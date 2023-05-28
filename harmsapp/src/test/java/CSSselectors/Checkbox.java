package CSSselectors;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	//WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Single Chekbox select
         
		
		List<WebElement> cbl=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println( "Size is " + cbl.size());

		//select all checkbox
		for(int i=0;i<cbl.size();i++)
		{
		cbl.get(i).click();		
			
		}
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("monday"))).click();		
		
		/*for(WebElement cb:cbl)
		{
			cb.click();	
		}*/
		
		// select last 2 checkbox in the list
		/*for(int i=5;i<cbl.size();i++)
		{
			cbl.get(i).click();			
			
		}*/
		//select first two checkboxes
		 for(int i=0;i<cbl.size();i++) {
			if(cbl.get(i).isSelected())
			{
			cbl.get(i).click();	
			}
		}
	}

}
