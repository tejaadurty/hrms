package Java;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;


public class Hash_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht=new Hashtable(); //capacity 11 , loadfactor 0.75%
		ht.put(101, "john");
		ht.put(102, "john");
		ht.put(103, "x");
		ht.put(104, "y");
		System.out.println(ht); //{104=y, 103=x, 102=john, 101=john}
		System.out.println(ht.get(104));  //Y
		ht.remove(103);
		System.out.println(ht); //{104=y, 102=john, 101=john}
		ht.containsKey(103);// false
		System.out.println(ht.containsKey(103)); //false
		System.out.println(ht.containsKey(104)); //true
		ht.containsValue("x");
		System.out.println(ht.containsValue("x")); ///false
		System.out.println(ht.keySet());// return all the keys [104, 102, 101]
		System.out.println(ht.values());//returns all the values [y, john, john]
		System.out.println(ht.entrySet());
		
		for(Object o:ht.keySet())
		{
			System.out.println("Keys 0 "+o +" Values "+ht.get(o)); //key along with values 
			//Keys 102 Values john			
			//Keys 101 Values john
			
		} 
		
		Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		t.put(101, "Tiger");
		t.put(102, "Lion");
		t.put(103, "Fox");
		t.put(104, "Yak");
		for(Map.Entry entry:t.entrySet())
		{
			
			System.out.println("key "+entry.getKey() +" value "+entry.getValue());
		}
		
		//Iterator
		Set s=t.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			System.out.println("Enter key  "+entry.getKey() +" values "+entry.getValue());
		}
		
		
		
	}

}
