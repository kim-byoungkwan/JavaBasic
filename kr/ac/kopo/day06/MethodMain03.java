package kr.ac.kopo.day06;

// 클래스와 클래스를 구분하는 것은 패키지를 포함한 클래스 명으로 구분한다.
// 즉, 같은 패키지 안에서 같은 이름의 클래스가 정의된다면 두 클래스는 서로 동일한 클래스로 인식하여 에러가발생한다.
// 메소드를 실행하기 위해선 그 메소드가 정의된 클래스 설계도를 이용해 인스턴스 객체를 new라는 키워드를 이용해 생성해야한다.




class ExamMethod {

	int getSum(int a, int b) {
		return a + b;
	}
	
	int getTotal(int a, int b) {
		int s = 0;
		while(a <= b) {
			s += a++;
		}
		return s;
	}
}

public class MethodMain03 {

	public static void main(String[] args) {
		ExamMethod exam = new ExamMethod();
		int sum = exam.getSum(10,	20);
		System.out.println("10 + 20 = " + sum);
		
		System.out.println("1 ~ 10 총합 : " + exam.getTotal(1, 10));
	}
}
