package edu.whccd.evaldez;

import java.util.Scanner;

/*
    The purpose of this application is to demonstrate how to use try/catch blocks as well as their benefits
    Author: Evander Valdez

*/
public class Main {

    public static void main(String[] args) {
//  Initialize Variables
	int userInput;
	Scanner sc = new Scanner(System.in);

//	Try catch block
	try {
        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();
        System.out.println(userInput + " is valid");
    } catch (Exception e) {
        System.out.println("Invalid Input");
    }
	finally {
	    System.out.print("This message will display whether or not there is an exception.");
    }
    }
}
