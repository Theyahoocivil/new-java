package org.task;

import java.util.Scanner;

public class Verify {
public static void main(String[] args) {
	System.out.println("Enter Email");
	Scanner scanner = new Scanner(System.in);
	String verify = scanner.next();
	boolean contains = verify.contains("@");
	System.out.println(contains);
	
}
}
