package mavendemoproject.MavenProject;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_Logic implements IRetryAnalyzer {
	
	int count = 0;              //declare variable globally
	int retrycount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(count < retrycount) {
			
			count++;
			return true;
		}
		
		return false;
		
	}

	
	
}
