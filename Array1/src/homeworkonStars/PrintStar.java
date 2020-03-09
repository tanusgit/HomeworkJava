package homeworkonStars;

public class PrintStar {
/*input 6
*
**
***
****
*****
******
*****
****
***
**
*
 */
	public static void main(String[] args) {
		print(6);
	}

private static void print(int k) {
	for(int i =1; i <= k; i++) {
		for(int j = 0; j < i; j++ ) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	for(int i = k; i > 0; i--) {
		for(int j = 0; j < i; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
	
	
}
	
	
}
