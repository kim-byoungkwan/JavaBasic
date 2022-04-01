package kr.ac.kopo.day09.abs02;

/*
 * 패키지 안에 존재하는 클래스의 상속관계를 생각해주면되고, 패키지와 패키지사이의 상속관계를 생각하지 않는다.
 * 
 * 어떠한 클래스 이름에 기능이나, ui 같은 이름이 붙는다면 사용자가 사용하는 기능이 동작하게 하는 클래스임을 의미하고, 이를 비즈니스 클래스라고한다.
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	
	private String select() {
		System.out.print("프린터를 선택하세요(1.LG  2.SAMSUNG  3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	private void print(String type) {
		Printer p = null;
		switch(type) {
		case "1" :
			p = new LGPrinter();
			break;
		case "2" : 
			p = new SamsungPrinter();
			break;
		case "3" : 
			p = new HPPrinter();
			break;
		}
		if(p != null) {
			p.print();
		}
	}
/*	
	public void print(String type) {
		switch(type) {
		case "1" :
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2" : 
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case "3" : 
			HPPrinter hp = new HPPrinter();
			hp.print();
			break;
		}
	}
*/	
	public void process() {

		String type = select();
		print(type);
	}

	
}
