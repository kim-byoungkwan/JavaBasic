package kr.ac.kopo.day06;

// 메소드의 이름이 같은 경우는 존재할 수 있지만, 어떤 클래스에 존재하는 메소드인지, 즉 어떤 클래스로 정의된
// 객체에 존재하는 메소드인지에 따라서 이름이 같더라도 기능(동작)은 다를 수 있다.
// 클래스안에 메소드를 정의했다고 해서 그순간에 실질적인 객체는 아직 존재하고있는 상태가 아니다. 
// 설계도인 클래스만 존재하는 상태이다. 설계도인 클래스를이용해서 객체를 생성해야만 비로소 실질적인 객체가 존재하는
// 것이다.

// 실제객체를가리키고있는주소값을갖고있는변수.메소드이름() 의 의미는 변수에 저장된 주소값이 가리키고있는 객체가
// 갖고 있는 메소드를 실행하게 되는 것이다.

// 하나의 클래스에 여러개의 메소드가 선언될 수 있다. 이때 main메소드가 같은 클래스안에있는 여러개의 메소드를
// 호출할때에는 메소드의 자료형 즉, 클래스를 앞에 적어주지 않아도된다.

// 항상 클래스에 정의된 메소드를 동작하게 하려면 항상 클래스(설계도)를 통해 실제 인스턴스객체를 생성해야만 할수있다.

// 자바는 메소드와 메소드를 구분하는 구분자를 메소드의 이름과 함께, 메소드의 매개변수 즉 파라미터의 타입으로 구분할수
// 있다. 즉, 같은 이름의 메소드일지라도, 정의된 파라미터의 타입이 다르면 본질적으로 다른 메소드로 인식하는 것이다.
// 절자지향적 언어에서는 메소드의 이름이 같으면 동일한 메소드로 인식하여 동일한 메소드이름의 메소드는 존재할 수 없다.

// 만약 어떤 메소드의 파라미터가 double 이고, 이 메소드를 정수형 파라미터로 호출할때, 정수형 파라미터는 
// double 자료형보다 크기가 작으므로, 파라미터의 자료형이 다른 메소드가 호출됐을 지라도, 묵시적 형변환에 의해
// double 형 파라미터로 정의된 메소드로 정수형 파라미터가 대입된 메소드가 실행되는 것이다.

// 이러한 위의 모든 메소드의 이름과 파라미터의 본질적 특징을 이용해서, 메소드 오버로딩 기술을 사용할 수 있는 것이다.
// 즉, 메소드 오버로딩이란 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로다른 메소드를 여러개
// 정의하는 것을 말한다.

// 이와같이 메소드오버로딩을 자바에서 지원하기 때문에 println()메소드의 파라미터안에 문자열이든 정수든 다양한 자료형
// 의 파라미터를 사용해도 사용할수있는 것이다. 즉, 자바에서는 그 어떤 메소드라도, 예외사항없이 메소드오버로딩을 지원
// 하는것이다.

// 또한 메소드 오버로딩은 파라미터의 종류와 변수이름이 같은 2개가 있더라도 순서를 달리하면 서로다른 메소드로 인식
// 하게 되므로 순서에 의한 것도 메소드 오버로딩을 제공하는 것이다.

// 그러므로 메소드를 정확하게 사용하려면, 자바 문서를 통해서 어떠한 파라미터를 갖고, 순서를 갖고, 종류를 갖는지까지
// 정확하게 알아야 메소드를 구사할 수 있다.





class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을잡니다");
	}
	
	void 냐용거린다() {
		System.out.println("고양이가 냐용합니다");
	}
}

class Method {
	// 메소드 오버로딩(overloading)
	// 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른것
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	void call(int i) {
		System.out.println("call(int) 메소드 호출...");
	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	
	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출...");
	}
	
	void call(int n, String str) {
		System.out.println("call(int, String) 메소드 호출...");
	}
}

public class MethodMain02 {

	public static void main(String[] args) {
		
		Method m = new Method();
		m.call();
		m.call(10);
		m.call(10.3);
		m.call(true);
		m.call("hello", 5);
		m.call(5, "hello");
		
		고양이 나비 = new 고양이();
		
		나비.냐용거린다();
	}
}