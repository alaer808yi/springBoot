package com.timer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@Configurable
public class TimeSchedule {
	
	@Scheduled(cron="0 3/5 8-20 *  * ?")
	public static void getTime(){
		
	}

}
