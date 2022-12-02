package pom.irctc.pages;

import wrappers.GenericWrappers;

public class DescriptionPage extends GenericWrappers{

		public  EnquiryFormPage clickOnEnquiryForm() {
			clickByXpath("//a[text()='Enquiry Form']");
			return new EnquiryFormPage();
		}

}
