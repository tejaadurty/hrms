package CSSselectors;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiselectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		//we've to capture all this values into the variable 
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(class,multiselect)]//label"));
		
		//find total number of options
		options.size();
		
		//print all the options
		for(int i=0;i<options.size();i++)
		{
			
			String data=options.get(i).getText();
			System.out.println(data);
			
		}
		//select options from dropdown
		for(int i=0;i<options.size();i++)
		{
			// select selected options
			/*if(options.get(i).getText().equals("Java"))
			{
				options.get(i).click();
				break;
			} */
			
			// select All options
			options.get(i).click();
			
		}
		

	}

}
