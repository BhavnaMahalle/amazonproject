package mavendemoproject.MavenProject;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

public class TestCase4_EditProfile extends Amz_LaunchQuit{

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void edit_profile_information() throws InterruptedException, EncryptedDocumentException, IOException 
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
		 
		 Amz_MnageProfilePage manage_profile = new Amz_MnageProfilePage(driver);
		 manage_profile.ho_hellowuser(driver);
		 manage_profile.clickon_manageprofile(driver);
		 manage_profile.edit_name(driver);
		 manage_profile.about_you_women();
		// manage_profile.age_group();
	}
	
	
	
}
