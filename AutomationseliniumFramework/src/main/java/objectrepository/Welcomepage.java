package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	//initialization
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//	declaration
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(linkText = "//span[text()='Shopping cart']")
	private WebElement shoppingcartlink;
	
	@FindBy(linkText = "//span[text()='Wishlist']")
	private WebElement wishlistlink;

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getShoppingcartlink() {
		return shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return wishlistlink;
	}
	
	

}

