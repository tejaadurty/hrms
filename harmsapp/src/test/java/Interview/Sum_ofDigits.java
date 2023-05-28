package Interview;

public class Sum_ofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		int number=12345;
		int r=0;
		while(number>0)
		{
			r=number%10;
			sum=sum+r;
			number=number/10;
		}
		System.out.println(sum);
		
	}

}
