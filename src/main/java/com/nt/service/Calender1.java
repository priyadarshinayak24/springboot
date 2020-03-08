package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("cal")
public class Calender1 {
	public String wishMsgenerate(String name) {
		Calendar calc=null;
		int hour=0;
		//get instance
		calc=Calendar.getInstance();
		//get current hour of day
		hour=calc.get(Calendar.HOUR_OF_DAY);
		//generate wish msg
		if(hour<12)
			return "GOOD MORNING"+ name;
		if(hour<16)
			return "GOOD AFTERNOON" + name;
		if(hour<20)
			return "GOOD EVENING"+ name;
		else
			return "GOOD NIGHT" + name;
	}

}
