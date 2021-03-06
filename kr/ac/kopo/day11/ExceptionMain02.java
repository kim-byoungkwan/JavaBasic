package kr.ac.kopo.day11;

/*
 * JVM 자체게 기본적으로 내장된 예외처리기가 존재하고있다. 그래서 만약 내가 예외처리를 따로 하지 않더라도 JVM이 자동으로 예외처리를하게된다.
 * 
 * 자바에서 try catch 문을 사용하는 이유는 if 문을 사용해서 예외처리를 직접해주면 되지만, 그렇게 직접 해줌에도 불구하고, 내가 생각하지못한
 * 문제가 발생해서 프로그램이 중단되는 경우가 생길 수 있으므로, 이런 경우에도 프로그램이 완전하게 동작하게 하기 위해서 예외처리문 try catch문을
 * 자바에서 사용하는 것이다.
 * 
 * catch(아리스메틱 ae) 에서 try에서 발생한 예외를 아리스메틱 클래스 자료형의 객체를 가리키는 주소공간 ae 변수가 가리킬 수 있게하여
 * catch 블록 안에 동작이 실행될 수 있게 하는 것이다. 즉, try 문에서 발생된 예외에 대한 정보를 ae 참조변수가 가리키고 있는 것이다.
 * 그러므로 ae.getmessage() 라는 메소드를 통해 ae가 가리키고 있는 예외를 보여줄 수 있게 하는 것이다.
 * 이와 같이 예외가 발생된 try문의 코드의 정보가 담긴 객체를 ae 변수의 주소값이 가리키고 있게 되므로, ae변수명에 .점을 통해 접근하여
 * 예외가 발생된 코드에 대한 정보를 얻을 수 있다. ae.printStackTrace()를 사용하면 예외가 발생된 상황이 try문의 어디였는지를 알 수 있는
 * 것이다.
 * 
 * 다양하게 발생할 수 있는 예외상황을 처리하기 위해서 catch를 여러개 사용해서 다양한 예외상황을 처리할 수 있는 것이다.
 * 예외의 종류에는 아리스메틱 , 스트링오브아웃오브바운드 등이 있는데, 이 예외상황은 모두 각각의 예외 클래스에 담겨있는데, 그 클래스를 자료형으로
 * 규정하여 참조변수를 생성하면 그 참조변수가 각각의 예외상황이 발생된 정보를 담고있는 객체를 가리키게 하는 것이다.
 * 
 * 만약 catch에 설정된 예외가 아닌 다른 예외가 발생하면 JVM의 기본 내장된 예외처리 동작이 작동하여 프로그램이 즉각종료된다.
 * 
 * 그런데, 다양하게 발생되는 예외상황을 여러개의 catch에 규정하여 처리할 수 있지만, 하나의 catch 문에 | 또는 기호를 사용하여 설정하고,
 * 이 또는이 포함된 다각적인 예외상황의 정보를 한번에 표현하고 있는 참조변수를 정의하여 그 참조변수가 또는이 포함된 예외상황정보를 갖고있는
 * 객체의 정보를 한번에 가리킬 수 있게하는 것이다.
 * 
 * 모든 예외처리 클래스는 Exception을 부모클래스로 하여 상속받아서 존재하게되므로, catch(Exception e)와 같이 처리하여 부모클래스의
 * 참조변수 e를 통해 묵시적형변환이 자동으로 발생되어 자식클래스의 예외처리 메소드를 e.메소드() 와 같이 접근할 수 있다. 
 * 
 * 따라서, 모든 예외정보를 접근할 수 있는 최상위 부모클래스인 Exception 클래스를 catch 문에 설정하여 그 클래스를 참조자료형으로 하는
 * 참조변수 e를 정의하여 예외를 일반적으로 처리한다.
 * 
 * FileReader fr = new FileReader("a.txt") 와같은 코드는 외부에서 발생하는 예외이므로, 자바에서 compile시점에 미리 예외상황을
 * 알 수 있으므로, 이에 대해선 항상 try 블록에 포함하여 외부에서 발생할 확률이 높은 예외상황을 컨트롤 할 수 있도록 해야한다.
 * 즉, 이와같이 외부에서 발생하는 동작과 같이 예외가 발생할 확률이 매우 높은 상황에 대해서는 무조건 try문을 사용해야할 경우가 있는 것이다.
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
		} catch(ArithmeticException ae) {
//			System.out.println("예외발생 : " + ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("main end...");
		
	}
}
