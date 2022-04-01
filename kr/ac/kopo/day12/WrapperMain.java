package kr.ac.kopo.day12;

/*
 * Wrapper class 는 기본자료형을 멤버변수로 가지는 클래스를 의미한다.
 * 
 * 기본자료형에는 int, char, boolean 등이 있다.
 * 
 * Wrapper class는 java.lang 패키지에 존재한다.
 * 
 * int i4 = new Integer(100); 은 원리적으로 불가능하지만, Integer클래스는 wrapper 클래스이기 때문에 내무적으로 JVM이
 * Integer 클래스의 인스턴스객체값 100을 꺼내어서 int i4 기본자료형의 참조변수가 가리킬 수 있는 객체화시키는 것이다.
 * 이러한 동작을 auto unboxing라고 한다.
 * 
 * 마찬가지로
 * Integer.parseInt("123")이 가능한 이유도 Integer이 Wrapper 클래스이기 때문이다.
 * 이때 parseInt() 메소드의 return 타입은 int 이고, valueof() 메소드의 return 타입은 Integer이다.
 * 
 * 
 * 
 * 
 * 
 * 
 */

/*
	기본자료형			Wrapper Class
	boolean			Boolean
	char			Character
	byte			Byte
	short			Short
	int 			Integer
	long			Long
	float			Float
	double			Double
	

class Boolean {
	private boolean value;
	
*/

public class WrapperMain {

public static void main(String[] args) {
	
	int i = 100;
	Integer i2 = new Integer(100);
	Integer i5 = Integer.valueOf(100);
	Integer i3 = 100;	// auto boxing
	int i4 = new Integer(100);	// auto unboxing
	
	System.out.println(Integer.parseInt("123") + 100);
	System.out.println(Integer.valueOf("123") + 100);
}
}



