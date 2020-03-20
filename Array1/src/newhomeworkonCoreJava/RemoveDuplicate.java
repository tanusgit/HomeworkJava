package newhomeworkonCoreJava;

import java.util.ArrayList;

/*
 *  11.Remove the duplicate words in a sentence
Input: 
Hello Tanu Anil Kumar shyam Krishna ram shyam raju Tanu 
Output:
Hello Tanu Anil Kumar shyam Krishna ram raju
 */
public class RemoveDuplicate {
	public static void main(String[] args) {
		String s = "Hello Tanu Anil Kumar shyam Krishna ram shyam raju Tanu";
		ArrayList<String> list = removeDuplicate(s);
		for (String n : list) {
			System.out.print(n + " ");
		}
	}

	private static ArrayList<String> removeDuplicate(String s) {
		ArrayList<String> array = new ArrayList<>();
		String[] res = s.split(" ");
		for (int i = 0; i < res.length; i++) {
			if (!array.contains(res[i])) {
				array.add(res[i]);
			}
		}
		return array;
	}
}
