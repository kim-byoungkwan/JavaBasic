package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// S가 대문자 이므로 Scanner 클래스는 참조 자료형이다.
		// Scanner 참조자료형을 통해 키보드로 입력한 값을 받을 수 있는 것이다.
		
		System.out.print("문자를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		// 문자는 이와같이 문자열의 첫번째 덩어리만 표현하는 방식으로 입력받는다.
		
		
		
		
		System.out.print("문자열을 입력 입력하세요: ");
		String str = sc.nextLine();
		// 문장으로 입력받기 위해서는 nextLine 메소드를 사용해야한다. next()를 사용하면 next 메소드는 스페이스나
		// 엔터를 기준으로 문자단위를 끊어서 받아들이기 때문에 맨 앞의 한덩어리만 str에 저장되게되어 문자열을 입력받을 수 없다.
		System.out.print("str :  " + str);
		
		System.out.print("정수를 하나 입력하세요: ");
		// 키보드로 입력받을때엔 항상 위와같은 프린트문을 사용해줘야 소프트가 종료되지 않고 지속되는 것을 방지할 수 있다.
		
		int a = sc.nextInt();
		// 키보드로 값을 입력받고 싶은데 그 값을 정수형으로 입력받고자 하는 것을 nextint()가 의미한다.
		System.out.println("a : " +a);
		
		
	}

}
