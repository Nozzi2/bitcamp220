package _for;

import java.io.IOException;

public class GuGuDan {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("원하는 단을 입력 : ");
		//int dan = (int)System.in.read()-48; //1개의 문자를 입력 받는다.
		int dan = (int)System.in.read()-'0';
		/*
		문자를 입력받는 것이기 때문에 문자를 int형으로 했을 때의 숫자를 입력하려는 수로 바꿔줘야한다.
		'5' = 53 > '5'-48 = 5
		*/
		GuGuDan ggd = new GuGuDan();
		
		if(dan>=2 && dan<=9) {
			ggd.gugudan(dan);
		} else {
			System.out.println("범위 초과");
		}
		
	}
	
	public void gugudan(int dan) {
		for(int a=1; a<10; a++) {
			System.out.print(dan+" * "+a+" = ");
			System.out.println(dan*a);
		}
	}

}


/*
[문제] 구구단
제한1 : 2~9단까지만 구구단을 계산한다.

[입력1]
7
[입력2]
-5

[실행결과1]
원하는 단을 입력 : 7
7 * 1 = 7
7 * 2 = 14
....
7 * 9 = 63

[실행결과2]
원하는 단을 입력 : -5
범위초과
*/