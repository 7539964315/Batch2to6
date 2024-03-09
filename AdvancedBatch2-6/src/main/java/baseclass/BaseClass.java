package baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import fileutility.ReadProperty;
import listnerimplimentation.ListnerClass;
import objectrepository.LoginPage;

public class BaseClass extends ListnerClass{

	public WebDriver driver;
	
	public static WebDriver sdriver;
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		String browser=System.getProperty("browser");
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		sdriver=driver;
		driver.manage().window().maximize();
		ReadProperty properties=new ReadProperty();
		String url=properties.fetchProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		Reporter.log("Browser Opened and navigated successfully", true);
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser Closed successfully", true);
	}
	@BeforeMethod(alwaysRun = true)
	public void login() {
		ReadProperty properties=new ReadProperty();
		String username=properties.fetchProperty("username");
		String password=properties.fetchProperty("password");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys(username);
		loginPage.getPasswordTextField().sendKeys(password);
		loginPage.getLoginButton().click();
		Reporter.log("Logged in successfully", true);
	}
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("Logged out successfully", true);
	}
	
}
