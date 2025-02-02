package mavendemoproject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_FestivalDealsPage {

	WebDriver driver;

	@FindBy(xpath = "(//div[@class='GridRow-module__container_q6XsDi4clqdE6jhYFSBW']/div/div)[8]")
	WebElement selectproduct;
	
	public void select_product() {
		
		selectproduct.click();
		
	}
	 public Amz_FestivalDealsPage( WebDriver driver) {
		   
		   PageFactory.initElements(driver, this);
	   }
}
