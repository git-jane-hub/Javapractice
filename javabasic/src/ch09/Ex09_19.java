package ch09;

// StringBuffer의 메서드 
public class Ex09_19 {
	public static void main(String[] args) {
		// 16문자를 담을 수 있는(배열의 길이가 16) 버퍼를 가진 StringBuffer 인스턴스 생성 
		StringBuffer sb1 = new StringBuffer();
		// 지정된 개수의 문자를 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스 생성 
		StringBuffer sb2 = new StringBuffer(10);
		// 지정된 문자열 값에 16문자를 더해 담을 수 있는 버퍼를 가진 StringBuffer 인스턴스 생성 
		StringBuffer sb3 = new StringBuffer("Hi");	// 18문자
		
		StringBuffer sb01 = new StringBuffer("abc");		// abc
		StringBuffer sb02 = sb01.append(true);				// abctrue(sb02에는 sb01의 주소값을 넣어줌)
		sb01.append('z').append(10.0f);						// abctruez10.0
		StringBuffer sb03 = sb01.append("ABC").append(123);	// abctruez10.0ABC123(sb03에는 sb01의 주소값을 넣어줌)
		
		System.out.println(sb01);
		System.out.println(sb02);
		System.out.println(sb03);
		
		StringBuffer sb4 = new StringBuffer(100);
		sb4.append("abcd");

		// int capacity(): 버퍼의 크기를 알려줌
		int bufferSize = sb4.capacity();
		int stringSize = sb4.length();
		System.out.println(bufferSize);
		System.out.println(stringSize);	// 4, sb4에 담긴 문자열이 "abcd" 네글자
		
		// char chatAt(int index): 지정된 위치에 있는 문자 반환
		char c = sb4.charAt(2);
		System.out.println(c);
		
		// StringBuffer delete(int start, int end): 시작지점부터 끝지점 사이의 문자 제거(start <= x < end)
		StringBuffer sb5 = sb4.delete(1, 3);
		System.out.println(sb5);
		
		// StringBuffer deleteCharAt(int index): 지정된 위치의 문자를 제거
		StringBuffer sb6 = sb4.deleteCharAt(0);
		System.out.println(sb6);
	}
}
