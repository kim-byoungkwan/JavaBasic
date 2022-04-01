package kr.ac.kopo.day04.homework;

// 반복문의 조건에서 증감부분은 ,콤마 로 연결시킬 수 있고, 조건 부분은  &&와 같은 논리 연산자로 묶어줘야한다.
// 반복문의 시작조건은 반드시 변수에 상수값이 대입되어야 할 필요는 없다. 어떤 변수도 시작조건의 대입연산자에 대입될
// 수 있는데, 단, 그 변수는 미리 정의되어있어야 한다.

public class HomeworkMain01 {
	
	public static void main(String[] args) {
		
		int step = 3;
		
		for(int dan = 2; dan <= 9; dan += 3) {
			
			for(int i = 1; i <= 9; i++) {
				
				for(int j = dan; j <= 9 && j < dan + step; j++) {
					
					if(i == 0) {
					
						System.out.printf("%d * %d = %d\t",j, i, j*i);			
					
					} else {
						
						System.out.println();
						
					}
			
				}
			
			}
		
		System.out.println();
		
		}
	
	}

}