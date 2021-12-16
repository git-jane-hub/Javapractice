package ch09;

// Math 클래스의 메서드 
public class Ex09_23 {
	public static void main(String[] args) {
		// Math.abs(): 주어진 값의 절대값을 반환 
		int i = Math.abs(-10);
		double d = Math.abs(-10.0);
		System.out.println("i: " + i + ", d: " + d);
		
		// Math.ceil(): 주어진 값을 올림하여 반환
		double d1 = Math.ceil(10.1);
		double d2 = Math.ceil(-10.1);
		double d3 = Math.ceil(10.000015);
		System.out.println("d1: " + d1 + ", d2: " + d2 + ", d3" + d3);
		
		// Math.floor(): 주어진 값을 버림하여 반환
		double d4 = Math.floor(10.8);
		double d5 = Math.floor(-10.8);
		System.out.println("d4: " + d4 + ", d5: " + d5);
		
		// Math.max(): 주어진 두 값을 비교하여 큰 값을 반환
		double d6 = Math.max(9.5, 9.50001);
		int i1 = Math.max(0, -1);
		System.out.println("d6: " + d6 + ", i1: " + i1);
	}
}
