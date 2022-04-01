package kr.ac.kopo.day11.calendar;


import java.util.Scanner;

public class CalendarView {

	private Scanner sc = new Scanner(System.in);
	
	private int getInt(String msg) {
		System.out.print(msg);
		return Integer.parseInt(sc.nextLine());
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		while(true) {
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.이전달  4.다음달 5. 현재달 0.종료) : ");
			int year = 0, month = 0;
			switch (type) {
			case 1:
				year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2:
				year = getInt("년도를 입력하세요 : ");
				month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}
}
