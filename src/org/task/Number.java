package org.task;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		System.out.println("Enter your Mobile Number");
Scanner scanner = new Scanner(System.in);
String Num = scanner.next();
boolean contains = Num.contains("o");
System.out.println(!contains);
}
}