package Interview;

public class Fibonaccie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,n3,n;
		System.out.print(n1+" "+n2+" ");
		n=10;
		for(int i=2;i<=n;++i)
		{
			
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
		
	}

}
