package ch07;

// instanceof: 참조변수의 형변환 가능 여부 확인 
class Car2{
	String color;
	int door;
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine2 extends Car2{
	void water() {
		System.out.println("water~");
	}
}

class Ambulance2 extends Car2{
	void savePerson() {
		System.out.println("save person!!");
	}
}

public class Ex07_26 {
	public static void main(String[] args) {
		FireEngine2 fe = new FireEngine2();
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Car2);
		System.out.println(fe instanceof FireEngine2);
		
		Car2 c = new Car2();
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Car2);
		System.out.println(c instanceof FireEngine2);
	}
}
