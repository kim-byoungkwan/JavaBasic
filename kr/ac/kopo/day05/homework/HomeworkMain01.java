package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain01 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		
		int[] sum = new int[2];
		
		Scanner sc = new Scanner(System.in);
		
		// for()의 조건에서 만약 증감조건이 존재하지 않으면, for문의 초기변수에 아무런 효과도 일어나지 않는다.
		// 또한, 증감조건이 없어도 에러가 발생하지 않고 정상적으로 for문이 동작할수 있다.
		
		
		for(int i = 0; i < nums.length; i++) {
			
			do {
			
				System.out.print(i+1 + "번째 정수 입력 : ");
			
				nums[i] = sc.nextInt();
			
			} while(nums[i] < 0);
			
			sum[nums[i] % 2] += nums[i];
			
		}
		
		String[] title = {"짝수", "홀수"};
		
		for(int mod = 0; mod <= 1; mod++) {
			
			System.out.println(" < " + title[mod] + " > ");
			
			for(int i = 0; i < nums.length; i++) {
				
				if(nums[i] % 2 == mod) {
					
					System.out.print(nums[i] + " ");
				
				}
				
			}
			
			System.out.println();
			
			System.out.println(title[mod] + "총합 : " + sum[mod]);
			
		}
				
	}

}
