package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcHotePaymentPage extends GenericWrappers{
	public IrctcHotePaymentPage GetHotelNameAndCompare(){
		clickByXpath("//div[@class='mid-searchpack']/h5");
		return new IrctcHotePaymentPage();
	}
	
	public IrctcHotePaymentPage GetTheAmountAndCompare(){
		clickByXpath("//strong[text()='₹ 2692']");
		return this;
	}
	public IrctcHotePaymentPage clickOnAgree(){
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	public IrctcOtpPage clickOnMakePayment(){
		clickByXpath("//button[text()='Make Payment']");
		return new IrctcOtpPage();
	}
}
