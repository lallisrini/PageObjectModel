package pom.irctc.pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage enteremailid (String data){
		enterByXpath("//input[@name='email']",data);
		return this;
	}
	public LoginPage entermobilenum (String data){
		enterByXpath("//input[@name='mobileNo']",data);
		return this;
	}
	public Hotelspage clickOnsignin() {
		clickByXpath("//button[@type='submit']");
		return new Hotelspage();
	}
}
