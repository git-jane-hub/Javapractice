package ch09;

// Math 클래스 
public class Ex09_22 {
	public static void main(String[] args) {
		// Math.round()로 원하는 소수점 아래 세번째 자리에서 반올림
		double num = 90.7552;
		// 1. 원래 값에 100을 곱함
		num = num * 100;
		
		// 2. 위의 결과에 Math.round()를 사용
		num = Math.round(num);
		
		// 3. 위의 결과를 다시 100.0으로 나눔
		num = num / 100.0;
		System.out.println(num);
	}
}
