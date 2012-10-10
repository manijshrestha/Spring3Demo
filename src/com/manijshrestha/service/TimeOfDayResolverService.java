package com.manijshrestha.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

import com.manijshrestha.TimeOfDay;

/**
 * Service that will resolve proper time of day given current time
 * 
 * @author manijshrestha
 * 
 */
@Service
public class TimeOfDayResolverService {

	public TimeOfDay getTimeOfDay() {
		// Get Current Date
		Calendar now = new GregorianCalendar();

		int currHour = now.get(Calendar.HOUR_OF_DAY);
		// between 12 am - noon returns Morning
		if (currHour >= 0 && currHour < 12)
			return TimeOfDay.MORNING;
		else if (currHour >= 12 && currHour < 17)
			return TimeOfDay.AFTERNOON;
		else
			return TimeOfDay.NIGHT;
	}
}
