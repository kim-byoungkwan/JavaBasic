package kr.ac.kopo.day04.homework;

// �ݺ����� ���ǿ��� �����κ��� ,�޸� �� �����ų �� �ְ�, ���� �κ���  &&�� ���� �� �����ڷ� ��������Ѵ�.
// �ݺ����� ���������� �ݵ�� ������ ������� ���ԵǾ�� �� �ʿ�� ����. � ������ ���������� ���Կ����ڿ� ���Ե�
// �� �ִµ�, ��, �� ������ �̸� ���ǵǾ��־�� �Ѵ�.

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