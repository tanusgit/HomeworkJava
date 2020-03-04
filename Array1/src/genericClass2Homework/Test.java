package genericClass2Homework;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		//assignments: calling this methods
		
		User u = new User(23);
		User u1 = new User(24);
		User u2 = new User(26);
		User u3 = new User(27);
		List<User> userList = new ArrayList<>();
		userList.add(u);
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		System.out.println("show4 for userlist.................................");
		show4(userList);
		
		
		
		
		
		Person p = new Person();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p.setId(1);
		p1.setId(2);
		p2.setId(3);
		p3.setId(4);
		
		List<Person> personList = new ArrayList<>();
		personList.add(p);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		System.out.println("******************* show4 person");
		//calling show4 
		show4(personList);
		System.out.println("******************* show2 person");
		//calling show2
		show2(personList);
		
		
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		e.setPan("aa");
		e1.setPan("bb");
		e2.setPan("cc");
		e3.setPan("dd");
		
		e.setId(5);
		e1.setId(6);
		e2.setId(7);
		e3.setId(8);
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(e);
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		System.out.println("******************* show4 employee");
		//calling show4 
		show4(employeeList);
		System.out.println("******************* show3 employee");
		//calling show3 
		show3(employeeList);

		
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s.setSem("winter");
		s2.setSem("summer");
		s3.setSem("Spring");
		s1.setSem("Fall");
		
		s.setId(51);
		s1.setId(61);
		s2.setId(17);
		s3.setId(18);
		
		List<Student> StudentLists = new ArrayList<>();
		StudentLists.add(s);
		StudentLists.add(s1);
		StudentLists.add(s2);
		StudentLists.add(s3);
		System.out.println("******************* show4 student");
		//calling show4 
		show4(StudentLists);
		System.out.println("******************* show3 student");
		//calling show3 
		show3(StudentLists);
		System.out.println("******************* show2 student");
		//calling show2 
		show2(StudentLists);
		

	}
	//we can pass any arraylist of any data type
	static void show4(List<?> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	//we can pass  arraylist of person object or 
	//arraylist of student and employee objects
	//? means any class which is child of person class
	static void show3(List<? extends Person> list) {
		for(Object o: list) {
			System.out.println(o);
		}

	}
	//we can pass  arraylist of student object or 
	//arraylist of person object
	//? super means student and its parent class 
	static void show2(List<? super Student> list) {
		for(Object o: list) {
			System.out.println(o);
		}
	}
}
