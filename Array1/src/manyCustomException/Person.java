package manyCustomException;

public class Person {
	int age;
	int phoneNum;
	int salary;
	public Person(int age, int phoneNum, int salary) {
		super();
		this.age = age;
		this.phoneNum = phoneNum;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MultiCatch [age=" + age + ", phoneNum=" + phoneNum + ", salary=" + salary + "]";
	}
	

}
