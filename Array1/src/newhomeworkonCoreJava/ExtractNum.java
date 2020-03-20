package newhomeworkonCoreJava;

/*
 * 7.Extract only numbers for a given String
Input1:ku32m67k3sf689ada43@sf
Output: 32 67 3  689 43
 */
public class ExtractNum {
	public static void main(String[] args) {
		String s = "ku32m67k3sf689ada43@sf";
		extractNum(s);
		
	}

	private static void extractNum(String s) {
		String res = "";
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i);
			 if(Character. isDigit(c) == true) {
				 res = res + " "+ c;
			 }	
		}
		System.out.println(res);

	}

}
