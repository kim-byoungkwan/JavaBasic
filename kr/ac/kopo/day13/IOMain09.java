package kr.ac.kopo.day13;

/*
 * 객체를 바이트 단위로 멤버변수가 가지고 있는 값들을 바이트 스트림에 일렬로 나열하는 것을 객체직렬화라고한다.
 * 만약 어떠한 멤버변수중 객체직렬화에 포함시키고 싶지 않은 멤버변수는 transient 키워드를 붙여서 표현하면된다.
 * 
 * 
 * 
 * 
 * 
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain09 {

	public static void write() {
		
		Icecream ice = new Icecream("월드콘", 2000, "해태");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/object.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ice);
			
			System.out.println("object.txt 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
		
	}
	
	public static void read() {

		Icecream ice = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);
			
			ice = (Icecream)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois, fis);
		}
		
		
		System.out.println(ice);
	}
	
	public static void main(String[] args) {
		
		read();
//		write();
		
	}
}
