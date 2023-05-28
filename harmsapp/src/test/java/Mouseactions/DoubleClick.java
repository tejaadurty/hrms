package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act=new Actions(driver);
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement phone=mywait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[@class='d-none d-md-inline' and text()='123456789']"))));
		//selecting the phone 
		act.doubleClick(phone).build().perform();
		String copytext=phone.getText();
		System.out.println(copytext);
		if(copytext.equals("123456789"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
					
		}
		
	}

}
