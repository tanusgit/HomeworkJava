package varArgFunctions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
//var arg functions:
//merge of some arraylist
//mergre() should return the mergedlist


public class MergeArraylist {
public static void main(String[] args) {

	ArrayList<String> a = new ArrayList<>();
	a.add("Rose");
	a.add("Sky");
	a.add("Lily");
	a.add("tulip");
	
	ArrayList<String> b = new ArrayList<>();
	b.add("Rosy");
	b.add("Sikim");
	b.add("Liberty");
	b.add("titan");
	
	
	
	//ArrayList c = merge(a, b);
	  ArrayList<String> c = merge(a, b);
		for(String element: c) {
			System.out.println(element);
		}
	
	
	ArrayList<Integer> d = new ArrayList<>();
	d.add(4);
	d.add(5);
	d.add(6);
	d.add(7);
	
	ArrayList<Integer> e = new ArrayList<>();
	e.add(41);
	e.add(52);
	e.add(66);
	e.add(78);
	
	ArrayList<Integer> f = merge2(d, e);
	for(Integer element: f) {
		System.out.println(element);
	}
	
}

public static ArrayList<String> merge(ArrayList<String>... n) {
	ArrayList<String> newlist = new ArrayList<String>();
	for(ArrayList<String> element : n) {
		for(String elmnt : element) {
			newlist.add(elmnt);
		}
	}
	return newlist;
	
}

public static<T> ArrayList<T> merge2(ArrayList<T>... n) {
	ArrayList<T> newlist = new ArrayList<>();
	for(ArrayList<T> element : n) {
		for(T elmnt : element) {
			newlist.add( elmnt);
		}
	}
	return newlist;
}
}
