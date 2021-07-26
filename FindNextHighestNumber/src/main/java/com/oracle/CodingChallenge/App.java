package com.oracle.CodingChallenge;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CodingChallenge codingTest = new CodingChallenge();
		boolean check = true;
		System.out.println("---------------Find the next highest number--------------");
		System.out.println("Enter 'Exit' to quit the program");
		while (check) {
			System.out.println("Enter number:");
			String input = scanner.next();
			if(input.toLowerCase().equals("exit")) {
				System.out.print("Have a good day!");
				check = false;
			} else {
					String output = codingTest.nextHighestNumber(input);
					System.out.println("Result:" + output);
			}			
		}
		scanner.close();

	}
}
