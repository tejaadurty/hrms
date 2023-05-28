package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("venkat");
		al.add("Hyd");
		System.out.println(al);

		al.remove(2);// index
		System.out.println(al);
		al.add(2, "Hyd");
		System.out.println(al);
		al.remove("Hyd"); // element
		System.out.println(al);
		// forloop
		for (int i = 0; i < al.size(); i++) {
			System.out.println( "reading with for loop " +al.get(i));
		}
		
		//foreach
		for(Object e:al)
		{
			System.out.println("reading with foreach loop " +e);
		}
		
		//Iterator
		//Iterator is a interface
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println("reading with Iterator loop " +it.next());
		}
		
		ArrayList al_dupe=new ArrayList();
		al_dupe.addAll(al);
		System.out.println("Adding one list to other :"+al_dupe);
		
		//Sort array
		ArrayList<Integer> ial=new ArrayList<Integer>();
		ial.add(20);
		ial.add(40);
		ial.add(100);
		ial.add(30);
		System.out.println("Before sort"+ial); //[20, 40, 100, 30]
		Collections.sort(ial);
		System.out.println("After sort"+ial); //[20, 30, 40, 100]
		//reverse order
		Collections.sort(ial,Collections.reverseOrder()); //[100, 40, 30, 20]
		System.out.println("reverse sort"+ial);
		
		//Shuffling
		Collections.shuffle(ial);
		System.out.println("After shuffle"+ial);
		
		
		//Convert array to arraylist
		
		String arr[]= {"Dog","cat","Horse"};
		for(String s:arr)
		{
			System.out.println("array values "+s);
			
		}
		ArrayList cal=new ArrayList(Arrays.asList(arr));
		
		System.out.println(cal);

	}

}
