package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistNum {
	public static void main(String[] args) {
		prefer2();

	}

	static ArrayList<Integer> nums = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	// prefer fulfills the required features for this assignment
	public static void prefer() {
		while (true) {
			System.out.println("enter num ");
			int input = sc.nextInt();
			nums.add(input);
			System.out.println("Do yo wish to continue type yes or no? ");
			String input2 = sc.next();
			if (input2.equalsIgnoreCase("yes")) {
				continue;
			} else {
				/*for (int n : nums) {
					System.out.println(n);
				}*/
				break;
			}
		}
		for (int n : nums) {
			System.out.println(n);
		}

	}
	
	
	//approach2
	public static void prefer2() {
		String input2 = "";
		do {
			System.out.println("enter num ");
			int input = sc.nextInt();
			nums.add(input);
			System.out.println("Do yo wish to continue type yes or no? ");
			input2 = sc.next();
		}while(input2.equalsIgnoreCase("yes"));
    
    
		for (int n : nums) {
			System.out.println(n);
		}

	}

}

