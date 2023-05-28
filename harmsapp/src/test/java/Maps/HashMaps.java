package Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(null, 1);
		hm.put(null, 1);
		hm.put(null, 1);
		hm.put("Number", 1);
		hm.put("Abc", 2);
		hm.put("Abc", 3);
		hm.put("CDF", 2);
		hm.put("", null);

		//Entry
		for (Map.Entry e : hm.entrySet()) {

			System.out.println("Key : " + e.getKey() + " Value :" + e.getValue());
		}
		/* Output
		Key : null Value :1
		Key : Abc Value :2
		Key : Number Value :1
		Key : CDF Value :2
		*/
		//Iterator
				Set set=hm.entrySet();
				Iterator itr=set.iterator();
				while(itr.hasNext())
				{
					Map.Entry en=(Entry) itr.next();
					System.out.println("Key is "+en.getKey()+ " Value is "+en.getValue());
				}
				
				/*
				 * Key is null Value is 1 
				 * Key is Abc Value is 2 
				 * Key is Number Value is 1 
				 * Key is CDF Value is 2
				 */
				
		for(Object k:hm.keySet())
		{
			System.out.println("Only Keys "+ k);
		}
		
		/*
		 * Only Keys null 
		 * Only Keys Abc 
		 * Only Keys Number 
		 * Only Keys CDF
		 */
		for(Object j:hm.values())
		{
			System.out.println("Only values "+ j);
		}
		/*
		 * Only values 1 
		 * Only values 2 
		 * Only values 1 
		 * Only values 2
		 */
		for(Object s:hm.keySet())
		{
			System.out.println(""+s +hm.get(s));
		}
		
		
		/* If I/P :
		 * hm.put(null, 1);
		 *  hm.put(null, 1); 
		 *  hm.put(null, 1); 
		 *  Output => Key : null Value :1
		 */
		
		/* If I/P :
		hm.put(null, 1);
		hm.put(null, 1);
		hm.put(null, 1);
		hm.put("Number", 1);
		hm.put("Number", 2);
		*  Output => Key : null Value :1
		*			 Key : Number Value :2
		 */
		
		String Name="venkattejaadurty";
		char[] ch=Name.toCharArray();
		HashMap<Character,Integer> split=new HashMap<>();
		for(Character c:ch)
		{
			if(split.containsKey(c))
			{
				split.put(c, split.get(c)+1);
			}
			else
			{
				split.put(c, 1);
			}
		}
		System.out.println(split);
	}

}
