package ch08;

public class Ex08_04 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);	// ArithmeticException
			System.out.println(4);		// 실행되지 않음 
		}catch(ArithmeticException ae) {// 해당 예외 처리 가능
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}System.out.println("ArithmeticException");
		}catch(Exception e) {			// 모든 예외의 최고 조상 - 모든 예외 처리 가능
			System.out.println("Exception");
		}// try ~ catch 끝 
		System.out.println(6);
	}
}
