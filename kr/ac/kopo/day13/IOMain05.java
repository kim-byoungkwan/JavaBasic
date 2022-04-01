package kr.ac.kopo.day13;

/*
 * read() 메소드는 한 바이트 단위로 데이터를 읽어온다.
 * 
 * Reader, Writer 클래스는 object 클래스를 상속받은 추상클래스이다.
 * 
 * bufferedreader,bufferedwriter은 속도를 빠르게 해주기 위해 존재하는 것이다.
 * 
 * 
 * 
 */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;


public class IOMain05 {

	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/data.dat");
			dos = new DataOutputStream(fos);
			char c = 'A';
			int num = 99;
			double f = 12.34;
			
			dos.write(c);
			dos.writeChar(c);
			dos.writeInt(num);
			dos.writeDouble(f);
			
			dos.flush();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dos, fos);
		}
		System.out.println("파일저장 완료...");
	}
	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("iotest/data.dat");
			dis = new DataInputStream(fis);
			
			int i = dis.read();
			char c = dis.readChar();
			int i2 = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("첫번째 문자 : " + (char)i);
			System.out.println("두번째 문자 : " + c);
			System.out.println("정수 : " + i2);
			System.out.println("실수 : " + d);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
		
	}
	
	public static void main(String[] args) {
		
		read();
//		write();
		
	}
}
