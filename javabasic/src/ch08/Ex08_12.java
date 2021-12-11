package ch08;

import java.io.File;

// 메서드에 예외 선언: 메인 메서드에서 처리할지 / 메인 메서드에서 호출한 메서드에서 처리할지 선택 
public class Ex08_12 {
	public static void main(String[] args) {	// 5. 메인 메서드에서 예외를 넘겨받음 
		try {
			// args[0] 값은 실행버튼 - run configurations... - Arguments 탭 - Program arguments에 작성 
			File f = createFile(args[0]);	// 1. 파일이름을 매개변수로 넘기면서 메서드 호출 
			// 위에서 매개변수로 넘겨준 값이 getName()에 의해 호출되어 프로젝트 아래 파일이 생성됨 
			System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
		}catch(Exception e) {	// 6. 예외를 처리 
			System.out.println(e.getMessage() + " 다시 입력해주시기 바랍니다.");
		}
	}
	
	static File createFile(String fileName) throws Exception {	// 4. 예외를 호출한 쪽으로 떠넘김 
		if(fileName == null || fileName.equals("")) {	// 2. 빈 문자열이 들어오면 
			throw new Exception("파일이름이 유효하지 않습니다.");	// 3. 예외가 발생 
		}
		// File 클래스의 객체를 생성 
		File f = new File(fileName);
		// File 객체의 createNewFile() 메서드를 이용해 실제 파일을 생성 
		f.createNewFile();
		// 생성된 객체의 참조를 반환 
		return f;			
	}
}
