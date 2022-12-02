package pom.irctc.pages;


import wrappers.GenericWrappers;

public class PersonaldetailsPage extends GenericWrappers {
	public PersonaldetailsPage enterFirstName(String data) {
		enterByXpath("//input[@id='firstName']", data);
		return new PersonaldetailsPage();
	}
	public PersonaldetailsPage  waitForPageLoad(long time){
    	waitProperty(time);
    	return this;
    }


	public PersonaldetailsPage enterMiddleName(String data) {
		enterByXpath("//input[@id='middleName']", data);
		return this;
	}
	public PersonaldetailsPage enterLastName(String data) {
		enterByXpath("//input[@id='lastname']", data);
		return this;
	}
	public PersonaldetailsPage ClickOnGender() {
		selectByxpath("//span[text()='Female']");
		return this;
	}
	public PersonaldetailsPage SelectDate() {
		selectByxpath("//a[text()='21']");
		return this;
	}
	public PersonaldetailsPage SelectDate1() {
		selectByxpath("//a[text()='14']");
		return this;
	}

	public PersonaldetailsPage SelectDate2() {
		selectByxpath("//a[text()='23']");
		return this;
	}



	public PersonaldetailsPage SelectMonth() {
		selectByxpath("//option[text()='April']");
		return this;
	}
	public PersonaldetailsPage SelectMonth1() {
		selectByxpath("//option[text()='February']");
		return this;
	}
	public PersonaldetailsPage SelectMonth2() {
		selectByxpath("//option[text()='September']");
		return this;
	}


	public PersonaldetailsPage SelectYear() {
		selectByxpath("//option[text()='2004']");
		return this;
	}
	public PersonaldetailsPage SelectYear1() {
		selectByxpath("//option[text()='1998']");
		return this;
	}

	public PersonaldetailsPage SelectYear2() {
		selectByxpath("//option[text()='2002']");
		return this;
	}


	public PersonaldetailsPage SelectOccupation() {
		selectByxpath("//span[text()='PRIVATE']");
		return this;
	}
	public PersonaldetailsPage SelectOccupation1() {
		selectByxpath("//span[text()='PROFESSIONAL']");
		return this;
	}
	public PersonaldetailsPage SelectOccupation2() {
		selectByxpath("//span[text()='STUDENT']");
		return this;
	}
	public PersonaldetailsPage chooseMaritalStatus() {
		clickByXpath("//label[text()='Married']");
		return this;
	}
	public PersonaldetailsPage chooseMaritalStatus1() {
		clickByXpath("//label[text()='Unmarried']");
		return this;
	}
	public PersonaldetailsPage SelectCountry() {
		selectByxpath("//select[@formcontrolname='resCountry']/option[text()='India']");
		
		return this;
	}
	public PersonaldetailsPage SelectCountry1() {
		selectByxpath("//select[@formcontrolname='resCountry']/option[text()='Aland Islands']");
		
		return this;
	}
	
	public PersonaldetailsPage SelectCountry2() {
		selectByxpath("//select[@formcontrolname='resCountry']/option[text()='Antigua and Barbuda']");
		
		return this;
	}
	

	
	public PersonaldetailsPage enterEmailId(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	public PersonaldetailsPage enterMobNum(String data) {
		enterByXpath("//input[@name='mobile']", data);
		return this;
	}

	public PersonaldetailsPage SelectNationality() {
		selectByxpath("//select[@formcontrolname='resCountry']/option[@value='94']");
		return this;
	}
	public PersonaldetailsPage SelectNationality1() {
		selectByxpath("//select[@formcontrolname='resCountry']/option[text()='Sri Lanka']");
		return this;
	}
	public PersonaldetailsPage SelectNationality2() {
		selectByxpath("//select[@formcontrolname='resCountry']/option[text()='Syria']");
		return this;
	}
	public AddressPage clickOnContinue() {
		clickByXpath("//button[@label='Continue']");
		return new AddressPage();
	}
}
