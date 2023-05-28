package Java;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		//default capacity 16 and Load factor 0.75%
		HashSet hs1=new HashSet(100);
		HashSet hs2=new HashSet(100,(float)0.95); //custome load factor
		HashSet<Integer> h_s=new HashSet<Integer>();
		
		//Add objects
		hs.add(100);
		hs.add("venkat");
		hs.add(0.5);
		hs.add(200);
		hs.add(200);
		hs.add(null);
		hs.add(null);
		System.out.println("insertion order no "+hs);
		
		//Remove 
		hs.remove(0.5);
		System.out.println("remove 0.5 order no "+hs);
		
		//Contains
		System.out.println("remove 0.5 order no "+hs.contains(200));
		
		//loop 
		for(Object gdata :hs)
		{
			System.out.println(gdata);
		}
		//using Iterator
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			
			System.out.println("Iterator "+it.next());
		}
		
		HashSet<Integer> even=new HashSet<Integer>();
		even.add(2);
		even.add(4);
		even.add(6);
		System.out.println("event "+ even);
		HashSet<Integer> eveninto=new HashSet<Integer>();
		eveninto.addAll(even);
		eveninto.add(10);
		System.out.println("Im in new hashset"+eveninto);
		
		//Union, Intersection, difference
		//Union adds only unique from both the collections
		HashSet<Integer> all=new HashSet<Integer>();
		all.add(1);
		all.add(2);
		all.add(3);
		all.add(4);
		all.add(5);
		all.add(11);
		System.out.println("Normal numbers "+all);
		all.addAll(eveninto);
		System.out.println("Union "+all);
		
		//Intersection 
		//common elements
		all.retainAll(eveninto);
		System.out.println("Intersection "+all);
		
		//Differences
		//means removing the other collection
		System.out.println("check all numbers "+all);
		System.out.println("check even numbers "+even);
		all.removeAll(even);
		System.out.println("difference "+all);
		
		//Subset
		all.containsAll(even);// events other than even those elements in all will get returns
		System.out.println("subset "+all);
		

	}

}
