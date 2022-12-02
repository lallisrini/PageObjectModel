package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormcSignUpPage  extends GenericWrappers {

	public FormCPage clickOnSignUp() {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new FormCPage();
	}
}
