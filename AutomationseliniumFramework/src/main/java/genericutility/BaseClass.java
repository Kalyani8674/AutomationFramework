package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.Homepage;
import objectrepository.Loginpage;
import objectrepository.Welcomepage;

public class BaseClass
{
	public static WebDriver driver;
	
	public FileUtility filelib;
	public JavaUtility javalib;
	public ExcelUtility excellib;
	
	public Welcomepage wp;
	public Loginpage lp;
	public Homepage hp;
	@BeforeClass
	public void launchbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		filelib=new FileUtility();
		String url = filelib.getDataFromProperty("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		wp=new Welcomepage(driver);
		wp.getLoginlink().click();
		lp=new Loginpage(driver);
		String email = filelib.getDataFromProperty("email");
		String password = filelib.getDataFromProperty("password");
		lp.getEmailtextfield().sendKeys(email);
		lp.getPasswordtextfield().sendKeys(password);
		lp.getLogginbutton().click();
	}
	@AfterMethod
	public void logout()
	{
		hp = new Homepage(driver);
		hp.getLogoutlink().click();
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	

}
