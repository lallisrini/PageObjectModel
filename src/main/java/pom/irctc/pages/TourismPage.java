package pom.irctc.pages;

import wrappers.GenericWrappers;

public class TourismPage extends GenericWrappers{
	public DescriptionPage clickOnChartericon() {
		clickByXpath("//a[text()='Charter']");
		return new DescriptionPage();
	}
	public FtrCoachSignUpPage clickOnBookYourCoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new FtrCoachSignUpPage();
	}
}
