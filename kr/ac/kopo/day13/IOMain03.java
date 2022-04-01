package kr.ac.kopo.day13;

/*
 * Koala.jpg는 입력장치에서 움직여야하고, Koala2.jpg는 출력장치에서 움직여야한다.
 * 
 * filenotfoundation은 값이 존재하지 않거나, 하드디스크에 용량이 꽉찬경우 등에서 발생하게된다.
 * 
 * 외부장치에 저장된 파일을 외부장치에 저장할때, 외부장치에서 곧장 외부장치로 데이터를 옮길수는 없다.
 * 무조건 램을 거쳐서 가야만한다.
 * 
 * int c = fis.read()
 * fos.write()
 * 는 c에 저장한 바이트형태의 자료를 write() 로읽으면 다시 바이트 형태가 된다. 이러한 방식처럼 외부장치에서 외부장치로바로
 * 데이터를 이동시킬 수는 없다.
 * 
 *버퍼에 동시에 존재하는 파일이 많이 존재하면 에러가 발생하게된다. 이런경우 컴퓨터를 재부팅해야한다.
 *
 *자바에서 어떤 외부장치(자원)을 연결하면 반드시 연결을 해제해야하는 상황이 도달하는데, 이때 쓰는 메소드를 close()라고한다.
 *이러한 메소드는 closable 라는 인터페이스에서 상속받는다. 외부장치에 접근하여 사용하는 경우 무조건 close()메소드를 
 *마지막에 써야한다. 그러므로, 내가 사용해야하는 close 메소드는 반드시 finally 에 존재해야한다. 이러한 close()메소드는
 * 외부장치에 접근한 개수만큼 사용해야한다.
 * 
 * 데이터를 byte단위로 전송하는 것은 쌀을 한톨한톨 옮기는 것과도 같은 비효율적인 작업이다.
 * 그러므로, 이러한 비효율을 줄이기 위해서 버퍼라는 쌀 바구니 같은 역할을 하는 것이 존재한다.
 * 
 * 
 * 
 */

/*
	Koala.jpg -> Koala2.jpg 복사 
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOMain03 {

public static void main(String[] args) {

	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	try {
		fis = new FileInputStream("iotest/Koala.jpg");
		fos = new FileOutputStream("iotest/Koala2.jpg");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int c = fis.read();
			if(c == -1) break;
			fos.write(c);
		}
		fos.flush();
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	System.out.println("파일복사가 완료되었습니다");
}
}



