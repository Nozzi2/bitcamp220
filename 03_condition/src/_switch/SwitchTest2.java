package _switch;

import java.io.IOException;
import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 데이터 : ");
		int a = scan.nextInt();
		System.out.print("연산자 입력   : ");
		//char op = scan.next().charAt(0);
		int op1 = System.in.read(); //문자열 입력해도 좋음
//		int op = scan.nextInt();
		System.out.print("두번째 데이터 : ");
		int b = scan.nextInt();

		
//		switch(op) {
//		case '+' : System.out.print(a+" "+op+" "+b+" = ");
//					System.out.println(a+b); break;
//		case '-' : System.out.print(a+" "+op+" "+b+" = ");
//					System.out.println(a-b); break;
//		case '*' : System.out.print(a+" "+op+" "+b+" = ");
//					System.out.println(a*b); break;
//		case '/' : System.out.print(a+" "+op+" "+b+" = ");
//					System.out.printf("%.3f",(a/(double)b)); break;
//		default : System.out.println("연산자 에러");
//		}
		
		switch(op1) {
		case '+' : System.out.print(a+" "+(char)op1+" "+b+" = ");
					System.out.println(a+b); break;
		case '-' : System.out.print(a+" "+(char)op1+" "+b+" = ");
					System.out.println(a-b); break;
		case '*' : System.out.print(a+" "+(char)op1+" "+b+" = ");
					System.out.println(a*b); break;
		case '/' : System.out.print(a+" "+(char)op1+" "+b+" = ");
					System.out.printf("%.3f",(a/(double)b)); break;
		default : System.out.println("연산자 에러");
		}
	}

}


/*
[문제] 계산 - switch
정수형 2개와 연산자를 입력하여 계산하시오
단 연산자(+,-,*,/)만 입력하고 그외는 에러가 나오게 하면 된다.

[실행결과]
첫번째 데이터 : 25
연산자 입력  : +
두번째 데이터 : 36
25 + 36 = xx

첫번째 데이터 : 25
연산자 입력  : /
두번째 데이터 : 36
25 / 36 = 0.~~~~

첫번째 데이터 : 25
연산자 입력  : %
두번째 데이터 : 36
연산자 에러
 */

