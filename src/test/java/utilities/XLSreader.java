package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSreader {

	public static HashMap hmObj;

	// public static HashMap getData(String XLFileName,String SheetName) throws
	// IOException {
	public static HashMap getData(String data) throws IOException {

		// Anu-Login
		String[] dataAry = data.split("-");

		// String excelfilepath = "../../"+dataAry[0]+".xlsx";
		String excelfilepath = "C:\\Users\\oye\\eclipse-workspace\\AutomationProject\\src\\test\\resources\\dataRepo\\"
				+ dataAry[0] + ".xlsx";
		// C:\Users\oye\Desktop\XLS\Anu.xlsx
		// System.out.println(excelfilepath);
		FileInputStream input = new FileInputStream(excelfilepath);

		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet(dataAry[1]);
		hmObj = new HashMap();

		for (int i = 0; i <= sheet.getLastRowNum(); i++) { // Rows

			for (int j = 0; j < sheet.getRow(i).getLastCellNum() - 1; j++) { // Columns

				// System.out.println(sheet.getRow(i).getCell(j).toString());
				// System.out.println(sheet.getRow(i).getCell(j+1).toString());

				hmObj.put(sheet.getRow(i).getCell(j).toString(), sheet.getRow(i).getCell(j + 1).toString()); // Key, Value
			}

		}

		workbook.close();
		input.close();
		return hmObj;

	}

	public static void main(String[] args) throws IOException {

	}

}
