package kr.ac.kopo.day13;

/*
 * InputStreamreader 은 byte를 받아서 문자형의 데이터로 출력하는 기능을 해준다.
 * 
 * read() 메소드는 바이트스트림과 문자형 스트림을 모두 읽을 수 있는데, System.in 메소드를 사용해서 읽으면 바이트스트림을
 * 읽어들이고, inputStreamReader은 결과값으로 문자값을 도출하므로 read() 메소드의 결과값이 제대로 도출되기 위해서는
 * 문자값을 도출하는 인풋스트림메소드를 사용해야한다.
 * 
 * read() 메소드의 결과값은 무조건 유니코드값으로 도출된다. 즉 숫자로 도출되게 됨으로 변수형을 int로 설정하는 것이다.
 * 즉, 바이트나 문자나 모두 read() 메소드로 읽어들이면 그 결과값은 유니코드형의 숫자값으로 도출되게된다.
 * 
 * 출력하는데에 사용되는 클래스는 outputStream을 사용한다.
 * 
 * 램에서 모니터로 보낸 데이터는 램에서 존재하지 않을지라도 버퍼에는 남아있는 상태일 수 있다. 이러한 버퍼에 남아있는 데이터를
 * 한번에 모니터와같은 출력장치로 내보내주는 역할을 해주는 것을 flush() 메소드이다.
 * 그래서, 일반적으로 이와같은 flush()메소드를 마지막에 출력전에 사용해서 버퍼를 지워주게된다.
 * 
 * 멀티미디어 데이터를 출력할때에는 일반적으로 바이트스트림을 많이사용한다.
 * 
 * 어떠한 파일에서 입력과 출력을 실행시키기 위해서 사용하는 클래스는 FileInputStream이다. 즉, 파일에 저장된 데이터를 불러오는
 * 상황이나, 어떠한 데이터를 파일에 저장하는 상황에 사용되는 클래스가 FileInputStream이다.
 * 
 * 내가 어떠한 파일을 읽어오기 위해서는 반드시 하드디스크에그 파일이 존재해야한다.
 * 그런데, 하드디스크에 파일이 존재하지 않으면 에러가 발생하므로, 반드시 이러한 상황에 대해 예외처리를 해줘야한다.
 * 
 * 어떠한 파일을 덮어써야하는 상황이 fileoutputstream을 쓰는 상황이고, 어떠한 기존의 파일에 내용을 추가하고자 하는 것을
 * fileoutputstream(,boolean append)이다.
 * 
 * 
 * 
 
 * 
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {

	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("키보드 입력을 하세요. ctrl+z 입력시 종료됩니다");
		
		while(true) {
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

