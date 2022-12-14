package project_1;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExxcelReader {

	public static ArrayList getExcelData(String filePath) 
    {
		ArrayList arr = new ArrayList();
        try
        {
            FileInputStream file = new FileInputStream(new File(filePath));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                // Iterator<Cell> cellIterator = row.cellIterator();
                Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    arr.add(cell.getStringCellValue());
                }
                System.out.println("");
            }
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return arr;
    }
}
