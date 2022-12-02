package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	public EnquiryFormPage clickOnEnquiryForm() {
		clickByXpath("//a[text()='Enquiry Form']");
		return new EnquiryFormPage();
	}
	}
