package pom.phptravels.pages;


import wrappers.GenericWrappers;

public class PhpTravels extends GenericWrappers{
	public PhpTravels enterFirstName(String data) {
		enterByXpath("//input[@id='inputFirstName']", data);
		return new PhpTravels();
	}
	public PhpTravels enterLastName(String data) {
		enterByXpath("//input[@id='inputLastName']", data);
		return this;
	}
	public PhpTravels enterEmailId(String data) {
		enterByXpath("//input[@id='inputEmail']", data);
		return this;
	}
	public PhpTravels SelectCountry() {
		selectByxpath("//span[text()='India (भारत)']");
		return this;
	}
	
	public PhpTravels enterPhoneNum(String data) {
		enterByXpath("//input[@id='inputPhone']", data);
		return this;
	}
  public PhpTravels enterCompNme(String data) {
		enterByXpath("//input[@id='inputCompanyName']", data);
		return this;
	}
	public PhpTravels enterStreetAdd(String data) {
		enterByXpath("//input[@id='inputAddress1']", data);
		return this;
	}
	public PhpTravels enterStreetAdd2(String data) {
		enterByXpath("//input[@id='inputAddress2']", data);
		return this;
	}
	public PhpTravels enterCity(String data) {
		enterByXpath("//input[@id='inputCity']", data);
		return this;
	}
	public PhpTravels enterState(String data) {
		enterByXpath("//input[@id='stateinput']", data);
		return this;
	}
	public PhpTravels enterPostCode(String data) {
		enterByXpath("//input[@id='inputPostcode']", data);
		return this;
	}
	public PhpTravels SelectCountry1() {
		selectByxpath("//option[@value='IN']");
		return this;
	}
	public PhpTravels enterPassword(String data) {
		enterByXpath("//input[@id='inputNewPassword1']", data);
		return this;
	}
	public PhpTravels enterConfirmPassword(String data) {
		enterByXpath("//input[@id='inputNewPassword2']", data);
		return this;
	}
	public PhpTravels clickOnGeneratePswd() {
		clickByXpath("//button[@class='btn btn-default btn-sm btn-sm-block generate-password']");
		return this;
	}
	public PhpTravels clickOnCopyToClipBoard() {
		clickByXpath("//button[@id='btnGeneratePasswordInsert']");
		return this;
	}
	public PhpTravels clickOnNo() {
		clickByXpath("//span[@class='bootstrap-switch-handle-off bootstrap-switch-secondary']");
		return this;
	}
	public PhpTravels enterWhatsappNum(String data) {
		enterByXpath("//input[@id='customfield2']", data);
		return this;
	}
	public PhpTravels clickOnRegister() {
		clickByXpath("//input[@value='Register']");
		return this;
	}
	 public PhpTravels  waitForPageLoad(long time){
	    	waitProperty(time);
	    	return this;
	    }
}
