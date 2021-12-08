package ch07;

class Outer{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;	// 중요1. 내부 클래스에서 외부 클래스의 private 멤버도 접근 가능 
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv;	// static 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가능 
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;			// 값이 변경되지 않는다면 변수도 상수로 간주 
		final int LV = 0;	// final 생략가능
//		lv = 100;
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
			/* 중요2. 원래는 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능 
			 * - JDK1.8부터 에러는 아니지만 lv의 값이 변경되면 에러 발생
			 * 상수에만 접근이 가능한 이유는 myMethod가 종료되면 lv가 없어지지만 liv3이 더 오래 존재할 수도 있기 때문 
			 */
			int liv3 = lv;	
			int liv4 = LV;
		}
	}
}

public class Ex07_48 {

}