package org.calendartime.bluenatural;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class StopWatch {
	
	private boolean bl;
	private int second,minute;
	
	public StopWatch(Boolean bl) {
		this.bl = bl;
	}
	public void stopwatch(Player p) throws InterruptedException {
		
		
		while (bl) {
			Thread.sleep(1000);
			
			second++;
			if (second == 60) {
				second = 00;
				minute++;
				second++;
			}
 			p.sendMessage(ChatColor.GREEN + String.valueOf(minute) + ChatColor.WHITE +  ":" + ChatColor.GREEN + String.valueOf(second));


		}
		
		}
	public boolean equalTime(int minute2,int second2) {
		return minute == minute2 && second == second2;
	}

	}

