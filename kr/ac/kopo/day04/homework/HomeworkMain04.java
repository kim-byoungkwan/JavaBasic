package kr.ac.kopo.day04.homework;

// 규칙을 파악하는 것은 그 어떤 상황에서도 필요한 능력이다.

public class HomeworkMain04 {
	
	public static void main(String[] args) {
		
		int star = 5;
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 5-star; j++) {
				
				System.out.print('-');
				
			}
			
			for(int j = 1; j <= star; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
			if(i < 5) {
				
				star--;
					
			} else {
				
				star++;
				
			}
			
		}
		
	}
}