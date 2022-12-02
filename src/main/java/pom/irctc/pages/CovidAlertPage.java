package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers{

	
	public HomePage clickOnOk() {
		clickByXpath("//button[@type='submit']");
		return new HomePage();
	}
	
	
}
