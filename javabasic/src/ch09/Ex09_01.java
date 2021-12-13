package ch09;

// Object 클래스와 equals() 1
public class Ex09_01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같다.");
		}else {
			System.out.println("v1과 v2는 다르다.");
			
		}
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	// 서로 다른 객체여도 주소비교가 아닌 값의 비교를 통해 참거짓 값을 반환하려면 오버라이딩을 통해 인스턴스 변수의 값을 비교하는 메서드를 생성 
	public boolean equals(Object obj) {
		// equals() 메서드를 사용하면 객체의 주소비교를 하기 때문에 서로 다른 객체는 항상 false를 반환 
//		return this == obj;	
		
		// 참조변수의 형변환 전에는 반드시 instanceof를 통해 확인해야 하지만 Object obj에 어떤 값이 들어올지 모르기 때문에 
		if(!(obj instanceof Value)) {
			return false;
		}
		Value v = (Value)obj;	// obj를 value로 형변환
		return this.value == v.value;
	}
}
	
	
	
	
	
	
	
	
	