package com.hexaware;

import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) {
		System.out.println("Welcome to Eclipse");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Text");
		String word = sc.next();
		System.out.println("Enter th number");
		int num = sc.nextInt();
		System.out.println("word " + word + ", Number " + num);
		sc.close();
	}
}
