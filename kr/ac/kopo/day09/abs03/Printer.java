package kr.ac.kopo.day09.abs03;

/*
 * 항상 메소드의 우선순위는 내안에 있는 메소드가 가장 우선순위를 갖고 실행된다. 즉, 만약 상속관계가 존재하는 클래스에서 오버라이딩된 메소드가
 * 존재할 때, 오버라이딩된 메소드는 나의 클래스안에 존재하므로 가장 우선순위를 갖고 실행된다. 동일한 이름을 가진 메소드가 부모클래스에 존재함에도.
 * 
 * 
 * 
 * 
 * 
 */

public class Printer {

	private String model;
	
	public Printer() {
		
	}
	public Printer(String model) {
		this.model = model;
	}
	
	public void print() {
		System.out.println("프린트중...");
	}
}
