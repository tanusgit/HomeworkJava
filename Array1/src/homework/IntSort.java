package homework;

import java.util.Arrays;
import java.util.Scanner;

public class IntSort {
	/*
	 * take the size for the input take the numbers 
	 * after taking input print it sort
	 * it in order
	 */
	public static void main(String[] args) {
		sort();

	}

	static Scanner sc = new Scanner(System.in);

	public static void sort() {
		System.out.println("enter size");
		int num = sc.nextInt();
		int[] nums = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("enter num");
			int n = sc.nextInt();
			nums[i] = n;
		}
		Arrays.sort(nums);
		
		for (int p : nums) {
			System.out.println(p);
		}
	}
	
	
	public static void sortHelper(int[] a) {
		int l = a.length;
		int max = a[0];
		int swap = 0;
		for(int i = 0; i < l; i++) {
			int temp = a[i+1];
			if(max < temp) {
				
			}
		}
	}

	
	
	
}
