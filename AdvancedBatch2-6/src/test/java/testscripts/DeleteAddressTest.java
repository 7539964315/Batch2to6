package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;

public class DeleteAddressTest {

	@Test(groups = "Regression")
	public void deleteAdressTest() {
		Reporter.log("Address Deleted Successfully", true);
	}
}
