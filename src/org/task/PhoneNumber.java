package org.task;

import java.util.Scanner;

public class PhoneNumber {
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your mobile number");
	String phno = scanner.next();
	int length = phno.length();
	if(length<=10) {
		System.out.println("valid");
	}
	if(length>10) {
		System.out.println("Invalid");
	}
	
	}
}
