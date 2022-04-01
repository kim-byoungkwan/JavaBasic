package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 1 ~ 3 사이의 정수 입력:
 * 1 입력시 "one" 출력
 * 2 입력시 "Two" 출력
 * 3 입력시 "Three" 출력
 * 그외 "Error" 출력
 * 
 * case 문에서의 블록 {} 은 아무런 영향을 갖고 있지 않다. 오직 블록은 switch에서만 의미가 있다.
 * 
 * 또한, switch case 문은 if이 n개중에 1개를 택하는 개념이라면 n개 중에 m개를 택하는 다중 선택의 개념이다.
 * 즉, switch case 문은 책에 붙여둔 포스트잇의 개념이다. 즉, 포스트잇을 붙여놓은 곳을 펼친뒤 그곳에서 부터 시작하면 무조건
 * 그곳에서부터 책의 마지막까지 읽어야하는 것과 같은 개념이다. 그러므로, 이러한 switch case 문의 다중선택적 개념을 if 처럼
 * n개중 1개를 택하는 개념처럼 사용하기 위해 switch case 문은 break 와 함께 사용하여 1개를 택하는 동작처럼 사용한다.
 * 
 * break 문은 if 문과 아무런 상관이 없다. break 문은 반복문, while문 switch case 문에서만 의미가 있다. 
 * 만약 if문에서 단독으로 break를 쓰면 에러가 난다.
 * 
 * 또한, default문은 어떤 위치에 존재한다 하더라도, 반드시 case 조건문을 모두 실행한 다음에 마지막에 실행된다.
 * 그리고, case 문 또한 어떤 위치에 존재한다 하더라도, 범위의 개념이 아니라 case문의 조건의 개념들은 동등한 개념이기 때문에,
 * 문제 없이 실행될 수 있다.
 * 
 * switch 문의 조건수식에 사용될 수 있는 것은 오직 byte, short, char, int만 가능하다.
 * 
 * 
 * 
 */



public class Switchmain01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 - 3 사이의 정수 입력 : ");
		
		int num = sc.nextInt();
		
		if(num == 1) {
			
			System.out.println("one");
			
		} else if(num == 2) {
			
			System.out.println("Two");
			
		} else if(num == 3) {
			
			System.out.println("Three");
			
		} else {
			
			System.out.println("Error");
		}
		
		
		
		switch(num) {
		
		case 1 :
			System.out.println("one");
			break;
			
		case 2 :
			System.out.println("Two");
			break;
		
		case 3 :
			System.out.println("Three");
			break;
	
		default :
			System.out.println("Error");		
		}
		
	}
	
}
