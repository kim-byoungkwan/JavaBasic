package kr.ac.kopo.day12;

/*
 * Set 자료구조의 구성클래스는 HashSet, TreeSet이 존재한다.
 * 
 * Object[] arr = set.toArray();
 * 위의 toArray()의 결과값으로 오브젝트 참조자료형 배열을 자료형으로 갖고 배열 안의 데이터로 오브젝트 참조자료형의 인스턴스객체가
 * 도출되므로, 좌변에 대입연산자의 원칙을 성립시키게 하기 위해 오브젝트배열을 참조자료형 자료형으로 갖는 참조변수 arr 변수를 정의해서
 * arr 변수가 우변의 toArray()메소드의 결과 값으로 도출된 오브젝트 배열 참조자료형으로 형성된 인스턴스 배열 객체를 가리키도록
 * 하는 것이다.
 * 
 * arr[i]는 객체이므로 String 클래스의 객체에만 적용할 수 있는 length() 메소드를 arr[i].length()와 같이 사용할 수없다.
 * 그러므로, arr[i] 오브젝트 클래스의 인스턴스 객체에 length() 메소드를 사용하게 하려면 명시적 형변환을 해줘야 한다.
 * 즉 (String)arr[i].length() 는 가능하다.
 * 
 * 해쉬셋이던 트리셋이던 중복을 허용하지 않고 순서를 갖고 있지 않는다.
 * 셋 자료구조를 상속받는 구현 클래스이기 때문이다.
 * 
 * set 자료구조를 toArray() 메소드를 통해 array화 시켰을대, 본래 set 자료구조가 중복이 없고, 순서도 없기 때문에
 * 출력된 array도 어떠한 값이 어떠한 순서로 정렬될지 알 수 없다.
 * 
 * iterator() 메소드를 이용해서 출력된 결과값은 iterator 인스턴스 객체가 도출된다.따라서
 * Iterator<String> ite = set.iterator() ; 이 대입연산자 등호 = 에의해 성립된다.
 * 이때 ite 참조변수가 가리키는 Iterator을 참조자료형으로 하는 인스턴스객체가 생성되고, 그 인스턴스 객체를 통해 여전히 set안에
 * 저장되어있는 데이터를 인스턴스 객체가 갖고 있는 메소드 .next() , .hasNext() 와 같은 것들을 통해서 접근할 수 있게되고,
 * 이때 비로소 set 자료구조안에 들어있던 모든 데이터를 접근할 수 있게되는 것이다.
 * Iterator 참조자료형으로 생성된 Iterator 객체가 set에 들어있던 모든 데이터를 복사해서 갖고있는 개념이 아니다!!
 * 
 * 
 * 
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set : 순서(X), 중복(X)
 	 - HashSet
 	 - TreeSet
 */

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
//		Set<String> set = new TreeSet<>();
		System.out.println("\"one\"입력성공여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		System.out.println("\"one\"입력성공여부 : " + set.add("one"));
		
		System.out.println("전체 원소의 개수 : " + set.size() + "개");
		
		/*
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5버전의 for문 이용
		 * 2. toArray() 메소드 이용
		 * 3. Iterator 객체 이용
		 */
		
		System.out.println("< 1.5 for문 이용한 출력");
		for(String str : set) {
			System.out.println(str);
		}
		
		System.out.println("< toArray() 이용한 출력 >");
		Object[] arr = set.toArray();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * Iterator(순환객체) 주요메소드
		 *    - hasNext() : 데이터 존재여부판단
		 *    - next()	  : 데이터 접근
		 */
		System.out.println("< Iterator 이용한 출력 >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}


