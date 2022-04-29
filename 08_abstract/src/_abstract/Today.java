package _abstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : "+date); //객체 생성되는 시점의 시간 출력
		System.out.println();
		
		//날짜 형식
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일  HH:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println();
		
		//입력 
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		
		Date birth = input.parse("19930426052015"); //String -> Date
		System.out.println(birth);
		System.out.println("내 생일 sdf : "+sdf.format(birth));
		System.out.println("내 생일 input : "+input.format(birth));
		
		//Calendar는 추상클래스이므로 new할 수 없다. 
		//자식 클래스로 객체 생성하거나 메소드로 생성해야함
		//메소드로 선언할 땐 반환형이 부모클래스 인지 확인해야함
//		Calendar cal1 = new GregorianCalendar(); //기준은 시스템 날짜와 시간
//		Calendar cal2 = Calendar.getInstance();  //기준은 시스템 날짜와 시간
		
		//다른 나라의 시간을 기준으로 변경
		//Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific")); //캐나다 기준으로 시간을 잡겠다
		
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
	}
}
