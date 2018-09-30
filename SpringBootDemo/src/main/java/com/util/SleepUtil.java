package com.util;

public class SleepUtil {
	public static void sleepMill(int millis){
		try {
			Thread.sleep(millis *1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
