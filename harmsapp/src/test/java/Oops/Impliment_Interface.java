package Oops;

public class Impliment_Interface extends MethodOverriding implements IMaster {

	public static void main(String[] args) {

		// Interface Class
		IMaster im = new Impliment_Interface();
		im.OpenUrl();
		im.Login();
		im.Logout();

		Method1();

		// ==This is from MethodOverloading class
		MethodOverloading ol = new MethodOverloading();
		System.out.println("=== Method Overloading ====");
		System.out.println("Without parameter : " + ol.livingbeeings());
		System.out.println("With parameter : " + ol.livingbeeings("get flowers"));

		// ==This method Bank() is from MethodOverriding class and created new
		// implementation again
		MethodOverriding MO = new Impliment_Interface();
		int roi = MO.Bank();
		System.out.println("ROI : " + roi);

		System.out.println("this is static method : " + calculate(10, 12));
	}

	public static float calculate(int A, int B) {
		return A + B;
	}

	public static void Method1() {
		System.out.println("this is for test static call");
	}

	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Login Successfull");
		Method1();
	}

	public void Logout() {
		// TODO Auto-generated method stub
		System.out.println("Logout Successfull");

	}

	public void OpenUrl() {
		// TODO Auto-generated method stub
		System.out.println("Open Url");

	}

	int Bank() {

		return 8;

	}

}
