package AlertsandPopup;

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click(); 
		//"button[contains(@onclick,'jsConfirm()')]"
		//---- Accept or Dismiss in single line
		/*driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss(); */
		
		Alert ALwindow=driver.switchTo().alert(); //Alert Class
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(ALwindow.getText());
		//ALwindow.accept(); //this will close alert window using ok button
		ALwindow.dismiss(); //this will close alert window using cancel button
		

	}

}
