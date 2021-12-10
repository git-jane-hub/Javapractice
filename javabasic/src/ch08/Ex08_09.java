package ch08;

// 고의로 예외 발생 
public class Ex08_09 {
	public static void main(String[] args) {
		try {
			/*
			// new 연산자를 이용해 예외클래스의 객체 생성 
			Exception e = new Exception("고의로 발생시킨 예외");
			// 생성한 객체 던지기
			throw e;
			*/
			throw new Exception("고의로 발생시킨 예외");
		}catch(Exception e) {
			// 생성된 예외 클래스 객체 내부에는 에러에 대한 정보가 있음
			// e.getMessage()의 메시지는 생성한 객체의 파라미터 값과 동일 
			System.out.println("에러 메시지: " + e.getMessage());	// 에러 메시지: 고의로 발생시킨 예외
			e.printStackTrace();								// java.lang.Exception: 고의로 발생시킨 예외 at ch08.Ex08_09.main(Ex08_09.java:13)
		}
		System.out.println("프로그램 정상 종료됨");					// catch 블럭에 의해서 예외가 처리되었기 때문에 해당 문장까지 출력됨 
	}
}
























