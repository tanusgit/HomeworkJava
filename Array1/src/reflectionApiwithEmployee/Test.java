package reflectionApiwithEmployee;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
	//set the data for employee object using reflection api
	
	Class  Obj = Class.forName("reflectionApiwithEmployee.Employee");
	System.out.println(Obj);
	
	System.out.println(Obj.getDeclaredField("id"));
	
}
}
