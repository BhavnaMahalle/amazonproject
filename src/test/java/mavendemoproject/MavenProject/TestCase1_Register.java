package mavendemoproject.MavenProject;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TestCase1_Register extends Amz_LaunchQuit {

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)

	public void Registration() throws InterruptedException, EncryptedDocumentException, IOException 
	{   
		
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.hoverover(driver);
		homepage.new_registration(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DDT_Logic d1 = new DDT_Logic();
		d1.registration_credetial();
		
		Amz_RegistrationPage register = new Amz_RegistrationPage(driver);
		register.customer_name();
		register.phone_number();
		register.password();
		register.varify_number(driver);
		
		
	}
}
