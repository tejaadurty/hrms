package Mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions act=new Actions(driver);
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//Locate the element to mousehover
		WebElement Desktop=mywait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[text()='Desktops']"))));
		//build() create the action and perform() execute the action
		act.moveToElement(Desktop).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//a[text()='PC (0)']"))).click().build().perform();
		
		((JavascriptExecutor) driver).executeScript("scroll(0,250);");
		//Contextclick

	}

}
