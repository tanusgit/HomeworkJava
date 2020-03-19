package newhomeworkonCoreJava;

import java.util.ArrayList;
import java.util.List;

/*
Program to reverse words in a String
Input: Hi Kumar How are you
Output: you are How Kumar Hi
 */
public class ReverseWords {

	public static void main(String[] args) {
		String s = "Hi,Kumar How are you";
		reverseWords3(s);
		List<String> array = splitt(s);
		for (String m : array) {
			// System.out.println(m);
		}
	}

	private static void reverseWords3(String s) {

		List<String> array = splitt(s);
		String res = "";
		for (int i = array.size() - 1; i >= 0; i--) {
			res = res + " " + array.get(i);
		}
		System.out.println(res);

	}

	private static void reverseWords(String s) {
		String[] array = s.split(" ");
		// String[] array = splitt(s);
		String res = "";
		for (int i = array.length - 1; i >= 0; i--) {
			res = res + " " + array[i];
		}
		System.out.println(res);

	}

	private static List<String> splitt(String s) {
		List<String> list = new ArrayList<String>();
		int sp = ' ';
		String res = "";
		for (char c : s.toCharArray()) {
			if ((int) c == sp) {
				if(!res.isEmpty()) {
					list.add(res);
				}
				res = "";
			} else {
				res = res + c;
			}
		}
		list.add(res);
		return list;
	}

}
