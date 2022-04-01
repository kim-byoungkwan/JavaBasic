package kr.ac.kopo.day10;

/*
 * final 키워드를 붙인 변수나 메소드는 절대 자식클래스로 오버라이딩될 수 없다.
 * 
 * 자식클래스는 부모클래스의 메소드와 변수를 모두 사용할 수 있고, 또한 메소드와 변수를 오버라이딩 할 수 있다.
 * 
 * 원래 자바에서 기본적으로 제공하고 있는 클래스를 내가 정의한 클래스에 상속하여 부모클래스의 메소드를 이용하여 나만의 메소드를
 * 오버로딩하여 정의할 수도 있는것이다.
 * 
 * 무조건 부모의 메소드를 자식에 상속시킬때, 매개변수와 리턴타입을 다르게 하면 오버라이딩 시킨것은 아니지만, 오버로딩 시켜서 재정의
 * 하였다고 말할 수 있다.
 * 
 * 그러나, String 클래스는 final 키워드가 붙은 클래스이므로 상속받아서 string 클래스에 들어있는 메소드를 자유롭게 나의
 * 자식클래스에서 재정의할 수없다. 
 * 
 */

import java.util.Random;

/*final*/ class FinalMain {
	private /* final */ double PI = 3.14;
	
	FinalMain() {
		PI = 3.141592;
	}
	
	/* final */ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends FinalMain {
	
	void call() {
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random {

	// nextInt(10) => 1 ~ 10
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}
	
	public int nextInt(int start, int end) {
		return super.nextInt(end-start) + start;
	}
}


//public class FinalMain {
//
//	public static void main(String[] args) {
//
//		MyRandom r = new MyRandom();
//		int random = r.nextInt(2);
//		System.out.println(random);
//		
//		/*
//		Random r = new Random();
////		int random = r.nextInt(90) + 10;
//		int random = r.nextInt(10) + 1;
//		*/
//	}
//
//}
