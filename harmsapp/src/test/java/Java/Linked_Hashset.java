package Java;
import java.util.LinkedHashSet;
public class Linked_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new  LinkedHashSet() ; // accepts both homogeneous and heteriogeneous
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(400);
		lhs.add(null);
		lhs.add("");
		lhs.add("");
		System.out.println(lhs); 
		//Accepts does not accepts the null," ",duplicate values at run time shows the latest value

		
	}

}
