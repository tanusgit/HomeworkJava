package homework;

import java.util.Scanner;

public class ValidateNameAgeId {
	public static void main(String[] args) {
		ValidateNameAgeId v = new ValidateNameAgeId();
		v.validate();

	}
	String name = "";
	int id = 0;
	int age = 0;
	static Scanner m = new Scanner(System.in);

	public void validate() {
		takeInput();
		if (name.length() < 5) {
			System.out.println("invalid name");
		} else if (id < 0) {
			System.out.println("invalid id");
		} else if (age < 18) {
			System.out.println("invalid age");
		}

	}

	public void takeInput() {
		System.out.println("please enter name");
		name = m.next();
		System.out.println("please enter age");
		age = m.nextInt();
		System.out.println("please enter id");
		id = m.nextInt();
		

	}

}
