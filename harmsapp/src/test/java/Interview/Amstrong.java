package Interview;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,tmp,digits=0,sum=0,r;
		tmp=n;
		while(tmp>0)
		{
			tmp=tmp/10;
			digits++;
		}
		System.out.println(digits);
		tmp=n;
		while(tmp>0)
		{
			r=tmp%10;
			sum+=Math.pow(r, digits);
			tmp=tmp/10;
		}
		
		if(sum==n)
		{
			System.out.println("Amstrong Number : "+sum);	
		}
		else
		{
			System.out.println("Not Amstrong Number");		
		}

	}

}
