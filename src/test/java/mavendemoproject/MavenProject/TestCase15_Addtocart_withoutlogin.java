package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase15_Addtocart_withoutlogin extends Amz_LaunchQuit {
	
	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	
	public void product_details() throws InterruptedException  
	{
		Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
		searchpage.searchitems();
		
		Amz_ProducDescriptionPage productdetailpage = new Amz_ProducDescriptionPage(driver);
		productdetailpage.select_product(driver);
		productdetailpage.add_to_cart(driver);
		
}
}