package kr.ac.kopo.day04.homework;

// �̹����� ���� 5m�� �ö󰡸鼭 1m �Ǵ� 2m�� �̲������� ���� ������ ���̴�.

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		int snail = 0, hour = 0;
		
		while(snail < 100) {
			
			snail += (snail < 50 ? 5-1 : 5-2);
			
			System.out.println("[" + ++hour + "�ð���] �����̰� �ö� �� ���� : " + snail + "M");

		}
		
	}
				
}

//�̹����� ���� 5m�� �ö� �ڿ� 1m �Ǵ� 2m�� �������� ��츦 ������ ���̴�.

//		int snail = 0, hour = 0;
//		
//		while((snail+= 5) < 100) {
//			
//			snail += snail < 50 ? -1 : -2;
//			
//			System.out.println("[" + ++hour + "�ð���] �����̰� �ö� �� ���� : " + snail + "M");
//
//		}
//		
//		System.out.println("[" + ++hour + "�ð���] �����̰� �ö� �� ���� : " + snail + "M");
//		
//	}