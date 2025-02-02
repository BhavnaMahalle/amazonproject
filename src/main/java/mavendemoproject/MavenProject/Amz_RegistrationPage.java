package mavendemoproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class Amz_RegistrationPage extends DDT_Logic{
//1
	
	WebDriver driver;
	
	@FindBy(name = "customerName")
	WebElement name;
	
	@FindBy(id = "ap_phone_number")
	WebElement mobile_number ;
	
	@FindBy(id = "ap_password")
	WebElement pass ;
	
	@FindBy(id = "continue")
	WebElement check_number ;
	
	
	
	//2
	
	public void customer_name () 
	{
		name.sendKeys("Amy");	
	}
	
	public void phone_number() 
	{
		mobile_number.sendKeys(register_mob);	
			
	}
	
	public void password() 
	{
		pass.sendKeys(registration_pw);
		
	}
	
	public void varify_number(WebDriver driver) throws InterruptedException 
	{
		check_number.click();
		Thread.sleep(3000);
		//Assert.assertEquals(driver.getTitle(), "Authentication required", "registration page assertion failed");
	}
	
	 public Amz_RegistrationPage ( WebDriver driver) 
	   { 
		   PageFactory.initElements(driver, this);
	   }
}


