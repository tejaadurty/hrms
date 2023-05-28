package Java;

import java.util.HashMap;

import org.apache.poi.ss.formula.functions.Index;

public class normalpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int n=0,r=0,sum=0,temp=0; n=454; temp=n; while(n>0) { r=n%10; sum=(sum*10)+r;
		 * n=n/10; } System.out.println(sum);
		 */

		/*
		 * int n=0,r=0,sum=0,temp=0; n=153; int digits=0; temp=n; while(temp>0) {
		 * temp=temp/10; digits++; }
		 * 
		 * temp=n; System.out.println(n); System.out.println(digits); while(temp>0) {
		 * r=temp%10; sum+=(Math.pow(r, digits)); temp=temp/10; }
		 * System.out.println(sum);
		 * 
		 * String name="venkat"; String res=""; for(int i=name.length()-1;i>=0;i--) {
		 * res+=name.charAt(i);
		 * 
		 * 
		 * } System.out.println(res);
		 */

		
		/*
		 * HashMap<Character, Integer> hp = new HashMap<>();
		 * 
		 * String data = "hhhrrrsss"; char[] ch = data.toCharArray(); for (Character c :
		 * ch) { if (hp.containsKey(c)) {
		 * 
		 * hp.put(c, hp.get(c) + 1); } else { hp.put(c, 1); } }
		 * 
		 * System.out.println(hp);
		 */
		 

		HashMap<Object, Integer> hs = new HashMap<>();
		String st = "abcdabcdab";
		char[] ch = st.toCharArray();
		for (int d = st.length() - 1; d >= 0; d--) {
			if (hs.containsKey(st.charAt(d))) {
				int count = hs.get(st.charAt(d));
				hs.put(st.charAt(d), ++count);

			} else {
				hs.put(st.charAt(d), 1);
			}
		}
		System.out.println(hs);
		
		

	}

}
