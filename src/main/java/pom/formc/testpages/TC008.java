package pom.formc.testpages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.formc.pages.FormcSignUpPage;
import wrappers.ProjectWrappers;

public class TC008  extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify  FormC registration";
		testCaseName= "TC008";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="http://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC008";
	}
	
	@Test(dataProvider="fetchData")

	public void FormCRegistration() {
		new FormcSignUpPage()
		.clickOnSignUp()
		.enterUserId("Umaviswanathan2345")
		.enterPassword("keerthukrish1918")
		.waitForPageLoad(3000)
	    .enterConfirmPassword("keerthukrish1918")
		.waitForPageLoad(4000)
		.SelectSecurityQn()
		.SelectSecurityQn1()
		.enterSecurityAns("ramu")
		.enterName("Uma")
		.SelectGender()
		.enterDOB("03/06/1965")
		.enterDesignation("Photographer")
		.enterEmailID("keerthukrish@gmail.com")
		.enterAccoMobileNum("9098765432")
		.enterPhoneNo("044234567897")
		.SelectNationality()
		.enterstayName("HolidaySpecial")
		.enterCapacity("12")
		.enterAddress("Ecr")
		.SelectState()
		.Selectcity()
		.SelectAccomodationType()
		.SelectAccomodationGrade()
		.enterAccoEmailId("Holidayspecial@gmail.com")
		.enterAccoMobileNum("9988567895")
		.enterAccoPhoneNum("04423456789")
		.enterOwnerDetailsName2("Sekar")
		.enterOwnerDetailAddress2("ARRR")
		.waitForPageLoad(1000)
		.SelectOwnerDetailState2()
		.SelectOwnerDetailcity2()
		.enterOwnerDetailEmailId2("Sekar@gmail.com")
		.enterOwnerDetailPhoneNo2("04422233388")
		.enterOwnerDetailMobileNo2("8896668889")
		.clickOnAdd()
		.waitForPageLoad(5000)
		.enterOwnerDetailsName2("Keerthu")
		.enterOwnerDetailAddress2("Sadagopan")
		.waitForPageLoad(5000)
		.SelectOwnerDetailState2()
		.SelectOwnerDetailcity1()
		.enterOwnerDetailEmailId2("keerthu@gmail.com")
		.enterOwnerDetailPhoneNo2("04422233378")
		.enterOwnerDetailMobileNo2("9996668889")
		/*.clickOnAdd()
		.waitForPageLoad(1000)
		.enterOwnerDetailsName2("lalli")
		.enterOwnerDetailAddress2("MADAMBAKKAM")
		.waitForPageLoad(1000)
		.SelectOwnerDetailState2()
		.SelectOwnerDetailcity2()
		.enterOwnerDetailEmailId2("lalli@gmail.com")
		.enterOwnerDetailPhoneNo2("04422233390")
		.enterOwnerDetailMobileNo2("9996668896")*/
		;

	}

	

}
