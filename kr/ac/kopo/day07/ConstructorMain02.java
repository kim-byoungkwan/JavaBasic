package kr.ac.kopo.day07;

// 클래스안의 변수의 값이 무엇이 들어있는지를 일반적으로 드러내기보단 숨겨야하는 데 이를 객체의 은닉성이라고한다.
// 은닉성을 캡슐화라고도한다.

// Q. new 뒤에는 생성자 메소드만 와야하고, 생성자 메소드가 있어야만 비로소 객체가 생성되는 것인가? 
// A. 그것은 아니다. new뒤에는 배열도 올 수 있다. 이때 배열에 의해 형성되는 것은 참조변수 배열의 공간이 생성되는
// 것이다.

// 생성자를 정의할때 () 안의 매개변수를 정의할때엔 멤버변수의 name과 매개변수에 사용된 변수를 의미하는 지역변수의
// 이름이 같은 경우가 있다. 이때엔, 지금 현재 나보다 가까운 곳에 있는 지역변수가 더 우선순위가 있다. 멤버변수보다.
// 이클립스에서 지역변수는 갈색빛으로 띄고, 멤버변수는 파란색으로 띤다.

// 생명주기가 메소드나 생성자에 한정되있는 변수를 지역변수라고 한다. 즉 메소드나 생성자의 블록이 끝남과 동시에
// 사라지는 변수를 지역변수라고한다.

// this.변수를 통해 접근할 수있는 변수는 클래스안에 존재하지만 메소드 블록이나 생성자 블록 외부에 있는 멤버변수
// 에만 접근할 수있는 것이다.

// 클래스를 설계할때엔 멤버변수를 정의하고, 생성자를 정의하고, 그뒤 메소드를 정의하는 순서로 설계한다.

// 즉, this.멤버변수를 사용하면 메소드나 생성자내에서만 존재하는 지역변수와 멤버변수를 구분할 수 있기 위해서
// 등장한 것이기도 하다. 지역변수의 이름은 직관성을 위해 초기화하고자 하는 멤버변수의 이름과 같은것이좋기 때문이다.

// 만약, 생성자나 메소드에 정의된 그어떤 변수의 이름도 멤버변수와 동일하지 않다면, this 없이 그냥 멤버변수의
// 이름만 사용하여 멤버변수에 접근할 수 있다.

// shift + art + a : 다중선택이 가능한 단축키이다.

// 자바에서는 문자열을 객체로 취급한다.
// String 클래스는 java.lang 패키지에 포함된다.

// 반환형자료형 메소드이름() 이와같은 형태는 무조건 메소드이다 생성자는 반환형자료형이 없다.

// 메소드나 생성자를 연쇄적으로 호출하는 방식은 썩 좋은 방식은 아니다. 중복을 피하기 위해서일지라도 말이다. 또한
// 연쇄적으로 메소드를 호출하는 방식보다 직접 필요한 메소드나 생성자를 호출하는방식이 성능면에서 더 좋다.




public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member("홍길동");
		/*
		Member m2 = new Member();
		m2.name = "홍길동";
		*/
		
		Member m3 = new Member("윤길동", 22);
		Member m4 = new Member("한길동", 30, "O");
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
	}
}
