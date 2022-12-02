package pom.irctc.testcases;

import pom.irctc.pages.CovidAlertPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import wrappers.ProjectWrappers;

public class TC006  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify Book a coach";
		testCaseName= "TC006";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
	}
	
	@Test

	public void irctcBookYourCoach() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.clickOnmenuicon()
		.clickOnBookYourCoach()
		.clickOnSignUp()
		.enterUserId("raman")
		.enterPassword("Keerthu_1906")
		.enterConfirmPswd("Keerthu_1906")
		.SelectSequrityQues()
		.enterSecurityAns("cat")
	    .SelectDOBDate()
	    .SelectDOBMonth()
	    .SelectDOBYear()
	    .chooseGender()
	    .ChooseMaritalStatus()
	    .enterEmailId("raman_laksh@gmail.com")
	    .selectOccupation()
	    .enterFirstName("ram")
	    .enterMiddleName("laksh")
	    .enterLastName("manan")
	    .selectNationality()
	    .enterFlat("Arrrns")
	    .enterStreet("kannapan")
	    .enterArea("Thalamboo")
	    .selectCountry()
	    .enterMobNum("9865383377")
	    .enterPinCode("600117")
	    .selectCity()
	    .selectState()
	    .selectPostOffice1()
	    .ClickOfficeAddressAsNo()
	    .enterFlatDoor("2c3")
	    .enterStreetLane("Murugan")
	    .enterAreaLocality("Mookambika")
	    .selectCountryOff()
	    .enterMobileNumber("9865383389")
	    .enterPincodeoff("600028")
	    .selectcityoff()
	    .selectStateOffice()
	    .selectPostOffice2()
	    ;
	}
}
