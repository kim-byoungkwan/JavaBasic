package kr.ac.kopo.day13;

/*
 * 파일의 경로의 최상위폴더는 자바에선 일반적으로 JAVA 폴더이다. 그 안에 어떠한 파일의 존재여부를 생각할 수 있는 것이다.
 * 
 * length() 메소드의 출력값은 long형이다.
 * 
 * 디렉토리는 항상 폴더를 말하는 개념이다.
 * 
 * 이클립스는 실시간으로 내용이 보이는 탐색기는 아니다. 그래서 어떠한 변동사항을 보기위해선 F5를 놀러서 새로고침해야한다.
 * 
 * new File() 생성자에서 항상 매개변수안에 들어있는 인자의 마지막 값을 만들고자 하는 목적의 생성자이다.
 * 
 * 1.5버전의 for문에서 for(원소의 타입 변수명 : list) 과 같은 형태여야한다. 이때, 어떠한 배열의 "원소"의 타입이 표현되어야
 * 한다는 것을 알아야한다.
 * 
 * File 클래스에서 뒤에 Stream 이 붙는 것은 모두 바이트 스트림이다.
 * 
 * Scanner 클래스는 JDK 1.5 버전부터 등장했다.
 * 
 * 
 * 
 * 
 * 
 */

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
	
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory() ? "디렉토리" : "파일");
			}
			
//			String[] list = dirObj.list();
//			for(String data : list) {
//				System.out.println(data);
//				File fileObj = new File(dirObj.getName() + "/" + data);
//				System.out.println(fileObj.isDirectory() 
//						? "디렉토리" : "파일");
//			}
		}
		
		/*
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부 : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		if(!dirObj.exists()) {
			dirObj.mkdirs();
		}
		*/
	/*
		File fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("부모 : " + parent);
		
		System.out.println("파일 존재여부 : " + fileObj.exists());
		long fileSize = fileObj.length();
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		long lastTime = fileObj.lastModified();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간 : " 
					+ sdf.format(new Date(lastTime)));
	*/
	}
}
