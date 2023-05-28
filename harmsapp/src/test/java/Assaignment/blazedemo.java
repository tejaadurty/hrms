package Assaignment;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hpsf.Decimal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blazedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement startcity= driver.findElement(By.name("fromPort"));
		Select scity=new Select(startcity);
		scity.selectByVisibleText("Portland");
		
		WebElement endcity= driver.findElement(By.name("toPort"));
		Select ecity=new Select(endcity);
		ecity.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		List<WebElement> tdata=driver.findElements(By.xpath("//table[@class='table']//tbody/tr"));
		ArrayList<String> Li=new ArrayList<String>();
		
		String sd;
		for(int r=1;r<=tdata.size();r++)
		{
		//System.out.println(tdata.get(r).getText());
		String cdata=driver.findElement(By.xpath("//table[@class='table']//tbody/tr["+r+"]//td[6]")).getText();
		//System.out.println(cdata.replace("$",""));
		 sd=cdata.replace("$","").toString();	
		//testArray[r]=sd.toString();
		System.out.println( sd.toString());
		Li.add(sd);
		}
	Collections.sort(Li);
	System.out.println("Sort Amount :"+Li);
	System.out.println("Minimum Amount :"+Li.get(0));

	for(int r=1;r<=tdata.size();r++)
	{
	//System.out.println(tdata.get(r).getText());
	String cdata=driver.findElement(By.xpath("//table[@class='table']//tbody/tr["+r+"]//td[6]")).getText();
	if(cdata.equals("$"+Li.get(0)))
	{
		driver.findElement(By.xpath("//table[@class='table']//tbody/tr["+r+"]//td[1]")).click();
	}
	
	}
	
	
	}

}
