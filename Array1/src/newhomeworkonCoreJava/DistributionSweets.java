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
		int people = 100;
		int sweets = 250;
		int position = 27;
		int pos = distribute(people, sweets, position);
		System.out.println(pos);
	}

	private static int distribute(int people, int sweet, int position) {
		// TODO Auto-generated method stub
		int res = ((position + sweet)-1)% people;
		return res;
		
	}
}
