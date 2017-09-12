package KBC;

import java.util.Scanner;

public class UserInput {
	void userpass(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Remember that Username and Password must be same");
	System.out.println("");
	System.out.print("Enter Username ::  ");
	String username = scanner.nextLine();
	System.out.println(username);
	System.out.print("Enter Password ::  ");
	String password = scanner.nextLine();
	if(!username.equals(password)) {
		System.out.println("Get lost you don't even saw first line,"
				+ " How can u play KBC"); 
	}
	else {
		System.out.println(password.replaceAll(".","*"));
		System.out.println("Congratulations you had completed first step,"
				+ " now u are eligible to play my game");
		System.out.println("Do you want to start (Y/N)");
		String chin = scanner.next();
		scanner.close();
		if(chin == "Y"|| chin =="y")
			System.out.println("Welcome to KBC");
		else {
			System.out.println("Good Bye, Take a Vodka Shot");
			System.exit(0);
		}
		TermsAndConditions tc = new TermsAndConditions();
		tc.show();
	}
		
}}
