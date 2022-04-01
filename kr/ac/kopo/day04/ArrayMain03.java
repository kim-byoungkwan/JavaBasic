package kr.ac.kopo.day04;

public class ArrayMain03 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = i+1;
			
		}
				
		
		System.out.println("< PRINT >");
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + '\t');
			
		}
		
		System.out.println();
		
		
		System.out.println("< PRINT >");
		
		for(int num : arr) {
			
			System.out.println(num + "\t");
			
		}
		
		
		int data = 1;
		
		for(int num : arr) {
			
			num = data++;
			
		}
		
		// 위의 num변수는 arr배열의 데이터를 담고 있는 복사본으로써 어떤 값을 위와 같이 data++ 와 같이 대입하더라도
		// for문의 1.5버전에서는 위의 num 변수는 {} 블록이 한사이클 반복될때까지만 생존해있는 것이므로, 다시 처음으로
		// 돌아갈 경우 num변수는 초기화 되어 다시 arr의 요소값이 할당되게 된다. 즉, 1.5버전의 for문은 출력을 위해서
		// 존재하는 메소드이다.
		
		
		
	}

}
