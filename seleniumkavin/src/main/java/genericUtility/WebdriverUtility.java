package genericUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebdriverUtility {
	Actions act;
	public WebdriverUtility(WebDriver driver) {
       act=new Actions(driver);
	}
	public void doubleclick(WebElement element) {
		act.doubleClick(element).perform();
	}
	public void draganddrop(WebElement source,WebElement target) {
		act.dragAndDrop(source, target).perform();
	}
	public void scrollToElement(WebElement element) {
		act.scrollToElement(element).perform();
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	
	public void switchToWindow(WebDriver driver,String url) {
		Set<String> allwindow = driver.getWindowHandles();
		for (String string : allwindow) {
			String acturl = driver.switchTo().window(string).getCurrentUrl();
			if(acturl.contains(url)) {
				break;
			}
		}
	}

}
