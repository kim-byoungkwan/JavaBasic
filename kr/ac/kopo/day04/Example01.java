package kr.ac.kopo.day04;

public class Example01 {
	
	public static void main(String[] args) {
		
		int space = 0;
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				
				if (j <= 5 - space || j >= 5 + space) {
				
					System.out.print('*');
				
				} else {
					
					System.out.print(' ');
					
				}
			
			}
				
			System.out.println();
			
			if(i < 5) {
				
				space++;
				
			} else {
				
				space--;
				
			}
			
		}
		
	}
	
}
