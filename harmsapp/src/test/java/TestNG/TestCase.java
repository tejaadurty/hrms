package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {

	ChromeDriver driver;
	@Test(priority = 1)
	void OpenApp() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(1);
	}

	@Test(priority = 2)
	void Login() {
		
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button.oxd-button")).click();
		System.out.println(2);
		
	}
	@Test(priority = 3)
	void Close() {
		
		driver.close();
		System.out.println(3);
	}
}
