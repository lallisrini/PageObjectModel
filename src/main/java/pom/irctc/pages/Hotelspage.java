package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Hotelspage extends GenericWrappers{
		public Hotelspage entercityname (String data){
		enterByXpath("//input[@id='filterText']",data);
		return this;
	}
		 public  Hotelspage waitForPageLoad(long time){
		    	waitProperty(time);
		    	return this;
		    }
	public Hotelspage clickOncheckin(){
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	public Hotelspage clickOncheckindate(){
		clickByXpath("//span[text()='20']");
		return this;
	}
	public Hotelspage clickOncheckout(){
		clickByXpath("//input[@name='dt13']");
		return this;
		
	}
	public Hotelspage clickOncheckoutdate(){
		clickByXpath("//span[text()='22']");
		return this;
	}
	public Hotelspage clickOnguestroom(){
		clickByXpath("//input[@name='guest']");
		return this;
	}
	public Hotelspage clickOnguestroomNum(){
		clickByXpath("//option[text()='1']");
		return this;
	}

	public Hotelspage clickOnAdultsroomNum(){
		clickByXpath("//option[text()='3']");
		return this;
	}
	public Hotelspage clickOnDone(){
		clickByXpath("//button[text()='Done']");
		return this;
	}
	public IrctcHotelPage clickOnfindhotel(){
		clickByXpath("//button[text()='Find Hotel ']");
		return new IrctcHotelPage();
	}
	

}
