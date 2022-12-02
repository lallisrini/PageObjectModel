package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{

	public RegistrationPage enterUSerName(String data) {
		enterByXpath("//input[@id='userName']", data);
		return new RegistrationPage();
	}
		public RegistrationPage enterPassword(String data) {
			enterByXpath("//input[@id='usrPwd']", data);
			return this;
		}
			public RegistrationPage enterConfirmPassword(String data) {
				enterByXpath("//input[@id='cnfUsrPwd']", data);
				return this;
			}
			public RegistrationPage SelectSecurityquestion() {
				selectByxpath("//span[text()='Security Question']");
				return this;
			}
	
			public RegistrationPage SelectSecurityquestion1() {
				selectByxpath("//span[text()='What was the name of your first school?']");
				return this;
			}
			public RegistrationPage SelectSecurityquestion2() {
				selectByxpath("//span[text()='Who was your Childhood hero?']");
				return this;
			}
	
			public RegistrationPage SelectSecurityquestion3() {
				selectByxpath("//span[text()='What is your favorite past-time?']");
				return this;
			}
			public RegistrationPage SelectSecurityquestion4() {
				selectByxpath("//span[text()='What is your all time favorite sports team?']");
				return this;
			}
	
			public RegistrationPage enterSecurityanswer(String data) {
				enterByXpath("//input[@placeholder='Security Answer']", data);
				return this;
			}
			public void waitProperty(long time)  {
				
					return;	
		}
		
			
			public RegistrationPage SelectPreferredlanguage1() {
			selectByxpath("//span[text()='English']");
				return this;	
	}
			
			public RegistrationPage SelectPreferredlanguage2() {
				selectByxpath("//span[text()='हिंदी']");
					return this;	
		}

			
				public PersonaldetailsPage clickContinue() {
					clickByXpath("//button[@label='Continue']");
					return new PersonaldetailsPage();
				}
			
				
}
				
				