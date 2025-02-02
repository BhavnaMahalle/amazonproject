package mavendemoproject.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_LoginPage extends DDT_Logic {
	WebDriver driver;
	  
	   @FindBy(id ="ap_email")
	   WebElement enter_username;
	   
	   @FindBy(id ="continue")
	   WebElement continue_botton;
	  
	   @FindBy(id ="ap_password")
	   WebElement enter_passward;
	   
	   @FindBy(id ="signInSubmit")
	   WebElement signin_button;
	   
	   @FindBy(xpath ="(//span[@class='a-truncate'])[2]")
	   WebElement deals;
	   
	   public void username_method(WebDriver driver) 
	   { 
		   Assert.assertEquals(driver.getTitle(), "Amazon Sign In", "Actual & Expected title is not matched");
		  
		   enter_username.sendKeys(username);
	   }
	   
	   public void continue_button() {
		
		   continue_botton.click();
	   }
	   
	   public void correct_passward() {
		   
		   enter_passward.sendKeys(correct_pw);
	   }
	   
//	   public void passward_method(String password)     //method overloading to sent diff password
//	   {
//		    enter_passward.sendKeys(password);
//	
//	   } 
       public void incorrect_passward() {
		   
		   enter_passward.sendKeys(incorrect_pw);
	   }
	   
	   
	   public void signinForLogin(WebDriver driver) 
	   { 
		  signin_button.click();
		  WebElement actual= driver.findElement(By.xpath("//span[.='Hello, Bhavna']"));
		  Assert.assertEquals(actual.isDisplayed(), true , "signin is not successful");
	   }
	   
	   public void signinForInvalidLogin(WebDriver driver) 
	   { 
		  signin_button.click();
		  String actual= driver.findElement(By.xpath("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none']")).getText();
		  Assert.assertEquals(actual, "Your password is incorrect" ,"test case fails because of assertion");
	   }
	   
	   public void apply_coupan() {
		   
		   deals.click();
	   }
	   public Amz_LoginPage( WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }
	 
	   
}


