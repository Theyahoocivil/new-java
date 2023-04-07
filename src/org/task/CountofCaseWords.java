package org.task;

import java.util.Scanner;

public class CountofCaseWords {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the text");
	String txt = scanner.nextLine();
	int length = txt.length();
	int count = 0;
	boolean contains = txt.contains("@");
	for(int i=0;i<txt.length();i++)
	if(Character.isUpperCase(txt.charAt(i))) {
		if(contains==true) {
			System.out.println("Characters Present in tis Sentence is :");
			System.out.println(contains);
			
		}
		count++;
		
	}
System.out.println("UpperCase is :"+count);
System.out.println("Lowercase is :"+(length-count));
}
	
	
	
	
	
	
	}

