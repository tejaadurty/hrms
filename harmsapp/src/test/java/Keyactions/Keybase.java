package Keyactions;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Keybase {

	WebDriver driver;

	Keybase(WebDriver driver) {
		this.driver = driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/#inline");
		
		driver.manage().window().maximize();
		
		

	}

}
