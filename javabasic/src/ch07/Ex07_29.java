package ch07;

class Product2{
	int price;
	int point;
	
	Product2(){}	// 기본 생성자
	Product2(int price){
		this.price = price;
		this.point = (int)(price / 10.0);
	}
}

class Tv4 extends Product2{
	Tv4(){
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2{
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2{
	Audio2(){
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

// 구매자 
class Buyer2{
	int money = 1000;
	int point = 0;
	// 구매한 제품을 저장하기 위한 배열 
	Product2 [] cart = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		point += p.point;
		// 제품을 Product[] cart 에 저장 
		cart[i++] = p;
		System.out.println(p + "를 구입했습니다.");
	}
	
	// 구매 물품에 대한 정보 
	 void summary() {
		 // 구매 물품에 대한 가격 합계
		 int sum = 0;
		 // 구매 물품 목록
		 String itemList = "";
		 
		 // 반복문을 이용해 구입한 물품의 총가격과 목록을 만듦 
		 for(int i = 0; i < cart.length; i++) {
			 
			 // cart 내부의 값이 비어있으면 객체가 없기 때문에 건너뜀 
			 if(cart[i] == null) {
				 break;
			 }
			 sum += cart[i].price;			// cart[i] 객체 내부의 price 값을 sum에 저장
			 itemList += cart[i] + ", ";	// cart[i]와 문자열이 결합하면서 cart[i]의 toString() 호출 
		 }
		 System.out.println("구매한 물품의 총 금액은 " + sum + "만원입니다.");
		 System.out.println("구매한 제품은 " + itemList + "입니다.");
	 }
}

public class Ex07_29 {
	public static void main(String[] args) {
		// Buyer2 클래스를 생성하면 Product2 배열인 cart가 생성됨 - 길이 10짜리 배열의 각 초기값은 null
		Buyer2 b = new Buyer2();
		
		// buy()를 호출하면 cart[0]에는 Tv4 객체가 저장, cart[1]에는 Computer2 객체가 저장...
		b.buy(new Tv4());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}















