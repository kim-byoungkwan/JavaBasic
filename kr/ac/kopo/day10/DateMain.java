package kr.ac.kopo.day10;

/*
 * Date d 에서 d는 주소값을 갖고 있는 변수인데, println(d)  와같이 사용하면 실제로는 println(d.toString())이 동작하고
 * 있는 것이므로, 주소값이 출력되지 않는다. 이때, toString()이 클래스를 불러오지 않았음에도 가능한 이유는 tostring() 메소드는
 * object 클래스에 존재하기 때문이다.
 * 
 * 그러므로, Date 클래스에는 object 클래스를 상속받아 object 클래스에 존재하는 toString() 메소드를 오버라이딩하므로,
 * Date클래스로 만든 d 객체를 통해 toString()를 사용할 수 있는 것이다.
 * 
 * calendar 클래스는 추상클래스이다. 추상클래스로는 인스턴스객체를 만들 수 없으므로, calendar 클래스로는 인스턴스 객체를
 * 만들 수 없다. 그러므로, calendar 클래스를 상속받은 자식클래스로 인스턴스 객체를 생성할 수 있는 것이다.
 * 
 * 그러므로, Calendar 클래스의 getInstance() 메소드를 활용하면, calendar 클래스를 상속받은 자식클래스를 통해 만들어진
 * 객체를 얻어올 수 있는 것이다.
 * 
 * 클래스 내부에 존재하는 메소드나 변수에 static을 붙이면 클래스를 통해 객체를 생성하지 않더라도, 클래스를 로딩하는 순간 바로
 * 메소드영역에 메소드와 변수가 객체화되어 존재하므로, 클래스.메소드or변수 를 통해서 접근할 수 있다.
 * 그러므로 calendar 클래스의 getInstance() 메소드에 접근하기 위해서 static를 붙여야만 하고, 그 순간 getInstance()가
 * 추상메소드임에도 불구하고, 클래스를 통해 클래스.메소드()를 통해서 접근할 수 있는 것이다.
 * 
 * 즉, JVM이 클래스를 사용할때, 즉, 클래스를 보는 순간 바로 클래스를 가장 먼저 로딩하여, 이 클래스를 사용해서 new를 적용하여 만들
 * 인스턴스객체를 할당할 저장공간의 크기를 미리 예측하는 것이다. 그런데 이때, JVM은 클래스내부에 존재하는 static으로 선언된 변수와
 * 메소드를 가장먼저 보자마자 메소드영역에 저장공간에 할당하여 객체화시키는 것이다. 
 * 
 * 객체와 객체는 서로 메소드를 이용해서만 데이터를 주고받는다.
 * 
 * getter , setter 메소드는 Date클래스 내부에 존재하는 private 변수 int year,month와같은 변수는 클래스의 내부{}에서만
 * 접근할 수 있으므로, 이러한 변수의 값을 가져오거나 값을 새롭게 설정할때엔 Date 클래스를 통해 생성된 객체를 통해 내부{}에 존재하는
 * 메소드를 접근하고, 이때의 메소드는 getter, setter형의 메소드이므로 이러한 메소드를 통해서 비로소 클래스 내부에 존재하는 private
 * 변수에 접근할 수 있으므로, private 변수를 컨드롤한다.
 * 
 * final 키워드만 있어도 상수가 형성되지만 일반적으로 public static final 을 함께 키워드로서 사용하여 상수를 생성한다.
 *  
 * set 메소드는 ()안의 매개변수가 다양한 형태로 가질 수 있는 형태로 메소드가 존재한다.
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 *  
 * 
 * 
 */


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 HH시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		/*
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);	// 1(일) ~ 7(토) 
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 "
				+ date + "일(" + week[day] + ")입니다");
		
		// 2020년 5월 20일 요일????
		c.set(2020, 5-1, 20);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20 " + week[day] + "요일");
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_WEEK);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
		*/
		
		/*
		Date d = new Date();
		System.out.println(d);
		
		// 오늘은 2022년 3월 23일(수)입니다
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
		int day = d.getDay(); // 0 ~ 6
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month 
					+ "월 " + date + "일(" + week[day] + ")입니다" );
		*/
	}
}
