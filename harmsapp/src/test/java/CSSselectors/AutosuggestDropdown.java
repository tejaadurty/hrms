package CSSselectors;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Venkat");
		List<WebElement> WL=driver.findElements(By.xpath("//div[@class='OBMEnb']//ul//li"));
	System.out.println(WL.size());	
		for(int i=0;i<WL.size();i++)
		{
			
			System.out.println(	WL.get(i).getText());
			if(WL.get(i).getText().equals("Venkat"))
			{
				
				WL.get(i).click();
				break;
			}
		}
		
	}

}
