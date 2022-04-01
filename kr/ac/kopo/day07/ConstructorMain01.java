package kr.ac.kopo.day07;

//
// 디폴트생성자는 클래스내에 생성자가 하나도 정의되어있지 않을 때에만 생성된다. 만약에 클래스 내부에 어떠한 생성자가
// 정의되어있다면 디폴트 생성자가 생성되지 않고, 에러가발생한다.
// 만약에 생성자 앞에 반환형 타입이 정의되어 있으면 이는 JVM이 생성자가 아닌 일반 메소드로 인식해서 생성자가
// 없는 것으로 인식하여 디폴트 생성자를 생성한다. 즉, 메소드의 이름과 생성자의 이름은 다르게 하는 것이 좋다.
// 따라서, 생성자는 반환형이 없고, 클래스명과 동일한 정의를 갖는다.

// 생성자는 메소드처럼 오버로딩을 지원한다.

// 생성자를 사용하는 목적은 멤버변수를 초기화하기 위함이다.

// 반환형이 존재하면 그것은 생성자가 아니고 무조건 메소드이다. 정의에의해.
  


/*
 * 생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 없다
 * 3. 디폴트 생성자 지원 : 클래스내에 생성자가 존재하지 않은 경우  JVM이 자동으로 생성
 * 4. 오버로딩 지원
 * 5. 멤버변수 초기화
 */

class Car {
	
	Car() {
		System.out.println("Car() 생성자 호출...");
	}
	
	Car(int i) {
		System.out.println("Car(int) 생성자 호출...");
	}
	
	Car(int i, String s) {
		System.out.println("Car(int, String) 생성자 호출...");
	}
	
}

public class ConstructorMain01 {

	public static void main(String[] args) {
	
		Car c = new Car();
		Car c2 = new Car(10);
		Car c3 = new Car(10, "aaa");
	}
}
