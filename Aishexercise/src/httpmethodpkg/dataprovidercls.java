package httpmethodpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class dataprovidercls {

	XSSFWorkbook wb;
	XSSFSheet sh;
	
	public void excelconfig() throws IOException,FileNotFoundException
	{
		File f=new File("C:\\Users\\HP\\Desktop\\testdata.xlsx");
		FileInputStream fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
	}
	public int rowcount(String sheetname)
	{
		sh=wb.getSheet(sheetname);
		int ro=sh.getLastRowNum();
		ro=ro+1;
		return ro;
	}
	public int columncount(String sheetname)
	{
		sh=wb.getSheet(sheetname);
		int co=sh.getRow(0).getLastCellNum();
		return co;
		
	}
	public String printdata(String sheetname, int row,int col)
	{
		sh=wb.getSheet(sheetname);
		String s=sh.getRow(row).getCell(col).getStringCellValue();
		return s;
		
	}
}

