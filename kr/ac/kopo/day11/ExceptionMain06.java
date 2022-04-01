package kr.ac.kopo.day11;

/*
 * finally는 그전에 break가 존재하거나 return이 존재하더라도 무조건 실행되게된다.
 * 이러한 성질때문에 finally는 자원을 관리하기위한 목적으로 사용된다.
 * 
 * 
 * 
 * 
 */


import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("loop...");
				if (i == 3) {
					FileReader fr = new FileReader("a.txt"); // checked Exception
				}
			} catch (Exception fnfe) {
				fnfe.printStackTrace();
				return;
			} finally {
				System.out.println("end loop...");
			}
		}
		System.out.println("main end...");
		
	}
}



