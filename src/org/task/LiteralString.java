package org.task;

import java.util.Scanner;

public class LiteralString {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the First text");
	String nextLine = scanner.nextLine();
	System.out.println("Enter the second text");
	String nextLine2 = scanner.nextLine();
	String s = "nextLine";
	//System.out.println("Enter the Third text");
	//String nextLine3 = scanner.nextLine();
	System.out.println(System.identityHashCode(nextLine));
	System.out.println(System.identityHashCode(nextLine2));
	//System.out.println(System.identityHashCode(nextLine3));
}
}
