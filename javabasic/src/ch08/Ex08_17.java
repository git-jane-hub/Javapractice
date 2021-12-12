package ch08;

// 예외 되던지기(Exception re-throwing): 예외를 처리하고 다시 발생시켜서, 호출한 메서드와 호출된 메서드 양쪽에서 모두 처리 
public class Ex08_17 {
	public static void main(String[] args) {
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main 메서드에서 예외가 처리되었습니다.");		// 4. 다시 예외 처리 
		}
	}
	
	static void method1() throws Exception{
		try {
			throw new Exception();										// 1. 예외 발생시킴 
		}catch(Exception e) {
			System.out.println("method1 메서드에서 예외가 처리되었습니다.");		// 2. 예외 처리
			throw e;													// 3. 다시 예외 발생시킴 
		}
	}
}
