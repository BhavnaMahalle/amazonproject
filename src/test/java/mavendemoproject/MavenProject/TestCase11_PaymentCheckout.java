package mavendemoproject.MavenProject;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

public class TestCase11_PaymentCheckout extends Amz_LaunchQuit {

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void add_to_cart() throws InterruptedException, EncryptedDocumentException, IOException 
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
		 
		 Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
		 searchpage.searchitems();
		
		 Amz_ProducDescriptionPage productdetailpage = new Amz_ProducDescriptionPage(driver);
		 productdetailpage.select_product(driver);
		 productdetailpage.add_to_cart(driver);
		 //productdetailpage.buy_now();
		 Thread.sleep(2000);
		 
		 Amz_checkOutPage paymentprocess = new Amz_checkOutPage(driver);
		 paymentprocess.proceed_to_buy();
		 paymentprocess.select_address();
		 paymentprocess.payment_mode();
		 paymentprocess.entre();
	
		  
		 Amz_EntreCardDetailPage carddetails = new Amz_EntreCardDetailPage(driver);
		 carddetails.Entre_Card_details(driver);
}
}