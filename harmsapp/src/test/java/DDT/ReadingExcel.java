package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*file-workbook-sheets-rows-columns */
public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\hanu4\\git\\repository\\harmsapp\\testdata\\Booksdata.xlsx");
		// or
		//FileInputStream file=new FileInputStream(System.getProperty("user.dir"+"\\testdata\\Booksdata.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int totalrows=sheet.getLastRowNum();
		int totalcells=sheet.getRow(1).getLastCellNum();
		System.out.println("total Number of rows"+ totalrows);
		System.out.println("total Number of cells"+ totalcells);
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			
			for(int c=0;c<totalcells;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				String value=cell.toString();				
				System.out.println(value + "   ");
			}			
			System.out.println();
		}
		workbook.close();
		file.close();

	}

}
