package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요 : ");
		
		int time = sc.nextInt();
		
		int seconds = time % 60;
		
		int minute = time / 60;
		
		int real_minute = minute % 60;
		
		int hours = minute % 60;
		
		System.out.printf("결과출력 : %d시간 %d분 %d초", hours, real_minute, seconds);

	}
	
}