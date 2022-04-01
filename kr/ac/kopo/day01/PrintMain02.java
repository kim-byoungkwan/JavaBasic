package kr.ac.kopo.day01;

public class PrintMain02 {
	
	public static void main(String[] args) {
		
		System.out.println('A');
		
		System.out.println('A' + "BCD");
		
		System.out.println('A' + 'B');
		
		System.out.println('A' + 10);
		
		System.out.println(0x41 + 0x42);
		
	}

}

/*
 * ascii code는 대문자, 소문자, 숫자, 특수문자, 공백문자를 숫자로 일대일매칭시킨 숫자표이다.
 * 이따 키보드의 문자는 한정되어있으므로, 아스키 코드는 0~256으로 구ㄱ성된다.
 * 
 * 유니코드는 아스키코드가 우리나라 한국어를 표현하는데에 숫자의 종류에 있어서 한계가 존재하기 때문에 등장한 코드이다. 0~65500
 * 으로 구성되어있다. 일반적인 프로그래밍 언어는 아스키코드를 사용하는데 자바에서는 유니코드를 사용한다.
 * 
 * 'A' : 65 -> 16진수 0x
 * 'a' : 97 -> 16진수 0x61
 * '0' : 48 -> 16진수 0x30
 * 
 * 따라서 자바에서는 유니코드 기반이므로 문자와 문자를 더하면 이를 유니코드로 변환하여 인식하게된다.
 * 
 */






