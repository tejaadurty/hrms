package Interview;

public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Place="Hyderabad";
		String reverse="";
		for(int i=Place.length()-1;i>=0;i--)
		{
			
			reverse+=Place.charAt(i);
		}
		System.out.println(reverse);

	}

}
