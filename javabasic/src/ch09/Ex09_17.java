package ch09;

// StringBuffer: String 과 달리 내용 변경이 가능
public class Ex09_17 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		
		// append()는 지정된 내용을 StringBuffer에 추가하고 StringBuffer의 참조를 반환하기 때문에 아래와 같이 작성가능(반횐타입이 StringBuffer)
		sb.append("123").append("xyz");
		System.out.println(sb);
		
		// equals()가 오버라이딩 되어있지 않음
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2));	// true
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb1.equals(sb2)); // false
		
		// equals()로 주소 비교가 아닌 내용 비교를 하려면 StringBuffer를 String 으로 변환
		String s3 = sb1.toString();
		String s4 = sb2.toString();
		System.out.println(s3.equals(s4));	// true
	}
}
