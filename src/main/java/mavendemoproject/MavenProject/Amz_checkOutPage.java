package mavendemoproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Amz_checkOutPage {

	WebDriver driver;
	
	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceeedtobuy;
	
	@FindBy(xpath = "(//input[@name='submissionURL'])[2]")
	WebElement address_checkbox;
	
	@FindBy(id ="shipToThisAddressButton")
	WebElement use_address;		
	
	@FindBy(xpath ="//input[@value='SelectableAddCreditCard']")
	WebElement creditcard_chechbox;
	
	@FindBy(xpath ="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")
	WebElement net_banking;
	
	@FindBy(id ="pp-SFfsrh-125")
	WebElement otherupi;
	
	@FindBy(xpath ="//input[@value='instrumentId=EMI&isExpired=false&paymentMethod=CC&tfxEligible=false']")
	WebElement emi;
	
	@FindBy(xpath ="//input[@value='instrumentId=0h_PE_CUS_18b1c868-2e63-40e2-8b24-414fe05d88c8%2FCash&isExpired=false&paymentMethod=COD&tfxEligible=false']")
	WebElement cashon;
	
	@FindBy(partialLinkText ="Enter card details")
	WebElement entre_card_details;
	
	@FindBy(id ="pp-Qfb11E-96")
	WebElement coupancode;
	
	@FindBy(id ="pp-Qfb11E-97")
	WebElement apply;
	
	public void proceed_to_buy() throws InterruptedException 
	{
		proceeedtobuy.click();	
		Thread.sleep(1000);
	}
	
	public void select_address() throws InterruptedException 
	{
		address_checkbox.click();
		Thread.sleep(1000);
		use_address.click();	
	}
	
	public void payment_mode()
	{	
		creditcard_chechbox.click();
	}
	
	public void netbanking()
	{	
		net_banking.click();
	}
	
	public void other_upi()
	{	
		otherupi.click();
	}
	
	public void emi_payment()
	{	
		emi.click();
	}
	
	public void cashon_delivery()
	{	
		cashon.click();
	}
	
	public void entre()	{
	
	entre_card_details.click();	
	
	}
	
	public void entre_coupanncode()	{
		try {
		coupancode.sendKeys("APPLY04");
		apply.click();
		String actual = driver.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText();
		System.out.println(actual);
		Assert.assertEquals(actual, "The promotional code you entered is not valid." , "Assertion for promotion code failed");
		
		}
		catch(Exception e){
			
			System.out.println("Giving Exception");
		}
		
		}
	
	public Amz_checkOutPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	
	
	
}
