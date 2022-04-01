package kr.ac.kopo.util;

/*
 * file.io 를 하는 기본적인 이유는 램에 있는 데이터를 file에 저장하고자하는 것이다. 왜냐하면 램에 있는 정보는 프로그램을 
 * 껏다가 키면 지워지기 때문에 프로그램이 꺼지기 전에 램에 있는 정보를 file에 저장하여 데이터를 계속 유지하고자하는 것이다.
 * 
 * DatainputStream은 기본자료형 변수가 가지고 있는 값들을 file에 저장하거나 또는 file에서 데이터를 기본자료형의 형태로
 * 사용하고자 할 때, 사용하는 필터 클래스이다.
 * 즉, file에서 데이터를 읽어올 때, byte형태로 읽어오고 데이터를 전달할 때 데이터를 기본자료형 boolean, char, char 등의
 * 형태로 전달하는 것이다.
 * 
 * DataInput 클래스의 메소드는 매개변수가 없다.
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(InputStream is) {

		if(is != null) {
			try {
				is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(OutputStream os) {
		
		if(os != null) {
			try {
				os.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream fis, InputStream is) {
		close(fis);
		close(is);
	}
	
	public static void close(OutputStream fos, OutputStream os) {
		close(fos);
		close(os);
	}
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}