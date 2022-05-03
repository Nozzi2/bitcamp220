package nozzi2.Namane_Calendar;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class CalendarMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CalendarService CalendarService = new CalendarService();
		Calendar cal = Calendar.getInstance();
		CalendarService.menu();
	}
}
