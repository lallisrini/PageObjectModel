package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelinfoPage extends GenericWrappers {
	public HotelinfoPage SelectTitle(){
		selectByxpath("//option[text()='Mrs']");
		return new HotelinfoPage();
	}
	
	public HotelinfoPage enterFirstName(String data){
		enterByXpath("//input[@name='firstName']",data);
		return this;
	}
	public HotelinfoPage enterLastName(String data){
		enterByXpath("//input[@name='lastName']",data);
		return this;
	}
	public HotelinfoPage Selectcountry(){
		selectByxpath("//option[text()='India']");
		return this;
	}
	public HotelinfoPage SelectState(){
		selectByxpath("//option[text()='TAMIL NADU']");
		return this;
	}
	public HotelinfoPage enterPhonenumber(String data){
		enterByXpath("//input[@name='mobileNo']",data);
		return this;
	}
	public HotelinfoPage enteremailId(String data){
		enterByXpath("//input[@name='email']",data);
		return this;
	}
	public HotelinfoPage SelectGst(){
		selectByxpath("//option[text()='Yes']");
		return this;
	}
	public HotelinfoPage enterGstNum(String data){
		enterByXpath("//input[@name='gstNumber']",data);
		return this;
	}

	
	public HotelinfoPage entercompanyName(String data){
		enterByXpath("//input[@name='companyName']",data);
		return this;
	}
	public HotelinfoPage entercompanyaddress(String data){
		enterByXpath("//input[@name='companyAddress']",data);
		return this;
		
	}
	public HotelinfoPage VerifytheErrorMessage (){
		clickByXpath("//span[text()='Please Enter Valid GSt number']");
		return this;
	}
	public HotelinfoPage SelectGstasNo(){
		clickByXpath("//option[text()='No']");
		return this;
	}
	public IrctcHotePaymentPage clickContinue(){
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
		return new IrctcHotePaymentPage();
	}



	
		}

	
	
	
