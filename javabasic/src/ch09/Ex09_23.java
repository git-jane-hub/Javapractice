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
		
		// Math.min(): 주어진 두 값을 비교하여 작은 값을 반환
		double d7 = Math.min(9.5, 9.50001);
		int i2 = Math.min(0, -1);
		System.out.println("d7: " + d7 + ", i2: " + i2);
		
		// Math.random(): 0.0 <= x < 1.0 범위의 임의의 double 값을 반환 
		double d8 = Math.random();
		int i3 = (int)(Math.random() * 10) + 1;	// 1 이상 10 미만
		System.out.println("d8: " + d8 + ", i3: " + i3);
		
		// 반올림
		// Math.rint(): 주어진 double 값과 가장 가까운 정수값을 double형으로 반환, 정가운데 값은 짝수를 반환 
		// -> round even
		double d9 = Math.rint(1.2);
		double d10 = Math.rint(2.6);
		double d11 = Math.rint(3.5);
		double d12 = Math.rint(4.5);
		System.out.println("d9: " + d9 + ", d10: " + d10 + ", d11: " + d11 + ", d12: " + d12);
		
		// Math.round(): 소수점 첫자리에서 반올림한 정수값을 반환
		// -> half_up
		long l1 = Math.round(1.2);
		long l2 = Math.round(2.6);
		long l3 = Math.round(3.5);
		long l4 = Math.round(4.5);
		System.out.println("l1: " + l1 + ", l2: " + l2 + ", l3: " + l3 + ", l4: "+ l4);
	}
}
