package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase7_ProductDetail extends Amz_LaunchQuit{

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void product_details()  
	{
		Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
		searchpage.searchitems();
		
		Amz_ProducDescriptionPage productdetailpage = new Amz_ProducDescriptionPage(driver);
		productdetailpage.select_product(driver);
		
		
		
	}
	
	
}
