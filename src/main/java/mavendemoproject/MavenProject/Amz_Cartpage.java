package mavendemoproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_Cartpage {
	WebDriver driver;	
	WebDriverWait wait;
	
	@FindBy(id ="nav-cart-count-container")
	WebElement veiwcart;
	
	@FindBy(id ="quantity")
	WebElement increasequntity;
	
	@FindBy(xpath ="//input[@value='Delete']")
	WebElement deleteitem;
	
	public void  veiw_cart() 
	{
		veiwcart.click();	
	}
	
	public void update_quantity() 
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(increasequntity));
		Select s1=new Select(increasequntity);
		s1.selectByIndex(3);		
	}
	
	public void remove_product() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(deleteitem));
		deleteitem.click();	
	}
	
	public Amz_Cartpage(WebDriver driver) {
		this.wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
}
