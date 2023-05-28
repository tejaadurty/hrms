package Screenshort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshort_c {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	
		TakesScreenshot ts=(TakesScreenshot)driver;
	/*	File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C://Users//hanu4//eclipse-workspace//harmsapp//screenshots//capture.png");
		
		FileUtils.copyFile(src, trg);
		*/
		
		TakesScreenshot nts=(TakesScreenshot)driver;
		WebElement search=driver.findElement(By.xpath("//div[@class='RNNXgb']"));
		File nsrc=search.getScreenshotAs(OutputType.FILE);
		String random=RandomStringUtils.randomAlphabetic(5); 
		File ntrg=new File("C://Users//hanu4//eclipse-workspace//harmsapp//screenshots//"+random+".png");	
		FileUtils.copyFile(nsrc, ntrg);
		

	}
	
	

}
