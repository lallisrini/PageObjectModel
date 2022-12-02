package pom.irctc.testcases;

import pom.irctc.pages.CovidAlertPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import wrappers.ProjectWrappers;

public class TC005  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify EnquiryForm";
		testCaseName= "TC005";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in";
	}
	
	@Test

	public void irctcSaloonMandatory() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.waitForPageLoad(1000)
		.clickOnmenuicon()
		.clickOnChartericon()
		.clickOnEnquiryForm()
		.enterNameOfApplicant("Prasannakrish")
		.enterNameOfOrganisation("Rorito")
		.enterAddress("ARRR Flats")
		.enterWrongMobNum("999888890")
		.enterEmailId("Prasannakrish_1808@gail.com")
		.SelectRequestForSaloon()
		.enterOriginationStation("Delhi")
		.enterDestinationStation("mumbai")
		.SelectDateOfDeparture()
		.SelectDateofArrival()
		.enterDuration("5")
		.enterNumAndTypeOfCoaches("2Tier")
		.enterNumOfPassengers("4")
		.enterPurposeOfCharter("Training")
		.enterAdditionalServices("Additional Services Required")
		.clickOnSubmit()
		.clickOnMobNumNotValidErrMsg()
		;
	}
}