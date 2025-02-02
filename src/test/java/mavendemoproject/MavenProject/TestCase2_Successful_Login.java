package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_Successful_Login extends Amz_LaunchQuit {
	
	@Test(retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	 public void login() throws EncryptedDocumentException, IOException
	 {
		 Amz_HomePage homepage = new Amz_HomePage (driver);
		 homepage.hoverover(driver);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 homepage.signin_click();
		
		 DDT_Logic d1 = new DDT_Logic();
		 d1.Login_credetial();
		 
		 Amz_LoginPage login = new Amz_LoginPage(driver);
		 login.username_method(driver);
		 login.continue_button();
		 login.correct_passward();
		 login.signinForLogin(driver);
	}
		
}
