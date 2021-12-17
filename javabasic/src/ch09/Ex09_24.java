package ch09;

// round 반올림 test
public class Ex09_24 {
	public static void main(String[] args) {
		for(double d = 0.0; d <= 2; d += 0.1) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			// 전체자리.소수점아래자리f(자릿수는 소수점. 포함)
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
		}
		
		System.out.println("---------------");
		
		double sum = 0;
		double sum1 = 0;
		double sum2 = 0;
		
		for(double d = 0.5; d < 10.5; d++) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
			
			sum += d;
			sum1 += d1;
			sum2 += d2;
		}
		System.out.println("---------------");
		System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
		
	}
}
