
public class SuperKeySample extends SubClass1{
	public String str = "last SubClass";
	SuperKeySample(){
		System.out.println(super.str);
	}
	public static void main(String[] args) {
		SuperKeySample obj = new SuperKeySample();
	}

}
class SubClass1 extends ParentClass{
	public String str = "SubClass1";
	SubClass1(){
		System.out.println("This :"+str);
		//System.out.println("super :"+super.str);
	}
}

class ParentClass{
	public String str = "Parent Class";
	ParentClass(){
		System.out.println(str);
	}
	
}