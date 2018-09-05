public class Employee {
	private String EmpName;
	private int EmpID;
	private int age;
	
	public Employee(String name,int id, int age) {
		this.EmpName = name;
		this.EmpID = id;
		this.age = age;
	}
	
	public String getName() {
		return EmpName;
	}
	public int getId() {
		return EmpID;
	}
	public int getAge() {
		return age;
	}
	
}

