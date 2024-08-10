package books;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.Baceclass;
import genericUtility.ExcelUtility;
import genericUtility.ListenerUtility;
import objectRepository.HomePage;
@Listeners(ListenerUtility.class)
public class Tc_DWs_005_Test extends Baceclass {
    @Test
    public void clickonBooks() throws EncryptedDocumentException, IOException {
    	hp=new HomePage(driver);
    	hp.getBookslinktext().click();
    	excellib=new ExcelUtility();
    	String actualtitle = driver.getTitle();
    	Object expectedtitle = excellib.getStringDataFromExcel("Books",1, 0);
    	Assert.assertEquals(actualtitle, expectedtitle,"Book page not displayed");
    	Reporter.log("book page is displayed",true);
    }
	
}
