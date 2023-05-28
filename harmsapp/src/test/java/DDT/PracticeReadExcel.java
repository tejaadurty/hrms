package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class PracticeReadExcel {
	
	public static FileInputStream file;
	public static  XSSFWorkbook wb;
	public static XSSFSheet sheet;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file=new FileInputStream("C:\\Users\\hanu4\\git\\repository\\harmsapp\\testdata\\Booksdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int totalrow=sheet.getLastRowNum();
		int totalcolumn=sheet.getRow(1).getLastCellNum();
		System.out.println("total Number of rows"+ totalrow);
		System.out.println("total Number of cells"+ totalcolumn);
		
		
		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<totalcolumn;c++)
			{
				
				XSSFCell cell=row.getCell(c);
				String value=cell.toString();
				System.out.println(value + " ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
		

	}
	
	

}

