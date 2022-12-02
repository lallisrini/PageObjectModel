package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRPage extends GenericWrappers {
	public FTRPage enterUserId(String data) {
		enterByXpath("//input[@id='userId']",data);
		return new FTRPage();
	}
	public FTRPage enterPassword(String data) {
		enterByXpath("//input[@id='password']",data);
		return this;
	}
	public FTRPage enterConfirmPswd(String data) {
		enterByXpath("//input[@id='cnfPassword']",data);
		return this;
	}
	public FTRPage SelectSequrityQues() {
		clickByXpath("//option[text()='What is your pet name?']");
		return this;
	}
	public FTRPage enterSecurityAns(String data) {
		enterByXpath("//input[@id='secAnswer']",data);
		return this;
	}
	public FTRPage SelectDOBMonth() {
		clickByXpath("//option[text()='Mar']");
		return this;
	}
	public FTRPage SelectDOBYear() {
		clickByXpath("//option[text()='2007']");
		return this;
	}
	public FTRPage SelectDOBDate() {
		clickByXpath("//a[text()='13']");
		return this;
	}
	public FTRPage chooseGender() {
		clickByXpath("//input[@id='gender1']");
		return this;
	}
	public FTRPage ChooseMaritalStatus() {
		clickByXpath("//input[@id='maritalStatus0']");
		return this;
	}

	public FTRPage enterEmailId(String data) {
		enterByXpath("//input[@id='email']","Seetha_somasundaram@gmail.com");
		return this;
	}

	public FTRPage selectOccupation() {
		clickByXpath("//option[text()='Public']");
		return this;
	}

	public FTRPage enterFirstName(String data) {
		enterByXpath("//input[@id='fname']",data);
		return this;
	}

	public FTRPage enterMiddleName(String data) {
		enterByXpath("//input[@id='mname']",data);
		return this;
	}
	public FTRPage enterLastName(String data) {
		enterByXpath("//input[@id='lname']",data);
		return this;
	}
	public FTRPage selectNationality() {
		clickByXpath("//option[text()='Indian']");
		return this;
	}
	public FTRPage enterFlat(String data) {
		enterByXpath("//input[@id='flatNo']",data);
		return this;
	}
	public FTRPage enterStreet(String data) {
		enterByXpath("//input[@id='street']",data);
		return this;
	}
	public FTRPage enterArea(String data) {
		enterByXpath("//input[@id='area']",data);
		return this;
	}
	public FTRPage selectCountry() {
		clickByXpath("//option[text()='India']");
		return this;
	}
	public FTRPage enterMobNum(String data) {
		enterByXpath("//input[@id='mobile']","9865383377");
		return this;
	}
	public FTRPage enterPinCode(String data) {
		enterByXpath("//input[@id='pincode']","600117");
		return this;
	}
	public FTRPage selectCity() {
		clickByXpath("//option[text()='Kanchipuram']");
		return this;
	}
	public FTRPage selectState() {
		clickByXpath("//select[@id='state']/option[@value='TAMIL NADU']");
		return this;
	}
	public FTRPage selectPostOffice1() {
		clickByXpath("//option[text()='Kovilambakkam B.O']");
		return this;
	}

	public FTRPage ClickOfficeAddressAsNo() {
		clickByXpath("//input[@id='sameAddresses1']");
		return this;
	}
	public FTRPage enterFlatDoor(String data) {
		enterByXpath("//input[@id='flatNoOffice']",data);
		return this;
	}
	public FTRPage enterStreetLane(String data) {
		enterByXpath("//input[@id='streetOffice']",data);
		return this;
	}
	public FTRPage enterAreaLocality(String data) {
		enterByXpath("//input[@id='areaOffice']",data);
		return this;
	}
	public FTRPage selectCountryOff() {
		clickByXpath("//option[text()='India']");
		return this;
	}

	public FTRPage enterMobileNumber(String data) {
		enterByXpath("//input[@id='mobileOffice']",data);
		return this;
	}
	public FTRPage enterPincodeoff(String data) {
		enterByXpath("//input[@id='pincodeOffice']","600028");
		return this;
	}
	public FTRPage selectcityoff() {
		clickByXpath("//option[text()='Chennai']");
		return this;
	}

	public FTRPage selectStateOffice() {
		clickByXpath("//select[@id='stateOffice']/option[text()='TAMIL NADU']");
		return this;
	}
	public FTRPage selectPostOffice2() {
		clickByXpath("//option[text()='Raja Annamalaipuram S.O']");
		return this;
	}


}
