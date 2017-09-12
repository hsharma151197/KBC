package KBC;

import java.util.Scanner;

public class KBC {

	public static void main(String[] args) {
		UserInput userinput = new UserInput();
		userinput.userpass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lifelines :: ");
		System.out.println("1. Audience Poll");
		System.out.println("2. Flip");
		System.out.println("3. Fifty-Fifty");
		System.out.println("4. Expert Advice");
		System.out.println("");
		String Answer = scanner.next();
		
	}

}
