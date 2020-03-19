package newhomeworkonCoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1.Write a Java program to reverse the elements in the list.
Input1 = [1,2,6,23,3,67,9,34,5]
Output: [5,34,9,67,3,23,6,2,1]
 */
public class ReverseList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 6, 23, 3, 67, 9, 34, 5);
		reverse(list);
	}

	private static void reverse(List<Integer> list) {
		List<Integer> array = new ArrayList<Integer>();
		for (int i = list.size()-1; i >= 0; i--) {
			array.add(list.get(i));
		}
		System.out.println(array);
		/*for(int i : array) {
			System.out.print(i + " ");
		}*/
	}

}
