package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력하시오");
		
		int r = sc.nextInt();
		
		final double pi = 3.141592;
		
		System.out.printf("결과출력 : 원의 면적은 %.4f 입니다", pi*r*r);
				
	}
	
}
