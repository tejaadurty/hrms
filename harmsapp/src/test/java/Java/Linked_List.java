package Java;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		LinkedList li = new LinkedList();
		li.add(101);
		li.add("Venkat");
		li.add(true);
		li.add(null);
		System.out.println("Print output" + li);
		System.out.println("Print size " + li.size());
		li.remove(2); // index
		System.out.println("After removing new list" + li);

		// adding element middle of linked list
		li.add(2, "2rdplace");
		System.out.println("After inserting 2rd list" + li);

		// retive
		li.get(2);
		System.out.println("2ndplcae " + li.get(2));

		// changing the value
		li.set(2, "N_2");
		System.out.println("2ndplcae changed " + li);

		Thread.sleep(2);
		// Contains
		System.out.println(li.contains("N_2"));
		System.out.println(li.contains("N_1"));

		for (int i = 0; i <li.size(); i++) {
			System.out.println("for loop "+li.get(i));
		}
		
		//reading elemets in LL using foreach
		for(Object e:li)
		{
			System.out.println("foreach "+e);
		}

		//Iterator
		Iterator it=li.iterator();
		while(it.hasNext())
		{
			
			System.out.println("Iteraror "+it.next());
		
		}
		LinkedList Li_dup=new LinkedList();
		Li_dup.add("B");
		Li_dup.add("D");
		Li_dup.add("Z");
		Li_dup.add("A");
		LinkedList Li_dup2=new LinkedList();
		Li_dup2.addAll(Li_dup);
		System.out.println("Add All" +Li_dup2);
		Collections.sort(Li_dup);
		System.out.println("Sorted "+Li_dup);
		Collections.sort(Li_dup,Collections.reverseOrder());
		System.out.println("Sorted "+Li_dup);
		
		//Stack and Queue
		LinkedList ani=new LinkedList();
		ani.add("dog");
		ani.add("cat");
		ani.add("horse");
		ani.add("Fox");
		System.out.println("Animals "+ ani);
		ani.addFirst("Tiger");
		System.out.println("Add First Animals "+ ani);
		ani.addLast("Elephant");
		System.out.println("Add Last Animals "+ ani);
		System.out.println("New Animals "+ ani);
		System.out.println("First Ani: "+ani.getFirst());
		System.out.println("Last Ani: "+ani.getLast());
		
		
	}

}
