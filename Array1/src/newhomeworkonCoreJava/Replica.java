package newhomeworkonCoreJava;
/*
 * 5.Find if the second string is a rotation of first string
Input1 : KUMAR
Input2 : UMARK
 */
public class Replica {
public static void main(String[] args) {
	String k = "KUMAR";
	String A = "UMARK";
	rotation(k, A);
}

private static void rotation(String k, String A) {
	String res = "";
	boolean found = false;
	for(int i =0; i < k.length(); i++) {
		for(int j =0; j < A.length(); j++) {
			if((int)k.charAt(i) == (int)A.charAt(j)) {
				res = "yes";
				found = true;
			}
			else {
				res = "no";
				found = false;
			}
		}
	}
	if(found) {
		System.out.println("yes");
	}
	if(!found) {
		System.out.println("no");
	}
	System.out.println(res);
}
}
