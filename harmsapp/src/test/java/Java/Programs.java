package Java;

public class Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapping();

	}
	
	static void swapping()
	{
		//without 3rd variable
		int a=30;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("--2 swap--");
		System.out.println("b "+b);
		System.out.println("a "+a);
		
		//with 3rd variable
		int x=30;
		int y=20;
		int z;//30
		z=x;//30
		x=x+y;//50
		y=x-y;//50-20=30
		x=x-z; //50-30=20
		
		//---or--using temp
		z=x; //30
		x=y;//20
		y=z;// 30		
		
		System.out.println("--3 swap--");
		System.out.println("x "+x);
		System.out.println("y "+y);
	}

}
