package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 70, 30};
		
//		int[] copy = arr;
		
		// 위의 코드는 copy가 표현하는 주소값이 arr변수에 표현되어 있는 주소값을 할당하는 것이다. 즉,
		// 힙 영역의 하나의 저장공간을 두개의 변수 arr과 copy과 가리키도록 하는 방식인것이다.
		// 이러한 방식은 shallow copy 얕은 복사라고 한다. 이러한 복사는 실제 값을 복사한 것이아니라,
		// 주소값을 복사한 방식이다.
		
//		System.out.println("arr : " + Arrays.toString(arr));
//		
//		System.out.println("copy : " + Arrays.toString(copy));
		
		// shallow copy에 의해 주소값이 표현하는 저장공간을 문자열로 표현하게된다.
		

//		int[] copy = new int[arr.length];
//		
//		for(int i = 0; i < arr.length; i++) {
//			
//			copy[i] = arr[i];
//			
//		}
		
		// 위의 방식은 deep copy 방식
		
		int[] copy = new int[arr.length];
		
		System.arraycopy(arr, 0, copy, 0, arr.length);
		
		// 위와 같은 메소드를 사용해서 deepcopy를 구현할 수도있다.
		// 이때, System 클래스는 import 하지 않았는 이 클래스는 java.lang 패키지에 들어 있기 때문이다.
		// 왜냐면 JVM은 자바를 실행할때 자동으로 java.lang 패키지를 불러오기 때문이다.
		
		
		System.out.println("arr : " + arr);
		
		System.out.println("copy : " + copy);
		
		// shallow copy의 경우 같은 저장공간을 가리키고 있으므로, 시작주소값을 갖고 있는 변수 arr과 copy의
		// 주소값은 같지만, deep copy의 경우는 다르다.
		
		System.out.println("arr : " + Arrays.toString(arr));
		
		System.out.println("copy : " + Arrays.toString(copy));

		
		
		
		copy[2] = 100;
		
		// shallow 카피의 경우 copy는 힙의 저장공간을 가리키는 주소값을 갖고 있고, 이경우 copy는 arr와 같은
		// 저장공간의 배열을 가리키므로 arr과 copy 배열의 값은 서로 같지만, 위의 deep copy 방식의 경우 실제 
		// copy 변수는 arr배열과 다른 힙영역의 저장공간을 가리키므로, 그 저장공간의 배열의 값을 바꾸게 된다.
		
		
		System.out.println("arr : " + Arrays.toString(arr));
		
		System.out.println("copy : " + Arrays.toString(copy));
		
		
	}

}
