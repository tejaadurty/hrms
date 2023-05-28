package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
	
	@Test(priority=1)
	void Openapp() {
		
		Assert.assertTrue(true);
	}
	@Test(priority=2,dependsOnMethods= {"Openapp"})
	void Login() {
		
		Assert.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"Openapp","Login"})
	void Search() {
		
	Assert.assertTrue(false);
	}
	@Test(priority=4,dependsOnMethods= {"Login","Search"})
	void AdSearch() {
		
		Assert.assertTrue(true);
	}
	@Test(priority=5,dependsOnMethods= {"Login"})
	void Logout() {
		Assert.assertTrue(true);	
		
	}

}
