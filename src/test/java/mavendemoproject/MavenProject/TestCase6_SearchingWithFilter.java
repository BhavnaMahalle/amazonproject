package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase6_SearchingWithFilter extends Amz_LaunchQuit {

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void searching_items() throws InterruptedException 
	{
		Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
		searchpage.searchitems();
		searchpage.selectcategory(driver);
		Thread.sleep(2000);
		searchpage.selectcolour(driver);
		//Thread.sleep(2000);
		//searchpage.selectsize(driver);
	}
	
	
	
	
	
}
