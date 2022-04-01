package kr.ac.kopo.day06;

// 어떠한 키보드로 입력 받아서 값이 생성되는 경우 메소드의 블록{} 안에 스캐너 메소드를 정의하여 키보드의 값을 받고,
// 그 값이 실행되게 하므로, () 호출자로부터 파라미터를 전달받지 않고도 피호출자 메소드가 실행될수 있으므로,
// 파라미터가 ()에 없이 동작하게 할 수 있다.

// 같은 클래스 내부에 존재하는 멤버변수는 그 클래스안에 존재하는 모든 메소드가 매개변수로 정의하지 않고도,
// 접근할 수 있게된다.

public class MethodMain04 {

	public static void main(String[] args) {
		Gugudan gu = new Gugudan();
		
		System.out.print("2 - 9사이의 단을 입력 : ");
		int dan = gu.getDan();
		gu.print(dan);
		
		gu.print();
		
		System.out.print("시작단 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단 입력 : ");
		int endDan = gu.getDan();
		
		System.out.println(startDan + " : " + endDan);
		
	}
}

