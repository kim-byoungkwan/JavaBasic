package kr.ac.kopo.day02;

public class OperationMain01 {
	
	public static void main(String[] args) {
		
		int a = 1, b = 0, c = -1;
		
//		boolean bool = (++a > 1) || (++b > 1);
		// 괄호가 없어도 관계연산자가 우선순위가 높기 때문이 올바로 결과가 나온다
		// 이미 앞의 괄호에 컴퓨터는 결과값이 True임을 알기 때문에 효율적인 컴퓨터는 뒤에것을 실행조차하지 않는다.
		// 따라서 최종 아래의 프린트 값에서의 b값은 0으로 표현된다.
		
//		boolean bool = --a > 1 && ++b > 1 || ++c > 0;
		// && 연산자가 || 연산자보다 우선순위가 높다. 따라서 표현되지 않아도 자동으로 &&에 괄호가 쳐져 있는 것이다.
		// 위 경우 ++b는 실행조차 되지 않는다.
		// 위 경우 ++c는 실행된다.

//		boolean bool = a++ > 0 || b-- >= 0 && c++ <= 0;
		// 위의 경우에도 컴퓨터는 무조건 왼쪽에서 오른쪽으로 읽어나간다.
		// 후위 a++ 증가 시점은무조건 ; 이후이다. ;이전에는 변수를 보여주는 역할만을 하는 것이다.
		// 따라서 ; 콜론 이전에는 a 변수값의 변화 없이 바로 보여지게 되는 것이다.
		
		boolean bool = b-- >= 0 && c++ <= 0 || a++ > 0;
		
		
		System.out.println("bool : " + bool);
		
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		
	}

}
