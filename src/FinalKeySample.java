
public class FinalKeySample {
    //Can't create one method with same final method of the extended class.
	/*
	public void methodFinal() {

	}*/

    int a = 12; //can create a variable with same name.

    public static void main(String[] args) {
        TestFinal obj = new TestFinal();
        obj.methodFinal();
        //obj.a=12; cannot modify the value

    }

}

final class TestFinal {
    public final int a = 10;

    //Inside this class we can't create another instance/Static variable with same name but can be created local variables inside method.
    //Cannot modify the final variable value ex: a=12

    public final void methodFinal() {
        System.out.println("This is final method, It cant be overridden");
    }

}
