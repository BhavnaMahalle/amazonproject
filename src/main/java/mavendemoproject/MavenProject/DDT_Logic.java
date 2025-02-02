package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class DDT_Logic {
	

	public static String username;
	public static String correct_pw;
	public static String incorrect_pw;
	public static String registration_pw;
	public static String register_mob;
	
	//for correct login
	public void Login_credetial() throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream f1 = new FileInputStream("/Users/surajmahalle/Bhavna/bhavna-workspace/MavenProject/Amz_ddt/Amz_Project1_DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);	
		
		username = NumberToTextConverter.toText(w1.getSheet("login credentials").getRow(1).getCell(0).getNumericCellValue());
		//System.out.println(username);
		
		correct_pw = w1.getSheet("login credentials").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(correct_pw);
	}
		
		
	//for incorrect
	public void incorrect_credetial() throws EncryptedDocumentException, IOException 
		{
			
		FileInputStream f1 = new FileInputStream("/Users/surajmahalle/Bhavna/bhavna-workspace/MavenProject/Amz_ddt/Amz_Project1_DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);		
			
			
	    incorrect_pw = w1.getSheet("login credentials").getRow(2).getCell(1).getStringCellValue();
		//System.out.println(incorrect_pw);
		}
		
		
		//for registration
		public void registration_credetial() throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("/Users/surajmahalle/Bhavna/bhavna-workspace/MavenProject/Amz_ddt/Amz_Project1_DDT.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);	
			
		registration_pw = w1.getSheet("login credentials").getRow(3).getCell(1).getStringCellValue();
		//System.out.println(registration_pw);
		
		register_mob = NumberToTextConverter.toText(w1.getSheet("login credentials").getRow(3).getCell(0).getNumericCellValue());
		//System.out.println(register_mob);
		}
	}
	

