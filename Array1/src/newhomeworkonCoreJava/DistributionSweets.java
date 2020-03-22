package newhomeworkonCoreJava;
/*
 * Input1: No of people
Input2: No of distribution
Input3 : position Number from which the distribution starts

Output:
The position number who receives the last chocolate
 */
public class DistributionSweets {
	public static void main(String[] args) {
		int people = 5;
		int sweets = 2;
		int position = 1;
		int pos = distribute(people, 2, 1);
		//System.out.println(pos);
	}

	private static int distribute(int people, int sweet, int position) {
		// TODO Auto-generated method stub
		int keptsweet = 1;
		int pos = 0;
		int[] array = new int[people];
		int a = array.length;
		//System.out.println(a);
		while (sweet > 0) {
			for (int i = position; i < array.length; i++) {
				array[i] = keptsweet++;
				pos = i;
				
			}
			sweet = sweet -1;;
		}
		
		for(int n : array) {
			System.out.println(n);
		}
		return pos;
	}
}
