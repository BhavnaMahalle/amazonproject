package mavendemoproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_HomePage {
	WebDriver driver;
	   
	 
	   @FindBy(id ="nav-link-accountList")
	   WebElement accountsandlist;
	   
	   @FindBy(linkText ="Start here.")
	   WebElement new_customer;
	   
	   @FindBy(xpath ="//span[.='Sign in']")
	   WebElement signin_botton;
	  
       public void new_registration(WebDriver driver) 
       { 
		   new_customer .click();   
		   Assert.assertEquals(driver.getTitle(), "Amazon Registration" , "Actual & Expected result not matches");	 
	   }
	   
      
       public void hoverover( WebDriver driver) {
		   //Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" ,"you are on wrong page");
		   
		   Actions a1 = new Actions(driver);
		   a1.moveToElement(accountsandlist).perform();;	   
	   }
	   
	   
       public void signin_click()
	   {
		  Assert.assertEquals(signin_botton.isDisplayed(), true ,"sign in button is not displaying");
		  signin_botton.click(); 
	   }
	    
	   public Amz_HomePage ( WebDriver driver) 
	   {
		   
		   PageFactory.initElements(driver, this);
	   }
		
}
