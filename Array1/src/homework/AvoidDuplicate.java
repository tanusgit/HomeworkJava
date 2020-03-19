package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * taking the names and avoid the duplicates in arraylist
 */
public class AvoidDuplicate {
	public static void main(String[] args) {
		duplicate();

	}
//program is not working successfully
	static List<String> names = new ArrayList<>();

	public static void duplicate() {
		Scanner m = new Scanner(System.in);
		while (true) {
			System.out.println("enter names");
			String name = m.nextLine();
			String res = name;
			if (name.equalsIgnoreCase("end")) {
				break;
			}
			names.add(name);
		}
		System.out.println(names);
		int size = names.size();
		System.out.println(size + " is the size of the arraylist");
		int count = 0;
		String first = names.get(count);
		
		System.out.println(first + " is the 1st element of the arraylist");
		 List<String> newName = new ArrayList<>();
	
		for(int i = 1; i < size; i++) {
			if(!names.get(count).equals(names.get(i))){
				newName.add(names.get(i));
				
			}
			count++;
			
		}
	 
		newName.add(first);
		System.out.println("after sorting .........");
		System.out.println(newName);
	}
}
