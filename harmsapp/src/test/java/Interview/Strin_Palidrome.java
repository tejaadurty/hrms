package Interview;

public class Strin_Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Place="dad";
		String reverse="";
		for(int i=Place.length()-1;i>=0;i--)
		{
			
			reverse+=Place.charAt(i);
		}
		if(reverse.equals(Place))
		{
			System.out.println("String Plindrome");
		}
		else
		{
			System.out.println("String Not Plindrome");
		}
	}

}
