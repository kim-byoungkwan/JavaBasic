package kr.ac.kopo.day03.homework;

public class HomeworkMain02 {
	
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 30) +1;
		
		int num2 = (int)(Math.random() * 30) +1;
	
		int num3 = (int)(Math.random() * 30) +1;
		
		int num4 = (int)(Math.random() * 30) +1;
		
		// Math.random()은 0부터 1미만의 난수가 추출된다.
		// 10미만의 정수를 추출하려면 위와 같이 소수점의 실수형태의 값을 더 작은 범위의 정수로 강제형변환하는 과정이 필요하다.
		
		System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4);
		
		
		int max = num1 > num2 ? num1 : num2;
		// = 대입 연산자의 우선순위가 모든 연산자중에 가장 낮다.
		// 따라서 위의 코드는 삼항연산자가 먼저 실행되고, 그 결과값이 max에 우선순위가 가장 낮은 대입 연산자 = 에 의해
		// 최종적으로 대입되는 것이다.
		
		if(max < num3) {
			
			max = num3;
			
		}
		
		if(max < num4) {
			
			max = num4;
			
		}
		
		// 위의 코드는 if문이 병렬적으로 표현되어 있지만, max라는 연쇄적인 변수에 의해서 토너먼트식의 연산과정이 실행되는 것이다.

	}
	
}
