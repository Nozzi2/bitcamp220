package _if;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, rank;
		int salary, plusPay;
		double tax, tot; 
		name = sc.nextLine();
		rank = sc.nextLine();
		salary = sc.nextInt();
		plusPay = sc.nextInt();
		tot = salary+plusPay;
		tax = tot>4000000? 0.03 : 0.02;
		
		DecimalFormat df = new DecimalFormat();
		
		
		System.out.println("\t\t*** "+name+"월급 명세서 ***");
		System.out.println("직급 : "+rank+"\n");
		System.out.print("기본급\t\t"+
				"수당\t\t"+
				"급여\t\t"+
				"세율\t\t"+
				"세금\t\t"+
				"월급\n");
		System.out.print(df.format(salary)+"\t"+
				df.format(plusPay)+"\t\t"+
						df.format(tot)+"\t");
		//강사님이 풀이해주신 것과 비교해서 더 나은 방법
		System.out.print((int)(tax*100)+"%\t\t"); //<강사님 구현
		/* 내가 구현한 것
		if(tax>0.02) {
			System.out.print("3%"+"\t\t");
		} else {
			System.out.print("2%"+"\t\t");
		}*/
		System.out.println(df.format(tot*tax)+"\t\t"+
				df.format((tot-(tot*tax))));
		
		
		
	}

}

/*
[문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000원 이상이면 3% 아니면 2%로 한다 
if문 또는 조건 연산자 사용해도 된다.

급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000

         *** 홍길동 월급 명세서 ***
직급 : 부장

기본급      수당         급여            세율      세금      월급
4,500,000     200,000     4,700,000      3%      xx,xxx   x,xxx,xxx
*/