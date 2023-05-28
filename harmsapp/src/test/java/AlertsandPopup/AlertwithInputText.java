package AlertsandPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInputText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[contains(@onclick,'jsPrompt()')]")).click(); 
		Alert alertwindow=driver.switchTo().alert();
		alertwindow.sendKeys("Wellcome");
		alertwindow.accept();
		String result=driver.findElement(By.xpath("//p[contains(@id,'result')]")).getText();
		if(result.contains("Wellcome"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
	}

	}

}
