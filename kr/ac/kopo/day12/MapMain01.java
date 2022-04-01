package kr.ac.kopo.day12;

/*
 * 구현된 클래스라는 의미는 항상 어떤 부모클래스에 대한 자식클래스를 의미한다.
 * 
 * 맵 자료구조에서 Key값에는 중복이 되어선 안되지만, value 값은 중복이 되어도 상관없다.
 * 
 * 아이디 패스워드는 아이디가 키이고 패스워드가 밸류인 관계로 볼 수 있다.
 * 
 * main 메소드에서 return을 사용하면 main 메소드가 JVM을 호출하게 되면서 종료된다.
 * 
 * 문자열과 문자열의 비교는 문자열은 근본적으로 2차원배열의 형태로 접근할 수 있으므로, 실제 객체안에 들어있는 값을 비교할 수있는
 * equals()를 사용해야한다.
 *  
 * 맵의 키는 셋자료구조의형태로 구성되어있는 것이다. 그러므로 맵에 있는 정보를 셋 형태의 객체로 변환할 수 있다. 이때, 사용되는
 * 메소드는 entrySet()이다.
 * 
 * 하나의 클래스안에 또다른 클래스가 존재할 수 있는데, 이러한 클래스를 내부클래스라고한다.
 * 이때 내부클래스를 지칭할때엔 외부클래스이름$내부클래스이름 과같이 접근할 수있다.
 * 맵클래스의 내부에 Entry 클래스가 내부클래스로 존재하는데, 이 내부클래스안에 비로소 key와 value값이 존재하는 것이다.
 * 그러므로, 맵의 키와 value를 접근하기 위해서 사용하는 메소드는 entrySet()메소드를 사용하게되는것이다.
 * 이러한 내부클래스를 Map.Entry 와같이 접근할수도있다.
 * 
 * 어떠한 클래스를 설계할때, 클래스내부에 존재하는 private멤버변수를 접근하기 위해서는 항상 메소드를 사용해서 값을 불러오고
 * 설정해주는데, 값을 불러오는 메소드는 getname() 과 같은 형태의 메소드가 정의된 것이고, 값을 설정하는 메소드는 setname()
 * 와 같은 형태의 메소드가 정의된 것이다. 이러한 getname()메소드와 setname()메소드를 getter메소드 setter메소드라고 
 * 부른다. 이러한 메소드는 자바에서 일반적으로 클래스에 당연히 정의되어 있다고 암묵적인 룰로 규정되어있다.
 * 
 * map.keySet()메소드는 맵에 존재하는 key값만을 모두 모아서 set 자료구조의 타입으로 만들어주는 메소드이다.
 * 이와 같이 맵자료구조에 있는 데이터의 값을 변활할때에는 일반적으로 set 자료구조를 사용하여 변환하는 것이다.
 * 
 * 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 	Map : key, value 쌍의 집합, key에 대한 중복(X)
 	  - HashMap
 	  - TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디 입력 : ");	
		String id = sc.nextLine();
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
		
		System.out.print("기존의 패스워드 입력 : ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 일치않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
		
		System.out.print("변경할 패스워드 입력 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		System.out.println("< 회원 정보 출력 >");
		System.out.println("---------------------------");
		System.out.println("아이디\t패스워드 ");
		System.out.println("---------------------------");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
		
		/*
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> e : set) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		*/
		System.out.println("---------------------------");
	}
}




