package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritetoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int totalrows = totalrows("sheet1",path);
		int totalcolumns=totalcolumns("sheet1",path);
		System.out.println(totalrows+" "+totalcolumns);
		SetCellData("sheet1",path,4,"place");
	}

	public static ResourceBundle rb;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static FileInputStream file;
	public static String path="C:\\Users\\hanu4\\git\\repository\\harmsapp\\testdata\\Booksdata.xlsx";
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileOutputStream fo;
	
	public static int totalrows(String sheetname,String path) throws IOException {
		/*
		 * rb = ResourceBundle.getBundle("config"); String
		 * path=rb.getString("excelpath");
		 */
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetname);
		int totalrows = sheet.getLastRowNum();
		wb.close();
		fi.close();
		return totalrows;
	}
	
	public static int totalcolumns(String sheetname,String path) throws IOException {
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetname);
		int totalcells = sheet.getRow(1).getLastCellNum();
		wb.close();
		fi.close();
		return totalcells;
	}
	
	public static void SetCellData(String sheetname,String path,int colnum,String data)throws IOException
	{
		fi = new FileInputStream(path);
		wb = new XSSFWorkbook(fi);
		sheet = wb.getSheet(sheetname);
		row=sheet.getRow(totalrows(sheetname, path));
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
		
	}
	
	

}
