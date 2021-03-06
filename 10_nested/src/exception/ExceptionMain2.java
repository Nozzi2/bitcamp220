package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionMain2 {
	Scanner scan = new Scanner(System.in);
	private int dan;
	
	public void input() throws IOException {
		System.out.print("원하는 단을 입력 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		dan = Integer.parseInt(br.readLine());
		if(dan > 9 || dan < 2) {
			//System.out.println("범위초과");
			//return;
			try {
				//개발자가 강제로 Exception 발생하게 할 수 있음.
				throw new MakeException("내가 만든 에러메시지");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			output();
		}
		
	}
	
	public void output() {
		for(int i=1; i<10; i++) {
			System.out.println(dan+"*"+i+" = "+(dan*i));
		}
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input(); //호출부에도 throws가 있어야함
		//exceptionMain2.output();
	}
}


/*
원하는 단을 입력 : 7

input() => BufferedReader 사용, throws 사용




7*1=7
7*2=14
~~

output() => 사용
*/