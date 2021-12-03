package ch07;
// 참조 변수의 형변환 1
class Car{
	String color;
	int door;
	void drive() {
		System.out.println("drive~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water~");
	}
}

class Ambulance extends Car{
	void savePerson() {
		System.out.println("save person!!");
	}
}

public class Ex07_24 {
	public static void main(String[] args) {
		/*
		// 객체 생성 
		FireEngine f = new FireEngine();
		// 조상 타입으로 형변환 가능
		Car c = (Car)f;
		// 자손 타입으로 형변환 가능 
		FireEngine f2 = (FireEngine)c;
		// 상속 관계가 아닌 클래스간 형변환 불가능 
//		Ambulance a = (Ambulance)f;
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		// null 값인 car에 fe의 주소값이 들어감 
		// car = (Car)fe;에서 형변환 생략 - 5개의 기능중에 4개만 쓸 수 있게됨(안전)
		car = fe;	
		// Car 타입의 참조변수로는 water() 호출 불가능 - 사용할 수 있는 것은 car의 4개 기
//		car.water();
		// 형변환 생략 불가능 - 4개의 기능에서 증가된 5개의 기능을 사용하게됨
		// fe2의 값이 null일 때도 형변환은 가능 - 실행하면 에러(NullPointerException)
		fe2 = (FireEngine) car;
		fe2.water();
		*/
		Car cc = new Car();
		// 실행되면 형변환 에러 발생 - **객체가 Car 인스턴스이기 때문**
		FireEngine ff = (FireEngine)cc;	
		ff.water();
	}
}
