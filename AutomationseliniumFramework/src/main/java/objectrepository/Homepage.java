package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;
	
	
	public WebElement getBookslink() {
		return bookslink;
	}


	public WebElement getLogoutlink() {
		return logoutlink;
	}
	
}
