package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonArraylist {
	/*
	 * ask for id name age
then if you wish to continue? If yes then 
ask for id name age
if no print all the data
add person objects in arraylist, size as an input, do you wish to add person
	 */
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	int age;
	int id;
	
	
	Scanner sc = new Scanner(System.in);
	ArrayList<PersonArraylist> names = new ArrayList<>();
	public void prefer() {
		while(true) {
		System.out.println("enter name ");
		String input = sc.nextLine();
		System.out.println("enter age ");
		int age = sc.nextInt();
		System.out.println("enter id");
		int id  = sc.nextInt();
		PersonArraylist p = new PersonArraylist(input, age, id);
		names.add(p);
		System.out.println("Do yo wish to continue type yes or no? ");
		 String input2 = sc.nextLine();
		if (input2.equalsIgnoreCase("yes")) {
			continue;
			}
		else {
			for (PersonArraylist n : names) {
				System.out.println(n.getName() + " "+ n.getId() + " " + n.getAge());
			}
			break;
		}
		}
		
		
	}
	public PersonArraylist(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public static void main(String[] args) {
		
	}

}
