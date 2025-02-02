package mavendemoproject.MavenProject;

import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestCase3_IncorrectPassword extends Amz_LaunchQuit{

	
	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void login() throws EncryptedDocumentException, IOException
	 {
		
		 Amz_HomePage homepage = new Amz_HomePage (driver);
		 homepage.hoverover(driver);
		 homepage.signin_click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 DDT_Logic d1 = new DDT_Logic();
		 d1.incorrect_credetial();
			
		 Amz_LoginPage login = new Amz_LoginPage(driver);
		 login.username_method(driver);
		 login.continue_button();
		 login.incorrect_passward();
		 login.signinForInvalidLogin(driver);
	}
}
