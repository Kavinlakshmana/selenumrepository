package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.HomePage;
import objectRepository.Loginpage;
import objectRepository.WelcomePage;

public class Baceclass {
     public static WebDriver driver;
     public static FileUtility filelib;
     public static ExcelUtility excellib;
     public static JavaUtility javalib;
     
     public WelcomePage wp;
     public Loginpage lp;
     public HomePage hp;
	@BeforeClass
	public void navigatetobrowser() throws IOException{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		filelib=new FileUtility();
		String url = filelib.getdatafromproperty("url");
		driver.get(url);
		
	}
	@BeforeMethod
	public void login() throws IOException {
		wp=new WelcomePage(driver);
	     wp.getLoginlink().click();
	     lp=new Loginpage(driver);
	    lp=new Loginpage(driver);
	    lp.getEmailtextfield().sendKeys(filelib.getdatafromproperty("email"));
	    lp.getPasswordtextfield().sendKeys(filelib.getdatafromproperty("password"));
	    lp.getLoginbutton().click();
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
		hp.getLogoutlinktext().click();
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}
