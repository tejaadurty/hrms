package Java;

import java.util.Arrays;
import java.util.List;


public class ArrayList_Arrays_Convertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array to ArrayList
		String[] name= {"venk","kat","tej"};
		List<String> li=Arrays.asList(name);
		System.out.println(li);
		
		//List to Array
		Object[] back=li.toArray();
		for(Object obj:back)
		{
			System.out.println(obj);
		}

	}

}
