package ch07;
// 인터페이스와 다형성 
abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	};
}

interface Fightable{
	void move(int x, int y);	// public abstract 가 생략됨 
	void attack(Fightable f);	// public abstract 가 생략됨 
}

class Fighter extends Unit2 implements Fightable{
	@Override
	// 오버라이딩: 조상보다 접근제한자 범위가 좁을 수 없음 
	public void move(int x, int y) {
		System.out.println("[ " + x + ", " + y + " ] 로 이동");
	}

	@Override
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	// Fighter를 생성해서 반환 - 싸울 수 있는 상대를 불러옴 
	Fightable getFightable() {
		Fighter f = new Fighter();
		// 반환 타입이 인터페이스일 때는 인터페이스를 구현한 객체를 반환 
		return f;
	}
}

public class Ex07_38 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
		
		Unit2 u = new Fighter();
		u.move(300, 400);
		// Unit2에는 attack()가 없어서 호출 불가 
//		u.attack(new Fighter());
		u.stop();
		
		Fightable f2 = f.getFightable();
		f2.move(500, 600);
		f2.attack(new Fighter());
		// Fightable에는 stop()이 없어서 호출 불가
//		f2.stop();
	}
}





























