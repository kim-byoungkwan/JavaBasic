package kr.ac.kopo.day02_assignment;

import java.util.Scanner;

public class assignment_num_7 {
	
	public static void main(String[] args) {
		
		System.out.println("입력(알파벳) : ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		
		char c = inputStr.charAt(0);
		
		int num = (int)c;
		
		if (num >=65 && num <=90) {
			
			int gap = num - 65;
			
			num = 97 + gap;
			
		} else if(num >= 97) {
			
			int gap = num - 97;
			
			num = 65 + gap;
			
		}
		
		char str = (char)num;
		
		System.out.printf("변경된 값 : %s",str);
		
	}

}
