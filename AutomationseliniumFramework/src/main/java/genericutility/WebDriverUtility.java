package genericutility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	Actions act;
	public WebDriverUtility(WebDriver driver) {
		act=new Actions(driver);
		
	}
	public void doubleclick(WebElement element) {
		act.doubleClick(element).perform();
	}
	
	public void clickandhold(WebElement element) {
		act.clickAndHold(element).perform();
	}
	
	public void MouseHover(WebElement element) {
		act.moveToElement(element).perform();
	}
	
	public void scrolltoelement(WebElement element) {
		act.scrollToElement(element).perform();
	}
	
	public void switchtowindow(WebDriver driver,String expectedurl) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds) {
			String acturl = driver.switchTo().window(id).getCurrentUrl();
			if(acturl.contains(expectedurl)) {
				break;
			}
		}
	}
	
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	public Alert SwitchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
		
	}

}
