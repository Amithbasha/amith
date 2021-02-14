import java.util.*;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<String> List = new ArrayList<String>();
		List.add("red");
		List.add("black");
		List.add(0,"blue");
		List.set(0,"green");
		ArrayList<String> ListDuplicate = (ArrayList<String>) List.clone();
		List.addAll(ListDuplicate);
		int ListSize = List.size(); /** For get the no.of items in the arrayList */
		int pos = List.indexOf("black"); /** for get the position of the element */
		
		System.out.println(List);
		/** for sorting in asending order */
		Collections.sort(List);
		System.out.println(List);
		/** for sorting in descending order */
		Collections.sort(List,Collections.reverseOrder());
		System.out.println(List);
		/** for get the element by its position */
		System.out.println(List.get(2));
		System.out.println(ListDuplicate);
		
	}
}
