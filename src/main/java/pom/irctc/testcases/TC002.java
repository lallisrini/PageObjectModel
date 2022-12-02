package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FacebookSignUpPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	
	@BeforeClass
	public void beforeClass() {
		testCaseDescription="To verify Facebook Sign up for new user registration";
		testCaseName= "TC002";
		author="Lalitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC002";
	}
	
	@Test(dataProvider="fetchData")
	public void FacebookRegistration(String firstname,String lastname,String email,String pswd,String emailcnfn,String day,
			String month,String year ) {
	new FacebookSignUpPage()
	.clickOnSignUp()
	.enterFirstName(firstname)
	.enterLastName(lastname)
	.enterMobNum("8890567889")
	.enterNewPswd("Keerthu_1918")
	.SelectDate("6")
	.SelectMonth()
	.SelectYear()
	.clickOnFemale()
	//.clickOnMale()
	//.clickOnCustom()
	//.SelectYourPronoun()
	//.enterGender("Male")
	//.clickOnSignUp()
	;
}
}
