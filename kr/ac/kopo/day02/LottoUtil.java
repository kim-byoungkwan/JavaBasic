package kr.ac.kopo.day02;

import java.util.Random;

/**
 * 이것을 문서화 주석이라고 한다.
 * Lottoutil 클래스는 로또와 관련된 여러가지 기능 클래스를 의미한다.
 * @author kim-byoungkwan
 *
 */

public class LottoUtil {
	
	public void todayProbabiltiy() {
		
		Random r = new Random();
		
		int p = r.nextInt(101);
		// 임의의 정수형의 난수를 추출하겠다는 의미이다. 이경우 인자값을 101로 지정했으므로, 0 ~ 100의 숫자를 추출하게된다.
		// 즉 101로 나누었을때 나머지는 무조건 0~100의 숫자가 추출되므로, 이러한 개념을 의미하는 인자이다.
				
		System.out.println("오늘의 로또 확률은 " + p +  "%입니다 ");
		
	}

}
