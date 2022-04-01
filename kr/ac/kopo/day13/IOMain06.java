package kr.ac.kopo.day13;

/*
 * read 메소드는 파일의 끝을 -1로 인식한다.
 * 
 * main 메소드에 존재하는 String[] args 와 같은 매개변수에 할당된 것을 argument라고한다.
 * 
 */


/*
	iotest/IOMain05.java -> IOMain05.java.txt 복사
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;


public class IOMain06 {

public static void main(String[] args) {
	
	FileReader fr = null;
	FileWriter fw = null;
	
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	try {
		
		fr = new FileReader("iotest/IOMain05.java");
		br = new BufferedReader(fr);
		
		fw = new FileWriter("iotest/IOMain05.java.txt");
		bw = new BufferedWriter(fw);
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			bw.write(data);
			bw.newLine();
		}
		bw.flush();
		System.out.println("파일 복사를 완료하였습니다");
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		FileClose.close(br);
		FileClose.close(fr);
		FileClose.close(bw);
		FileClose.close(fw);
	}
	
}
}
