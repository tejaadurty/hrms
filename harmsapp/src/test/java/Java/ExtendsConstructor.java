package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ExtendsConstructor extends Constructor {

	ExtendsConstructor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	static void display() {

		System.out.println(x);
		System.out.println(name);

	}

	@FindBy(xpath = "")
	WebElement txtName;

	public void setname(String name) {
		txtName.sendKeys(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Constructor c=new Constructor(driver);
		display();
		Constructor cd = new Constructor(null);
		cd.display();

	}

}
