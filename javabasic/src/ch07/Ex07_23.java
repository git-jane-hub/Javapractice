package ch07;
// 다형성 - 조상 타입 참조변수로 자손 타입 객체를 다루는 것 
class Tv2{
	boolean power;
	int channel;
	void power(){
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

class SmartTv2 extends Tv2{
	String text;
	void caption() {
		System.out.println(text);
	}
}
public class Ex07_23 {
	public static void main(String[] args) {
		// 7개의 멤버변수 중 사용할 수 있는 기능: 7개 
		SmartTv2 s = new SmartTv2();
		
		// 7개의 멤버변수 중 사용할 수 있는 기능: 5개 
		Tv2 t = new SmartTv2();
		
//		SmartTv2 st = new Tv2();
	}
}
