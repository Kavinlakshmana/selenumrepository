package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	@FindBy(id="Email")
	private WebElement emailtextfield;

	@FindBy(id="Password")
	private WebElement Passwordtextfield;

	@FindBy(xpath="//input[@value=\"Log in\"]")
	private WebElement loginbutton;

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return Passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	
	
}
