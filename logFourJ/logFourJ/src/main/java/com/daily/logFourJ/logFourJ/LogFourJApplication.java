package com.daily.logFourJ.logFourJ;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class LogFourJApplication extends SpringBootServletInitializer {

	private static final Logger LOGGER = LogManager.getLogger("LogFourJApplication.class");

	public static void main(String[] args) {
		SpringApplication.run(LogFourJApplication.class, args);
		/*LOGGER.debug("Debug level log message");
		LOGGER.error("Error level log message");
		LOGGER.trace("Trace level log message");
		LOGGER.info("Info level log message");
		LOGGER.fatal("Fatal");
		LOGGER.warn("Warn");*/
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
/*		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");*/

		// Displaying the HashMap
		/*System.out.println("Initial Mappings are: " + hash_map);

		hash_map.entrySet().forEach(entry -> LOGGER.info("Current Broadcast: " + entry.getKey()));*/


		List ListofKeys = new ArrayList(hash_map.keySet());
		if (ListofKeys.size() != 0) {
			LOGGER.info("Current Broadcast: " + ListofKeys);
		}
		//System.out.print(ListofKeys);

		//	All dates between two given dates

		/*****************************************************************
		 *
		 */
		//String input = "2017-01-18 20:10:00";

// Using Java 8 new Date and Time API
/* DateTimeFormatter oldPattern = DateTimeFormatter .ofPattern("yyyy-MM-dd HH:mm:ss");
 DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
 java.time.LocalDateTime datetime = LocalDateTime.parse(input, oldPattern);
 String output = datetime.format(newPattern);
 System.out.println("Date in old format (java 8) : " + input);
 System.out.println("Date in new format (java 8) : " + output);
// String maxDate = newPattern.toString();
System.out.println(newPattern.toString());*/

	}
}
