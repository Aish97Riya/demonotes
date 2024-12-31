package functionpkg;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import httpmethodpkg.dataprovidercls;

public class dpcls {
	@Test(dataProvider="dp")
	public static void dtprint(String Name,String Gender,String City)
	{
		System.out.println(Name+" "+Gender+" "+City);
	}
@DataProvider(name="dp")
public Object[][] pass() throws IOException
{
	dataprovidercls d=new dataprovidercls();
	d.excelconfig();
	int r=d.rowcount("sheet4");
	int c=d.columncount("sheet4");
	Object [][] ob=new Object[r][c];
	for (int i=0;i<r;i++)
	{
		for (int j=0;j<c;j++)
		{
		 ob[i][j]=d.printdata("sheet4", i, j);
		 
		}
	}
	return ob;
	
		
}

}
