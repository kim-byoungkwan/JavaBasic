package kr.ac.kopo.day06;

//next() 메소드는 단어단위로 입력 받고, nextLine()는 라인단위로 입력받는다.
//라인단위라는 것은 엔터를 기준으로 라인으로 인식하고, 단어단위라는 것은 스페이즈바를 기준으로 입력받는다.
//자바라는 컴파일러는 키보드 입력을 받을 대, 입력버퍼를 사용하기때문에 nextLine()메소드의 문제가 생긴다.
//입력버퍼를 쓰는 가장 큰 목적은 성능향상을 위해서이다.
//램에 있는 정보를 입출력장치를 통해 출력하거나, 입출력장치에 있는 정보를 램에 저장할수도있다. 이때, 
//정보가 램과 입출력장치사이를 움직일때, char by char단위로 정보가 움직인다. 135라는 숫자를 키보드를
//통해 입력해도, 실제로 램에 정보가 저장되는 단위는 1,3,5 와같은 문자단위로 전달되게된다.
//즉, 램과 외부 입출력장지가 정보를 주고받을때 문자단위로 움직이는 것이다.
//외부입출력장치에서 램에있는 정보에 접근하는 속도는 램에있는 정보를 램에서 접근하는 속도에 비해 100배이상느리다.
//그러므로, 3자리의 정수를 입출력장치를 통해 램에 입력하는 속도와 5자리의 정수를 입출력장치를 통해 램에 입력하는 속도는
//큰 속도차이가 발생하게 된다. 그래서, 컴퓨터는 정수의 자리수에 상관없이 정보를 램에 저장하고 접근하는 속도를
//줄이기 위해 고민하는 과정에서 버퍼라는 저장장치를 고안하게됐다.
//아침점심저녁 밥을 먹기위해 매번 시장에 가서 재료를 사야하는 것은 매무 비효율적이다. 이와같은 상황이 버퍼기억장치ㅏㄱ
//존재하지 않으면 발생하게된다. 이런 문제를 없애기 위해, 아침점심저녁먹을 밥의 재료를 모두 사와서 나의 위치와 가까운
//버퍼에 한번에 저장해서 밥을 먹을때마다 빠르게 재료를 갖고와서 해먹을 수 있으면 이러한 문제를 해결할 수 있다.
//여기서 입출력장치는 시장이고, 램은 내가 있는 위치 즉 집이다. 버퍼는 램안에 즉 나의 위치와 가까운 곳에 존재한다.
//실제 모든 프로그래밍언어는 모두 버퍼라는 기억공간을 사용한다.
//즉, 키보드(시장)에서 입력받을 때, 한꺼번에 입력을 받고자한다.
//nextLine()은 키보드에서 입력받을때, 엔터라는 단위가 나올때까지 모두 한꺼번에 입출력장치 키보드로부터 최대한 입력
//받아서 효율성을 높이려고하는 것이다.한꺼벋에 엔터가 등장하기 전까지 키보드로부터 입력받은 내용을 모두 나의 위치 (램)
//과 가까운 버퍼라는 저장공간에 저장해놓는 것이다. 이것이 nextLine()의 개념이다. 정확하게는 키보드에서 입력받은
//문자를 저장하는 버퍼인 입력버퍼에 저장되는 것이다.

//nextInt() 메소드를 사용하기 전에 무조건 제일번저 입력버퍼가 비어있는지 아닌지를 확인한다. 즉 집에 있는쌀통에 쌀이
//있는지 없는지를 먼저 확인하는 것이다.
//45 엔터를 키보드로부터 했을 경우 입력버퍼에는 4, 5, \n이 문자로서 저장되게 되는 것이다.
//nextInt() 메소드는 숫자만 문자로 인식해서 입력버퍼에 저장하게된다. 즉 엔터가 \n 입력버퍼에 저장되게되면
//45 엔터를 입력한 경우 45라는 \n전의 숫자만 변수에 저장하게 된다. 이때, \n는 다른 문자열을 저장하는 변수에 저장되게 된다.
//즉, 45는 num 이라는 변수에 \n은 ch 라는 변수에 저장되게된다.

//nextInt()메소드를 사용하기 전에 만약 입력버퍼에 \n과 같은 문자가 존재하고 있을때, 입력버퍼에 모든 내용을 버리고,
//다시 엔터 \n가 등장할때까지 정수를입력받게 된다. 실수로 문자를 입력하긴해도 문자도 일단 입력버퍼에 옮겨지긴하지만,
//버퍼에 저장되면 에러가 발생하고, \n엔터 문자는 입력버퍼에 저장하게된다. nextInt() 메소드를 사용해서 숫자를
//입력받으면 버퍼에 숫자를 저장하고 엔터문자 \n가 입력되기 전까지의 모든 숫자를 입력버퍼에 저장하고 그것을 숫자로
//인식하는 것이다. 즉 숫자문자가 아닌 스페이스 문자나 엔터문자가 등장하기전의 모든 숫자를 인식하는 것이다.
//따라서 아래와 같이 스캐너의 입력 메소드 nextInt()를 3번이나 사용했지만,
//10 20 30 엔터 와같이 입력을 하게 되면, 스페이스와 엔터를 기준으로 입력버퍼에 저장되고,
//정수를 입력받으므로, num1,2,3 변수에 한번에 저장되게 되는 것이다.
//첫번째 nextint()에 의해 10 스페이스 20 스페이스 30 엔터 문자가 입력버퍼에 저장되고,
//nextInt()메소드는 정수가아닌 문자가 등장하는 스페이스가 등장할때까지의 정수를 입력받으므로 10을
//입력받고 그것을 변수에 저장하면 그 위에 스페이스 20 스페이스 30 이 변수에 저장된 10을 제외하고
//남아있게되고, 두번째 nextInt()메소드가 실행될때 이 메소드는 스페이스문자는 입력받지 않고
//버퍼에서 제거하므로 20이라는 정수를 인식하고, 스페이스문자가 등장하므로 20을 변수에 저장한다.
//그리고 세번째 nextInt() 메소드가 실행되면 남아있는 스페이스를 버리고, 30을 입력받고, 뒤에
//엔터가 등장하므로 30을 num3 변수에 저장하게된다. 이후 입력버퍼엔 \n 엔터문자만 남아있게된다.
//즉 nextInt() 메소드가 실행되면 항상 마지막엔 최소 \n 문자는 남아있게되므로, nextInt()메소드를
//사용했을때 입력버퍼에 남아있는 \n엔터문자를 제거하기 위해 뒤에 sc.nextLine()를 사용한다.
//nextLine()는 엔터가 등장할때까지 엔터를 기준으로 문자를 인식하므로, 엔터가 나오면 버퍼를 엔터이전까지으
//문자를 변수에 입력받고, 버퍼를 비우기때문에 버퍼를 비울 수 있게된다.
//이때, sc.nextLine(); 만 변수 = 없이 사용하면 입력버퍼에 남아있는 엔터문자만 제거하고 입력버퍼에
//무엇이 존재한다 하더라도 변수가 존재하지 않으므로 입력버퍼에 남아있는 내용이 변수에 저장되는 동작은
//발생하지 않아서 입력버퍼를 청소할 수 있게되는 것이다. 즉, nextLine()는 엔터문자가 등장하면 
//엔터문자 이전의 모든 값을 변수에 저장하고 엔터문자이후에 있는 모든 입력버퍼의 내용을 제거하게된다

//정수입력하는 nextInt() 메소드를 사용할때 실수로 .점 을 입력하게 되면 정수아닌 문자가 입력버퍼에
//저장되므로 오류가 발생하게된다.

//nextLine() 메소드를 사용하여 엔터이전의 문자를 모두 버퍼에 입력받게 되면 엔터가 등장하는 순간 
//엔터이전의 모든 문자를 문자열로 인식하여 버퍼에 엔터이전의 문자를 소비하는 과정이 일어나는데,
//소비하는 과정에서 만약 str = nextLine() 와 같이 변수가 정의된경우에 이 문자열로 인식하여 소비된
//문자를 str 변수에 저장하고 만약에 str = 과 같은 변수가 정의되지 않았다면, 엔터이전의 문자열로 인식된
//문자는 단지 소비되어 입력버퍼로부터 없어지고 입력버퍼는 사라지게된다.

//만약에 nextInt() 메소드를 이용해서 10 20 30 \n가 입력버퍼에 저장되게되고 두번째 nextInt()
//메소드가 실행될때 입력버퍼에 20 30 \n이 이미 존재하므로 "키보드로부터 입력받는 행위자체"를 하지않고,
//이미 입력버퍼에 존재하는 내용을 키보드로부터 입력받은 것으로 인식하고 스페이스가 등장하기 전, 즉
//정수가 아닌 문자인 스페이스문자가 등장하기 이전에 정수 20을 입력버퍼로부터 소비하여 이경우엔 변수가
//정의되어있으므로, 변수 num2에 저장되게 되고, 이때 입력버퍼에는 30\n만 남게된다.

//nextLine() 메소드는 엔터문자 이전의 모든 문자를 문자열로 한번에 인식하므로, 엔터문자가 등장하는순간
//엔터문자이전의 모든 문자를 하나의 문자열로 인식하고, 이를 소비하여 변수가 정의되어있다면 이를 변수에
//저장하거나, 변수가 정의되지 않은 경우 하나의 문자열을 입력버퍼로부터 제거한다. 그래서 결과적으로
//위와 같이 nextInt()메소드가 3번사용되고 nextLine() 메소드를 사용하면 입력버퍼에 남아있던
//마지막 \n도 제거되면서 입력버퍼가 청소되게된다.


import java.util.Scanner;

public class ScannerMain01 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("실수 : ");
		double f = Double.parseDouble(sc.nextLine());
		//double f = sc.nextDouble();
		//sc.nextLine();
		
		System.out.print("정수 : ");
		int num = Integer.parseInt(sc.nextLine());	// "123" -> 123
		
//		int num = sc.nextInt();
//		sc.nextLine();
		
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("str : " + str + ", num : " + num);
		*/
		
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("num : " + num 
				+ ", num2 : " + num2 + ", num3 : " + num3);
		
	}
	
}
