package manyCustomException;

public class manyCatchblock {
	public static void main(String[] args) {
		validate();
	}

	
	public static void validate() {
		try {
		int num1 = 8;
		int num2 = 2;
		int res = num1/num2;
		int array[] = new int[5];
		//System.out.println(res);
		String name = "";
		int l = Integer.parseInt(name);
		System.out.println(l);
		//System.out.println(name);
		}catch(ArithmeticException e) {
			System.out.println("num2 is 0");
		}
		catch(NumberFormatException n) {
			System.out.println("cannot parse an empty string");
		}
		finally {
			System.out.println("program ends");
		}
	}
}
