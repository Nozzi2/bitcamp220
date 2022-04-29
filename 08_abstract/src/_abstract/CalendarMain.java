package _abstract;

import java.util.GregorianCalendar;
import java.util.Scanner;

class CalendarTest {
	//필드
	//평년일때 1~12월 말일
	static int[] MAX_DAY_OF_PYUNGYEAR = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//윤년일떄 1~12월 말일
	static int[] MAX_DAY_OF_YOONYEAR = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	GregorianCalendar greCal = new GregorianCalendar();
	int weekday; //월초 요일
	int year;
	int month;
	int max_day; //월 말일
	final int GIJUN = 1; //1년 1월 1일은 월(1)요일이다.
	
	
	//생성자로 날짜 입력받기
	public CalendarTest(int year, int month) {
		this.year = year;
		this.month = month;
		calc1();
		calc2();
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getWeekday() {
		return weekday;
	}
	
	//메소드
	//윤년 평년 계산하여 월말일 계산
	public void calc1() {
		if(greCal.isLeapYear(this.year)) {
			//윤년
			max_day = MAX_DAY_OF_YOONYEAR[month-1];
		} else {
			//평년
			max_day = MAX_DAY_OF_PYUNGYEAR[month-1];
		}
	}
	
	//월초 요일, 월말일 계산
	public void calc2() {
		int sum=0;
		
		//1년부터 시작해서 윤년일때마다 366을 더하고, 그외에는 365일 더하기
		for(int i=1; i<year; i++) {
			if(greCal.isLeapYear(i)) {
				sum+=366;
			} else {
				sum+=365;
			}
		}
		
		//월도 일수 합계에 더하기
		for(int i=1; i<month; i++) {
			if(greCal.isLeapYear(year)) {
				sum+=MAX_DAY_OF_YOONYEAR[i-1];
			} else {
				sum+=MAX_DAY_OF_PYUNGYEAR[i-1];
			}
		}
		
		weekday = (sum+GIJUN+2)%7;
	}
	
	//달력 출력
	public void display() {
		//일 월 ~ 토 출력
		String[] weekdayKor = {"일","월","화","수","목","금","토"};
		System.out.print(" ");
		for(int i=0; i<weekdayKor.length; i++) {
			System.out.print(String.format("%2s", weekdayKor[i])); // % 'n'칸만큼 떨어져서 출력
			if(i%2==0 || i==weekdayKor.length-2) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		
		//시작하는 요일만큼 공백
		for(int i=0; i<weekday; i++) {
			System.out.print("   ");
		}
		//공백 후 첫 요일부터 출력
		for(int i=0; i<max_day; i++) {
			System.out.print(String.format("%3d", (i+1)));
			if((i+1+weekday)%7==0) { //7일마다 줄바꾸기
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
}


//-----------------------------------------
public class CalendarMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) { //연도 입력 시 음수 입력이면 중지
			System.out.print("년도를 입력하세요 : ");
			int year = scan.nextInt();
			if(year<0) break; //음수일 경우엔 다시 출력
			System.out.print("월을 입력하세요 : ");
			int month = scan.nextInt();
			CalendarTest calendarTest = new CalendarTest(year, month);
			calendarTest.display();
		}
		System.out.println("프로그램이 종료되었습니다.");

	}

}

/*
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR); //파라미터로 상수 전달
	int month = cal.get(Calendar.MONTH)+1; //1월이 0부터 시작됨 ㅡㅡ
	int day = cal.get(Calendar.DAY_OF_MONTH);
	String[] weekKor = {"일","월","화","수","목","금","토"};
	int week = cal.get(Calendar.DAY_OF_WEEK)-1;
	int hour = cal.get(Calendar.HOUR_OF_DAY);
	int min = cal.get(Calendar.MINUTE);
	int sec = cal.get(Calendar.SECOND);
	System.out.println(year+"년 "+month+"월 "+day+"일 "+weekKor[week]+"요일");
	System.out.println(hour+"시 "+min+"분 "+sec+"초");
 */



/*
[문제] 만년 달력
1. 년, 월을 입력하여 달력을 출력하시오.
2. 클래스 : CalendarTest
   필드
   생성자 : 입력
   메소드 : calc() -> 월마다 끝나는 일이 다름.
                     월마다 시작하는 요일이 다름
          display -> 


[실행결과]
년도 입력 : 2002
월 입력 : 10

일  월  화  수  목  금  토
       1   2  3   4  5
6   7  8   9  10  11 12
..
27  28 29  30 31




*/