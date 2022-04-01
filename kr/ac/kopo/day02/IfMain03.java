package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 중첩된 if문을 사용하면 조건들이 서로 종속적인 관계에 놓여있는 것처럼 보이지만, 실제로는 조건들이 수평적인 경우
 * 코드를 해석하기에 매우 복잡해 보일 수 있다. 그러므로, 이러한 상황에서 수평적인 조건들을 직관적으로 이해하기 쉽게 표현하기 위해선
 * elseif 문을 사용하게 된다. 본질적으로 의미가 동일하기 때문이다.
 * 
 * 
 * if 문에 블록 처리를 안하면 무조건 다음에 1줄의 코드만 블록으로 인식하고 실행한다. 그리고, 그 뒤의 코드는 무조건 실행되게된다.
 * 
 * 
 */


public class IfMain03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		
		int time = sc.nextInt();
		
		if(time >= 800 && time < 815) {
			
			System.out.println("버스를 타고 학교 간다");
			
		} else if(time < 800) {
			
			System.out.println("걸어서 학교간다");
			
		} else {
			
			System.out.println("택시타고 학교간다");
			
		}
		
	}
	
}
