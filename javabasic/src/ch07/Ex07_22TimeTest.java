package ch07;
// 캡슐화 
class Time{
	private int hour;	// 0 - 23 사이의 값이 범위 
	private int minute;	// 0 - 59 사이의 값이 범위 
	private int second;	// 0 - 59 사이의 값이 범위 
	
	public int getHour() {
		return hour;
	};
	public void setHour(int hour) {
		if(isInvalidHour(hour)) {	// 괄호안 드래그 - 우클릭 - refactor - Extract Method
			return;	// 범위에 충족하지 않으면 빠져나갈 수 있게 작성 
		}
		this.hour = hour;
	}
	// 메서드 추출로 만들어진 메서드 - 매개변수로 넘겨진 hour가 유효한지 체크하는 메서드 
	private boolean isInvalidHour(int hour) {
		return hour < 0 || hour > 23;
	}
}

public class Ex07_22TimeTest {
	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100;
//		System.out.println(t.hour);
		t.setHour(25);
		System.out.println(t.getHour());
		t.setHour(23);
		System.out.println(t.getHour());
	}
}
