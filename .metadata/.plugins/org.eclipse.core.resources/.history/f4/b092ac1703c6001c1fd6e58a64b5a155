package _abstract;

import java.util.Calendar;
import java.util.Scanner;

class CalendarTest1 {
	private int year, month, lastDay, week;
	
	public CalendarTest1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}
	
	public void calc() {
		//Calendar cal = new Calendar(); - error
		//Calendar cal = new GregorianCalendar(); //Sub class를 이용하여 생성
		Calendar cal = Calendar.getInstance();//메소드 - 기준은 시스템 날짜로 생성 (2022.04.27)
		
		//기준을 원하는 날짜로 변경
//		cal.set(Calendar.YEAR, year);
//		cal.set(Calendar.MONTH, month-1);
//		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		cal.set(year, month-1, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일?
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//28,29,30,31
	}
	
	public void display() {
		System.out.println();
		System.out.print("일\t월\t화\t수\t목\t금\t토\t\n");
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=lastDay; i++) {
			System.out.print(i + "\t");
			if(week%7 == 0) System.out.println();
			week++;
			
		}
	}
	
}
//----------
public class CalendarMain_lect {

	public static void main(String[] args) {
		CalendarTest1 ct = new CalendarTest1();
		ct.calc();
		ct.display();

	}

}

/*
[문제] 만년달력
1. 년, 월을 입력하여 달력을 출력하시오
2. 클래스 : CalendarTest1
   필드
   생성자 : 입력
   메소드 : calc() -> 월마다 끝나는 일(28, 29, 30, 31)을 구하기
                  -> 월마다 시작하는 요일을 구하기
           display()

[실행결과]
년도 입력 : 2002
월 입력 : 10

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

 */







