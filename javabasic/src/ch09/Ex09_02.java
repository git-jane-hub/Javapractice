package ch09;

//Object 클래스와 equals() 2
class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {	// obj가 Person 객체가 아니면 비교하지 않고 바로 false 반환 
			return false;
		}
		
		Person p = (Person)obj;	// 비교를 위한 형변환
		return this.id == p.id;	// Object obj에 들어온 값과 자신의 값을 비교
	}
	
	Person(long id){
		this.id = id;
	}
}
public class Ex09_02 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}
}
