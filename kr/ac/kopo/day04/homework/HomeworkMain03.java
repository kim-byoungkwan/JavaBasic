package kr.ac.kopo.day04.homework;

public class HomeworkMain03 {
	
	public static void main(String[] args) {
		
		int star = 1;
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= star; j++) {
				
				System.out.println('*');
				
			}
			
			System.out.println();
			
			// 아래의 if else문은 for문의 그 다음 회차의 시행에 적용되는 부분이므로, 5에 등호가 들어가지 않는다.
			if(i < 5) 
				
				star++;
			
			else
				
				star--;
				
			
		}
		
	}

}
