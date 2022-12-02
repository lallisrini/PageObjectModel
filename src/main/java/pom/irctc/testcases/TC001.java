package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import pom.irctc.pages.RegistrationPage;
import wrappers.ProjectWrappers;

public class TC001  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify  IRCTC registration";
		testCaseName= "TC001";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
	}
	
	@Test
	
	public void irctcRegistration() {
		
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUSerName("Lalitha123$")
		.enterPassword("Secret123$")
		.enterConfirmPassword("Secret123$")
		.SelectSecurityquestion()
		//.SelectSecurityquestion1()
		.enterSecurityanswer("AMHSS")
		.SelectPreferredlanguage1()
		.clickContinue()
		.waitForPageLoad(1000)
		.enterFirstName("pari")
		.enterMiddleName("bavani")
		.enterLastName("shankar")
		.ClickOnGender()
		.SelectDate()
		.SelectMonth()
		.SelectYear()
		.SelectOccupation()
		.chooseMaritalStatus()
		.SelectCountry()
		.enterEmailId("lallisrini@gmail.com")
		.enterMobNum("9998886668")
		.SelectNationality()
		.clickOnContinue()
		.enterflatNo("5t")
		.enterStreet("mookambika")
		.enterArea("madipakkam")
		.enterPinCode("600117")
		.enterState("TamilNadu")
		.SelectCity()
		.SelectPostOffice()
		.enterPhoneNo("8889093456")
		.CopyResidenceAsNo()
		.enterflatNo1("Arrr")
		.enterStreet1("Manikandan")
		.enterArea1("Lalbahur")
		.enterPin1("600117")
		.enterState1("TamilNadu")
		.SelectCity1()
		.SelectPostOffice1()
		.enterPhoneNo1("9098765445")
		.ClickOnCheckbox()
		;
		
		
		
	}

	private RegistrationPage SelectPreferredlanguage1() {
		// TODO Auto-generated method stub
		return null;
	}

}
