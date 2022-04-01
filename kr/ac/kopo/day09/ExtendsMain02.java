package kr.ac.kopo.day09;

/*
 * super는 무조건 상속관계가 부모클래스와 자식클래스사이에서 연속적으로 존재할지라도, 부모클래스와 자식클래스사시에 존재하는 1:1 관계의
 * 부모클래스와 자식클래스 관계만을 고려하면된다. 즉, super 은 어떠한 자식클래스에서 그 바로위의 부모클래스만을 의미한다. 
 * super을 따질땐 1:1 관계로 생각해야한다.
 * 
 * extends를 사용하여 상속관계를 설정하는 경우는 클래스와 클래스 사이에서 설정할 수 있고, 인터페이스와 인터페이스 사이세서만 오직 설정할 수 있다.
 * 그러므로, 항상 상속관계를 따져줄때는 1:1관계로 따져주면서 연쇄적인 관계까지 생각해준다.
 * 
 * 
 * 
 */

class A {
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		super();
		System.out.println("C() 호출...");
	}
}

public class ExtendsMain02 {

	public static void main(String[] args) {
	
//		new A();
//		new B();
		new C();
	}
}
