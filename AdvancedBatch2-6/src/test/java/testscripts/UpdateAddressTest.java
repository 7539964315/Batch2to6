package testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;

public class UpdateAddressTest  {

	@Test(groups = "Smoke")
	public void updateAdressTest() {
		Reporter.log("Address Updated Successfully", true);
	}
}
