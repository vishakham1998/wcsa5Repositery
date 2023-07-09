package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for(int i=0;i<=10;i++)
		{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provide the path of the file
		Workbook wb = WorkbookFactory.create(fis);//make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(i);//get into desired the row
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		Thread.sleep(2000);
		System.out.println(data); 
	}
}
}