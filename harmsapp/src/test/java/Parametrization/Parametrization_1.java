package Parametrization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Parametrization_1 {
	
	WebDriver driver;
  @BeforeClass 
  @Parameters({"browser","url"})
  public void Launch( String br,String url) {
	  
	 
	  if(br.equals("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  }else if(br.equals("edge"))
	  {
		  WebDriverManager.edgedriver().setup();
		  driver=new EdgeDriver();
	  }
	  
	  driver.get(url);
	  driver.manage().window().maximize();
	  
	  
  }
  
  @Test (priority = 0)
   void Test1()
  {
	  WebDriverWait _wait=new WebDriverWait(driver, Duration.ofSeconds(10));

	  boolean logo=_wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[src='/web/images/ohrm_branding.png?1672659722816']"))).isDisplayed();
		
	  Assert.assertEquals(logo, true);
	  
  }
  
  @Test
  void Test2()
  {
	  System.out.println("Testing 2...!");
	  
  }
  @Test
  void Test3()
  {
	  System.out.println("Testing 3...!");
	  
  }
   @AfterClass
   void Exit()
   {
	   driver.close();
   }
  
}
