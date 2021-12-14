package ch09;

import java.util.Arrays;
import java.util.Date;

// String 클래스의 생성자와 메서드 
public class Ex09_11 {
	public static void main(String[] args) {
		// String(char[] value): 주어진 문자열을 갖는 String 인스턴스를 생성 
		char[] c = {'H', 'e', 'l', 'l', 'o'};
		String str = new String(c);
		System.out.println("String(char[]): " + str);
		
		// String(StringBuffer buf): StringBuffer 인스턴스가 갖고있는 문자열과 깉은 내용의 인스턴스를 생성
		StringBuffer sb = new StringBuffer(str);
		System.out.println("String(StringBuffer): " + sb);
		
		// char charAt(int index): 지정된 위치에 있는 문자를 알려줌(index는 0부터 시작)
		char c1 = str.charAt(1);
		System.out.println("charAt(): " + c1);
		
		// int compareTo(String str): 문자열과 사전순서로 비교 - 같으면 0, 사전순 이전이면 음수, 이후면 양수 반환
		int i1 = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println("compareTo(): " + i1);
		System.out.println("compareTo(): " + i2);
		System.out.println("compareTo(): " + i3);
		
		// String concat(String str): 문자열 뒤에 덧붙임
		String s1 = str.concat(" World");
		System.out.println("concat(): " + s1);
		
		// boolean contains(CharSequence s): 문자열 포함 확인
		boolean b1 = str.contains("ell");
		System.out.println("contains(): " + b1);
		
		// boolean endsWith(String suffix): 지정된 문자열로 끝나는지 검사
		String file = "Hello.txt";
		boolean b = file.endsWith("txt");
		System.out.println("endsWith(): " + b);
		
		// boolean equals(Object obj): 매개변수 문자열 obj와 String 인스턴스의 문자열 비교
		boolean b2 = str.equals("hello");
		boolean b3 = str.equals("HELLO");
		System.out.println("equals(): " + b2);
		System.out.println("equals(): " + b3);
		
		// boolean equalsIgnoreCase(String str): str과 String 인스턴스 문자열을 대소문자 구분없이 비교
		boolean b4 = str.equalsIgnoreCase("hello");
		boolean b5 = str.equalsIgnoreCase("HELLO");
		System.out.println("equalsIgnoreCase(): " + b4);
		System.out.println("equalsIgnoreCase(): " + b5);
		
		// int indexOf(int ch): 주어진 문자 ch가 문자열에 존재하는지 확인하여 위치를 반환(못찾으면 -1 반환)
		int i4 = str.indexOf('o');
		int i5 = str.indexOf('k');
		System.out.println("indexOf(): " + i4);
		System.out.println("indexOf(): " + i5);
		
		// int indexOf(int ch, int pos): 주어진 문자 ch가 문자열에 존재하는지 pos(검색 시작위치)부터 확인하여 위치를 반환(못찾으면 -1 반환)
		int i6 = str.indexOf('e', 0);
		int i7 = str.indexOf('e', 2);
		System.out.println("indexOf(-, -): " + i6);
		System.out.println("indexOf(-, -): " + i7);
		
		// int indexOf(String str): 주어진 문자열이 존재하는지 확인하여 위치를 반환(못찾으면 -1 반환)
		int i8 = str.indexOf("el");
		System.out.println("indexOf(): " + i8);
		
		// int length(): 문자열의 길이 반환 
		int length = str.length();
		System.out.println("length(): " + length);
		
		String str2 = "java.lang.java";
		// int lastIndexOf(int ch): 주어진 문자 ch를 문자열의 오른쪽 끝에서부터 찾아 위치를 반환(못찾으면 -1 반환)
		// index는 왼쪽부터 0 시작으로 고정 
		int i9 = str2.lastIndexOf('.');
		int i10 = str2.indexOf('.');
		System.out.println("lastIndexOf(): " + i9);
		System.out.println("indexOf(): " + i10);
		
		// int lastIndexOf(String str): 주어진 문자열 str를 문자열의 시작지점을 오른쪽 끝에서부터 찾아 위치를 반환(못찾으면 -1 반환)
		int i11 = str2.lastIndexOf("java");
		int i12 = str2.indexOf("java");
		System.out.println("lastIndexOf(): " + i11);
		System.out.println("indexOf(): " + i12);
		
		// String[] split(String regex): 문자열을 분리자(regex)로 나누어 문자열 배열에 담아 반환 
		String animals = "dog,cat,bear,tiger";
		String[] arr1 = animals.split(",");
		System.out.println(Arrays.toString(arr1));
		
		// String[] split(String regex, int limit): 문자열을 분리자(regex)로 나누어 문자열 배열에 담아 반환하는데 전체를 지정된 수로 자름
		String[] arr2 = animals.split(",", 2);
		System.out.println(Arrays.toString(arr2));
		
		// boolean startsWith(String prefix): 주어진 문자열로 시작하는지 검사
		boolean b6 = str2.startsWith("java");
		boolean b7 = str2.startsWith("lang");
		System.out.println("startsWith(): " + b6);
		System.out.println("startsWith(): " + b7);
		
		// String substring(int begin): 주어진 시작지점부터 끝지점 범위에 포함된 문자열을 얻음(begin <= x < end)
		String s2 = str2.substring(10);
		String s3 = str2.substring(5, 9);
		System.out.println("substring(): " + s2);
		System.out.println("substring(): " + s3);
		
		// String toLowerCase(): String 인스턴스에 저장된 모든 문자열을 소문자로 변환해 반환
		String s4 = str.toLowerCase();
		System.out.println("toLowerCase(): " + s4);
		
		// String toUpperCase(): String 인스턴스에 저장된 모든 문자열을 대문자로 변환해 반환
		String s5 = str.toUpperCase();
		System.out.println("toUpperCase(): " + s5);
		
		// String trim(): 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환, 문자열 중간에 있는 공백은 제거되지 않음 
		String str3 = "       Hello World         ";
		String s6 = str3.trim();
		System.out.println("trim(): " + s6);
		
		// static String valueOf(): 지정된 값을 문자열로 변환하여 반환, 참조변수의 경우 toString()을 호출한 결과를 반환
		// + 로 "" 빈문자열을 더하는 것도 같은 결과가 나오지만 valueOf()가 성능이 좋음
		String boo = String.valueOf(true);
		System.out.println("valueOf(boolean b): " + boo);
		String ch = String.valueOf('a');
		System.out.println("valueOf(char c): " + ch);
		String in = String.valueOf(100);
		System.out.println("valueOf(int i): " + in);
		String lo = String.valueOf(100L);
		System.out.println("valueOf(long l): " + lo);
		String fl = String.valueOf(10f);
		System.out.println("valueOf(float f): " + fl);
		String dou = String.valueOf(10.0);
		System.out.println("valueOf(double d): " + dou);
		Date dd = new Date();
		String date = String.valueOf(dd);
		System.out.println("valueOf(Object o): " + date);
	}
}
