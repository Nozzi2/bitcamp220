package constructor;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		this.dan = scan.nextInt();
	}
	
	public void output() {
		StringBuffer buffer = new StringBuffer();
		for(int i=1; i<=9; i++) {
			//System.out.println(dan+"*"+i+"="+(dan*i));
			buffer.append(dan).append("*").append(i).append("=").append(dan*i);
			System.out.println(buffer);
			//buffer.delete(0, 6); //0번 인덱스부터 6번 인덱스 '전'까지 지우기
			buffer.delete(0, buffer.length()); //0번 인덱스부터 글자수 '전'까지 지우기
		}
	}
	
	public static void main(String[] args) {
		StringBufferMain stringBufferMain = new StringBufferMain();
		stringBufferMain.input();
		stringBufferMain.output();
	}

}


/*
원하는 단을 입력 : 7		input() 메소드 사용

7*1=7					output() 메소드 사용
7*2=14
...
7*9=63
*/