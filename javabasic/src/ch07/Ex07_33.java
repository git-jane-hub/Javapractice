package ch07;
// 추상 클래스 작성 
public class Ex07_33 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};	// 배열의 생성과 초기화를 한번에 
		/*
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		*/
		
		// group의 타입은 Unit[], group[i]의 타입은 Unit
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);	// 0~2 돌면서 각 객체의 move()를 호출 
		}
	}
}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);	// 해당 좌표로 이동  
	void stop() {
		// 현재 위치에서 정지
	};
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[ x = " + x + ", y = " + y + " ]");
	}
	void stimPack() {
		// stimPack 사용 
	}
}

class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[ x = " + x + ", y = " + y + " ]");
	}
	void changeMode() {
		// 공격모드 변환 
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[ x = " + x + ", y = " + y + " ]");
	}
	void load() {}
	void unload() {}
}