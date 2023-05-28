package Java;

import java.util.HashMap;

public class countofduplicate_java {
	public static void main(String[] args) {
		
		String name="venkatteja";
		HashMap<Character,Integer> hm=new HashMap();
		
		char[] ch=name.toCharArray();
		
		for(Character c:ch) {
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
				
			}
			
		}
		System.out.println(hm);

	}

}
