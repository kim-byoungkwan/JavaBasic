package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		// {} 위와같이 new를 사용하지 않는 방식은 반드시 int[] arr이라는 코드와 반드시 함게 써야만
		// 가능한 방식이다.
		
//		arr = {5, 4, 3};
		
		// 그러므로 위와 같은 방식은 컴파일시 에러가 발생하게 된다.
		
		arr = new int[] {5, 4, 3};

		// 위와 같이 new 메소드를 이용해야만 오류가 발생하지 않는다.
		
		
//		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		System.out.println("arr : " + Arrays.toString(arr));
		
	}
	

}
