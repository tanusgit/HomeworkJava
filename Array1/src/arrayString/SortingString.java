package arrayString;

public class SortingString {
//not working for string
	public static void main(String[] args) {
		String[] names = { "Biz", "Lila", "Mina", "Rina", "Hina" , "Aisa"};
		sort(names);
		for (String n : names) {
			System.out.println(n);
		}
		
		
		int[] nums = { 1, 6, 8, 4 };
		sort(nums);
		for (int n : nums) {
			System.out.println(n);
		}
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j])
					swap(array, i, j);
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	private static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void sort(String[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].compareTo(array[j]) == -1) {
					swap(array, i, j);
				} 
			}
		}
		// compareto() returns -1 if the first string comes before the second string

	}
}
