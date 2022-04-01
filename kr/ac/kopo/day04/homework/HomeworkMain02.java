package kr.ac.kopo.day04.homework;

// 이문제의 경우는 5m를 올라가면서 1m 또는 2m를 미끄러지는 경우는 구현한 것이다.

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		int snail = 0, hour = 0;
		
		while(snail < 100) {
			
			snail += (snail < 50 ? 5-1 : 5-2);
			
			System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총 높이 : " + snail + "M");

		}
		
	}
				
}

//이문제의 경우는 5m를 올라간 뒤에 1m 또는 2m를 내려오는 경우를 구현한 것이다.

//		int snail = 0, hour = 0;
//		
//		while((snail+= 5) < 100) {
//			
//			snail += snail < 50 ? -1 : -2;
//			
//			System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총 높이 : " + snail + "M");
//
//		}
//		
//		System.out.println("[" + ++hour + "시간후] 달팽이가 올라간 총 높이 : " + snail + "M");
//		
//	}