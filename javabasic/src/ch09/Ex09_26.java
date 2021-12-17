package ch09;

// wrapper 클래스
public class Ex09_26 {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i == i2 -> " + (i == i2));					// 서로 주소비교 
		System.out.println("i.equals(i2) -> " + i.equals(i2));			// 서로의 값 비교
		System.out.println("i.compareTo(i2) -> " + i.compareTo(i2));	// 같으면 0, 작으면 양수, 크면 음수 
		System.out.println("i.toString() -> " + i.toString());			
		
		// Integer 의 속성(정보)
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + "bits");
		System.out.println("BYTES = " + Integer.BYTES + "bytes");
		System.out.println("TYPE = " + Integer.TYPE);
	}
}
