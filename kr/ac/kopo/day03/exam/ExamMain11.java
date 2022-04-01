package kr.ac.kopo.day03.exam;

public class ExamMain11 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			
			if (i<=5) {
				
				for(int j=5;j>=i;j--) {
					
						System.out.print('*');	
						
					}
				
					System.out.println();
				
			} else {
				
				for(int j=6;j<=i+1;j++) {
							
					System.out.print('*');	
					
				}
				
				System.out.println();
			
			}
		
		}

	}

	
}
