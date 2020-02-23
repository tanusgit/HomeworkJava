package manyCustomException;

import java.util.Scanner;

public class TestMultiexception {
public static void main(String[] args) {
	try {
		setData();
	} catch (AgeException e) {
		System.out.println(e);
		//e.printStackTrace();
	} catch (SalaryException e) {
		System.out.println(e);
		//e.printStackTrace();
	} catch (PhoneException e) {
		System.out.println(e);
		//e.printStackTrace();
	}
	
}

static Scanner s = new Scanner(System.in);
public static void setData() throws AgeException, SalaryException, PhoneException{
	System.out.println("enter age");
	int age = s.nextInt();
	if(age < 18) {
		AgeException a = new AgeException("error1", "wrong age");
		throw a;
	}
	System.out.println("enter phone");
	int phone = s.nextInt();
	if(phone < 18) {
		PhoneException b = new PhoneException("error2", "wrong phone");
		throw b;
	}
	System.out.println("enter salary");
	int salary = s.nextInt();
	if(salary < 18) {
		SalaryException c = new SalaryException("error3", "wrong salary");
		throw c;
	}
}
}
