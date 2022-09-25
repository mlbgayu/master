package com.gayu.localization1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateFormatExample {
	
	
	void doDateFormat(Locale loc, TimeZone zone) {
		DateFormat df = DateFormat.getTimeInstance(DateFormat.LONG,loc);
//		df.setTimeZone();
		String d2 = df.format(new Date());
		System.out.println(d2);
	}
	
	
	public static void main(String[] args) {
			DateFormatExample d = new DateFormatExample();
			Locale local_india = new Locale("ta","IN");
			TimeZone  india_tz =TimeZone.getTimeZone("IST"); 
			Locale local_us = new Locale("en","US");
			TimeZone.getTimeZone("EST");
			d.doDateFormat(local_india,india_tz);
	}
}
