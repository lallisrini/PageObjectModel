package pom.irctc.testcases;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;

import wrappers.ProjectWrappers;

public class TC004  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify IRCTC OTP validation";
		testCaseName= "TC004";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
	}
	
	@Test


	public void irctcOTPValidation() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.waitForPageLoad(1000)
		.clickOnLogin()
		.clickOnGuestUsericon()
		.enteremailid("Ram_11@gmail.com")
		.entermobilenum("9900789065")
		.clickOnsignin()
		.entercityname("chennai")
		.clickOncheckin()
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
		.enterFirstName("Ram")
		.enterLastName("Kumar")
		.SelectState()
		.enterPhonenumber("99977787650")
		.enteremailId("Ram_Kumar@gmail.com")
        .SelectGstasNo()
        .clickContinue()
        .GetHotelNameAndCompare()
        .GetTheAmountAndCompare()
        .clickOnAgree()
        .clickOnMakePayment()
        .clickOnVerifyPopUP()
        .verifyOtpFieldIsRequiredMessage()
        ;
	}
}
