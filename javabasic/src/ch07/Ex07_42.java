package ch07;
// 내부 클래스 1 inner class 

class AA{	// BB의 외부 클래스
	int i = 100;
	BB b = new BB();
	// 이 클래스를 AA 클래스 내부에서만 사용한다면 
	class BB{	// AA의 내부 클래스 
		void method() {
			// BB가 AA의 내부 클래스가 아닐 때, 클래스 AA의 i를 사용하려면
//			AA a = new AA();
//			System.out.println(a.i);
			// 객체 생성없이 외부 클래스의 멤버 접근 가능 
			System.out.println(i);
		}
	}
	
}

/*
class CC{
	BB b = new BB();
}
*/

public class Ex07_42 {
	public static void main(String[] args) {
//		BB b = new BB();
//		b.method();
	}
}
