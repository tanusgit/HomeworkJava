package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	/*
	 * ask for id name age
then if you wish to continue? If yes then 
ask for id name age
if no print all the data
add person objects in arraylist, size as an input, do you wish to add person
	 */
	
	String name;
	int age;
	int id;
	
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

	
	
	public Person(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	

}
