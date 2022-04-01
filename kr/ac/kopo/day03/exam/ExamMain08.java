package kr.ac.kopo.day03.exam;

public class ExamMain08 {
	
	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++) {
			
			for(int j=0;j<=i-1;j++) {
				
				System.out.print(' ');
			
			}
			
			
			for(int j=4;j>=i;j--) {
				
				System.out.print('*');
			
			}
		
		System.out.println();
			
		}
		
	}
	

}
