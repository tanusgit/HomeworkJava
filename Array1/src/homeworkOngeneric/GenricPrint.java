package homeworkOngeneric;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class GenricPrint {
//print arraylist, linkedlist, vectors using generics

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		a.add("Rose");
		a.add("Sky");
		a.add("Lily");
		a.add("tulip");
		System.out.println("printing arraylist...........................");
		print(a);

		LinkedList<String> b = new LinkedList<>();
		b.add("Rosy");
		b.add("Sikim");
		b.add("Liberty");
		b.add("titan");
		System.out.println("printing Linkedlist...........................");
		print(b);

		Vector<Integer> c = new Vector<>();
		c.add(4);
		c.add(5);
		c.add(6);
		c.add(7);
		System.out.println("printing vector...........................");
		print(c);

	}

//<T> represents generic List<?> represents anytype of list
//T[] represents any type of array
//if we write ? we dont have to <T>
	private static  void print(List<?> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}
	//another approach
	private static <T> void print2(List<T> list) {
		for (Object element : list) {
			System.out.println(element);
		}
	}

}
