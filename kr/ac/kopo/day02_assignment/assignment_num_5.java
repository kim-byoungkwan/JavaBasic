package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_5 {
	
	public static void main(String[] args) {
		
		final double fixed_dollar = 1092.50;
		
		System.out.println("달러를 입력하세요 ? ");
		
		Scanner sc = new Scanner(System.in);
		
		int putted_dollar = sc.nextInt();
		
		System.out.printf("원화 : %.2f원", fixed_dollar*putted_dollar);
		
	}
	
}