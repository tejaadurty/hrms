package CSSselectors;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("country-list")).click();
		
		// Drop down with select tag has the special class called Select Class
		WebElement dd=driver.findElement(By.id("country-list"));
		Select ds=new Select(dd);
		//ds.selectByVisibleText("USA");		
		//get options in dropdown		
		List<WebElement> List=	ds.getOptions();
		System.out.println(List.size());
		for(int i=0;i<List.size();i++)
		{
		String j=List.get(i).getText();
		
		System.out.println(j);
		}
		
		//Multi-select Dropdown

	}

}
