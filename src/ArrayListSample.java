import java.util.*;
public class ArrayListSample {
	public static void main(String args[]){
		ArrayList<Employee> arraylist = new ArrayList<Employee>();
		arraylist.add(new Employee("Chaitanya",22, 26));
		arraylist.add(new Employee("Rahul", 24,12));
		arraylist.add(new Employee("Ajeet", 32,121));
	    //Collections.sort(arraylist);
	    
	    for(Employee str: arraylist){
			System.out.println(str);
	    }
    }
}
