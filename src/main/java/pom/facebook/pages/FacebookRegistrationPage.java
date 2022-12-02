package pom.facebook.pages;

	
	import wrappers.GenericWrappers;

	public class FacebookRegistrationPage extends GenericWrappers {

		public FacebookRegistrationPage enterFirstName (String data) {
			enterByXpath(prop.getProperty("FacebookRegistrationPage.FirstName.XPath"),data);
			return new FacebookRegistrationPage();
		}
		public FacebookRegistrationPage enterLastName (String data) {
			enterByXpath(prop.getProperty("FacebookRegistrationPage.LastName.XPath"),data);
			return this;
		}
		public FacebookRegistrationPage enterMobNum (String data) {
			enterByXpath("//input[@name='reg_email__']",data);
			return this;
		}
		public FacebookRegistrationPage enterNewPswd (String data) {
			enterByXpath("//input[@name='reg_passwd__']",data);
			return this;
		}
		public  FacebookRegistrationPage SelectDate(String value) {
			selectVisibileTextByXpath("//select[@id='day']", value);
			return this;
		}
		public  FacebookRegistrationPage SelectMonth() {
			selectByxpath("//select[@id='month']");
			return this;
		}
		
		public  FacebookRegistrationPage SelectMonth1() {
			selectByxpath("//option[text()='Apr']");
			return this;
		}
		public  FacebookRegistrationPage SelectYear() {
			selectByxpath("//option[text()='2009']");
			return this;
		}
		public  FacebookRegistrationPage clickOnFemale() {
			clickByXpath("//label[text()='Female']");
			return this;
		}
		public  FacebookRegistrationPage clickOnMale() {
			clickByXpath("//input[@id='u_3_3_43']");
			return this;
		}
		public  FacebookRegistrationPage clickOnCustom() {
			clickByXpath("//input[@id='u_0_6_dq']");
			return this;
		}
		
		public  FacebookRegistrationPage SelectYourPronoun() {
			selectByxpath("//option[text()='She: \"Wish her a happy birthday!\"']");
			return this;
		}
		public FacebookRegistrationPage enterGender(String data) {
			enterByXpath("//input[@id='u_0_q_qS']",data);
			return this;
		}
		public  FacebookRegistrationPage clickOnSignUp() {
			clickByXpath("//div[@class='_1lch']/button[text()='Sign Up']");
			return this;
		}
	}


