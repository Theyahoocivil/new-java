package org.task;

import java.util.Scanner;

public class Equality {
	public static void main(String[] args) {
	System.out.println("Enter the two strings");	
	
Scanner scanner = new Scanner(System.in);
String a = scanner.next();
String b =scanner.next();
boolean equals = a.equals(b);
System.out.println(equals);
}
}