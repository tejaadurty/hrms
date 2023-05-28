package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {

	/*@Test*/
	void Test1()
	{
		System.out.println("Tetsing 1.....");
		System.out.println("Tetsing 2.....");
		System.out.println("Tetsing 3.....");
		System.out.println("Tetsing 4.....");
		System.out.println("Tetsing 5.....");
		
		Assert.assertEquals(1, 2); /* if it fails then next statements will not run */
		
		System.out.println("Tetsing 6.....");
		
	}
	
	@Test
	void test_softAss() {
		
		System.out.println("Tetsing 1.....");
		System.out.println("Tetsing 2.....");
		System.out.println("Tetsing 3.....");
		System.out.println("Tetsing 4.....");
		System.out.println("Tetsing 5.....");
		
		SoftAssert sa=new SoftAssert();
		/*sa.assertEquals(1, 2);	 */	
		
		System.out.println("Tetsing 6.....");
		sa.assertEquals(1, 1);
		sa.assertAll();
		
		
		
	}
}
