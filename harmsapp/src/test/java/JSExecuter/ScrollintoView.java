package JSExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollintoView {

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// String text=driver.findElement(By.xpath("//*[@class=\"toc chapters\"]//li")).getText();
		WebElement linktext = wait
				.until(ExpectedConditions.visibilityOfElementLocated((By.linkText("Linux"))));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//arguments[0].scrollIntoView(true); used to scroll to particular element
		js.executeScript("arguments[0].scrollIntoView(true);", linktext);
		
		System.out.println(driver.getTitle());
		// to click the button
		js.executeScript("arguments[0].click();", linktext);
		Thread.sleep(5);
		driver.navigate().back();
		
		//Scroll to bottom of the page
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		
		//Set values to textbox
		WebElement textbox=driver.findElement(By.xpath("//*[@id='philadelphia-field-email']"));
		js.executeScript("arguments[0].scrollIntoView(true);",textbox);
		textbox.sendKeys("hanu");
		//js.executeScript("arguments[0].setAttributes('value','venkat.adurty@gmail.com');", textbox);
		
		//Scroll vertically down by 1000 pixels
		//js.executeScript("window.scrollBy(0,1000)"); 
		Thread.sleep(5);
		//driver.close();

	}

}
