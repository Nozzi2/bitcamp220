package nozzi2.Namane_Calendar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class CalendarService {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void display(Calendar cal){
		System.out.print(cal.get(Calendar.YEAR)+"/");
		System.out.print(cal.get(Calendar.MONTH)+1+"/");
		System.out.println(cal.get(Calendar.DATE));

		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE));
		//요일 출력
		String[] weekdayKor = {"일","월","화","수","목","금","토"};
		for(int i=0; i<weekdayKor.length; i++) {
			System.out.print("   ");
			System.out.print(weekdayKor[i]); // % 'n'칸만큼 떨어져서 출력
			System.out.print("\t");
		}//for i
		System.out.println();
		System.out.println("---------------------------------------------------------");
		
		
		//공백 출력
		int week = cal.get(Calendar.DAY_OF_WEEK)-1; //1일의 요일?
		for(int i=1; i<week; i++) {
			System.out.print("\t");
		}//for
		
		//날짜 출력
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//28,29,30,31
		for(int i=1; i<=lastDay; i++) {
			if(i==cal.get(Calendar.DATE)) {
				System.out.print("<"+i+">"+ "\t");
			} else {
				System.out.print(i + "\t");
			}
			if(week%7 == 0){
				System.out.println();
				System.out.println();
				System.out.println("_________________________________________________________");
			}//if
			week++;
		}//for i
	}
	
	public void menu() throws NumberFormatException, IOException{
		Calendar cal = Calendar.getInstance();
		int month=cal.get(Calendar.MONTH);
		while(true) {
			display(cal);
			int select = Integer.parseInt(br.readLine());
			
			if(select == 1) {
				month++;
				cal.set(cal.get(Calendar.YEAR), month, cal.get(Calendar.DATE));
			} else if(select == 2) {
				month--;
				cal.set(cal.get(Calendar.YEAR), month, cal.get(Calendar.DATE));
			}
		}
		
		
		
	}

}
