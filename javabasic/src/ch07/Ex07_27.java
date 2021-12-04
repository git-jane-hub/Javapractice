package ch07;
// 다형성의 장점
class Product{	//	부모 
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);	// 보너스점수: 제품가격의 10%
	}
}

class Tv3 extends Product{	// 자손 
	Tv3(){
		// 생성자의 첫줄에는 반드시 다른 생성자 호출 
		// 조상 클래스의생성자 Product(int price)를 호출 
		super(100);
	}
	
	// Object toString() 오버라이딩 
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{	// 자손 
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다.");
			return;
		}
		// 물건을 구매하면 가진 돈에서 제품의 가격 차감 
		money -= p.price;
		// 제품의 보너스 점수를 추가
		bonusPoint += p.bonusPoint;
		// 참조변수와 문자열 결합시에는 참조변수의 toString() 호출 
		System.out.println(p + "를 구매했습니다.");
	}
}

public class Ex07_27 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		// 다형성으로 하나의 메서드로 여러 제품을 구매 
		b.buy(new Tv3());		// buy(Product p)
		// 위와 아래는 같지만, 위는 참조변수가 없기때문에 메서드 내부에서만 사용가능 
//		Product p = new Tv3();
//		b.buy(p);
		
		b.buy(new Computer());	// buy(Product p)
		
		System.out.println("현재 잔액은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
















