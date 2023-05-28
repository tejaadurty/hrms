package Java;

import java.util.*;

import com.beust.jcommander.internal.Maps;

public class ArrayList_to_Set_Convertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("venkat");
		al.add("teja");
		al.add("venkat");
		al.add("adurty");
		al.add("venkat");
		System.out.println(al);

		HashSet<String> hs = new HashSet<>();
		hs.addAll(al);

		System.out.println(hs);

		String[] s = { "This", "is", "venkat", "venkat", "venkat" };
		HashMap<String, Integer> hm = new HashMap();

		for (int i = s.length - 1; i >= 0; i--) {
			if (hm.containsKey(s[i])) {
				hm.put(s[i], hm.get(s[i]) + 1);
			} else {
				hm.put(s[i], 1);
			}
		}
		System.out.println(hm);

		/*
		 * HashSet hs1=new HashSet(); hs1.addAll(hm.keySet());
		 * 
		 * System.out.println(hs1);
		 */
		for (String sh : hm.keySet()) {
			System.out.print(sh + " ");
		}

		String str = "java programming java java";
		// op= java programming
		String[] j = str.split(" ");
		HashSet<String> hsd = new HashSet<>();

		for (String dup : j) {
			System.out.println(dup);
			hsd.add(dup);

		}
		Iterator it = hsd.iterator();
		while (it.hasNext()) {

			System.out.print(it.next() + " ");
		}

		ArrayList<Integer> even = new ArrayList<>();
		even.add(1);
		even.add(2);
		even.add(3);
		even.add(4);
		int count = 0;
		for (Integer i : even) {
			
			if (i % 2 == 0) {
				count=count+1;
			}

		}
		System.out.println(count);

	}

}
