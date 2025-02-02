package mavendemoproject.MavenProject;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_EntreCardDetailPage {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(name = "ApxSecureIframe")
	WebElement iframe_entry;

	@FindBy(name = "addCreditCardNumber")
	WebElement card_no;

	@FindBy(name = "ppw-accountHolderName")
	WebElement nickname;

	@FindBy(name = "ppw-expirationDate_month")
	WebElement month;

	@FindBy(name = "ppw-expirationDate_year")
	WebElement year;

	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement enterbutton;
	
	@FindBy(name="ppw-widgetEvent:CancelAddCreditCardEvent")
	WebElement cancel_button;

	public void Entre_Card_details(WebDriver driver) {

		driver.switchTo().frame(iframe_entry);
      
		wait.until(ExpectedConditions.elementToBeClickable(card_no));
		card_no.sendKeys("5006744339813458");

		
		wait.until(ExpectedConditions.elementToBeClickable(nickname));

		nickname.clear();
		nickname.sendKeys("Bhavi");
		
		wait.until(ExpectedConditions.elementToBeClickable(month));
		Select s1 = new Select(month);
		s1.selectByIndex(4);;
	
		wait.until(ExpectedConditions.elementToBeClickable(year));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2030");
		
		wait.until(ExpectedConditions.elementToBeClickable(enterbutton));
		enterbutton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(cancel_button));
		cancel_button.click();
		//driver.switchTo().defaultContent();
	}

	public Amz_EntreCardDetailPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait (driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);

	}

}
