package kr.ac.kopo.day07;

// 메소드의 선언부에는 메소드를 반환형을 함께 표현해줘야 정의가 되지만, 그 이후에는 반환형 없이 메소드이름만 사용해도
// 가능하다.

// 자바에서는 유일하게 new라는 명령어를 썻을때만 유일하게 생성자를 호출하고 있다고 인지한다. 그러므로,
// new를 사용하지 않은 

// this()라는 생성자는 생성자 내부에서 같은 클래스 내부에서 정의된 다른 오버로딩된 생성자를 지정할 때에 사용하는 생성자이다.
// 또한, this() 생성자는 어떠한 생성자 내부에서 사용될때 가장 맨 윗줄에 사용되어야만 한다.

// 생성자는 클래스에서 정의되고 실제로 사용될때는 인스턴스객체를사용할때에만 사용된다.

// 인스턴스 객체를 생성하는 행위는 main 메소드에 존재하고, main 메소드 외부에 존재하는 클래스를 정의할때엔
// 설계도를 정의하는 의미에서의 클래스와 그 내부의 멤버변수,메소드, 생성자를 정의할때에 사용된다.

// 생성자의 특징은 클래스명과 항상 동일하다 이것은 문법적 법칙으로 정의된 것이므로 이것은 언제나 위배되선안된다.
// 그러므로, 언제나 this는 현재 this가 사용되고 있는 공간을 의미하고 있는 class를 의미하는 것으로 볼수있다.
// 즉, this.변수 는 그 클래스에 존재하는 그 변수를 의미하고, this.메소드()눈 그 클래스에 존재하는 메소드이고,
// this.생성자()는 그 클래스에 존재하는 그 생성자를 의미하는 것이다.

// new라는 명령어는 클래스를 설계하는 과정에서는 사용될 수 없고, main() 메소드안에서 객체를 생성하거나 어떠한
// 메소드 안에서 객체를 생성하는 과정에서 사용된다. 즉, this.멤버변수 this(), this.메소드와 같이 표현하여
// 정의하는 과정은 클래스를 설계할때만 표현되고, 실제로 이러한 this에 의한 동작이 비로소 발생되는 것은
// 클래스를 설계하는 과정 외부의 main메소드나 다른 메소드안에서 new를 사용하여 실제로 객체를 생성하는 동작이발생
// 될때 동작하게된다.

public class Member {

	String name;
	int    age;
	String bloodType;
	
	Member() {
		this("알수없음", -1, "알수없음");
	}
	
	Member(String name) {
		this(name, -1, "알수없음");
	}
	
	Member(String name, int age) {
		this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + age
				+ ", 혈액형 : " + bloodType);
	}
	
}
/*
public class Member {

	String name;
	int    age;
	String bloodType;
	
	Member() {
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name) {
		this.name = name;
		this.age = -1;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + age
				+ ", 혈액형 : " + bloodType);
	}
	
}
*/
