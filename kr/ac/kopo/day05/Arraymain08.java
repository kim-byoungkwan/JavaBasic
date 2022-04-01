package kr.ac.kopo.day05;

// 참조자료형 형태의 1차원 배열을 만들면 본질적으로는 2차원 배열처럼 동작처럼 이루어진다. 그러므로, 
// 대부분 1차원의 참조자료형 배열만으로도 이미 2차원 배열의 동작을 일으키고 있으므로 1차원을 주로 사용하는 것이다.



public class Arraymain08 {

	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		
		strArr[0] = "hello";
		
		strArr[1] = new String("good");
		
		strArr[2] = "byebye~~~~";
		
		for(String str : strArr) {
			
			System.out.println(str);
		}
		
	}
	
}
