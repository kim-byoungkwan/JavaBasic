package kr.ac.kopo.day02;

/*
 * 
 * 참조 자료형으로 생성된 객체에 대하여 == 로 동등비교를 할때엔 항상 객체에 저장된 데이터가 아니라, 위치값과 대응되는 관계가 있다.
 * 따라서, 실제 값을 비교하기 위해선 == 로하면 위치값과 비교되므로 false가 나오므로 equals가 사용되어야한다.
 * 
 * 또한, switch case 문에서 switch 수식조건과 case 조건이 서로 매칭되는지를 파악하는 과정에서도 ==가 아니라,
 * equals 메소드가 switch case에서 작동하고 있는 것이다.
 * 
 */


public class SwitchMain02 {
	
	public static void main(String[] args) {
		
		String str = new String("Hello");
		
		if (str == "Hello") {
			
			System.out.println("True");
			
		} else {
			
			System.out.println("False");
			
		}
		
		
		switch(str) {
		
		case "Hello" :
			
			System.out.println("True");
			
			break;
			
		default:
			
			System.out.println("False");
	
		}
			
	}
	
}
