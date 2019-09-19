package com.hexaware;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestEmployeeBean {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(100, "Alex", LocalDate.now(), 34500));
		employees.add(new Employee(100, "Bruce", LocalDate.of(1999, 8, 9), 90500));
		employees.add(new Employee(100, "Charls", LocalDate.of(1998, 6, 12), 65500));
		System.out.println("Total Employees: " + employees.size());
		Iterator<Employee> it = employees.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			if (e.getSalary()>70000) {
			System.out.println(e);
			}
		}
	}

}
