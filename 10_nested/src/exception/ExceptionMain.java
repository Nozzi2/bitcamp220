package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length >= 1) { //데이터가 입력 되었으면
			System.out.println("args[0] : "+args[0]+"\n");
		}
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		
		//int data = br.read(); //1개 문자
		
		try {
			System.out.print("정수 입력 : ");
			int a = Integer.parseInt(br.readLine());
			
			System.out.print("정수 입력 : ");
			int b = Integer.parseInt(br.readLine());
			
			System.out.println(a+"/"+b+"="+(a/b));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식만 입력하세요. !!");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.!!");
		} finally { //무조건 실행하는 문장
			System.out.println("finally : error가 있건 없건 무조건 실행");
		}
	}

}
