package mavendemoproject.MavenProject;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

public class TestCase10_UpdateCartItem extends Amz_LaunchQuit {

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
		 
		 Amz_Cartpage updatecart = new Amz_Cartpage(driver);
		 updatecart.veiw_cart();
		 Thread.sleep(1000);
		 updatecart.update_quantity();
		 Thread.sleep(2000);
		 updatecart.remove_product();
	
	
	
	}	
}
