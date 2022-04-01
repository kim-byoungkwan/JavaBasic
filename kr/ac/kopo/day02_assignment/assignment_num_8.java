package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_8 {
	
	public static void main(String[] args) {
		
		System.out.println("물건값을 입력 : ");
		
		System.out.println("지불한 돈의 액수 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		int payed_money = sc.nextInt();
		
		int changed_money = payed_money - price;
		
		System.out.printf("거스름돈 : %d원\n", changed_money);
		
		int count_1000 = 0; 
		int count_500 = 0;
		int count_100 = 0;
		int count_50 = 0;
		int count_10 = 0;
		
		
		while(changed_money != 0) {
			
			if(changed_money >= 1000) {
				
				count_1000 = (changed_money / 1000); 
				
				changed_money = changed_money % 1000;
				
			} else if(changed_money >= 500) {
				
				count_500 = (changed_money / 500);
				
				changed_money = changed_money % 500;
				
			} else if(changed_money >= 100) {
				
				count_100 = (changed_money / 100);
				
				changed_money = changed_money % 100;
				
			} else if(changed_money >= 50) {
				
				count_50 = (changed_money / 50);
				
				changed_money = changed_money % 50;
				
			} else {
				
				count_10 = (changed_money / 10);
				
				changed_money = changed_money % 10;
				
			}
			
		}
		
		System.out.printf("1000 원 : %d개\n", count_1000);
		
		System.out.printf("500 원 : %d개\n", count_500);
		
		System.out.printf("100 원 : %d개\n", count_100);
	
		System.out.printf("50 원 : %d개\n", count_50);
		
		System.out.printf("10 원 : %d개\n", count_10);
		
	}

}
