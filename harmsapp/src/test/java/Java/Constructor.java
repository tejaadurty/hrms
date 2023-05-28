package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Constructor {

	static int x;
	static String name;
	WebDriver driver;

	Constructor(WebDriver driver) // Parametrized constructor we're inheriting this calls to EntendsConstructor
									// class
	{
		x = 10;
		name = "venkat";
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	static void display() {

		System.out.println(x);
		System.out.println(name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
