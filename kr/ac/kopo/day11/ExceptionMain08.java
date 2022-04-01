package kr.ac.kopo.day11;

/*
 * throw로 던진 예외는 반드시 try catch가 받아야만 한다.
 * 
 * throw는 어떤 코드가 일반적으로 예외가 발생할 시점이 아닌 정상적인 코드인데, 이 코드에서 예외가 발생했을 경우 이 예외를 처리하기위해
 * 사용하는 코드이다.
 * 
 * 
 */

import java.util.Scanner;

class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
	}

	public MismatchEvenException(String message) {
		super(message);
	}
	
}

public class ExceptionMain08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();

			if (num < 0 || num % 2 == 1) {
				throw new MismatchEvenException(num + "은 짝수가 아닙니다");
			}
		} catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수를 입력 : ");
		int num = sc.nextInt();
		
		if(num < 0 || num % 2 == 1) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
	}
}

