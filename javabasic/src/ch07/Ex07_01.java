package ch07;
// 상속 
class Tv{
	boolean power;
	int channel;
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

// 자식인 SmartTv클래스의 나타난 멤버는 2개이지만, 실제로는 7개 
// Tv클래스에서 자막을 보여주는 기능 추가 
class SmartTv extends Tv{
	// 상태 on/off
	boolean caption;
	void displayCaption(String text) {
		// 상태가 on(true)일 때에만 text를 보여줌
		if(caption) {
			System.out.println(text);
		}
	}
}

public class Ex07_01 {
	// 부모인 Tv클래스의 멤버는 5개 
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		// SmartTv에서 선언하지 않았지만 상속을 통해 사용할 수 있는 멤버 
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		// 상태 on
		stv.caption = true;
		stv.displayCaption("Hello, World");
	}
}
