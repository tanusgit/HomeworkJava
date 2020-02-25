package homework;

public class InsertinBetween {
	/*
	 * insert element in between of an array and delete from the middle position of
	 * array
	 */

	public static void main(String[] args) {

		int[] a = { 1, 4, 5, 7 };
		int[] array3 = insertAt(1, a, 51);
		for (int n : array3) {
			System.out.println(n);
		}
	}

	// method takes an array, an index position in the array and a value
	// then it puts the value in the array of that index position
	public static int[] insertAt(int index, int[] array, int value) {
		int [] array2 = null;
		try {
			int l = array.length;
			int newl = l * 2;
			int preValue;
			array2 = new int[newl];
			for (int i = 0; i < l; i++) {
				// copying the array in the new array2
				array2[i] = array[i];
			}
			for (int j = 0; j < newl; j++) {
				if (j == index) {
					preValue = array2[j];
					array2[newl - 1] = preValue;
					array2[j] = value;
				}
			}
			//return array2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("something went wrong");
		}
		return array2;
	}
}
