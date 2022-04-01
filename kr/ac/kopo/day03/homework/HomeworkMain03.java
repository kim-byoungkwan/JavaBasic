package kr.ac.kopo.day03.homework;

public class HomeworkMain03 {
	
	public static void main(String[] args) {
		
		int upperCnt = 'Z' - 'A' + 1;
		
		int lowerCnt = 'z' - 'a' + 1;
		
		
		char ch = 'B';
		
		if(ch >= 'A' && ch <= 'Z') {
			
			ch = (char)(ch + ('a' - 'A'));
			
		} else if(ch >= 'a' && ch <= 'Z') {
			
			ch = (char)(ch - ('a' - 'A'));
		}
					
	}
	// 위와 같은 코드에서 char로 강제형변환을 한 이유는 문자열의 연산자에 의한 결과값은 정수로 결정되고 정수는 4byte의 
	// 저장용량의 범위를 갖고, char은 2byte의 저장용량의 범위를 갖는데 큰 저장용량범위에서 작은 저장용량범위로 형변환을 하는
	// 상황이므로 강제형변환을 해줘야하는 것이다.
	
	
	// 'z', 'A' 이와 같은 문자는 단독으로 있을 대엔 그 자체로 문자이지만, 2개이상의 문자와 어떠한 연산자에 의해 관계가 생기는
	// 순간, 그 때부터 이 문자는 문자가 갖고 있는 아스키 코드의 숫자로 인식된다. 형변환을 하지 않아도 자동으로 그렇게 인식하는 것이다.
	
}
