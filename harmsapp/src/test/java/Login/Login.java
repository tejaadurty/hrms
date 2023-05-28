package Login;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		String Dashboard_title=driver.getTitle();
		String Actual_Dt="OrangeHRM";
		if(Dashboard_title.equals(Actual_Dt))
		{
			System.out.println(true);
			Thread.sleep(5000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#firstName")).sendKeys("venkat");
		}
		else
		{
			System.out.println(false);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][1]")).click();
		Thread.sleep(10000);
		
		
		driver.close();
		
	
		
		
	}

}
