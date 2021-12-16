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
		
		// StringBuffer insert(int pos, - -): 두번째 매개변수로 받은 값을 문자열로 변환하여 지정된 위치 pos(0부터 시작)에 추가 
		StringBuffer sb7 = new StringBuffer("0123456");
		System.out.println(sb7.insert(4, ','));
		
		// int length(): 인스턴스에 저장된 문자열의 길이를 반환
		System.out.println(sb7.length());
		
		// StringBuffer replace(int start, int end, String str): 지정된 범위의 문자들을 주어진 문자열로 변경 
		System.out.println(sb7.replace(3, 6, "ABC"));
		
		// StringBuffer reverse(): 인스턴스에 저장된 문자열의 순서를 거꾸로 나열
		System.out.println(sb7.reverse());
		
		// void setChatAt(int index, char ch): 지정된 위치의 문자를 주어진 문자로 변경
		sb7.setCharAt(2, 'Z');
		System.out.println(sb7);
		
		// void setLength(int newLength): 지정된 길이로 문자열의 길이를 변경, 길이를 늘리는 경우 나머지 빈 공간을 널문자로 채움 
		sb7.setLength(10);
		System.out.println(sb7);
		System.out.println(sb7.length());
		
		// String toString(): 인스턴스의 문자열을 String으로 반환
		String str = sb7.toString();
		System.out.println(str);
		
		// String substring(int start, int end): 지정된 범위 내의 문자열을 String으로 뽑아서 반환
		String str2 = sb7.substring(3, 5);
		System.out.println(str2);
	}
}
