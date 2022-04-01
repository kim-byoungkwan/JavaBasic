package kr.ac.kopo.day04;

import java.util.Arrays;

// 아래와 같은 코드에서 strArr 이라는 변수에는 strArr이름의 문자열 배열에 데이터가 저장되어 있는 배열을 가리키는
// 주소값이 저장되어 있다. 그런데, 이 주소값은 스트링 배열의 실제 데이터 값이 저장된 공간을 가리키고 있는 것이 아니라,
// 실제 데이터를 가리키고 있는 주소값을 갖고있는 배열의 시작 주소값을 가리키고 있다. 이때, 실제 문자열 데이터는
// 파편적으로 힙영역에 존재하고 있는 상태이다. 결과적으로 string 참조자료형으로 만들어진 객체는 힙에서 주소값을 갖고 있는
// 배열이 존재하고 실제 값을 갖고있는 데이터가 파편적으로 존재하는 것이다. 

public class ArrayMain02 {
	
	public static void main(String[] args) {
		
//		String[] strArr = {"데이터분석", "자바", "교육"};
		
//		String[] strArr = new String[3];
//		
//		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
//		
//		System.out.println("첫번째 문자열 : " + strArr[0]);
//		
//		System.out.println("두번째 문자열 : " + strArr[1]);
//		
//		System.out.println("세번째 문자열 : " + strArr[2]);
		
		// 참조자료형으로 만든 객체에 할당되는 초깃값은 null이다.

		String[] strArr = new String[5];
		
		int loc = 0;
		
		strArr[loc++] = "폴리텍";
		
		strArr[loc++] = "데이터분석";
		
		strArr[loc++] = "자바";
		
		strArr[loc++] = "교육";

		// 위와 같이 변수의 후위증가의 방식으로 배열에 값을 추가할 수 있다.
		
		System.out.println("< index를 이용한 출력 >");
		
		for(int i = 0; i < strArr.length; i++) {
			
			System.out.println(strArr[i]);
			
		}
	
		System.out.println("< JDK 1.5버전의 for문을 이용한 출력 >");
		
//		for(변수선언:배열명){} 이와 같은 방식에 의해서 배열에 존재하는 모든 원소값에 접근할 수 있다.
		
		for(String s : strArr) {
			
			System.out.println(s);
			
		}
		
		System.out.println("< Arrays.toString() 메소드를 이용한 출력 >");
		
//		Arrays.toString(배열명) 이와 같은 방식에 의해 배열에 존재하는 모든 요소를 하나의 문자열로 표현하여 출력할수있다.
		
		String result = Arrays.toString(strArr);
		
		System.out.println(result);
		
	}
	
}
