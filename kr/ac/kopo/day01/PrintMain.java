package kr.ac.kopo.day01;

/* 
 주석문 안에 있는 코드는 무엇이 됐든 컴파일 될 때 변환되지 않는 부분이다. 오직 개발자 사용자가 이해하기 위한 목적으로만 구성된다.
 이러한 주석문 여러줄을 쓸 수 있다. 또한, 주석문은 중첩되어선 안된다. 중첩되면 주석으로 인식되지 않기때문이다.
 */

// 슬래쉬 두개는 한줄단위의 주석처리를 할 때 쓰인다.


/*
 상수의 종류
 1. 정수형 상수
 2. 실수형 상수
 3. 문자형 상수('A'. 'b')
 4. 문자열 상수("abc")
 5. 논리형 상수 true false
 */


/*
 * 출력메소드
 * 1. println() : 개행문자를 포함한다.
 * 2. print() : 개행문자를 포함하지 않는다.
 * 3. printf() : jdk1.5 버전에 새로 추가된 문법, 개행문자를 포함하고 있지 않은 메소드이다, f는 여기서 formating을 의미한다.
 * 				 이때 f의 포맷팅을 출력하고자하는 것의 포맷팅을 설정하여 편하게 표현할 수 있음을 의미한다.
 * 				 프린트f의 본질은 "" 안에 들어있는 것을 출력한다는 의미이다. 이때, 출력하고자하는 것의 형태를 %기호를 사용하여
 * 				 표현한다. 
 * 				%d 정수
 * 				%f 실수
 * 				%c 문자
 * 				%s 문자열
 * 				%b 논리값
 */

public class PrintMain {
	
	public static void main(String[] args) {
		
		System.out.println(10);
		
		System.out.println('a');
		
		System.out.println("abc");
		
		System.out.println(true);
		
		System.out.println(23 + "살");
		
		System.out.print(23);
		System.out.println("살");
		
		System.out.println(10 + "+" + 20 + "=" + 10 + 20);
		
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("%d살", 23);
		
		System.out.println();
		
		System.out.printf("%d살\n", 23);
		
		System.out.println();
		
		System.out.printf("%d + %d = %d", 10, 20, 30);
		
		System.out.printf("[%d]\n", 1200);
		
		System.out.printf("[%d]\n", 950);
		
		System.out.printf("[%d]\n", 15800);
		
		System.out.printf("[%7d]\n", 1200);
		
		System.out.printf("[%7d]\n", 950);
		
		System.out.printf("[%7d]\n", 15800);
		
		System.out.printf("[%-7d]\n", 1200);
		
		System.out.printf("[%-7d]\n", 950);
		
		System.out.printf("[%-7d]\n", 15800);
		
		System.out.printf("[%04d]\n", 35);
		
		System.out.printf("[%f]\n", 12.3456);
		
		System.out.printf("[%.4f]\n", 12.3456);

		System.out.printf("[%.2f]\n", 12.3456);
		
		System.out.printf("%b\n", true);
		
		
	}

}








