package mavendemoproject.MavenProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_ProducDescriptionPage {

	WebDriver driver;
	
	@FindBy(xpath = "(//span[@class='rush-component s-latency-cf-section']/div/div)[5]")
	WebElement clickonitem;
	
	@FindBy(id = "add-to-cart-button")
	WebElement addtocart;

	@FindBy(id = "buy-now-button")
	WebElement buynow_button;
	
	public void select_product(WebDriver driver) {
		clickonitem.click();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		System.out.println(parentid);
		System.out.println(parentid);
		driver.switchTo().window(childid);
		
	    boolean rating = driver.findElement(By.id("acrCustomerReviewLink")).isDisplayed();    
		Assert.assertEquals(rating, true ,"rating assertion failed");            //assertion for rating
		
		
		boolean price = driver.findElement(By.id("corePriceDisplay_desktop_feature_div")).isDisplayed();    
		Assert.assertEquals(price, true ,"assertion for price of product is failed");        
		
		boolean product_info = driver.findElement(By.xpath("//h3[.=' About this item ']")).isDisplayed();
	    Assert.assertEquals(product_info, true ,"product details not showing");	   //assertion for product information
				
	}

	public void add_to_cart(WebDriver driver) throws InterruptedException {
		//Assert.assertEquals(addtocart.isDisplayed(), true , "add to cart assertion failed");
		
		addtocart.click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Thread.sleep(2000);
		boolean actual = driver.findElement(By.xpath("//div[@class='a-section a-padding-medium sw-atc-message-section']")).isDisplayed();
	    Assert.assertEquals(actual, true ,"asssertion error :Added to cart is not displaying after additing ");
	}
	
	public void buy_now() 
	{
		Assert.assertEquals(buynow_button.isDisplayed(), true , "buy now assertion failed");
		buynow_button.click();	
	}

	public Amz_ProducDescriptionPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

}
