package org.calendartime.bluenatural;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CountDown {
     private int minute,second;
     private boolean bl;
     
     public CountDown(Boolean bl) {
    	 this.bl = bl;
     }
     public void countdown(Player p) throws InterruptedException {
 		while(bl) {
 			Thread.sleep(1000);
 			second--;
 			if(second == 0 && minute > 0) {
 				second = 60;
 				minute--;
 				second--;
 			}else if(second == 0 && minute == 0) {
 				return;
 			}
 			p.sendMessage(ChatColor.GREEN + String.valueOf(minute) + ChatColor.WHITE +  ":" + ChatColor.GREEN + String.valueOf(second));
 		}
 	}
     public boolean equalTime(int minute2,int second2) {
 		return minute == minute2 && second == second2;
 	}
     public int getSecond() {
     	return second;
     }
     public int getMinute() {
     	return minute;
     }
}
