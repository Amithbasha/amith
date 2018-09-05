public class StaticKeySample extends StaticVartest {
	public static String myClassVar="static variable";
	public String localVar = "Local Variable";
	   public static void main(String args[]){
	      StaticKeySample obj = new StaticKeySample();
	      StaticKeySample obj2 = new StaticKeySample();
	      StaticKeySample obj3 = new StaticKeySample();
	      
	      //All three will display "class or static variable"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);
	      
	      //All three will display "Local Variable"
	      System.out.println(obj.localVar);
	      System.out.println(obj2.localVar);
	      System.out.println(obj3.localVar);

	      //changing the value of static variable and local variable using obj2
	      obj2.myClassVar = "static variable changed";
	      obj2.localVar = "local variable changed";

	      //All three will display "Changed Text"
	      System.out.println(obj.myClassVar);
	      System.out.println(obj2.myClassVar);
	      System.out.println(obj3.myClassVar);
	      
	      //only obj2 variable will display "Changed local text"
	      System.out.println(obj.localVar);
	      System.out.println(obj2.localVar);
	      System.out.println(obj3.localVar);
	     
	      //only static variable can accessible when importing or extends other class 
		  System.out.println("Accessed without use of object :"+sVar);
		  
		  //local variable can only access by using of object
		  StaticVartest obj1 = new StaticVartest();
		  System.out.println("accessed use of object :"+obj1.lVar);
	   }
	   
}

class TestClass extends StaticVartest{
	public static void main(String args[]){
		//StaticVartest obj = new StaticVartest();
		//StaticVartest obj2 = new StaticVartest();
		//StaticVartest obj3 = new StaticVartest();
		
		System.out.println(sVar);
	}
}

class StaticVartest{
	public static String sVar= "Static Var";
	public String lVar = "Local Var";
	
}
