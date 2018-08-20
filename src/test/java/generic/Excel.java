package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Excel 
{
	
	public static String getValue(String Path,String Sheet,int row,int cell)
	{
		String value="";
		try
		{
			FileInputStream fis=new FileInputStream(Path);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(Sheet);
			Row r=sh.getRow(row);
			Cell c=r.getCell(cell);
			value=c.toString();
			
		}
		catch(Exception e)
		{
			Reporter.log("path is inavlid",true);
			Assert.fail();
		}
		return value;
	}

}
