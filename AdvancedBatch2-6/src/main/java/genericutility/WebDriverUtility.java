package genericutility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public void sendText(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public String fetchTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	public String fetchUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void sendTextToAlert(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	public String fetchAlertText(WebDriver driver) {
		String alertText=driver.switchTo().alert().getText();
		return alertText;
	}
	
	public void selectOptionByIndex(WebElement element, int index) {
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOptionByValueAttribute(WebElement element, String value) {
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOptionByVisibleText(WebElement element, String visibleText) {
		Select sel=new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	
	
	
}
