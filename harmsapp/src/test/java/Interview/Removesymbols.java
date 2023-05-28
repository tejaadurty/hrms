package Interview;



public class Removesymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int n=153,r=0,sum=0;
		 * 
		 * while (n>0) { r=n%10; sum=(sum*10)+r; n=n/10; } System.out.println(sum);
		 */
		
		String s="Test!@#is#$%";
		String ds="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char d=s.charAt(i);
			if(d!='!' && d!='@' && d!='#' && d!='$' && d!='%' )
			{
				
				ds+=s.charAt(i);
				
			}
			
		}
		System.out.println(ds);
		
		
		
		
	}

}
