package fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	FileInputStream path;
	Workbook wb;
	public Object[][] readMultipleData(String sheetName) {
		try {
			path=new FileInputStream("./src/test/resources/GoIbiboTC.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb=WorkbookFactory.create(path);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet=wb.getSheet(sheetName);
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowCount][cellCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	
	public String fetchSingleData(String sheetName, int rowNumber, int cellNUmber) {
		try {
			path=new FileInputStream("./src/test/resources/GoIbiboTC.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			wb=WorkbookFactory.create(path);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet=wb.getSheet(sheetName);
		String data=sheet.getRow(rowNumber).getCell(cellNUmber).getStringCellValue();
		return data;
	}
}
