package org.calendartime.bluenatural;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.bukkit.entity.Player;

public class TimeSetter {
    private int second;
    private int minute;
    private int hour;
    private int day;
    private int month;
    private int year;
    private static Date date;
	private static Calendar calendar;
	public TimeSetter(int month,int day,int year,int hour,int minute,int second) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String createTimer() {
		
		date = new Date(month + day + year + hour + second + minute);
	    CalendarTime.plugin.getServer().getPluginManager().callEvent(new DateTimeEvent(null,date));

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			
			return sdf.format(date);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static TimeSetter getDateNow(Date date2) {
		date = date2;
		
	return new TimeSetter(date.getMonth(),date.getDay(),date.getYear(),date.getHours(),date.getMinutes(),date.getSeconds());
	}
	
	public long convertTime() {
		SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		try {
			date = (Date) formatter2.parse(createTimer());
			long time = date.getTime();
			
			return time;
		} catch (ParseException e) {
			return 0;
		}
	}
	@SuppressWarnings("deprecation")
	public void setTime(int second,int minute,int hour,int day,int month,int year) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		date = (Date) formatter.parse(createTimer());
	    date.setSeconds(second);
	    date.setMinutes(minute);
	    date.setHours(hour);
	    date.setDate(day);
	    date.setMonth(month);
	    date.setYear(year);
	    CalendarTime.plugin.getServer().getPluginManager().callEvent(new DateTimeEvent(null,date));

	}
	public void convertCalendar()  {
		calendar = Calendar.getInstance();
		int second = calendar.SECOND;
		int minute = calendar.MINUTE;
		int hour = calendar.HOUR;
		int day = calendar.DATE;
		int month = calendar.MONTH;
		int year = calendar.YEAR;
	   
		try {
			setTime(second,minute,hour,day,month,year);
		    CalendarTime.plugin.getServer().getPluginManager().callEvent(new DateTimeEvent(null,calendar.getTime()));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Date getDate(String string) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		date = (Date) sdf.parse(string);
		
		return date;
}
    public static Date getCalendarDate() {
    	date = calendar.getTime();
    	return date;
    }
	public static Calendar getCalendar() {
		return calendar;
	}
	
	
}
