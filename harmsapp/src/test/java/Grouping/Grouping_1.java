package Grouping;

import org.testng.annotations.Test;

/*loginByEmail - Sanity & regression
 *loginByFacebook -sanity 
 *loginBytwitter - sanity
 *
 *SignupByEmail - Sanity & regression
 *SignupByFacebook -regression 
 *SignupBytwitter - regression
 *
 *PaymentinRupees - Sanity & regression
 *PaymentinDollar -sanity 
 *PaymentReturnByBank - regression
 */

public class Grouping_1 {
	
	@Test (priority=1, groups = {"sanity", "regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
		
	}
	@Test (priority=2 ,  groups = {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by facebook");
		
	}
	@Test (priority=3 ,  groups = {"sanity"})
	void loginBytwitter()
	{
		System.out.println("this is login by twitter");
		
	}
	
	
	@Test (priority=4 , groups = {"sanity", "regression"})
	void SignupByEmail()
	{
		System.out.println("this is signup by email");
		
	}
	@Test (priority=5, groups = {"regression"})
	void SignupByFacebook()
	{
		System.out.println("this is signup by facebook");
		
	}
	@Test (priority=6, groups = {"regression"})
	void SignupBytwitter()
	{
		System.out.println("this is signup by facebook");
		
	}
	
	@Test (priority=7 , groups = {"sanity", "regression"})
	void PaymentinRupees()
	{
		System.out.println("this is Payment in Rupees");
		
	}
	
	@Test (priority=8 ,  groups = {"sanity"})
	void PaymentinDollar()
	{
		System.out.println("this is Payment in Dollar");
		
	}
	
	@Test (priority=9 ,  groups = {"regression"})
	void PaymentReturnByBank()
	{
		System.out.println("this is Payment return by Bank");
		
	}
}
