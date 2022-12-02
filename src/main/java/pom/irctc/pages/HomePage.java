package pom.irctc.pages;


import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public RegistrationPage clickOnRegister() {
		clickByXpath(" //a[text()=' REGISTER ']");
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
	 mouseHoverByXPath("//a[text()=' HOLIDAYS ']");
		return this;
	}
	
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXPath("//span[text()='Stays']/.");
		return this;
	}
	
	public AccommodationPage clickOnLounge() {
		clickByXpath("//a[@aria-label='Sub Menu of Stays, Lounge. Website will be opened in new tab']/span");
		return new AccommodationPage();
	}
	 public HomePage  waitForPageLoad(long time){
	    	waitProperty(time);
	    	return new HomePage();
	    }
	
}
