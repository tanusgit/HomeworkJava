package homework;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {
	/*
	 * Strings 2 arraylists create
	 *  a third arraylist with first 2 arraylist while merging avoid duplicates
	 */
	
	public static void main(String[] args) {
		String[] names = {"Rahul", "Mina", "Hina", "Rina"};
		String[] names2 = {"Rahuli", "Minu", "Hinu", "Rina"};
		
		MergeArray m = new MergeArray();
		m.merge(names, names2);
	}

	
	public void merge(String[] n, String[] m) {
		 List<String> names = new ArrayList<>();
		 int count = 0;
		 while(true) {
			 if(!(n[count++].equals(m[count++]))){
				 names.add(n[count++]);
				// names.add(m[count++]);
			 }
			 else {
				 break;
			 }
		 }
		 System.out.println(names);
		
		
	}
}
