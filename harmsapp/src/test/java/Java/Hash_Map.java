package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hp1 = new HashMap<>();
		// HashMap<Integer,String> hp=new HashMap<Integer,String>();
		hp1.put(101, "venkat");
		hp1.put(102, "raj");
		hp1.put(103, "scot");
		hp1.put(104, "rose");
		hp1.put(102, "rose");
		System.out.println("hp1 " + hp1); // hp1 {101=venkat, 102=rose, 103=scot, 104=rose}
		System.out.println("get 103 " + hp1.get(103));
		System.out.println("remove pair  " + hp1.remove(102));
		System.out.println("hp1 " + hp1);
		System.out.println(hp1.containsKey(102));
		System.out.println(hp1.containsValue("rose"));
		System.out.println("hp1 " + hp1);
		System.out.println(hp1.isEmpty());
		System.out.println("All keys set"+hp1.keySet());//return type is Set [101, 103, 104]
		System.out.println("All keys collection"+hp1.values()); //return is collection [venkat, scot, rose]
		System.out.println("Entry set"+hp1.entrySet());//returns all entries as a set [101=venkat, 103=scot, 104=rose]
		
		for(Object k:hp1.keySet())
		{
			System.out.println("Only Keys "+ k);
		}
		for(Object j:hp1.values())
		{
			System.out.println("Only values "+ j);
		}
		for(Object s:hp1.keySet())
		{
			System.out.println(""+s +hp1.get(s));
		}
		
		//Entry Method
		HashMap<Integer,String> hp=new HashMap<Integer,String>();
		hp.put(200, "Dog");
		hp.put(201, "Dog");
		hp.put(202, "Dog");
		hp.put(203, "Dog");
		for(Map.Entry entry:hp.entrySet())
		{
			
			System.out.println("key "+entry.getKey() +" value "+entry.getValue());
		}
		
		//Iterator
		Set s=hp1.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry en=(Entry) itr.next();
			System.out.println("Key is "+en.getKey()+ " Value is "+en.getValue());
		}
		
	}

}
