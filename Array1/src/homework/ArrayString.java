package homework;

import java.util.Scanner;

public class ArrayString {
	public static void main(String[] args) {
		/*
		 * 
		 * dont take size enter the name do you wish to continue
		 * if yes ask for the next
		 * name do you wish to continue? If no print all the name
		 */
		ArrayString.name1();

	}

	static Scanner sc = new Scanner(System.in);

	public static void name1() {
		String names[] = new String[5];
		int count = 0;
		while(true) {
			System.out.println("enter name ");
			String input2 = sc.nextLine();
			names[count++] = input2;
			if(count == 5) {
				break;
			}
			System.out.println("Do yo wish to continue? ");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("yes")) {
				continue;
		
			}
			
			else {
				break;
			}
		}
		for (String n : names) {
			System.out.println(n);
		}
		
	}
	
	
	
	
	
	
	public static void name() {
		String names[] = new String[5];
		System.out.println("enter name ");
		String input2 = sc.nextLine();
		names[0] = input2;
		System.out.println("Do yo wish to continue? ");
		String input = sc.nextLine();
		if (input.equalsIgnoreCase("yes")) {
			//System.out.println("enter name: ");
			for (int i = 1; i < 5; i++) {
				System.out.println("enter name again: ");
				input2 = sc.nextLine();
				names[i] = input2;
			}
			for (String n : names) {
				System.out.println(n);
			}
			
		} else {
			for (String n : names) {
				System.out.println(n);
			}
		}
	}

}
