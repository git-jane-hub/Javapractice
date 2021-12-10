package ch08;

// checked 예외와 unchecked 예외 
public class Ex08_10 {
	public static void main(String[] args) {
		try {
			// checked 예외: Exception과 그 자손은 반드시 예외처리를 해줘야함 
			throw new Exception("고의 에러 발생");		
		}catch(Exception e) {
			System.out.println("에러 메세지: " + e.getMessage());
			e.printStackTrace();
		}
		// unchecked 예외: RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일은 가능 - 예외가 발생하지 않는 것은 아님
		throw new RuntimeException();				
	}
}
