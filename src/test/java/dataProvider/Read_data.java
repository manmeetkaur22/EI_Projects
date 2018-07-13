package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {
	XSSFWorkbook wb;
	XSSFSheet xs;
	public Read_data() throws IOException
	{
		File src=new File("./applicationDataProvider/log_details.xlsx");
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
				
	}
	public String get_data(int sheetIndex,int row,int col)
	{
		String data=wb.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
