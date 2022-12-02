package pom.irctc.pages;


import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
public Hotelspage clickOnHotelicon() {
	clickByXpath("//div[@class='Nav-icons IRCTCHotels']");
	return new Hotelspage();
}
public TourismPage clickOnmenuicon() {
	clickByXpath("//a[@id='sidebarCollapse']");
	return new TourismPage();
}


public IrctcLoginPage clickOnLogin() {
	clickByXpath("//a[text()='Login']");
	return new IrctcLoginPage();
	
}
public  AccommodationPage waitForPageLoad(long time){
	waitProperty(time);
	return this;
}

}