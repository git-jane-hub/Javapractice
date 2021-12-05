package ch07;
// 추상 클래스: 일반 클래스와 동일하지만 추상(미완성) 메서드를 가지고 있는 클래스 - 미완성 클래스임을 알려주기 위해서 abstract 키워드 사용 
abstract class Player{
	boolean pause;	// 일시정지 상태 저장 
	int currentPos;	// 현재 재생되고 있는 위치 저장 
	
	// 추상 메서드도 생성자 필요 
	Player(){
		pause = false;
		currentPos = 0;
	}
	
	// 추상 메서드: 선언부는 있으나 구현부({}, 몸통)이 없는 메서드
	// - 각 기기마다 재생하고 멈추는 방식이 다르기 때문에 각 자손에서 서로 다르게 구현되어야 함 
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		// 추상 메서드를 호출할 수 있음 
		// 호출하는 방식: 1. 상속을 통해 자손이 메서드를 완성하고 2. 객체가 생성되면 3. 호출 가능 
		play(currentPos);
	}
}
class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "번 목록부터 재생합니다.");
	}
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
}

// 전체 메서드를 구현하지 않을 경우 class명 앞에 abstract 키워드를 입력해서 미완성 클래스임을 알려줌
abstract class DvdPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "번 채널부터 재생합니다.");
	}
}

public class Ex07_32 {
	public static void main(String[] args) {
		// 추상 클래스의 객체는 생성이 불가능
// 		Player p = new Player();
		
		// 다형성: Player로 AudioPlayer 객체를 가리킴 - AudioPlayer의 기능을 전부 갖고있기 때문에 동작함 
		Player p = new AudioPlayer();
		p.play(200);
		p.stop();

		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}
}




















