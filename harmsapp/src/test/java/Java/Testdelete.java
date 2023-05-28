package Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdelete {

	String username;
	String password;
	WebDriver driver;
	XSSFCell cell;

	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
	}

	@Test
	public void Read() throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		FileInputStream File = new FileInputStream(
				"C:\\Users\\hanu4\\git\\repository\\harmsapp\\testdata\\Userdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(File);
		XSSFSheet sheet = wb.getSheet("sheet1");
		int totalrows = sheet.getLastRowNum();
		System.out.println(totalrows);
		int totalcolmns = sheet.getRow(1).getLastCellNum();
		for (int r = 1; r <= totalrows; r++) {

			XSSFRow row = sheet.getRow(r);
			cell = sheet.getRow(r).getCell(0);
			cell.getStringCellValue();

			driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"))
					.sendKeys(cell.toString());
			cell = sheet.getRow(r).getCell(1);

			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys(cell.toString());
			/*
			 * WebElement login = wait.until(ExpectedConditions
			 * .visibilityOfElementLocated(By.
			 * xpath("//button[@class='btn-primary loginButton']")));
			 */
			WebElement login = driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
			login.click();

			/*
			 * String title = wait
			 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//div[@class='info__heading']"))) .getText();
			 */
			String title =driver.findElement(By.xpath("//div[@class='info__heading']")).getText();
			System.out.println(title);

			/*
			 * WebElement user = wait
			 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//img[@class='nI-gNb-icon-img']")));
			 */
			WebElement user = driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']"));
			user.click();
		/*	WebElement logout = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-type='logoutLink']")));*/
			WebElement logout = driver.findElement(By.xpath("//a[@data-type='logoutLink']"));
			logout.click();
			Assert.assertEquals(title, "Venkat");
			if (title != "") {
				driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
			}
		}

		wb.close();
		File.close();

	}

	@AfterTest
	public void Exit() {

		driver.close();
		
	}
	
	
	
	

}
