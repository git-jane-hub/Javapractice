package ch07;
// 내부 클래스 2 inner class

public class Ex07_45 {
	class InstanceInner{
		int iv = 100;
//		static int cv = 100;			// static 변수를 선언할 수 없음 
		final static int CONST = 100;	// final static 은 상수이므로 가능 
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200;	// static 클래스만 static 멤버 정의 가능
	}
	
	void myMethod(){
		class LocalInner{
			int iv = 300;
//			static int cv = 300;			// static 변수를 선언할 수 없음 
			final static int CONST = 300;	// final static 은 상수이므로 가능 
		}
		int i = LocalInner.CONST;			
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST);	// 지역 내부 클래스의 static 상수는 메서드 내에서만 사용 가능 
	}
}
