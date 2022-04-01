package kr.ac.kopo.day05;

import java.util.Arrays;

// 이차원 배열은 직관적으로 행렬처럼 이해해도 좋지만, 본질적으로는 주소의 접근의 개념으로 이해해야한다.

public class ArrayMain07 {
	
	public static void main(String[] args) {
		
		int[][] ar = new int[3][];
		// 위의 코드는 new라는 동작을 통해 생성된 객체의 생성이 1번만 일어난 상황이다.
		
		for(int i = 0; i < ar.length; i++) {
			
			ar[i] = new int[(int)(Math.random()*3)+2];
			
		}
		
		for(int i = 0; i < ar.length; i++) {
			
			for(int j = 0; j < ar[i].length; j++) {
				
				ar[i][j] = i*10 + (j+1);
				
			}
			
			System.out.println();
			
		}
		
		for(int[] arr : ar) {
			
			System.out.println(Arrays.toString(arr));
			
		}

		for(int[] arr : ar) {
			
			for(int num : arr) {
		
		// 1.5버전 for문에서의 용법은 : 왼쪽의 배열의 요소값은 오른쪽의 배열의 변수가 표현하는 주소가 표현하는
		// 배열 객체의 요소값을 의미한다.
				
				System.out.print(num + " ");
				
			}
			
			System.out.println();
		
		}
		
	}
	
}
