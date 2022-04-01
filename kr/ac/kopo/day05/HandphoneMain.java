package kr.ac.kopo.day05;

// 아래의 핸드폰 클래스는 접근제한자가 설정되지 않았으므로, default 접근제한자로 자동으로 설정되는데, 그러므로, 다른패키지에서 Handphone 클래스에
// 접근할 수는 없다.


class Handphone{
// 이경우엔 public 제한자를 포함하게되면 에러가 발생한다.

	String name;		// 실사용자명
	String phoneNumber; // 핸드폰번호
	String company;		// 제조사
		
}

public class HandphoneMain {
	
	public static void main(String[] args) {
		
		Handphone hp = new Handphone();
		// hp변수는 Handphone 참조자료형으로 정의된 변수로, 이 변수가 가리킬 수 있는 주소값은 반드시 (기본자료형의 경우와 같이)
		// Handphone 참조자료형의 객체여야한다. 그러므로, 위와같이 Handphone 참조자료형클래스로 생성된 생성자 Handphone()
		// 로 인스턴스객체를 생성하여 그 인스턴스 객체를 hp변수의 주소값이 가리키는 것이다.
		
		
		hp.name = "홍길동";
		
		hp.phoneNumber = "010-1111-2222";
		
		hp.company = "삼성";
		
		Handphone hp2 = new Handphone();
		
		hp2.name = "강길동";
		
		hp2.phoneNumber = "010-3333-4444";
		
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		
		hp3.name = "윤길동";
		
		hp3.phoneNumber = "010-5555-6666";
		
		hp3.company = "화웨이";
		
		
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone phone : hpArr) {
			
			System.out.println("사용자 : " + phone.name + ", 전화번호 : " + phone.phoneNumber
					+ ", 제조사 : " + phone.company);

		}
				
	}

}
