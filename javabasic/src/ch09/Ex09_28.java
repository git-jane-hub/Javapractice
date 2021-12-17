package ch09;

import java.util.ArrayList;

// 오토박싱과 언박싱
public class Ex09_28 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();	// ArrayList에는 객체만 저장 가능
		
//		list.add(new Integer(100));	// list에는 객체만 추가할 수 있기 때문에 이와 같이 작성하지 않으면 에러였음 
		list.add(100);	// 이와 같이 작성해도 컴파일러가 오토박싱
		
//		int i = list.get(0).intValue();	// intValue()로 Integer를 int로 변환 
//		Integer i = list.get(0);
		int i = list.get(0);
	}
}
