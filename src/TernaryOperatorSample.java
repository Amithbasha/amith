import java.util.Scanner;

public class TernaryOperatorSample {
	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		TernaryOperatorSample obj = new TernaryOperatorSample();
		int value1 = obj.getInput(sc);
		System.out.println();
		int value2 = obj.getInput(sc);
		String res = (value1==value2) ? "Values are Equal":"Values Not Equal";
		System.out.println(res);
	}

	private  int getInput(Scanner sc) {
		System.out.print("Enter the Value :");
		return sc.nextInt();
	}

}
