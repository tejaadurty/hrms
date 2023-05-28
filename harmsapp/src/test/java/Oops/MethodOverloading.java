package Oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodOverloading {
	
	
	//==Below methods are fetched in  Impliment_Interface class
	public ArrayList livingbeeings()
	{
		String[] animals= {"Horse","Lion","Deer"};
		ArrayList al=new ArrayList();
		List li=Arrays.asList(animals);
		al.add(li);
		return al;
		
	}
	public ArrayList livingbeeings(String flowers)
	{
		String[] flow= {"Rose","Sunflower","Jasmin"};
		ArrayList al=new ArrayList();
		List li=Arrays.asList(flow);
		al.add(li);
		return al;
		
	}
	
	

}
