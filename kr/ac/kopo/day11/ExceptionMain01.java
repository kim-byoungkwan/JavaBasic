package kr.ac.kopo.day11;

/*
 * JVM 자체게 기본적으로 내장된 예외처리기가 존재하고있다. 그래서 만약 내가 예외처리를 따로 하지 않더라도 JVM이 자동으로 예외처리를하게된다.
 * 
 * 자바에서 try catch 문을 사용하는 이유는 if 문을 사용해서 예외처리를 직접해주면 되지만, 그렇게 직접 해줌에도 불구하고, 내가 생각하지못한
 * 문제가 발생해서 프로그램이 중단되는 경우가 생길 수 있으므로, 이런 경우에도 프로그램이 완전하게 동작하게 하기 위해서 예외처리문 try catch문을
 * 자바에서 사용하는 것이다.
 * 
 * 
 * 
 */

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		Random r = new Random();
		int num = r.nextInt(3);	// 0, 1, 2
		System.out.println("num : " + num);
		System.out.println(10 / num);
		System.out.println("main end...");
		
	}
}
