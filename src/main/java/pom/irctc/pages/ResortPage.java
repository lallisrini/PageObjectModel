package pom.irctc.pages;

import wrappers.GenericWrappers;

public class ResortPage extends GenericWrappers {
	public ResortPage clickOnfirsthotelName(){
		clickByXpath("//div[@class='mid-searchpack']/h5");
		return new ResortPage();
	}
	public ResortPage clickOnfirsthotelprice(){
		clickByXpath("//strong[text()='₹ 2129']");
		return this;
	}
	public HotelinfoPage clickOnContinue(){
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-2']/b");
		return new HotelinfoPage();
	}
}
