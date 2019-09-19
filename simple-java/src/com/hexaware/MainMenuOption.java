package com.hexaware;
import java.util.List;
import java.util.Scanner;

public class MainMenuOption {
	static EmployeeDAO dao = new EmployeeDAO();
	public static void main(String[] args) {
		
		MainMenuShow();
	}
	public static void MainMenuShow() {
		while(true) {
		System.out.println("Employee Service");
		System.out.println("1. Store");
		System.out.println("2. Delete");
		System.out.println("3. Find By ID");
		System.out.println("4. List all");
		System.out.println("5. Update Salary");
		System.out.println("6. Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("Enter the Id");
		int id = sc.nextInt();
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter the Salary");
		double salary = sc.nextDouble();
		store(id, name, salary);
	}
		
		else if (choice == 2) {
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			delete(id);
			System.out.println("Done");
		}
		else if (choice == 3) {
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			findById(id);
		}
		else if (choice == 4) {
			//TestSelect.main(null);
			findall();
		}
		else if (choice == 5) {
			System.out.println("Enter the Id");
			int id = sc.nextInt();
			System.out.println("Enter the Salary");
			double salary = sc.nextDouble();
			update(id, salary);
		}
		else if (choice == 6) {
			Runtime.getRuntime().halt(0);
		}
		else {
			Runtime.getRuntime().halt(0);
		}
		}
	}
	public static  void store(int id, String name, double salary) {
		
		Employee emp = new Employee(id, name, null, salary);
		dao.store(emp);
		System.out.println("Done");
	}
	public static void delete(int id) {
		dao.delete(id);
		System.out.println("Done");
	}
	public static void findById(int id) {
		Employee emp = dao.findById(id);
		System.out.println(emp);
		}
	public static void findall() {
		List<Employee> emp = dao.findAll();
		for(Employee e : emp) {
		//System.out.println(e);
		System.out.println("Id: "+ e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
		}
	}
	public static void update(int id, double salary) {
		int emp = dao.updateSalary(id, salary);
		if(emp!=0) {
			System.out.println("Done");
		}
		else {
			System.out.println("Failed");
		}
		}
	}


