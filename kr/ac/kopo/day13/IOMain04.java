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
 * BufferedInputStream() 을 사용하면 매개변수에 취해지는 데이터의 사이에 버퍼를 취해 효율적인 전송을 해주겠다는 의미이다.
 * 
 * 객체를 4개 만들었으면, close() 메소드도 4번 취해줘야한다.
 * 
 * null 값을 갖는 객체는 close()할 수 없다.
 * null이 아닌 경우에서 발생하는 예외상황을 고려해주는 이유는 외부장치에서 발생할 수 있는  컨트롤할 수 없는 예외상황을 고려해주기
 * 위해서이다.
 * 
 * 
 */

/*
	Koala.jpg -> Koala2.jpg 복사 
*/


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;


public class IOMain04 {

public static void main(String[] args) {

	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		fis = new FileInputStream("iotest/Koala.jpg");
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream("iotest/Koala3.jpg");
		bos = new BufferedOutputStream(fos);
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int c = bis.read();
			if(c == -1) break;
			bos.write(c);
		}
		fos.flush();
		
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 : " + (end - start) / 1000. + "초");
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		
		FileClose.close(bis, fis);
		FileClose.close(bos, fos);
		
//		FileClose.close(bis);
//		FileClose.close(bos);
//		
//		FileClose.close(fis);
//		FileClose.close(fos);
	}
	/*
	} finally {
		
		if(bis != null) {
			try {
				bis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		if(bos != null) {
			try {
				bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			if(fis != null)
				fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			if(fos != null)
				fos.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
*/	
	System.out.println("파일복사가 완료되었습니다");
}
}








