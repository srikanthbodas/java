package Pdffile;
		import java.io.*;   
		import org.apache.poi.hssf.usermodel.HSSFWorkbook;   
		import org.apache.poi.ss.usermodel.Workbook;   
		public class Demoxlsheet  {   
		public static void main(String[] args) throws FileNotFoundException, IOException   
		{   
		//creating an instance of Workbook class   
		Workbook wb = new HSSFWorkbook();   
		//creates an excel file at the specified location  
		OutputStream fileOut = new FileOutputStream("E:\\excalsheet.xlsx");   
		System.out.println("Excel File has been created successfully.");   
		wb.write(fileOut);   
		}   
		} 


