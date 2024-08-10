package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
     PageFactory.initElements(driver, this);
	
	}

	@FindBy(linkText = "Log out")
	private WebElement Logoutlinktext;
	@FindBy(partialLinkText = "Books")
	private WebElement Bookslinktext;
	

	public WebElement getBookslinktext() {
		return Bookslinktext;
	}


	public WebElement getLogoutlinktext() {
		return Logoutlinktext;
	}
	
	
}
