package homeworkonStars;

import java.util.ArrayList;

public class NumberOfText {
//Write a method that will return the number of words in a line of text.
	
	public static void main(String[] args) {
		String sentence = "I like tea and you";
		//System.out.println(sentence.length());
		int c = WordCount2(sentence);
		System.out.println(c);
		
	}

private static int WordCount(String sentence) {
	String[] n = sentence.split(" ");
	int res = n.length;
		return res;
}





private static int WordCount2(String sentence) {
	ArrayList<String> res = new ArrayList<>();
	String r  = "";
	int sp = ' ';
	for(int i = 0; i < sentence.length(); i ++) {
		r = r + sentence.charAt(i);
		if((int)sentence.charAt(i) == sp ) {
			res.add(r);
		}
		
	}
	res.add(r);
	/*for(String n: res) {
		System.out.println(n);
	}*/
	
	return res.size();

	
}


private static int  WordCount3(String sentence) {
	int l = sentence.length();
	int count = 1;
		for(char r : sentence.toCharArray()) {
			int res = r;
			int sp = ' ';
			if(res == sp) {
				count++;
			}
			
		}
		return count;
	
}


private static int  AlphabetCount(String sentence) {
	int l = sentence.length();
	int count = 0;
		for(char r : sentence.toCharArray()) {
			int res = r;
			int sp = ' ';
			if(res != sp) {
				count++;
			}
			
		}
		return count;
	
}
	
	
}
