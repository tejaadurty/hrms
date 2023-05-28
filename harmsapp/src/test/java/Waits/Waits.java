package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	@Test
	void TestMethod() {
		
		
		System.out.print("I'm in test Annotation");
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		/*Implicit Wait = It should be available immediate after driver instance. only one implicit wait is 
		 * enough for all the statements*/
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		/*Thread.sleep(5000); we've to give it for all the statements when needed and it is not wait it
		 *  is part of java*/
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		/* Explicit wait 
		 * We've to declare it first
		 * then for each element we've to provide the condition
		  */
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		username.sendKeys("Admin123");
		
		
		
		

	}

	
}
