package mavendemoproject.MavenProject;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

public class TestCase13_ApplyCoupan extends Amz_LaunchQuit{

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void apply_for_coupan() throws InterruptedException, EncryptedDocumentException, IOException 
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
		 login.apply_coupan();
		 
//		 Amz_FestivalDealsPage deals = new Amz_FestivalDealsPage(driver);
//		 deals.select_product();
		 
//		 Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
//		 searchpage.searchitems();
//		 
//		 Amz_ProducDescriptionPage productdetailpage = new Amz_ProducDescriptionPage(driver);
//		 productdetailpage.select_product(driver);
//		 productdetailpage.add_to_cart(driver);
//		 
//		 Amz_checkOutPage paymentprocess = new Amz_checkOutPage(driver);
//		 paymentprocess.proceed_to_buy();
//		 paymentprocess.select_address();
//		 paymentprocess.entre_coupanncode();
		 
		 
	
	}	
}
