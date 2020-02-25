package homework;

public class DeleteInBetween {

	/*
	 * delete from any position of an array
	 */
//not working perfectly includes a 0 in the resulting array
	public static void main(String[] args) {

		int[] a = { 1, 2, 3};
		int[] array3 = DeleteAt(1, a);
		for (int n : array3) {
			System.out.println(n);
		}
	}

	public static int[] DeleteAt(int index, int[] array) {
		int[] array2 = null;
		int [] array3 = null;
		try {
			int l = array.length;
			int newl = l - 1;
			int preValue;
			array2 = new int[l];
			//we have to run the loop till l time as we are copying from the 
			//bigger array so we must reach the end of the bigger array
			for (int i = 0; i < l; i++) {
				if (!(i == index)) {
					array2[i] = array[i];
				}
				
				//array2[newl-1] = array[i+1];
				
			}
			 
			
			// return array2;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("something went wrong");
		}
		catch (NullPointerException e) {
			System.out.println("something went null");
		}
		return array2;
	}
}
