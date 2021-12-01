package ch07;
// 오버라이딩 
class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x: " + x + ", y: " + y;
	}
	
	// 조상인 Object클래스의 toString()을 오버라이딩 
	public String toString() {	//	선언부가 같아야 하기 때문에 public 작성 
		return "x: " + x + ", y: " + y;
	}
}
/*
class Point3D2 extends Point2{
	int z;
	// 조상의 gerLocation()을 오버라이딩 - 선언부는 변경할 수 없음(내용만 변경 가능)
	String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
}
*/
public class Ex07_01OverrideTest {
	public static void main(String[] args) {
		/*
		Point3D2 p = new Point3D2();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());	// 자손의 getLocation()이 호출됨 
		*/
		Point2 pp = new Point2(5, 9);
//		pp.x = 5;
//		pp.y = 9;
		// 모두 같은 결과를 출력 
		System.out.println(pp.toString());
		System.out.println("x: " + pp.x + ", y: " + pp.y);
		System.out.println(pp);
	}
}














