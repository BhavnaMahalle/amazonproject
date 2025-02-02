package mavendemoproject.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Amz_OrderHistoryPage {
	
	WebDriver driver;
	
	@FindBy(id = "time-filter")
	WebElement old_orders ;
	
	@FindBy(id = "a-autoid-4-announce")
	WebElement writereview ;
	
	public void orders_placed() 
	{
		Select s1 = new Select(old_orders);
		s1.selectByValue("year-2022");	
	}
	
	public void product_review(WebDriver driver) 
	{	
		writereview.click();
		WebElement actual = driver.findElement(By.xpath("//span[@class='a-color-error ryp__icon-alert__text']"));
		Assert.assertEquals(actual.getText(), "We apologize but this account has not met the minimum eligibility requirements to write a review. If you would like to learn more about our eligibility requirements, please see our community guidelines.", "Test case fail");
	}
	
	 public Amz_OrderHistoryPage ( WebDriver driver) 
	   {
		   
		   PageFactory.initElements(driver, this);
	   }	

}
