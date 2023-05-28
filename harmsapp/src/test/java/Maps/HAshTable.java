package Maps;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class HAshTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// throws error at run time if null added to key or value
		// if duplicate key added then latest key value is fetched
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("", 0);
		ht.put("", 3);
		ht.put("Id", 3013);
		// ht.put(null, 0);
		// O/P : [=0]
		// ht.put(null, null);
		// ht.put(null, null);
		System.out.println(ht.entrySet());

		for (Map.Entry e : ht.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	

		

	}

}
