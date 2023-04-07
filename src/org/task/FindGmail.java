package org.task;

import java.util.Scanner;

public class FindGmail {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Text");
String txt = scanner.nextLine();
boolean contains = txt.contains("gmail");
if(contains==true) {
	String replaceAll = txt.replaceAll("gmail", "yahoo");
	System.out.println(replaceAll);
}else {
	System.out.println("Gmail not present");
}








}
}
