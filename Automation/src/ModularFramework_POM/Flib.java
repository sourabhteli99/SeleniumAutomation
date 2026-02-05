package ModularFramework_POM;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	/**
	 * This Method Accept the key and it will fetch the value from the properties file from given Path
	 * @param key
	 * @return
	 */
	
	public static String getpropertyvalue(String key)
	{
		File file = new File(FrameworkContants.PROPERTIES_PATH);
		
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
		}
		
		Properties prop = new Properties();
		try
		{
			prop.load(fis);
		}
		catch(IOException e)
		{
		}
		
		return prop.getProperty(key) ;
	}
	
	public static String readCellValueFromExcel(String sheet, int row, int cell)
	{
		File file = new File(FrameworkContants.EXCEL_PATH);
		FileInputStream fis = null;
		
		try
		{
			fis = new FileInputStream(file);
		} 
		catch(FileNotFoundException e)
		{
			
		}
		
		Workbook wb = null;
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch(Exception e)
		{
			
		}
		
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
	
	
	public static String readCellValueFromExcelinint(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		File file = new File(FrameworkContants.EXCEL_PATH);
		FileInputStream fis  = new FileInputStream(file);
		Workbook wb =  WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row rw = sh.getRow(row);	
		Cell cl = rw.getCell(cell);
		double data = cl.getNumericCellValue();
		int data1 = (int) data;
		String value = String.valueOf(data1);
		return value;
	}
	
	public static int generateRandonNo()
	{
		Random random = new Random();
		int rn = random.nextInt(1000, 9999);
		return rn;
	}
	
}
