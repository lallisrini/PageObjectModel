package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravels;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify  PhpTravels registration";
		testCaseName= "TC007";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
	}
	
	@Test


public void PhpTravelsRegistration() {
	new PhpTravels()
	.enterFirstName("Suresh")
	.enterLastName("kandhar")
	.enterEmailId("Suresh_kandhar@gmail.com")
	.waitForPageLoad(1000)
	//.SelectCountry()
	.enterPhoneNum("8099067854")
	.enterCompNme("Reynold")
	.enterStreetAdd("Arumugam")
	.enterStreetAdd2("Kannapan")
	.enterCity("Chennai")
	.enterState("TamilNadu")
	.enterPostCode("600117")
	.SelectCountry1()
	.enterPassword("Yastuman_67Sad")
	.enterConfirmPassword("Yastuman_67Sad")
	.clickOnGeneratePswd()
	//.clickOnCopyToClipBoard()
	//.clickOnNo()
	//.enterWhatsappNum("8900967543")
	//.clickOnRegister()
	;
}

}
