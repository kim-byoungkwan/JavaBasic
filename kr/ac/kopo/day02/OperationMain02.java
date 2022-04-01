package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * a 입력 : 10
 * b 입력 : 3
 * 
 * 10이 3의 배수인가? False
 * 
 * a 입력 : 10
 * b 입력 : 5
 * 
 * 10이 5의 배수인가? true
 * 
 */


public class OperationMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a 입력 : ");
		
		int a = sc.nextInt();
		
		System.out.println("b 입력 : ");
		
		int b = sc.nextInt();
		
		System.out.println(a + " : " + b);
		
		boolean result = (b != 0 && a % b == 0);
		// b가 0이면 && 뒤는 아예 수행조차 되지 않는다.
		// 단, 위의 경우 && 앞뒤의 연산자의 순서가 바뀌면 의미가 없다 b가 0인경우 에러가 뜨기때문이다.
		// 따라서 && 연산자와 같은 연산자의 교환법칙이 성립하지 않는다는 것이다.
		
		System.out.printf("%d가 %d의 배수인가? %b\n", a, b, result);
		
	}
	
}



