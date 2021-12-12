package ch08;

// 연결된 예외(chained exception): 한 예외가 다른 예외를 발생시킴 
public class Ex08_18 {
	public static void main(String[] args) {
		try {
			install();
		// 연결된 예외를 사용하는 이유 1. 여러 예외를 하나로 묶음 
		}catch(InstallException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void install() throws InstallException{	// 실제 발생한 예외는 SpaceException이지만, InstallException을 예외로 등록 
		try {
			startInstall();	// SpaceException 발생(저장공간 부족)
			copyFiles();
		}catch(SpaceException e) {	// 예외 A
			InstallException ie = new InstallException("설치 중 예외발생");	// 예외 B
			// initCause(Throwable cause): 지정한 예외를 원인 예외로 등록
			ie.initCause(e);	// InstallException의 원인 예외를 SpaceException으로 지정 
			throw ie;	// InstallException 발생
		} catch(MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		}
		finally {
			deleteTempFiles();
		}
	}
	// 연결된 예외를 사용하는 이유 2. checked 예외를 unchecked 예외로 변경 
	static void startInstall() throws SpaceException, MemoryException{	// 1. 예외를 하나만 선언하고 
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간 부족");
		}
		if(!enoughMemory()) {
			throw new MemoryException("메모리 부족");
			// 2. RuntimeException(Throwable cause) 생성자 사용해 MemoryException은 Exception의 자손이지만 RuntimeExeption 안에 넣어줌 
			//throw new RuntimeException(new MemoryException("메모리 부족"));	// MemoryException을 RuntimeException의 원인 예외로 등록
		}
	}
	
	static void copyFiles() {
		System.out.println("파일 복사중...");
	}
	static void deleteTempFiles() {
		System.out.println("임시파일 삭제중...");
	}
	
	static boolean enoughSpace() {
		System.out.println("설치하는데에 필요한 공간 계산중...");
		return false;
	}
	static boolean enoughMemory() {
		System.out.println("설치하는데에 필요한 메모리 계산중...");
		return true;
	}
}

class InstallException extends Exception{
	InstallException(String msg){
		super(msg);
	}
}
class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
}
class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}
