package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormCPage extends GenericWrappers {
	public FormCPage enterUserId(String data) {
		enterByXpath("//input[@id='u_id']",data);
		return new FormCPage();
	}
	public FormCPage enterPassword(String data) {
		enterByXpath("//input[@id='u_pwd']",data);
		return this;
	}
	
	public FormCPage enterConfirmPassword(String data) {
		enterByXpath("//input[@id='u_repwd']",data);
		return this;
	}
	public FormCPage SelectSecurityQn() {
		selectByxpath("//select[@id='u_secques']");
		return this;
	}
	public FormCPage SelectSecurityQn1() {
		clickByXpath("//option[text()=' where did you meet your spouse?']");
		return this;
	}

	
	public FormCPage enterSecurityAns(String data) {
		enterByXpath("//input[@id='u_secans']",data);
		return this;
	}
	public FormCPage enterName(String data) {
		enterByXpath("//input[@id='u_name']",data);
		return this;
	}
	public FormCPage SelectGender() {
		clickByXpath("//option[text()=' Female']");
		return this;
	}
	public FormCPage enterDOB(String data) {
		enterByXpath("//input[@id='u_dob']",data);
		return this;
	}
	public FormCPage enterDesignation(String data) {
		enterByXpath("//input[@id='u_designation']",data);
		return this;
	}
	public FormCPage enterEmailID(String data) {
		enterByXpath("//input[@id='u_emailid']",data);
		return this;
	}
	public FormCPage enterMobileNo(String data) {
		enterByXpath("//input[@id='u_mobile']",data);
		return this;
	}
	public FormCPage enterPhoneNo(String data) {
		enterByXpath("//input[@id='u_phone']",data);
		return this;
	}
	public FormCPage SelectNationality() {
		clickByXpath("//option[text()='INDIA']");
		return this;
	}
	public FormCPage enterstayName(String data) {
		enterByXpath("//input[@id='name']",data);
		return this;
	}
	public FormCPage enterCapacity(String data) {
		enterByXpath("//input[@id='capacity']",data);
		return this;
	}
	public FormCPage enterAddress(String data) {
		enterByXpath("//textarea[@id='address']",data);
		return this;
	}
	public FormCPage SelectState() {
		clickByXpath("//option[text()=' TAMIL NADU']");
		return this;
	}
	public FormCPage Selectcity() {
		clickByXpath("//option[@value='4C']");
		return this;
	}
	public FormCPage SelectAccomodationType() {
		clickByXpath("//option[@value='D']");
		return this;
	}
	public FormCPage SelectAccomodationGrade() {
		clickByXpath("//option[@value='4s']");
		return this;
	}
	public FormCPage enterAccoEmailId(String data) {
		enterByXpath("//input[@id='email']",data);
		return this;
	}
	public FormCPage enterAccoMobileNum(String data) {
		enterByXpath("//input[@id='mcontact']",data);
		return this;
	}
	public FormCPage enterAccoPhoneNum(String data) {
		enterByXpath("//input[@id='contact']",data);
		return this;
	}
	public FormCPage enterOwnerDetailsName2(String data) {
		enterByXpath("//input[@name='name_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailAddress2(String data) {
		enterByXpath("//input[@name='address_o']",data);
		return this;
	}
	public FormCPage SelectOwnerDetailState20() {
		clickByXpath("//select[@id='state_o']");
		return this;
	}
	
	
	public FormCPage SelectOwnerDetailState2() {
		clickByXpath("//select[@name='state_o']/option[@value='28']");
		return this;
	}
	public FormCPage SelectOwnerDetailcity2() {
		clickByXpath("//select[@name='citydistr_o']/option[@value='21D']");
		return this;
	}
	public FormCPage enterOwnerDetailEmailId2(String data) {
		enterByXpath("//input[@name='emailid_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailPhoneNo2(String data) {
		enterByXpath("//input[@name='phoneno_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailMobileNo2(String data) {
		enterByXpath("//input[@name='mobile_o']",data);
		return this;
	}
	public FormCPage clickOnAdd() {
		clickByXpath("//input[@value='Add']");
		return this;
	}
	public FormCPage enterOwnerDetailsName8(String data) {
		enterByXpath("//input[@name='name_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailAddress1(String data) {
		enterByXpath("//input[@name='address_o']",data);
		return this;
	}
	
	public FormCPage SelectOwnerDetailState1() {
		clickByXpath("//select[@name='state_o']/option[@value='28']");
		return this;
	}
	public FormCPage SelectOwnerDetailcity1() {
		clickByXpath("//select[@name='citydistr_o']/option[@value='9D']");
		return this;
	}
	public FormCPage enterOwnerDetailEmailId1(String data) {
		enterByXpath("//input[@name='emailid_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailPhoneNo1(String data) {
		enterByXpath("//input[@name='phoneno_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailMobileNo1(String data) {
		enterByXpath("//input[@name='mobile_o']",data);
		return this;
	}
	public FormCPage clickOnAdd1() {
		clickByXpath("//input[@value='Add']");
		return this;
	}
	public FormCPage enterOwnerDetailsName10(String data) {
		enterByXpath("//input[@name='name_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailAddress3(String data) {
		enterByXpath("//input[@name='address_o']",data);
		return this;
	}
	
	public FormCPage SelectOwnerDetailState3() {
		clickByXpath("//select[@name='state_o']/option[@value='28']");
		return this;
	}
	public FormCPage SelectOwnerDetailcity3() {
		clickByXpath("//select[@name='citydistr_o']/option[@value='9D']");
		return this;
	}
	public FormCPage enterOwnerDetailEmailId3(String data) {
		enterByXpath("//input[@name='emailid_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailPhoneNo3(String data) {
		enterByXpath("//input[@name='phoneno_o']",data);
		return this;
	}
	public FormCPage enterOwnerDetailMobileNo3(String data) {
		enterByXpath("//input[@name='mobile_o']",data);
		return this;
	}
    public  FormCPage waitForPageLoad(long time){
    	waitProperty(time);
    	return this;
    }

}
