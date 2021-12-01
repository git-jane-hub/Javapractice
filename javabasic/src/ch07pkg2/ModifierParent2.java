package ch07pkg2;

import ch07pkg1.ModifierParent;

class ModifierChild extends ModifierParent{
	public void printMembers() {
//		System.out.println(prv);	// 에러, 서로 다른 클래스이기 때문 
//		System.out.println(dft);	// 에러, 서로 다른 패키지이기 때문 
		System.out.println(prt);	// OK
		System.out.println(pub);	// OK
	}
}

public class ModifierParent2 {
	public static void main(String[] args) {
		ModifierParent mt = new ModifierParent();
//		System.out.println(mt.prv);	// 에러, 서로 다른 클래스이기 때문 
//		System.out.println(mt.dft);	// 에러, 서로 다른 패키지이기 때문 
//		System.out.println(mt.prt);	// 에러, 자손 클래스가 아니기 때문
		System.out.println(mt.pub);	// OK
	}
}