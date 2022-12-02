package pom.irctc.pages;

import wrappers.GenericWrappers;

public class IrctcHotelPage extends GenericWrappers {
	public ResortPage clickOnfirsthotel(){
		clickByXpath("//div[@class='col-12 col-md-6']");
		return new ResortPage();
	}

}
