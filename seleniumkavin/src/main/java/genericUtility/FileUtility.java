package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
     public String getdatafromproperty(String key) throws IOException {
    	 FileInputStream file=new FileInputStream("./src/test/resources/CommonData.Properties");
    	 Properties prop=new Properties();
    	 prop.load(file);
    	 return prop.getProperty(key);
     }
}
