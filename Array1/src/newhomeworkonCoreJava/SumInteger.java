package newhomeworkonCoreJava;

/*
 * 8.program that accepts an integer (n) and computes the value of n+nn+nnn.
Input1: 3
Output : 369 [3+33+333]
 */
public class SumInteger {
	public static void main(String[] args) {
		sum(3);

	}

	private static void sum(int i) {
		String res = "";
		int sum = 0;
		// TODO Auto-generated method stub
		for(int j =0; j < i; j++) {
			sum = sum + i;
			res = res + sum + "";
			System.out.print(sum);
		}
		

	}
	
	private static int sumhelp(int n) {
		return n +n;
	}
}
