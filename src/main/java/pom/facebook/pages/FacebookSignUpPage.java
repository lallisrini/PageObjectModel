package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FacebookSignUpPage extends GenericWrappers {

	public FacebookRegistrationPage clickOnSignUp () {
		clickByXpath(prop.getProperty("FacebookSignupPage.CreateNewAccount.XPath"));
		return new FacebookRegistrationPage();
	
	}
}
