package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Log in")
	private WebElement loginlink;
	
	@FindBy(linkText="Register")
	private WebElement registerlink;
	
	@FindBy(linkText="Shopping cart")
	private WebElement Shoppingcartlink;

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getShoppingcartlink() {
		return Shoppingcartlink;
	}
	
	
	
}
