package Interview;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number,Flag=0;
		number=10;
		if(number==1 || number==0)
		{
			System.out.println(number+" Not Prime number ");
		}
		else
		{
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					System.out.println(number+" Not Prime number ");
					Flag=1;
					break;
					
				}
			}
		}
		if(Flag==0)
		{
			System.out.println(number+" Prime number ");
		}
	}

}
