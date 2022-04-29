package operator;


import java.io.IOException;
import java.util.Scanner;

public class CompTest3 {
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		String ch = scan.next();
		
		
		/* 내가 구현한 코드, 강사님이 구현한 콘드
		//소문자에서 32를 빼주면 대문자가 된다.
		int ch;

		//내가 구현한 코드
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		ch = System.in.read();
		
		System.out.print((char)ch+" -> ");
		ch = ch>=65 && ch<=90? ch+32 : ch-32;
		System.out.println((char)ch);
		
		
		
		System.out.println("\n\n 강사님이 풀어주신 코드");
		
		System.out.print("문자 입력 : ");
		int ch = System.in.read();

		char result = ch>='A' && ch<='Z'? (char)(ch+32) : (char)(ch-32);
		System.out.print(result);
		*/
	
		
	}
}

/*
[문제] 문자(ch)를 입력하여 대문자면 소문자로, 소문자면 대문자로 변환하시오.

[실행결과]
문자입력 : T
T -> t
*/