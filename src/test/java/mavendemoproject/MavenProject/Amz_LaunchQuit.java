package mavendemoproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

@Listeners(mavendemoproject.MavenProject.Listner_Screenshot.class)

public class Amz_LaunchQuit extends Listner_Screenshot   {
	
	//ChromeDriver driver;        
	
	@BeforeMethod 
	
	public void launch_browser() throws InterruptedException 
	{
		   ChromeOptions options  = new ChromeOptions();   //headlessmode
		    options.addArguments("--headless"); 
		    
		    
		    driver = new ChromeDriver (options);
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		 
	}
	
	@AfterMethod 
	public void quit() throws InterruptedException 
	{
		
		Thread.sleep(9000);
		driver.quit();
		
	}
	
}

//	WebDriver driver;
//	@BeforeMethod
//	@Parameters("browser")
//	
//	public void parallel_testing(String nameofbrowser) {
//		
//		if(nameofbrowser.equalsIgnoreCase("chrome"))        
//		{
//			driver= new ChromeDriver();	
//		}
//		
//		if(nameofbrowser.equalsIgnoreCase("firefox")) 
//		{
//			driver= new FirefoxDriver();	
//		}
//		
//		driver.get("https://www.amazon.in/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}	
//	
//	@AfterMethod 
//	public void quit() throws InterruptedException 
//	{
//		
//		Thread.sleep(5000);
//		driver.quit();
//		
//	}	
	

