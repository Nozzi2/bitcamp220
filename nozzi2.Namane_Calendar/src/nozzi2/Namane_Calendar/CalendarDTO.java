package nozzi2.Namane_Calendar;

import java.util.Calendar;
import java.util.Date;

enum Category {
	Birthday, Meeting, Friend, Family, Anniversary 
}

public class CalendarDTO {
	private Calendar today;  //등록일
	private Calendar planDay; //계획일
	private Calendar D_day; //계산되는 디데이
	private int cate; //카테고리
	private static int no; //자동생성되는 일련번호
	private boolean isImpt; //중요일정여부
	private String content; //일정 내용
	
	public CalendarDTO(Calendar planDay, int cate, String content, boolean isImpt, Calendar today) {
		this.planDay = planDay;
		this.cate = cate;
		this.content = content;
		this.isImpt = isImpt;
		
		//일단 평소에는 오늘날짜 기준으로 객체가 생성되지만, 매일마다 테스트할 수 없으므로 객체 생성함
		this.today = Calendar.getInstance(); 
		CalendarDTO.no = no++;
	}


	public void setToday(Calendar today) {
		this.today = today;
	}


	public void setPlanDay(Calendar planDay) {
		this.planDay = planDay;
	}


	public void setD_day(Calendar d_day) {
		D_day = d_day;
	}


	public void setCate(int cate) {
		this.cate = cate;
	}


	public static void setNo(int no) {
		CalendarDTO.no = no;
	}


	public void setImpt(boolean isImpt) {
		this.isImpt = isImpt;
	}


	public void setContent(String content) {
		this.content = content;
	}

	public Calendar getToday() {
		return today;
	}

	public Calendar getPlanDay() {
		return planDay;
	}

	public Calendar getD_day() {
		return D_day;
	}

	public int getCate() {
		return cate;
	}

	public static int getNo() {
		return no;
	}

	public boolean isImpt() {
		return isImpt;
	}

	public String getContent() {
		return content;
	}
	
	
}
