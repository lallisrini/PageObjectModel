package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;

import wrappers.ProjectWrappers;

public class TC003  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify Book a coach";
		testCaseName= "TC003";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
	}
	
	@Test

	public void irctcHotelRegistration() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.waitForPageLoad(1000)
		.clickOnLounge()
		/*.clickOnLogin()
		.clickOnGuestUsericon()
		.enteremailid("karan_19@gmail.com")
		.entermobilenum("9900856789")
		.clickOnsignin()
		.entercityname("chennai")
		.clickOncheckin()
		.waitForPageLoad(1000)
		.clickOncheckindate()
		.clickOncheckout()
		.clickOncheckoutdate()
		.clickOnguestroom()
		.clickOnguestroomNum()
		.clickOnDone()
		.clickOnfindhotel()
		.clickOnfirsthotel()
		.clickOnfirsthotelName()
		.clickOnfirsthotelprice()
		.clickOnContinue()
		.SelectTitle()
		.enterFirstName("kamal")
		.enterLastName("Hasan")
		.SelectState()
		.enterPhonenumber("99977787650")
		.enteremailId("kamal_hasan@gmail.com")
		.SelectGst()
		.enterGstNum("56789")
		.entercompanyName("rorito")
		.entercompanyaddress("perungudi")
		.VerifytheErrorMessage()
	     .clickContinue()*/
	;
		
		
		

	}
}
