package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcLoginPage extends GenericWrappers{
	public LoginPage clickOnGuestUsericon() {
		clickByXpath("//a[text()='Guest User Login ']");
		return new LoginPage();
	}
}
