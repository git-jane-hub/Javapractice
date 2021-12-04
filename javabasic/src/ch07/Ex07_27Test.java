package ch07;

// 다형성 장점 연습
class Cafe{
	int price;
	int point;
	
	Cafe(int price){
		this.price = price;
		this.point = (int)(price / 10.0);
	}
}

class Americano extends Cafe{
	Americano() {
		super(3000);
	}
	public String toString() {
		return "아메리카노";
	}
}

class Latte extends Cafe{
	Latte(){
		super(4000);
	}
	public String toString() {
		return "라떼";
	}
}

class Customer{
	int money = 10000;
	int point = 0;
	
	void buy(Cafe cafe) {
		if(this.money < cafe.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		System.out.println(cafe + "를 구매했습니다.");
		this.money -= cafe.price;
		this.point += cafe.point;
	}
}

public class Ex07_27Test {
	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.buy(new Americano());
		c.buy(new Latte());
		System.out.println("현재 잔액은 " + c.money + "원 입니다.");
		System.out.println("현재 보유 포인트는 " + c.point + "점 입니다.");
	}
}
