package kr.ac.kopo.day07;

// new와 함께 쓰이는 것은 무조건 생성자또는 배열로서, 인스턴스객체를 생성하는 데에 사용된다.
// c에서의 문자는 아스키코드 기반으로 움직인다.
// 어떠한 데이터를 주고받고자할때 바이트단위로움직인다.

// string 클래스에 존재하는 equals 메소드는 대소문자를 구별한다. 그러나, equalsignoreCase 메소드는 
// 대소문자를 구별하지 않고 비교하는 메소드이다.

// 문자열의 크기비교는 문자열의 사전순 순서로 대소비교하게 된다.

// 지금나와있는 모든 메소드는 문자열.메소드 와같은 방식으로 본질적으로 이루어지고 있는 것이다.
// 이것이 가능한 이유는 본질적으로 문자열은 자바에서 객체로서 인식하고 있기 때문에 문자열.메소드가 성립하는 것이다.
// 그러므로 이 문자열은 객체로서 객체를 저장하고 있는 힙의 저장영역이 존재하고 이 저장영역을 가리키는 주소값을 갖고
// 있는 변수가 스택에 존재하고 있는 것이다. 왜냐면 문자열은 참조자료형 String 클래스로 생성된 




import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		String str = new String("hello");
		char[] chars = {'h', 'e', 'l', 'l', 'o'};
		String str2 = new String(chars);
		byte[] bytes = {65, 67, 98, 120};
		String str3 = new String(bytes);
		
		System.out.println("str  : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		str = new String("Hello World!!!");
		System.out.println("str : " + str + ", 길이 : " + str.length());
		
		int loc = 0;
		char[] words = new char[5];
		str.getChars(6, 11, words, 0);
//		for(int i = 6; i <= 10; i++) {
//			words[loc++] = str.charAt(i);
//		}
		
		words = new char[str.length()];
		str.getChars(0, str.length(), words, 0);
		
		System.out.println("words : " + Arrays.toString(words));
		
	}
}
