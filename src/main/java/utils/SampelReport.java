package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampelReport {
	
	@Test
	public void generateReport() {
		
		// start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start test
		ExtentTest test = report.startTest("TC005", "To verify IRCTC Registration for the new user sign up");
		
		test.assignAuthor("Lalitha");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		test.log(LogStatus.PASS	, "The brwoser got luanched with the given url succesfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}

}
