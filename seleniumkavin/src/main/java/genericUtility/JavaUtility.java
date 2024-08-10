package genericUtility;

import java.time.LocalDateTime;

public class JavaUtility {

	public String getSystemtime() {
	return	LocalDateTime.now().toString().replace(":", "-");
	}
}
