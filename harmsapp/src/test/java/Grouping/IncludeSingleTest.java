package Grouping;

import java.util.ResourceBundle;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class IncludeSingleTest {
	
	ResourceBundle rb=ResourceBundle.getBundle("config");
	
	@Test(groups={"Sanity"})
	
	public void method1() {
		String url=rb.getString("url");
		System.out.println("from Method 1 "+url);
	}

	@Test
	@Parameters({ "Name" })
	public void method2(String Name) {
		System.out.println("from Method 2 " + Name);
	}

	@Test(groups={"Sanity"})
	public void method3() {
		System.out.println("from Method 3");
	}
}
