package org.task;

import java.util.Scanner;

public class ToUpper {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Text");
	String txt = scanner.nextLine();
	String lowerCase = txt.toLowerCase();
	System.out.println("Case changed text is :");
	String upperCase = lowerCase.toUpperCase();
	System.out.println(upperCase);
}
	
	
	
}

