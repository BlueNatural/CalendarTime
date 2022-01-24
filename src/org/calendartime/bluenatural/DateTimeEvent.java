package org.calendartime.bluenatural;

import java.util.Date;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.entity.Player;

public class DateTimeEvent extends Event {
	private Player p;
	private Date date;
	private TimeSetter ts;
	public DateTimeEvent(Player p,Date date) {
		this.p = p;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public Player getPlayer() {
		return p;
	}
	public TimeSetter getTimeSetter() {
		return ts.getDateNow(date);
	}
	
	private static HandlerList handlerlist = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		// TODO Auto-generated method stub
		return handlerlist;
	}
	public static HandlerList getHandlerList(){
		return handlerlist;
	}


}
