package kr.ac.kopo.day11;

/*
 * b() 메소드에서 발생한 예외를 throws 키워드를 사용해 b()메소드를 호출한 호출자 메소드로 떠넘기게되면, b()메소드에 대한 예외를
 * 호출자메소드인 main() 메소드에서 처리해야 되므로, try catch 예외처리 구문을 호출자메소드인 main()메소드에 사용해줘야한다.
 * 즉, 이와같은 상황에서 throws에 의해 떠넘김을 받는 호출자메소드엔 예외를 처리하기위한 try catch문이 반드시 존재해야한다.
 * 즉, throws를 통해 보낸 예외처리에 대한 try catch문은 반드시 호출자메소드에 존재해야하는 것이다.
 * 
 * throws 키워드의 뒤에 ,콤마를 사용하여 예외처리를 호출자 메소드에게 여러개를 넘길 수 있다.
 * 
 * 이러한 throws 키워드는 규모가 있는 프로그램을 만들때 유용하다. 왜냐하면 어떠한 메소드를 만들때 설계하는 사람이 예외가 발생할 수 있는
 * 상황에 대해 메소드를 사용하는 사람에게 확실하게 전달하여 프로그램의 오류를 막을 수 있기 때문이다.
 * 
 * 어떤 코드를 실행하는 시점이 예외가 발생할 시점이 아닌데, 인위적으로 예외를 발생시키고자 할때 throw를 사용한다.
 * 즉, 코드는 완벽해서 예외발생이 예상되지 않지만, 그럼에도 불구하고 내가 만든 완벽한 코드를 사용자가 잘못사용해서 발생하는 예외상황의 경우
 * 이때 발생하는 인위적인 예외를 처리하기 위해 사용하는 키워드를 throw이다.
 * 
 * throw로 예외를 던저주는 것은 try catch 구문에서 catch가 예외코드를 잡아서 처리할 수 있도록 하는 것이다.
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain07 {

	public static void main(String[] args) {
		
		try {
			c();
			d();
			e();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			b();
		} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		a();
		
	}
	
	public static void f() throws Exception {
		
	}
	
	public static void c() throws Exception {
		f();
	}
	
	public static void d() throws Exception {
		
	}
	
	public static void e() throws Exception {
		
	}
	
	public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	
	public static void a() {
		
		try{
			String str = null;
			System.out.println(str.length());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}


