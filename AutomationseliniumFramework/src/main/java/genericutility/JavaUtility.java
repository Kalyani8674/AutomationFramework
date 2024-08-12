package genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
	//java logics
	public String getsystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}
