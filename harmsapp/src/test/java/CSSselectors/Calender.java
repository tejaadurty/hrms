package CSSselectors;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://jqueryui.com/datepicker/");
		driver.get("https://www.makemytrip.com/hotels/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		String Month="December";
		String Year="2023";
		String Date="11";
	
		WebElement Yr=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div//span"));
	
		System.out.println(Yr.getText());
		
		String my=Month+Year;
		System.out.println(my);
		while(true)
		{
		
			WebElement data=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']//div"));
		
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			
			if( my.equals(data.getText()))
			{
				System.out.println(my);
				
				break;
			}
		
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//div[@class='DayPicker-Body']//div//div"));
		for(int i=0;i<alldates.size();i++)
		{
			if(Date.equals(alldates.get(i).getText()))
					{
				alldates.get(i).click();
				
					}
		}

	}

	

}
