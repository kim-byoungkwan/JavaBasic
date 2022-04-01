package kr.ac.kopo.day11;

/*
 * (Object data)와 같이 매개변수가 설정되었을 때, 모든 클래스의 부모클래스인 Object 클래스의 자식클래스에 존재하는 변수와 메소드를
 * 묵시적 형변환에의해 매개변수에 대입하여 사용할 수 있게된다.
 * 
 * 즉, 최상위 부모클래스 Object를 사용한 순간 그에 대한 자식클래스를 사용할 때, 매번 형변환을 시켜줘야 한다.
 * 
 * object를 사용하면 묵시적형변환 명시적형변환이 필요했지만 generic를 사용하면 그때그때마다 필요한 자료형으로 설정되어 원하는 메소드와 변수를
 * 사용할 수 있게되는 것이다.
 * 
 * 
 * 
 * 
 * 
 */



import java.util.Random;

class A {
	private Object data;
	
	A(Object data) {
		this.data = data;
	}
	
	Object getData() {
		return data;
	}
	
	void setData(Object data) {
		this.data = data;
	}
}

class B<T> {
	private T data;
	
	B(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}
	
	void setData(T data) {
		this.data = data;
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
		B<String> b = new B<String>(new String("hello"));
		System.out.println("길이 : " + b.getData().length());
		
		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + (b2.getData().nextInt(10) + 1));
		
		B<String> b3 = new B<String>("byebye");
		b3.setData("aa");
		
		A a = new A(new String("hello"));
		String data = (String)a.getData();
		System.out.println("길이 : " + data.length());
		
		A a2 = new A(new Random());
		int random = ((Random)a2.getData()).nextInt(10) + 1;
		System.out.println("추출된 정수 : " +  random);
	}
}

