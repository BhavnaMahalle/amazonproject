package mavendemoproject.MavenProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_MnageProfilePage {
	
	WebDriver driver;
	
	   @FindBy(id ="nav-link-accountList-nav-line-1")
	   WebElement hellowuser;
	   
	   @FindBy(xpath ="//button[.='Manage Profiles']")
	   WebElement click_manageprofile;
	 
	   @FindBy(linkText ="View")
	   WebElement click_view;
	
	   @FindBy(xpath ="//button[@class='edit-pencil-icon-button']")
	   WebElement clickon_pencil;
	   
	   @FindBy(id ="editProfileNameInputId")
	   WebElement editname ;
	   
	   @FindBy(id ="editProfileContinueButton")
	   WebElement continue_button;
	   
	   @FindBy(xpath ="//span[.='Your Orders']")
	   WebElement yourorder;
	   
	   @FindBy(id ="accordion-preferred-department-id")
	   WebElement pre_department;
	  
	   @FindBy(xpath ="(//button[@class='attribute-action'])[1]")
	   WebElement add_button;
	 
	   @FindBy(xpath ="//button[.='Women']")
	   WebElement add_women;
	   
	   @FindBy(xpath ="//div[@class='inline-button-container desktop']")
	   WebElement save_gender;
	 
	   @FindBy(id ="accordion-age-group-id")
	   WebElement agegroup;

	   @FindBy(xpath ="(//button[@class='attribute-action'])[3]")
	   WebElement add_age;
	   
	   @FindBy(xpath ="(//button[@class='text-option  '])[4]")
	   WebElement select_age;
	   
	   @FindBy(xpath ="//div[@class='inline-button-container desktop']")
	   WebElement save_age;
	   
	   @FindBy(xpath ="//button[.='Clear']")
	   WebElement clear;
	   
	   @FindBy(xpath ="//span[.='Yes, clear my data']")
	   WebElement yes_clear_gender;
	   
	   @FindBy(xpath ="//span[.='Yes, clear my data']")
	   WebElement yes_clear_age;
	
	 
	public void ho_hellowuser(WebDriver driver) 
	    {
		  Actions a1 = new Actions(driver);
		  a1.moveToElement(hellowuser).perform(); 
		   
	    }
	public void clickon_manageprofile(WebDriver driver) throws InterruptedException 
	   {
		click_manageprofile.click();
		click_view.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Profile Hub", "edit profile page not visible");
	   }
	public void edit_name(WebDriver driver) throws InterruptedException 
	{
		
		clickon_pencil.click();
		editname.sendKeys(Keys.COMMAND + "a");
		editname.sendKeys(Keys.COMMAND + "x");
		Thread.sleep(2000);
		editname.sendKeys("Bhavna Mahalle");
		
		//driver.switchTo().alert().sendKeys("Bhavna Mahalle");
		continue_button.click();
	}
	
	public void about_you_women() throws InterruptedException {
		
		
		Thread.sleep(1000);
		pre_department.click();	
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		yes_clear_gender.click();
		Thread.sleep(1000);
		add_button.click();
		Thread.sleep(1000);
		add_women.click();
		save_gender.click();
		Thread.sleep(1000);
		
		
	}
	
//	public void age_group() throws InterruptedException {
//		
//		agegroup.click();
//		Thread.sleep(1000);
//		clear.click();
//		Thread.sleep(2000);
//		yes_clear_age.click();
//		Thread.sleep(1000);
//		add_age.click();
//		select_age.click();
//		save_age.click();
//		
//	}
	public void your_order(WebDriver driver) {
		
		yourorder.click();
		Assert.assertEquals(driver.getTitle(), "Your Orders" , "page not found");
	}
	
	 public Amz_MnageProfilePage ( WebDriver driver) 
	   {
		   
		   PageFactory.initElements(driver, this);
	   }
	
	
}
