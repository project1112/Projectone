package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SecondTask {

  public static void main(String[] args) throws IOException {
//excel Location	
	  File excelLoc= new File("C:\\Users\\aaa\\Maven\\TestData\\Sample.xlsx");
	  //convert file object to java object
	  FileInputStream stream = new FileInputStream(excelLoc);
	  //initialize workbook
	  Workbook w= new XSSFWorkbook(stream);
	  
	 //to get sheet from workbook
	  
	  Sheet s = w.getSheet("CourseDetails");
	  
	  for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		  
		  Row r = s.getRow(i);
		  
		  for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			
			  Cell c = r.getCell(j);
			
			System.out.println(c);
			
		}
		
	}

  }
		
}
