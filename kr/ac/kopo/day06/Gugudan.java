package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {

	int dan;
	// 위와 같은 dan과 같은 변수는 Gugudan이라는 같은 클래스 안에서의 모든 메소드가 사용할 수 있는 
	// 멤버변수이다. 즉, 같은 클래스 안의 멤버변수는 메소드의 리턴 타입에 상관없이 사용할 수 있는 멤버변수이다.
	
	// 눈에보이는 사물들을 객체로 추상화하는 과정이기때문에 하나의 클래스안에 메소드만 존재하는 경우는 드물다.
	// 클래스 안에는 멤버변수와 메소드가 함께 존재하고있다.
	
	
	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
	
	/**
	 * 파라미터로 날라온 정수의 해단 구구단을 출력
	 * @param dan 출력단
	 */
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	/**
	 * 2 - 9단사이의 구구단 출력
	 */
	void print() {
	
		print(2, 9);
		
//		for(int dan = 2; dan <= 9; dan++) {
//			print(dan);
//		}
	}
	
	/**
	 * 파라미터로 날라온 시작단~종료단 사이의 구구단 출력
	 * @param start  시작단
	 * @param end    종료단
	 */
	void print(int start, int end) {
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}
}



/*
public class Gugudan {

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	void print() {
		
//		print(2);
//		print(3);
//		print(4);
//		print(5);
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
	}
}
*/
