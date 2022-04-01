package kr.ac.kopo.day08.extend2;

// 자바에 존재하는 모든 클래스는 말하지 않아도 자동으로 Object라는 클래스를 상속받게 된다.

/*
 * 상속관계에서 자식클래스의 생성자가 실행될 때엔 반드시 자식은 부모클래스의 모든 변수와 메소드를 접근할 수 있는 관계가 성립되어야 하므로,
 * 항상 부모클래스의 생성자 super()가 가장 먼저 실행되고 난 뒤에 자식클래스의 생성자가 실행된다. 무조건 자식클래스의 생성자가 실행될때엔
 * 부모클래스의 생성자가 먼저 실행된다. 단, 매개변수가 있는 자식클래스의 생성자가 실행될때엔 기본형의 부모클래스의 생성자 super()은 자동으로
 * 실행되지만, 똑같은 형태의 매개변수를 가진 부모클래스의 생성자는 자동으로 실행되지 않는다.
 * 
 */


public class Employee {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 위와 같이 자동으로 기본 생성자가 만들어진다. 부모클래스에 대한 기본 생성자도 마찬가지로 생성된다.
	// source -> generate constructor from super class
	
}
