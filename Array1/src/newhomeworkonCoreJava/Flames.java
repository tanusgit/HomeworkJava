package newhomeworkonCoreJava;

import java.util.Scanner;

/*2.FLAMES program using java
F - Friendship
L - Love
A - Affection
M - Marriage
E - Enemy
S - Sister (Sibling)
Ex:
Enter First name: Krishna
Enter Second name: Radha
Output: Affection
Kisn d
apply 5 to FLAMES
FLAMES
1. E is deleted FLAMS
2. M is deleted FLAS
3. S is deleted FLA
4. L is deleted FA
5. F is deleted A
 * 
 */
public class Flames {
	public static void main(String[] args) {
		flames();
		char p = 'p';

	}

	String F = "Friendship";
	String L = "Love";
	String A = "Affection";
	String M = "Marriage";
	String E = "Enemy";
	String S = "Sibling";
	static Scanner sc = new Scanner(System.in);

	private static void flames() {
		// TODO Auto-generated method stub
		System.out.println("enter first name");
		String input = sc.next();
		System.out.println("enter second name");
		String input2 = sc.next();
		int l = input.length();
		int l2 = input2.length();
		int totalLength = l + l2;
		String res = "";
		String res2 = "";
		String res3 = "";
		
		for (char c : input.toCharArray()) {
			Character cl = Character.toUpperCase(c);
			res = res +" " + cl;
		}
		for (char c : input2.toCharArray()) {
			Character cl = Character.toUpperCase(c);
			 res2 = res2 + " " +cl;
		}
		String[] resarray = res.split(" ");
		String[] res2array = res2.split(" ");               
		//making a new array with all the elements from the above 2 arrays
		String[] res3array = new String[resarray.length+res2array.length]; 
		//copying every element from resarray to res3array
		for(int i = 0; i < resarray.length; i++) {
			res3array[i] = resarray[i];
		}
		int count =0;
		for(int i =  resarray.length; i < res3array.length; i++) {
			//res2array has only 4 elements so cant copy from 4th element
			res3array[i] = res2array[count++];
		}
		
		System.out.println("printing res3array:   " );
		for(String s: res3array) {
			System.out.print(s);
		}
		
		System.out.println("*********************************");
		//remove duplicates from new string array
		int count2 =0;
		String[] res4 = new String[res3array.length];
		for(int i =0; i < res3array.length; i++) {
			for(int j =1; j < res3array.length; j++) {
				if(!(res3array[i].contains( res3array[j]))) {
					res4[i] = res3array[i];
				}
			}
		}
		System.out.println("*************************");
		for(String s: res4) {
			System.out.print(s + " ");
		}
		
		
		
	}

}
