package newhomeworkonCoreJava;

/*
 * 6.Patterns:
Input : 5
a)
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

b)
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 

c)
Input 3
o/p:
1 2 3
4 5 6
7 8 9
e)
Input :4
Output:
1
2 3
4 5 6
7 8 9 10



 */
public class PatternPrint {
	public static void main(String[] args) {
		print1(5);
		System.out.println("************************");
		print2(5);
		System.out.println("************************");
		print3(3);
		System.out.println("************************");
		print4(4);
	}

	private static void print1(int n) {
		// TODO Auto-generated method stub
		for (int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

	private static void print2(int n) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

	}

	private static void print3(int n) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println(" ");
		}

	}

	private static void print4(int n) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println(" ");
		}

	}
}
