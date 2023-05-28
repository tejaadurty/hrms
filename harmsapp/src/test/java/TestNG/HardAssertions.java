package TestNG;
import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertions {

	@Test
	void Test() {
		
		/*int x=10;
		int y=11;
		Assert.assertEquals(x, y); */
		
		int a=100;
		int b=100;
		/*Assert.assertEquals(actual, expected, any description);
		 * description message will be displayed only when the result is failed */
		
		/*Assert.assertEquals(a>b, true,"a is not grater than b"); */
		
		Assert.assertNotEquals(a,b,"a is not grater than b");
		
	}
}
