package mavendemoproject.MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestCase8_SortedBy extends Amz_LaunchQuit {

	@Test (retryAnalyzer = mavendemoproject.MavenProject.IRetry_Logic.class)

	public void sortedby() throws InterruptedException {

		Amz_ProductSearchPage searchpage = new Amz_ProductSearchPage(driver);
		searchpage.searchitems();
		searchpage.sortedby_lowprice(driver);
		searchpage.sortby_newest(driver);
		searchpage.sortby_review(driver);

	}
}
