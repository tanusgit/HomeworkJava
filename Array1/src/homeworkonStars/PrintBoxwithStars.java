package homeworkonStars;

import java.util.Scanner;

/*
*******
*     *
*     *
*     *
*     *
*******
 */
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
			for (int j = 0; j < w; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i == h - 1) {
					System.out.print("*");
				} else if (j == 0) {
					System.out.print("*");
				} else if (j == w - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
