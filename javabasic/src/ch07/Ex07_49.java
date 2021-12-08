package ch07;

class Outer2{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class Ex07_49 {
	public static void main(String[] args) {
		// 1. 외부 클래스의 인스턴스를 먼저 생성해야 
		Outer2 oc = new Outer2();
		// 2. 내부 클래스의 인스턴스를 생성 가능
		Outer2.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv: " + ii.iv);
		System.out.println("Outer2.StaticInner.cv: " + Outer2.StaticInner.cv);
		
		// static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 됨 
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv: " + si.iv);
	}
}





























