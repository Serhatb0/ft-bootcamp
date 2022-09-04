package com.biricik.ftBootcamp.util;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;

public class MethodUtils {

	
	/**
	 * Returns the current time and date in millis
	 * 
	 * @return TimeStamp
	 */
	public static Date getCurrentTimeStamp() {
		return new Timestamp(System.currentTimeMillis());
	}
	
	
	
	
	public static Object prepareErrorJSON(final HttpStatus status, final Exception ex) {
        Map  response = new HashMap<>();
        System.out.println("ex.getMessage(): " + ex.getMessage());
        response.put("status", status.value());
        response.put("ErrorMessage", ex.getMessage());
        response.put("time", ZonedDateTime.now(ZoneId.of("Z")));   
        return response;
    }
	
}
