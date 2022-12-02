package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers{
	public EnquiryFormPage enterNameOfApplicant(String data) {
		enterByXpath("//input[@name='name']",data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterNameOfOrganisation(String data) {
		enterByXpath("//input[@name='organization']",data);
		return this;
	}
	public EnquiryFormPage enterAddress(String data) {
		enterByXpath("//input[@name='address']",data);
		return this;
	}
	public EnquiryFormPage enterWrongMobNum(String data) {
		enterByXpath("//input[@name='mobile']",data);
		return this;
	}
	public EnquiryFormPage enterEmailId(String data) {
		enterByXpath("//input[@name='email']",data);
		return this;
	}
	public EnquiryFormPage SelectRequestForSaloon() {
		selectByxpath("//option[@value='Saloon Charter']");
		return this;
	}
	public EnquiryFormPage enterOriginationStation(String data) {
		enterByXpath("//input[@name='originStation']",data);
		return this;
	}
	public EnquiryFormPage enterDestinationStation(String data) {
		enterByXpath("//input[@name='destnStation']",data);
		return this;
	}
	public EnquiryFormPage SelectDateOfDeparture() {
		selectByxpath("//span[text()='19']");
		return this;
	}
	public EnquiryFormPage SelectDateofArrival() {
		selectByxpath("//span[text()='29']");
		return this;
	}
	public EnquiryFormPage enterDuration(String data) {
		enterByXpath("//input[@name='durationPeriod']",data);
		return this;
	}
	public EnquiryFormPage enterNumAndTypeOfCoaches(String data) {
		enterByXpath("//input[@name='coachDetails']",data);
		return this;
	}
	public EnquiryFormPage enterNumOfPassengers(String data) {
		enterByXpath("//input[@name='numPassenger']",data);
		return this;
	}
	public EnquiryFormPage enterPurposeOfCharter(String data) {
		enterByXpath("//textarea[@name='charterPurpose']",data);
		return this;
	}
	public EnquiryFormPage enterAdditionalServices(String data) {
		enterByXpath("//textarea[@name='services']",data);
		return this;
	}
	public EnquiryFormPage clickOnSubmit(){
		clickByXpath("//button[@type='Submit']");
		return this;
	}
	public EnquiryFormPage clickOnMobNumNotValidErrMsg(){
		clickByXpath("//span[text()='Mobile no. not valid']");
		return this;
	}
	



}
