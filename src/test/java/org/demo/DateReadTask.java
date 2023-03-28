package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateReadTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File excelLoc= new File("C:\\Users\\aaa\\Maven\\TestData\\Sample.xlsx");

		FileInputStream stream=new FileInputStream(excelLoc);

		Workbook w=new XSSFWorkbook(stream);

		Sheet s = w.getSheet("CourseDetails");

		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r = s.getRow(i);


			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if(type==1)
				{
					String str = c.getStringCellValue();
					System.out.println(str);
				}if(type==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						String dateformat = new SimpleDateFormat("dd-MM-yyyy") .format(c.getDateCellValue());
						System.out.println(dateformat);
					}
					else
					{

						String valueOf = String.valueOf((long) c.getNumericCellValue());
						System.out.println(valueOf);
					}



				}
			}


		}

	}

}
