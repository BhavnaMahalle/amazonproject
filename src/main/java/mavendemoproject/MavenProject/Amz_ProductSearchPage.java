package mavendemoproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_ProductSearchPage {

 WebDriver driver;
 WebDriverWait wait;
 //Select s1;
  
 @FindBy(id = "twotabsearchtextbox")
    WebElement search;
   
   @FindBy(id = "s-result-sort-select")
   WebElement sortby;
   
   @FindBy(id = "departments")
    WebElement category;
   
   @FindBy(id = "brandsRefinements")
   WebElement brand;
   
   @FindBy(id = "p_n_size_two_browse-vebin/2022304031")
   WebElement colour;
   
   @FindBy(id = "p_n_size_browse-vebin-title")
   WebElement size;
//   @FindBy(xpath = "(//ul[@data-csa-c-content-id='91049095031']/span/span)[2]")
//   WebElement brand;
   
 
	public void searchitems() 
	{
		search.sendKeys("shoes for women" + Keys.ENTER);
		
		Assert.assertEquals(search.isDisplayed(), true ,"search asssertion failed");
	
	}
	public void sortedby_lowprice(WebDriver driver) throws InterruptedException {
		
		Select s1 = new Select(sortby);
		s1.selectByVisibleText("Price: Low to High");
		
		boolean actual = driver.findElement(By.xpath("//span[.='Price: Low to High']")).isDisplayed();
		Assert.assertEquals(actual, true ," sortby low to high assertion failed") ;
		
		wait.until(ExpectedConditions.elementToBeClickable(sortby));
		Thread.sleep(3000);
	}
	
		public void sortby_newest(WebDriver driver) throws InterruptedException {
		Select s1 = new Select(sortby);
		s1.selectByVisibleText("Newest Arrivals");
		boolean actual = driver.findElement(By.xpath("//span[.='Newest Arrivals']")).isDisplayed();
		Assert.assertEquals(actual, true ," sortby newest arrival assertion failed") ;
		
		wait.until(ExpectedConditions.elementToBeClickable(sortby));
		Thread.sleep(3000);
		}
		
		public void sortby_review(WebDriver driver) {
		Select s1 = new Select(sortby);
		s1.selectByVisibleText("Avg. Customer Review");
		wait.until(ExpectedConditions.elementToBeClickable(sortby));
		boolean actual = driver.findElement(By.xpath("//span[.='Avg. Customer Review']")).isDisplayed();
		Assert.assertEquals(actual, true ," sortby newest arrival assertion failed") ;
		}
	
	
	
	public void selectcategory(WebDriver driver) 
	{
		category.click();
		
		boolean actual = driver.findElement(By.id("nav-search-dropdown-card")).isDisplayed();   //check that category is selected or not in search bar
		System.out.println(actual);
		Assert.assertEquals(actual, true ,"assertion for category failed");	
	}
	
//	public void selectbrand(WebDriver driver) 
//	{
//		
//		wait.until(ExpectedConditions.elementToBeClickable(brand));
//		brand.click();
		//Assert.assertEquals(brand.isSelected(), true ,"assertion for brand failed");	
//	}
	
	public void selectcolour(WebDriver driver) 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(colour));
		colour.click();
		//Assert.assertEquals(colour.isSelected(), true ,"assertion for color failed");	
	}
	
	public void selectsize(WebDriver driver) 
	{
		
		wait.until(ExpectedConditions.elementToBeClickable(size));
		size.click();
		
	}
	 public Amz_ProductSearchPage ( WebDriver driver) 
	   {
		 this.driver = driver;
		 //this.s1 = new Select(sortby);
		 this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));   
		 
		 PageFactory.initElements(driver, this);
	   }
}
