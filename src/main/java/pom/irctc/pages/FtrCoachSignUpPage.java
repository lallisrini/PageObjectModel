package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrCoachSignUpPage extends GenericWrappers {
	public FTRPage clickOnSignUp() {
		clickByXpath("//a[text()='New User? Signup']");
		return new FTRPage();
	}

}
