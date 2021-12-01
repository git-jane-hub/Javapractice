package ch07pkg1;

// 하나의 소스파일에 public class는 하나만 있어야하며
// public class명은 소스파일명과 일치
public class ModifierParent{ 
	// 같은 클래스 
	private int prv;
	// 같은 패키지 
	int dft;
	// 같은 패키지 + 다른 패키지 자손클래
	protected int prt;
	// 접근제한 없음 
	public int pub;
	
	public void printMembers() {
		System.out.println(prv);	// OK
		System.out.println(dft);	// OK
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
	}
}
class ModifierParentTest { // 접근제한자 default
	public static void main(String[] args) {
		ModifierParent mt = new ModifierParent();
//		System.out.println(mt.prv);	// 에러, 서로 다른 클래스이기 때문 
		System.out.println(mt.dft);	// OK
		System.out.println(mt.prt);	// OK
		System.out.println(mt.pub);	// OK
	}
	
}
