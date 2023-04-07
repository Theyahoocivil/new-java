package org.task;

import java.util.Scanner;

public class Find {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a String.");
	String s = scanner.nextLine();
	boolean contains = s.contains("pincode"); 
	if(contains==true) {
		String replace = s.replaceAll("pincode", "  ");
		System.out.println(replace);
	}
	}
}

