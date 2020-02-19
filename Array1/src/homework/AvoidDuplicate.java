package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * taking the names and avoid the duplicates in arraylist
 */
public class AvoidDuplicate {
	public static void main(String[] args) {
		
	}

	static List<String> names = new ArrayList<>();
	public static void duplicate() {
		Scanner m = new Scanner(System.in);
		while(true) {
		System.out.println("enter names");
		String name = m.nextLine();
		names.add(name);
		
		}
		
	}
}
