package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 : ");
		
		System.out.println("나눌 수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		int divider = sc.nextInt();
		
		int result = num / divider;
		
		int residual = num % divider;
		
		System.out.printf("몫 : %d\n", result);
		
		System.out.printf("나머지 : %d ",residual);
				
	}
	
}
	
	