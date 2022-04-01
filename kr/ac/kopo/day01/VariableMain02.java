package kr.ac.kopo.day01;

public class VariableMain02 {
	
	public static void main(String[] args) {
		
		// "Hello"라는 문자열을 저장하기 위한 변수 str을 선언하자.
		
//		String str;
		
//		str = "Hello";
		
		// 다른 자료형과 달리 문자열 자료형은 클래스 참조자료형으로 정의하므로 첫글자는 대문자로 정의된다.
		
//		System.out.println(str);
		
		String str = new String("Hello");
		
		// String 자료형은 참조자료형이므로 본질적으로 위와 같이 원래는 표현하지만 문자열 참조자료형은 예외로 new로
		// 정의하지 않아도 된다.
		
		// new String("Hello")를 하는 순간 참조 자료형이므로 heap 에 저장공간을 생성한다. 그리고,
		// String str을 하는순간 스택에 변수가 생성되고, 이 변수는 스택에 저장되고 이변수는 실제값을 저장하고 있지는 않지만,
		// 위치값을 저장하고 있다. 이 위치값만을 저장하고 있는 변수 str을 참조해서 heap에 실제값이 저장된 공간에 접근할 수 
		// 있는 것이다. 따라서, 스택에 저장된 str 변수는 위치값을 저장하고 있는 변수로서 heap의 실제값을 찾아갈 수 있게한다.
		// 따라서 str은 참조변수라고한다.
		
		// 문자열 변수 String만 유일하게 참조 자료형임에도 부룩하고 new 없이 정의할 수 있다. 이것은 약속이다. 유일한예외이다.
		
		Test t = new Test();
		System.out.println(t);
				
		// new 명령어를 통해 정의한 것은 무조건 heap에 저장된다.
		
	}

}
