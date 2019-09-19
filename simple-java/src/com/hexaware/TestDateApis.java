package com.hexaware;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDateApis {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("Year" + date.getYear());
		System.out.println("Month " + date.getMonth());
		
		LocalDate today = LocalDate.now();
		System.out.println("Today " + today);
		System.out.println("Year: " +  today.getYear());
		System.out.println("Month : " + today.getMonth());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Today with pattern: " + today.format(dtf));
	}
}
