package readexceldata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
        //Read Data From IPL Sheet
		//implementation of read the data from Excel
		FileInputStream fis=new FileInputStream("./data/TestData.xlsx");//
		Workbook wb=WorkbookFactory.create(fis);//make the file for ready to read
	    Sheet sheet=wb.getSheet("IPL");//get into the sheet
	    Row row=sheet.getRow(3);//get into the desired row
	    Cell cell = row.getCell(1);//get into the Desired cell/Column
	    String data = cell.getStringCellValue();//Read the data from Cell
	    System.out.println(data);
		
	}
		
	}
		

	
