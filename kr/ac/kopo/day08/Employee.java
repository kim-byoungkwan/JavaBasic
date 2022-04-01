package kr.ac.kopo.day08;

/*
 * 매개변수를 갖고있는 생성자를 클래스에 만들때에는, 매개변수를 갖고있지 않은 기본생성자를 앞에다가 만들어놓는 것이 좋다.
 *  
 */

public class Employee {

	String 	name;
	int 	salary;
	String 	grade;
	static int employeeCnt;		// 총사원수 
	
	Employee() {
		Employee.employeeCnt++;
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
	}
}
