package Oops;

public class Derived_Abstract extends Abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract_class DA = new Derived_Abstract();
		
		DA.CompleteAbstract();
		DA.PartialAbstract();
		
	
	}
	
	public  void CompleteAbstract() {
		// TODO Auto-generated method stub
		System.out.println("This is complete abstration");
		
	}

}
