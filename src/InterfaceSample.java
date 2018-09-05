interface Bike
{  
	String var = "Final String";
	abstract void run();     
	/**
	 * since java8 interface supports default and static methods
	 * both default and static methods allows to implement statements inside functions
	 * static methods cannot be overridden 
	 * default methods can be override.
	 */
	public default void defaultMethod() {
		System.out.println("Default method - interface");
	}
	public static void staticMethod() {
		System.out.println("static method");
	}
} 

//Creating a Child class which implements interface
class Honda implements Bike 
{
	Honda(){
		 System.out.println("Inside Honda");
	}
	public void defaultMethod() {
		System.out.println("default Method");
	}
	
	 public void run()
	 {
		 System.out.println("running safely..");	 
	 }  
}  

//Creating a Test class which calls abstract and non-abstract methods  
public class InterfaceSample extends Honda 
{
	public static void main(String args[]){  
		Bike obj = new Honda();
		Honda obj2 = new Honda();
		obj.run();  
		obj2.run();
		System.out.println(var); // we can use directly variable declared in interface
		
		/**
		 * var = "trying to change";
		 * compile time error cannot change all variabes in interface are final
		 */
		
		
		
    }  
}  

