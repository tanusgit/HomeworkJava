package homeworkonStars;

public class NumberOfText {
//Write a method that will return the number of words in a line of text.
	
	public static void main(String[] args) {
		String sentence = "I like to eat pizza a lot";
		int c = TextCount(sentence);
		System.out.println(c);
		
	}

private static int  TextCount(String sentence) {
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
