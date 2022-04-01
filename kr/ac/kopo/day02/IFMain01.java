package kr.ac.kopo.day02;

/*
 * 조건문을 제어문이라고 한다. 이문장을 수행할지 말지를 결정하는 문장이기때문이다.
 * 
 * 보유하고 있는 책 권수 : 1
 * 1 book
 * 
 * 보유하고 있는 책 권수 : 4
 * 4 books
 * 
 * if문은 else문 없이 혼자쓰일 수 있지만, else문은 if없이 쓰일 수 없다.
 * 
 * 자바에서는 블록 {}는 항상 키워드 옆에 쓰는 것이 권고사항이다.
 * 
 */


public class IFMain01 {
	
	public static void main(String[] args) {
		
		int book = 4;
		
		System.out.print(book + " book");
		
		if(book >= 2) {
			
			System.out.println("s");
			
		}
		
		if(book == 1) {
			
			System.out.println(book + " book");
			
		} else {
			
			System.out.println(book + " books");
			
		}
				
	}
	
}
