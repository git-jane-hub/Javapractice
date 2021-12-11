package ch08;

import java.io.File;
import java.io.IOException;

public class Ex08_11 {
	public static void main(String[] args) {
		File f = createFile("");
		System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
	}
	
	static File createFile(String fileName) {// throws Exception {	// 예외를 떠넘기지 않고 직접 처리 
		try {
			if(fileName == null || fileName.equals("")) 
				throw new Exception("파일이름이 유효하지 않습니다.");
		}catch(Exception e) {
			fileName = "제목없음.txt";		// 제목이 입력되지 않으면 자동으로 제목을 생성 
		}
		File f = new File(fileName);
		// 이클립스에서 자동으로 생성한 try ~ catch 블럭 
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;			
	}
}
