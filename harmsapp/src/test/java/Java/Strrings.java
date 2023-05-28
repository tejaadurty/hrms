package Java;

import java.util.*;
import java.util.Collection;

import lombok.ToString;

public class Strrings {

	public static void main(String[] args) {

		/*
		 * //Reversing string using loop String name="venkat"; String reverse="";
		 * for(int i=name.length()-1;i>=0;i--) { //reverse=reverse+name.charAt(i); // or
		 * reverse+=name.charAt(i); } System.out.println("Reversing : "+reverse);
		 * 
		 * //Reversing string using StringBuilder String middle="venkat"; String
		 * revstr=new StringBuilder(middle).reverse().toString();
		 * System.out.println("reversing with stringbuilder "+revstr);
		 * 
		 * //convert to upper System.out.println("Upper case : "+name.toUpperCase());
		 * 
		 * //Concatinating the string String lastname="adurty"; String
		 * concat=name.concat(lastname);
		 * 
		 * 
		 * //Count of single charecter in string int count=0; for(int i=0;
		 * i<name.length();i++) { if(name.charAt(i)=='a') { count=count+1; } continue;
		 * 
		 * } System.out.println("count of : "+count);
		 * 
		 * //Splitting the string String email="abc@gmail.com"; String
		 * first[]=email.split("@"); System.out.println(first[0]); //first index values
		 * System.out.println(first[1]); //second index values String
		 * newsplit=email.substring(0,3); System.out.println(newsplit);
		 * 
		 */

		// remove duplicate charecters in string
		/*
		 * String st = new String(); String data = "venkat teja adurty"; for (int i = 0;
		 * i < data.length(); i++) { char ch = data.charAt(i); if (st.indexOf(ch) < 0) {
		 * st += ch; }
		 * 
		 * } System.out.println(st.trim());
		 * 
		 * String sp = "venkat teja adurty"; String[] brok = sp.split(" "); String o =
		 * ""; for (String d : brok) { System.out.println(d); venkat teja adurty
		 * 
		 * 
		 * }
		 */
		String name = "abc,cdf,fbs";
		String[] ret = name.split(",");
		for(String d:ret)
		{
			System.out.print(d+" ");
		}
		
		String st1="xyz";
		String st2="LKM";
		String st3="ABC";
		
		StringBuffer sb=new StringBuffer(st1);
		sb.append(st2);
		sb.append(st3);
		System.out.println("StringBuilder "+sb);
		
		st2=st2.concat(st1);
		st3=st3.concat(st2);
		System.out.println("Concatination "+st3);
		
		
		

	}

}
