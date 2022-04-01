package kr.ac.kopo.day13;

/*
 * System.in = 키보드
 * System.out = 모니터
 * 를 사용하겠다는 것을 의미한다.
 * 
 * InputStream의 기본적인 의미는 외부장치에서 무엇인가를 읽어오겠다는 의미이다.
 * 
 * .read() 메소드를 사용할 때 발생하는 빨간밑줄은 checked exception 을 의미한다. 그러므로, 외부장치에서 발생할 수 있는 
 * 나도모르는 예외상황에대한 처리를 해야함을 의미하는 것이다.
 * 
 * 엔터기능의 본질적인 기능은 라인을 바꾸어 주는 것이다. 그러므로 엔터를 치고 라인을 바꿔주는 행위 뒤에 커서가 어떤 위치에 있을지는
 * 다를 수 있다. 이때, 라인만 바꿔주는 행위를 line feed 라고 하고,  그 뒤에 커서의 위치를 조정하는 동작을 carriage return
 * 이라고 한다. 즉, 엔터를 쳤을때, line feed 기능과 carriage retrun 기능이 모두 존재하는 것이다.
 * 
 * 키보드자체가 버퍼라는 저장장소를 사용하므로, 엔터를 치기 전까지 모든 값을 버퍼에 저장하여 엔터를 치면 한꺼번에 출력한다.
 * 
 * 아스키코드나 유니코드는 모두 0보다 크거나 같은수로 이루어져 있으므로, -1이 출력되면 동작이 실패했음을 의미한다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */


import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {

	public static void main(String[] args) {
		
		InputStream is = System.in;
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료됩니다");
		
		while(true) {
			try {
				int c = is.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}





