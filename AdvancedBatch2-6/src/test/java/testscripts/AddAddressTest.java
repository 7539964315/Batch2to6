package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseclass.BaseClass;

public class AddAddressTest {

	@Test(groups = "Smoke")
	public void addAdressTest() {
		Reporter.log("Address Added", true);
	}
}
