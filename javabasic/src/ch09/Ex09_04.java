package ch09;

import java.util.Objects;

// Object 클래스의 toString()과 오버라이딩 

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public boolean equals(Object obj) {	// 오버라이딩에는 선언부가 일치해야하기 때문에 Object obj라고 작성해야함 
		if(!(obj instanceof Card)) {
			return false;
		}
		Card c = (Card)obj;
		// String 일 때는 .equals() 
		return (this.kind.equals(c.kind)) && (this.number == c.number);
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야함 
	public int hashCode() {
		// Obejects 클래스는 객체와 관련된 유용한 메서드를 제공하는 유틸 클래(매개변수는 가변인자이기 때문에 값의 호출 시 지정하는 값의 개수가 정해져있지 않음)
		return Objects.hash(kind, number);
	}
	
	// 기존의 Object 가 가진 toString()은 return getClass().getName() + "@" + Integer.toHexString(hashCode()); - 유용하지 않음 
	// 클래스 이름과 주소 대신 값이 반환될 수 있도록 오버라이딩 
	public String toString() {
		// + 연산자로 객체를 문자열로 변환 
		return "kind: " + kind + ", number: " + number;
	}
}

public class Ex09_04 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
