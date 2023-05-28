package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_1 {
	
	WebDriver driver;
	
	@BeforeClass
	void Login() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		
	}
	
  @Test(dataProvider="dp")
  public void validate(String username, String password) {
	  driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		/*WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(password)));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); */
		
	  driver.findElement(By.name("Email")).sendKeys(username);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	  
	  String Expected="nopCommerce demo store";
	  String Actual=driver.getTitle();
	 
	  SoftAssert as=new SoftAssert();
	 
	  
	  as.assertEquals(Actual, Expected,"Not Matched");	  
	  
	  driver.findElement(By.cssSelector("[href='/logout']")).click();
	  as.assertAll();
  }
  @DataProvider(name="dp")
  String [][] Datagenerate() {
	  
	 String data [][]= {{"hanu422@gmail.com","password123"},{"hanu402@gmail.com","password123"}};
	  return data;
  }
  @AfterClass
  void Close() {
	  driver.close();
  }
}
