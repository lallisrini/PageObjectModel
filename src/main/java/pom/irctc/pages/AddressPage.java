package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AddressPage extends GenericWrappers{
	public AddressPage enterflatNo(String data) {
		enterByXpath("//input[@name='resAddress1']", data);
		return this;
	}
	public AddressPage enterStreet(String data) {
		enterByXpath("//input[@name='resAddress2']", data);
		return this;
	}
	public AddressPage enterArea(String data) {
		enterByXpath("//input[@name='resAddress3']", data);
		return this;
	}
	public AddressPage enterPinCode(String data) {
		enterByXpath("//input[@placeholder='Pin code']", data);
		return this;
	}
	public AddressPage enterState(String data) {
		enterByXpath("//input[@id='resState']", data);
		return this;
	}

	public AddressPage SelectCity() {
		selectByxpath("//option[text()='Kanchipuram']");
		return this;
	}
	public AddressPage SelectCity2() {
		selectByxpath("//option[text()='Chennai']");
		return this;
	}
	public AddressPage SelectCity3() {
		selectByxpath("//option[text()='Chennai']");
		return this;
	}

	public AddressPage SelectPostOffice() {
		selectByxpath("//option[text()='Kovilambakkam B.O']");
		return this;
	}
	public AddressPage SelectPostOffice2() {
		selectByxpath("//option[text()='Ramakrishna Nagar S.O (Chennai)']");
		return this;
	}
	public AddressPage SelectPostOffice3() {
		selectByxpath("//option[text()='Velacheri S.O']");
		return this;
	}

	public AddressPage enterPhoneNo(String data) {
		enterByXpath("//input[@id='resPhone']", data);
		return this;
	}
	public AddressPage CopyResidenceAsNo() {
		clickByXpath("//label[text()='No']");
		return this;
	}
	public AddressPage enterflatNo1(String data) {
		enterByXpath("//input[@id='offAddress1']", data);
		return this;
	}
	public AddressPage enterStreet1(String data) {
		enterByXpath("//input[@id='offAddress2']", data);
		return this;
	}
	public AddressPage enterArea1(String data) {
		enterByXpath("//input[@id='offAddress3']", data);
		return this;
	}
	public AddressPage enterPin1(String data) {
		enterByXpath("//input[@id='offPinCode']", data);
		return this;
	}
	public AddressPage enterState1(String data) {
		enterByXpath("//input[@id='offState']", data);
		return this;
	}
	public AddressPage SelectCity1() {
		selectByxpath("//option[text()='Chennai']");
		return this;
	}
	public AddressPage SelectPostOffice1() {
		selectByxpath("//option[text()='Raja Annamalaipuram S.O']");
		return this;
	}
	
	public AddressPage enterPhoneNo1(String data) {
		enterByXpath("//input[@id='offPhone']", data);
		return this;
	}

	public AddressPage ClickOnCheckbox() {
		clickByXpath("//input[@formcontrolname='termCondition']");
		return this;
	}

	
}


