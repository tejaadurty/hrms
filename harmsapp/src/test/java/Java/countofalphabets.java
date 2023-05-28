package Java;

import java.util.HashMap;

public class countofalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using for loop 
		String data = "aaabbbbcccccd";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int  i = data.length() - 1;i>=0; i--) {
			if (hm.containsKey(data.charAt(i))) {
				int count = hm.get(data.charAt(i));
				
				hm.put(data.charAt(i), ++count);
			} else {
				hm.put(data.charAt(i), 1);
			}

		}	
		
		System.out.println(hm); //{a=3, b=4, c=5, d=1}
		
	// using foreach
		HashMap<Character, Integer> hp = new HashMap<>();

		String data1 = "hhhrrrsss";
		char[] ch=data1.toCharArray();
		for(Character c :ch)
		{
		 if(hp.containsKey(c))
		 {
			
				hp.put(c, hp.get(c)+1);
		 }
		 else
		 {
			 hp.put(c, 1);
		 }
		}
		
		System.out.println(hp);

		String owl="eiroaeiouncoa";

		HashMap<Character, Integer> hm1 = new HashMap<>();
		int count=0;
		for(int j=0; j<owl.length();j++)
		{
			
			if(owl.charAt(j)=='a'||	owl.charAt(j)=='e'||
					owl.charAt(j)=='i'||owl.charAt(j)=='o'
					||owl.charAt(j)=='u')
			{
				count++;
				
			}
			 			
		}
		System.out.println(count);
		
		int n=0,Flag=0;
		n=3;
		if(n==0 || n==1)
		{
			System.out.println("Not prime number");
		}
		else {
			for(int k=2;k<n/2;k++)
			{
				if(n%k==0)
				{
					System.err.println("Not prime number");
					Flag=1;
					break;
				}
				
			}
			
				
		}
		if(Flag==0)
		{
			System.out.println("It is prime number "+n );
		}
		
	}

}
