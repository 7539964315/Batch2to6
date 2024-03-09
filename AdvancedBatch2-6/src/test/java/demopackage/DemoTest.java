package demopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import baseclass.BaseClass;
import fileutility.ReadExcel;
import fileutility.ReadProperty;
import genericutility.WebDriverUtility;
import objectrepository.LoginPage;


public class DemoTest{

	@Test
	public void loginTest() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String mainId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		Thread.sleep(2000);
		Set<String> allIds = driver.getWindowHandles();
		for(String id:allIds) {
			if(!(id.equals(mainId))) {
				driver.switchTo().window(id);
				String title=driver.getTitle();
				if(title.contains("YouTube")) {
					driver.close();
				}
				else {
					System.out.println(title);
				}
			}
		}
		

	}

}
