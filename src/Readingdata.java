import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdata {

	public static void main(String[] args) throws Exception 
	{
		File src = new File("C:\\Users\\Rohit\\Desktop\\Testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		int rcount = ws.getLastRowNum();
		
		for(int i=0; i<=rcount; i++)
		{
		
		String data1 = ws.getRow(i).getCell(0).getStringCellValue();
		String data2 = ws.getRow(i).getCell(1).getStringCellValue();
		System.out.println(data1+"....."+data2);
		
		}
		
		
		
		

	}

}
