package newhomeworkonCoreJava;
/*
 * 5.Find if the second string is a rotation of first string
Input1 : KUMAR
Input2 : UMARK
 */
public class Replica {
public static void main(String[] args) {
	String k = "KUMAR";
	String A = "ANIL";
	rotation(k, A);
}

private static void rotation(String k, String A) {
	for(int i =0; i < k.length(); i++) {
		for(int j =0; j < A.length(); j++) {
			if(k.charAt(i) == A.charAt(j)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
	
}
}
