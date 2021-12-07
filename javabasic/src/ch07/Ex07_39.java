package ch07;
// 인터페이스의 장점
/*
class A{
	public void method(B b) {	// 1. C로 변경 - 이 과정을 없애기 위해서 인터페이스 사용 
		b.method();
	}
}
*/

class A{
	public void method(I i) {	// 매개변수의 I i의 의미: 인터페이스 I를 구현한 객체만 들어옴 
		i.method();
	}
}

// A의 변경없이 B를 C로 변경하려면 B의 선언부와 구현부를 인터페이스 I로 분리 
interface I{
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("method of B class");
	}
}

// 기존의 B를 C로 바꾸려고 하면
class C  implements I{
	public void method() {
		System.out.println("method of C class");
	}
}


public class Ex07_39 {
	public static void main(String[] args) {
		A a = new A();
		// A가 B를 사용 = A가 B에 의존
		a.method(new C()); // 2. C로 변경 
	}
}
























