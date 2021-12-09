package ch08;

public class Ex08_05 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(args[0]);// ArrayIndexOutOfBoundsException
			System.out.println(4);		// 실행되지 않음 
		}catch(ArithmeticException ae) {// 해당 예외 처리 불가능 - 여기서 프로그램 비정상 종료되고 뒤의 문장 실행되지 않음 
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}System.out.println("ArithmeticException");
		}// try ~ catch 끝 
		System.out.println(6);
	}
}
