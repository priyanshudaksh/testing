package com.hexaware;

import java.time.LocalDate;
import java.util.Set;
import java.util.HashSet;


public class TestEmployeeSets {

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "Alex", LocalDate.of(1998, 3, 20), 40000);
		Employee e2 = new Employee(200, "Bruce", LocalDate.of(1998, 3, 20), 40000);
		Employee e3 = new Employee(100, "Alex", LocalDate.of(1998, 3, 20), 40000);
		
		Set<Employee> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println("Size: " + set.size());
	}

}
