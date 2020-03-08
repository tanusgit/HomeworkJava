package homeworkonStars;

import java.util.Scanner;

public class PrintBoxwithStars {
	public static void main(String[] args) {
		printBox();
	}

	static Scanner sc = new Scanner(System.in);

	private static void printBox() {
		System.out.println("enter the height");
		int h = sc.nextInt();
		System.out.println("enter the width");
		int w = sc.nextInt();
		for (int i = 0; i < h; i++) {
			//System.out.println("*");
			for (int j = 0; j < w ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
}
