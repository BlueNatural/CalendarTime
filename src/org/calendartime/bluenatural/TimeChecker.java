package org.calendartime.bluenatural;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeChecker {
	private Date date;
	public TimeChecker(Date date) {
		this.date = date;
	}
	public Boolean isEqualDate(String string) throws ParseException {
		TimeSetter ts = TimeSetter.getDateNow(date);
		
		return ts.getDate(string).equals(date);
	}
    @SuppressWarnings("deprecation")
	public Boolean isOneOfWeekDays() {
    	Calendar calendar = Calendar.getInstance();
    	Date date = calendar.getTime();
    	return date.getDay() == calendar.getTime().getDay();
    }
	public String getUTCofCountry(String idcountry) {
		
		TimeZone timezone = TimeZone.getTimeZone(idcountry);
		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		sdf.setTimeZone(timezone);
		return sdf.format(date);
	}
	public Date getTimeofUTCCountry(String string) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			Date date = (Date) sdf.parse(getUTCofCountry(string));
		return date;
	}

}
