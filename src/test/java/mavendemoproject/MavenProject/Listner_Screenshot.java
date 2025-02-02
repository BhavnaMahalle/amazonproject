package mavendemoproject.MavenProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner_Screenshot implements ITestListener {
	
	 static ChromeDriver driver;
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
         
		Reporter.log("My Test Case is Passed");
		
		
		TakesScreenshot t1 = driver;
		System.out.println(driver);
		File source =t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/surajmahalle/Bhavna/bhavna-workspace/MavenProject/Amz_PassedTests/pass"+ Math.random()+".png");
	    try {
			FileHandler.copy(source, destination);
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		Reporter.log("My Test Case is failed");
		
		TakesScreenshot t1 = driver;
	File source =	t1.getScreenshotAs(OutputType.FILE);
	File destination = new File("/Users/surajmahalle/Bhavna/bhavna-workspace/MavenProject/Amz_FailedTests/fail"+ Math.random() + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		
		
			
	}	
	
}
