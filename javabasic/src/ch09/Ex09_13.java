package ch09;

// 문자열과 기본형 간의 변환
public class Ex09_13 {
	public static void main(String[] args) {
		// 숫자를 문자열로 변경
		int i = 100;
		String str1 = i + "";
		String str2 = String.valueOf(i);	// 성능이 좋음
		
		// 문자열을 숫자로 변경
		int i2 = Integer.parseInt("100");
		int i3 = Integer.valueOf("100");	// parse~의 새로운 버전 
		Integer i4 = Integer.valueOf("100");
		
		System.out.println(str1 + str2);
		System.out.println(i2 + i3 + i4);
	}
}
