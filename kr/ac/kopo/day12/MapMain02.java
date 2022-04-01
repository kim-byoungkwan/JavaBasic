package kr.ac.kopo.day12;

/*
 * toString() 메소드는 object 클래스가 갖고 있는 것인데, 자식클래스가 오버라이딩 하고 있는 형태이다.
 * 
 * 
 * 
 * 
 */
import java.util.HashMap;
import java.util.Map;

/*
 	alt+shift+s 누른 후  c 선택 => 기본생성자
 						o 선택 => 매개변수 생성자
 						r 선택 => getter/setter 메소드
 						v 선택 => override/implement 메소드
 						s 선택 => toString() 메소드
*/ 

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<>();
		
		map.put(
				new Member("홍길동", "010-1111-2222"), 
				new Car("소나타", "33가3333")
		);
		
		map.put(
				new Member("윤길동", "010-3333-4444"), 
				new Car("K5", "45나1234")
		);
		
		// 홍길동 고객의 차량정보 변경
		map.put(
				new Member("홍길동", "010-1111-2222"), 
				new Car("카니발", "82다8282")
		);
		
		System.out.println("총 개수 : " + map.size());
//		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
//		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
//		System.out.println("hello".hashCode());
//		System.out.println(new String("hello").hashCode());
//		System.out.println(new String("hello").hashCode());
		
		/*
		Set<Entry<Member, Car>> entrys= map.entrySet();
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			
			System.out.println(member);
			System.out.println(car);
		}
		*/
	}
}


