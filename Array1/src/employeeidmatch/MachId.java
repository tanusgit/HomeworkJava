package employeeidmatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MachId {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, 25, 5000, "Rahul");
		Employee e2 = new Employee(2, 27, 15000, "Ram");
		Employee e3 = new Employee(2, 28, 25000, "Rity");
		Employee e4 = new Employee(4, 29, 35000, "Rim");
		Employee e5 = new Employee(2, 25, 5000, "Ribi");
		Employee e6 = new Employee(6, 25, 5000, "Rinki");

		List<Employee> emplist = new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);

		// approach1
		List<Employee> em = findMatchSalary(emplist, 5000);
		for (Employee m : em) {
			System.out.println(m.name + " " + m.getId());
		}
		
		// approach2 using stream
			// coolectiong all the employees whose id is 2 using stream
			Set<String> emp = emplist.stream().filter(e -> e.getId() == 2 && e.getAge() == 50)
					.filter(e -> e.salary == 5000)
					.map(p -> p.name + " " + p.id)
					.collect(Collectors.toSet());
			System.out.println(emp);


	}
	
	
	private static List<Employee> findMatchSalary(List<Employee> emplist, int salary) {
		List<Employee> l = new ArrayList<Employee>();
		for (int i = 0; i < emplist.size(); i++) {
			if (emplist.get(i).getSalary() > salary) {
				l.add(emplist.get(i));
			}
		}
		return l;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	private static List<Employee> findMatch(List<Employee> emplist, int id) {
		List<Employee> l = new ArrayList<Employee>();
		for (int i = 0; i < emplist.size(); i++) {
			if (emplist.get(i).getId() == id) {
				l.add(emplist.get(i));
			}
		}
		return l;

	}

}
