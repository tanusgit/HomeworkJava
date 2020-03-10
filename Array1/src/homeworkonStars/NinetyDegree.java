package homeworkonStars;

import java.util.Scanner;

public class NinetyDegree {
	public static void main(String[] args) {
		// printMatrix(5);
		takeMatrix();
	}

	static Scanner sc = new Scanner(System.in);

	private static void printMatrix(int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println(" ");

		}

	}

	private static void takeMatrix() {
		int input = 0;
		System.out.println("enter width");
		int w = sc.nextInt();
		System.out.println("enter height");
		int h = sc.nextInt();
		int[][] array = new int[h][w];
		for (int i = 0; i < h; i++) {
			System.out.println("enter num");
			for (int j = 0; j < w; j++) {
				input = sc.nextInt();
				array[i][j] = input;

			}
			System.out.println(" ");
		}
		for (int[] n : array) {
			for (int k : n) {
				System.out.print(k + " ");
			}
			System.out.println(" ");

		}

	}
	
	public static void shiftNinetydegree(int[][] matrix) {
		
	}

}
