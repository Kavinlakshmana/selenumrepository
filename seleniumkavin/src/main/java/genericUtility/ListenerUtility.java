package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility extends Baceclass implements ITestListener {
    
	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getName();
		javalib = new JavaUtility();
		String timestamp = javalib.getSystemtime();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tem = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/"+methodname+timestamp+".png");
       try {
		FileHandler.copy(tem, des);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	

}
