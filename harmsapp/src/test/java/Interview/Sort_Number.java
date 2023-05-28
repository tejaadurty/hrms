package Interview;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(1);
		al.add(6);
		al.add(5);
		al.add(2);
		al.add(3);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);

	}

}
