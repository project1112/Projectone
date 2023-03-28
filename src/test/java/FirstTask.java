import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("C:\\Users\\aaa\\MavenProject\\TestData\\Data.xlsx");
		
		FileInputStream fin=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet s=w.getSheet("course");
		
	}

}
