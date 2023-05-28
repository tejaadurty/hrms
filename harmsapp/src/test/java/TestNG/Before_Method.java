package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Before_Method {
	WebDriver driver;
	
  @BeforeMethod
  public void Login() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://demo.nopcommerce.com/");
	  System.out.println("Login");
  }
  @Test(priority = 1)
  void Search()
  {
	 driver.findElement(By.id("small-searchterms")).sendKeys("Hi");
	 System.out.println("Search");
  }
  @Test (priority = 2)
  void AdvanceSearch()
  {
	 System.out.println("Advance");
  }
  @AfterMethod
  void Logout() {
	  driver.close();
	  System.out.println("Logout");
	  
  }
}
