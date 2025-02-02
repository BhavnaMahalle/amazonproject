package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase5_SearchingProduct extends Amz_LaunchQuit{

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)
	public void searching_items() 
	{
		Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
		searchpage.searchitems();
		
	}
	
	
	
}
