package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcOtpPage extends GenericWrappers {
	public IrctcOtpPage clickOnVerifyPopUP(){
		clickByXpath("//button[text()='Verify']");
		return new IrctcOtpPage();
	}

	public IrctcOtpPage verifyOtpFieldIsRequiredMessage(){
		clickByXpath("//span[text()='otp is required.']");
		return this;
	}


}
