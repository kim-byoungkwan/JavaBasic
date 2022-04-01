package kr.ac.kopo.day09;

/*
 * Q. (자료형)을 취한다는 것의 본질적인 의미는?
 * Q. = 등호의 동작 흐름의 방향은?
 * 
 * API란 모든 경우에 사용할 수 있도록 하는 것이다.
 * 
 * print(Object obJ)와 같이 정의됐을때,
 * 
 * print(Random.random())
 * print(new String())
 * print(int num)
 * 
 * 이와 같은 모든 동작이 가능하다. 즉, 이러한 과정에서 부모 객체인 Object에서 Random, int, String 로 묵시적 형변환이 자동으로 일어나서
 * 위와 같은 표현이 가능하게 된 것이다.
 * 
 * equals(Object obj) 메소드의 정의에서 볼 수 있듯이, 매개변수를 Object obj로 정해진 순간 Object 클래스를 상속하는 모든 자식클래스의
 * 변수를 사용하여 equals()메소드를 사용할 수 있는데, 이때 자동적으로 묵시적형변환이 일어나고 있기 때문에가능한 것이다.
 * 
 * 명시적형변환이 오류가 발생하지 않도록 하기 위해선 가장먼저 묵시적 형변환을 한 뒤에 가능하게된다.
 * 
 * 
 *  
 * 
 * 
 * 
 */

public class Child02 extends Parent {

	String name = "자식2";
	
	@Override
	public void print() {
		System.out.println("Child02::print() 호출...");
	}
	
	public void play() {
		System.out.println("나는 놉니다");
	}
	
	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
}
