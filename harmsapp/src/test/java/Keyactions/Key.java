package Keyactions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Key extends Keybase {

	Key(WebDriver driver)
	{
		super(driver);
	}

	@Test
	void uppercase()
	{
		WebElement send=driver.findElement(By.cssSelector(".ds-input"));
		Actions act=new Actions(driver);
		act.moveToElement(send).click().keyDown(Keys.SHIFT).sendKeys("hi").build().perform();
	}

}
