package homeworkException;

import java.util.Scanner;

public class Test  {
	public static void main(String[] args) {
		try {
			data();
		} catch (WrongData e) {
			System.out.println(e);
			//e.printStackTrace();
			
		}
		
	}
	static Scanner m = new Scanner(System.in);
	
	public static void data() throws WrongData {
		System.out.println("enter name");
		String name = m.nextLine();
		if(name.length() < 5) {
			WrongData w = new WrongData("error1", "wrong name");
			throw w;
		}
		System.out.println("enter id");
		int id = m.nextInt();
		if(id < 5) {
			WrongData w = new WrongData("error2", "wrong id");
			throw w;
		}
		System.out.println("enter age");
		int age = m.nextInt();
		if(age < 5) {
			WrongData w = new WrongData("error3", "wrong age");
			throw w;
		}
	}

}
