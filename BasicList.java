
import java.util.ArrayList;
public class BasicList {
	public static void main(String[] args) {
	ArrayList<Integer> myList = new ArrayList<Integer>();
	for(int i = 10;i<101;i+=10) {
	myList.add(i);
	}
	System.out.println(myList);
	System.out.println("Size of the list is "+myList.size());
	myList.add(5,200);
	System.out.println(myList);
	System.out.println("The size of the list is "+myList.size());
	System.out.println("The value 200 is located at index "+myList.indexOf(200));
}
}
