package newhomeworkonCoreJava;
/*Input1 : kumar
Input2:  2
Output:
Ku Km Ka kr um ua ur ma mr ar
Kum kua kur uma umr mar
*/
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
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				char c = s.charAt(i);
				char d = s.charAt(j);
					res = c + " " + d + "  ";
					if (!array.contains(res)) {
						array.add(res);
					}
			}
		}
		System.out.println(array);
	}
	
	
	private static void permuteString3(String s, int p) {
		String res = "";
		
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				for (int k = j+1; k < s.length(); k++) {
				char c = s.charAt(i);
				char d = s.charAt(j);
				char e = s.charAt(k);
					res = c + " " +d + " " + e + "  ";
					if (!array.contains(res)) {
						array.add(res);
					}
				
				}
			}
		}
		System.out.println(array);
	}
	

	private static void permute(int n, int r) {
		int res = factorial(n) / (factorial(n - r)*factorial(r)) ;
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
