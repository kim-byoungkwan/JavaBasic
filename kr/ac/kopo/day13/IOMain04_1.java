package kr.ac.kopo.day13;

/*
 * args = argments를 의미하는데, args에는 "원본이름 복사된이름" 의 정보가 기억되어있다. 
 * 그러므로 args[0] = 원본파일이름 저장됨, args[1] = 복사된파일이름 저장되어 있음
 * 
 * 핑은 상대편의 서버가 살아있는지 죽어있는지의 여부를 파악하기 위해 주로 사용된다.
 * 
 * 
 * 
 * 
 */

/*
	콘솔모드에서
	java IOMain04_1 Koala.jpg Koala2.jpg  입력시
	
	 Koala.jpg -> Koala2.jpg 복사
*/

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;


public class IOMain04_1 {

public static void main(String[] args) {

	System.out.println("args : " + Arrays.toString(args));
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	
	try {
		fis = new FileInputStream(args[0]);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream(args[1]);
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
