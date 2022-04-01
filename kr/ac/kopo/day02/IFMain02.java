package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * if(조건1) {
 * 		문장1;
 * } else {
 * 		if(조건2) {
 * 			문장2;
 * 		} else {
 * 			문장3;
 * 		}
 * }
 * 		
 * 아래와 같은 조건문을 작성할 때엔, 조건의 범위를 가장 작은 것에서 부터 조건문을 작성하거나, 가장 큰 것에서부터 조건문을 작성하는방식으로
 * 작성해야 코드 작성이 효과적이다.
 * 
 */


public class IFMain02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		
		int time = sc.nextInt();
		
		if(time < 815) {
			
			if(time < 800) {
				
				System.out.println("걸어간다");
				
			} else {
				
				System.out.println("버스를 탄다");
				
			}
			
		} else {
			
			System.out.println("택시를 탄다");
			
		}
		
		
		
		if(time < 800) {
			
			System.out.println("걸어서 학교에 간다");
			
		} else {
			
			 if(time < 815) {
				 
				 System.out.println("버스를 타고 학교에 간다");
				 
			 } else {
				 
				 System.out.println("택시를 타고 학교에 간다");
			 }
			
		}
		
	}
	
}
