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
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
		} catch(ArithmeticException ae) {
			System.out.println("ArithmeticException : " + ae.getMessage());
//			ae.printStackTrace();
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : "
							+ se.getMessage());
		}
		System.out.println("main end...");
		
	}
}
