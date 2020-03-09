package homeworkonStars;

import java.util.ArrayList;

public class NumberOfText {
//Write a method that will return the number of words in a line of text.

	public static void main(String[] args) {
		 String sentence = "  i   love   tea   ";
		// System.out.println(sentence.length());
		int c = WordCount4(sentence);
		System.out.println(c);

	}

	private static int WordCount(String sentence) {
		String[] n = sentence.split(" ");
		int res = n.length;
		return res;
	}

	private static int WordCount2(String sentence) {
		ArrayList<String> res = new ArrayList<>();
		String r = "";
		int sp = ' ';

		for (int i = 0; i < sentence.length(); i++) {
			r = r + sentence.charAt(i);
			if ((int) sentence.charAt(i) == sp) {
				res.add(r);

			}

		}
		res.add(r);

		/*
		 * for(String n: res) { System.out.println(n); }
		 */

		return res.size();

	}

	private static int WordCount3(String sentence) {
		int count = 0;
		for (char r : sentence.toCharArray()) {

			if (r == ' ') {
				count++;
			}
		}
		return ++count;
	}

	private static int AlphabetCount(String sentence) {
		int l = sentence.length();
		int count = 0;
		for (char r : sentence.toCharArray()) {
			int res = r;
			int sp = ' ';
			if (res != sp) {
				count++;
			}

		}
		return count;

	}
	
	//working perfectly
	 private static int WordCount4(String sentence) {
			int count = 0;
			boolean isCharFirstEncounter=false;
			for (char r : sentence.toCharArray()) {
				if(r == ' '){
					isCharFirstEncounter = false;
				}
				else if (!isCharFirstEncounter ) {
					isCharFirstEncounter= true;
					count++;
				}  
			}
			System.out.println("word");
			return count;
		}


	  

}
