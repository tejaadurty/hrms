package DataTable;

import java.text.DecimalFormat;
import java.util.List;

import org.apache.poi.hpsf.Decimal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

// Find total number of rows


List<WebElement> table= driver.findElements(By.xpath("//table[@name='BookTable']//tr")); // when we've multiple tables
//or
List<WebElement> table_tag= driver.findElements(By.tagName("tr")); // you can use only when we've single table becoz it will count rows for other table also.
System.out.println("Total number of rows : "+table.size());

//Find total number of columns

List<WebElement> totalheaders=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
System.out.println("Total number of columns : "+totalheaders.size());

//Read specific row and column
for(int i=0;i<=table.size();i++) {
	
	if(i==2)
	{
		System.out.println(table.get(2).getText());
	}
}

//Read only specific column cell value using xpath 
WebElement Specific_Column=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]"));
System.out.println("Specific column cell value :"+Specific_Column.getText());

//Read only specific row cell value using xpath 
WebElement Specific_row=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]"));
System.out.println("Specific row cell value :"+Specific_row.getText());

//read all the rows and columns
	for(int r=2;r<=table.size();r++)
	{
		
		for(int c=1;c<=totalheaders.size();c++)
		{
			System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText()+" ");
			
			//System.out.println(table.get(c).getText());
			
		}
		System.out.println();
	}
	
//Condition based print book name who's author is amith
	for(int r=2;r<table.size();r++)
	{
		String Name=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		//System.out.println(Name);
		if(Name.equals("Amit"))
		{
			System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]")).getText()+" ");
			
		}
	}
	
	//Sum of prices for all the books
	int sum=0;
	for(int r=2;r<table.size();r++)
	{
		int Amount=Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText());
		
		sum=Amount+sum;	
		
	}
	System.out.println("Total : "+sum);
	
	driver.close();


	}

}
