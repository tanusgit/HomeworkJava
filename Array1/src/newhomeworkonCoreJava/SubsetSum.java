package newhomeworkonCoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//working properly
/*
 * 13. Find the subset of two numbers from the list that has maximum sum:
Input: 10, 7,6,15,9, 13
Output:  [15, 13]
 */
public class SubsetSum {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 10, 7, 6, 15, 9, 13);
		subsetSum(list);
	}

	private static void subsetSum(List<Integer> list) {
		int sum = 0;
		int max = 0;
		List<Integer> array = new ArrayList<>();
		List<keepint> resarray = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				sum = list.get(i) + list.get(j);
				array.add(sum);
				keepint k = new keepint(sum, list.get(i), list.get(j));
				resarray.add(k);
			}
		}
		//System.out.println("array with sum of num \n" + array);
		//System.out.println("array with sum of num and nums \n" + resarray);
		
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i) > max) {
				max = array.get(i);
			}
		}
		//System.out.println("max sum is " + max);
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < resarray.size(); i++) {
			if(resarray.get(i).getA() == max) {
				int num1 = resarray.get(i).getB();
				int num2 = resarray.get(i).getC();	
				result.add(num1);
				result.add(num2);
			}
		}
		System.out.println(result);
	

	}
}


class keepint{
	int a;
	int b;
	int c;
	public keepint(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public String toString() {
		return "[a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
}
