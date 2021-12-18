package ch09;

// 오토박싱과 언박싱 2
public class Ex09_29 {
	public static void main(String[] args) {
		int i = 10;
		
		// 기본형을 참조형으로 형변환(형변환 생략가능)
		Integer intg = (Integer)i;
//		Integer intg = Integer.valueOf(i);
		
		Object obj = (Object)i;
//		Object obj = (Object)Integer.valueOf(i);

		Long lng = 100L;
//		Long lng = new Long(100L);
		
		int i2 = intg + 10;		// 참조형과 기본형간 연산 가능 
		long l = intg + lng;	// 참조형간 덧셈 가능 
		
		Integer intg2 = new Integer(20);
		
		// 참조형을 기본형으로 형변환(형변환 생략가능)
		int i3 = (int)intg2;
	}
}
