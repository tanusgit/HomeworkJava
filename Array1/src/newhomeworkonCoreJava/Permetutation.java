package newhomeworkonCoreJava;
/*Input1 : kumar
Input2:  2
Output:
Ku Km Ka kr um ua ur ma mr ar*/
import java.util.ArrayList;

public class Permetutation {
	public static void main(String[] args) {
		int n = 5;
		int p = 2;
		permute(n, p);
		String k = "Kumar";
		permuteString(k, p);

	}

	private static void permuteString(String s, int p) {
		String res = "";
		String res2 = "";
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 1; j < s.length(); j++) {
				char c = s.charAt(i);
				char d = s.charAt(j);
				if (c != d) {
					res = c + " " + d + "  ";
					res2 = d + " " + c + "  ";
					if (!array.contains(res2)) {
						array.add(res);
					}
					// res = "";
				}

			}
		}
		System.out.println(array);
	}

	private static void permute(int n, int p) {
		int res = (factorial(n)) / (factorial(n - p));
		System.out.println(res);

	}

	private static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 1;
		} else if (n > 1) {
			return n * factorial(n - 1);
		} else
			return -1;
	}
}
