package homework;

import java.util.ArrayList;
import java.util.List;

public class MergeArray {
	/*
	 * Strings 2 arraylists create
	 *  a third arraylist with first 2 arraylist while merging avoid duplicates
	 */
	
	public static void main(String[] args) {
		String[] names = {"Rahul", "Mina", "Rahul", "Mina","Hina", "Rina", "Rina"};
		String[] names2 = {"Rahul", "Rina"};
		
		MergeArray m = new MergeArray();
		m.merge(names, names2);
	}

	String array [];
	public void merge(String[] n, String[] m) {
		try {
		 int l = n.length;
		 int l2 = m.length;
		 int l3 = l + l2;
		ArrayList<String> array = new ArrayList<>();
		 for(int i = 0; i < l; i ++) {
			 array.add(n[i]);
		 }
		 //getting exception because i have tried to access 
		 //string array from the 4th element which is the last element
		 //of string array m. 
		 //in arraylist we always add element at the end
		 //so we dont need to specify any special index for the arraylist
		 //but we do need to specify that we are accessing the m array from
		 //it 0 index to the last index, in this case l2 is the length of the array
		 //so loop will run until l2 and it will start from 0 as in any array
		 //elements stays from 0 index
		 for(int j = 0; j < l2; j ++) {
			 array.add(m[j]);
		 }
		 for(String n2: array) {
			 System.out.println(n2);
		 }
		 
		 System.out.println("after removing duplicates .............");
		 int count = 0;
		 String first = array.get(0);
		 ArrayList<String> array1 = new ArrayList<>();
		 for(int i = 1; i < array.size(); i++) {
			 if(!(array.get(count).equals(array.get(i)))) {
				 array1.add(array.get(i));
			 }
			 count++;
		 }
		 array1.add(first);
		 for(String n3: array1) {
			 System.out.println(n3);
		 }
		 
		}catch(Exception e) {
			System.out.println("invalid");
		}
		
	}
	
	
	public String toString() {
		String res = "";
		for(int i = 0; i < array.length; i ++) {
			res = array[i] + " ";
		}
		
		return res;
	}
	
	
	
	
}
