package kr.ac.kopo.day02;

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		int a = 10, b = 10;
		
		int max = a > b ? a : (a < b ? b : 0);
		
		max = a == b ? 0 : (a > b ? a : b);
		
		// 위의 코드는 a > b인경우는 a를 출력하고 a<b 인경우는 b로 출력하고 a == b 인경우는 0을 출력하게되는 코드이다.
		
		System.out.println("max : " + max);
		
	}
	
}
