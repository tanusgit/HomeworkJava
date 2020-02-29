package homework;

import java.util.Scanner;

public class ValidateStateNameAge {
	public static void main(String[] args) {
		show(2);
	}

	public static void show(int num) {
		Scanner m = new Scanner(System.in);
		for (int i = 0; i < num; i++) {
			System.out.println("print age....");
			String input = m.nextLine();
			System.out.println("print name....");
			String input1 = m.nextLine();
			System.out.println("print state....");
			String input2 = m.nextLine();
		}

	}
}