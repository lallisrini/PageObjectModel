package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import pom.formc.pages.FormCPage;
import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers{

	public static RemoteWebDriver driver;
	
	public static Properties prop ;
	
	public void loadObjects() {
		
		try {
			 prop = new Properties();
			prop.load(new FileInputStream("./src/test/java/object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void unloadObjects() {
		prop=null;
	}
	
	
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
            }else if(browser.equalsIgnoreCase("firefox")) {
             System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
              driver = new FirefoxDriver();
              }else if(browser.equalsIgnoreCase("ie")) {
              System.setProperty("webdriver.ie.driver" , "./drivers/IEDriverServe.exe");
              driver = new InternetExplorerDriver();
              }
             driver.manage().window().maximize();
              driver.get(url);
              driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
             // System.out.println("The browser "+browser+" is launched with the given "+url+" successfully");
              reportStep("The browser "+browser+" is launched with the given "+url+" successfully", "pass");
	      	} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
	      	//	System.err.println("The browser "+browser+" is not launched due to session not created error ");
			reportStep("The browser "+browser+" is not launched due to session not created error ", "fail");
		}catch (InvalidArgumentException e) {
			// TODO: handle exception
            //System.err.println("The browser "+browser+" is  not launched as url does not contain http/https");
            
			reportStep("The browser "+browser+" is  not launched as url does not contain http/https", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//	System.err.println("The browser "+browser+" is  not launched due to unknown error");
			reportStep("The browser "+browser+" is  not launched due to unknown error", "fail");
		}
	}
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data, Keys.TAB);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idValue+" is not found in the DOM");
			reportStep("The element with id "+idValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not visible in the application");
			reportStep("The element with id "+idValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not interactable in the application");
			reportStep("The element with id "+idValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not stable in the application");
			reportStep("The element with id "+idValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		
		}
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data, "pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in the DOM");
			reportStep("The element with name "+nameValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not visible in the application");
			reportStep("The element with name "+nameValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not interactable in the application");
			reportStep("The element with name "+nameValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not stable in the application");
			reportStep("The element with name "+nameValue+" is not stable in the application", "fail");
			
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error", "fail");
		
		}
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element xpath " +xpathValue+" is entered with data "+data);
			reportStep("The element xpath " +xpathValue+" is entered with data "+data, "pass");
		}
		catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not found in the DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not visible in the application");
			reportStep("The element with xpath "+xpathValue+" is not visible in the application", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not interactable in the application");
			reportStep("The element with xpath "+xpathValue+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in the application");
			reportStep("The element with xpath "+xpathValue+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" due to unknown error", "fail");
		
		}
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String actualTitle = driver.getTitle();
			if(actualTitle.equals(title)) {
				//System.out.println("The title of the page "+actualTitle+" is matched with expected title "+title);
				reportStep("The title of the page "+actualTitle+" is matched with expected title "+title, "pass");
			}else {
				//System.err.println("The title of the page "+actualTitle+" is not matched with expected title "+title);
				reportStep("The title of the page "+actualTitle+" is not matched with expected title "+title, "fail");
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The title of the page "+title+" is not verified due to unknown error");
			reportStep("The title of the page "+title+" is not verified due to unknown error", "fail");
		
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText=driver.findElementById(id).getText();
			if(actualText.equals(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is matched with expected text "+text, "pass");
			}else {
				//System.err.println("The element with id "+id+" is holding the text "+actualText+" is not matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText+" is not matched with expected text "+text, "fail");
			}
		}
			catch (NoSuchElementException e) {
				// TODO: handle exception
				//System.err.println("The element with id "+id+" is not found in the DOM");
				reportStep("The element with id "+id+" is not found in the DOM","fail");
			}  catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+id+" is not visible in the application");
				reportStep("The element with xpath "+id+" is not visible in the application","fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+id+" is not interactable in the application");
				reportStep("The element with xpath "+id+" is not interactable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+id+" is not stable in the application");
			    reportStep("The element with xpath "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element  with text " +text+" is not verified due to unknown error");
			reportStep("The element  with text " +text+" is not verified due to unknown error", "fail");
		
		}
		
	}
	
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText1=driver.findElementByXPath(xpath).getText();
			if(actualText1.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText1+" is matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText1+" is matched with expected text "+text, "pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText1+" is not matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText1+" is not matched with expected text "+text, "fail");
			}
		}
			catch (NoSuchElementException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
				reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
			}  catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not visible in the application");
				reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
				reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
			} catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+xpath+" is not stable in the application");
				reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
			
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with text "+text+" is not verified due to unknown error");
			reportStep("The element with text "+text+" is not verified due to unknown error", "fail");
		
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText1=driver.findElementByXPath(xpath).getText();
			if(actualText1.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" is holding the text "+actualText1+" is partially matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText1+" is partially matched with expected text "+text, "pass");
			}else {
				//System.err.println("The element with xpath "+xpath+" is holding the text "+actualText1+" is not matched with expected text "+text);
				reportStep("The element with xpath "+xpath+" is holding the text "+actualText1+" is not matched with expected text "+text, "fail");
			}

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
			reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
		}  catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not visible in the application");
			reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
			reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in the application");
			reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with text "+text+" is not verified due to unknown error");
			reportStep("The element with text "+text+" is not verified due to unknown error", "fail");
		
		}
		
	}
	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actualText1=driver.findElementById(id).getText();
			if(actualText1.contains(text)) {
				//System.out.println("The element with id "+id+" is holding the text "+actualText1+" is partially matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText1+" is partially matched with expected text "+text, "pass");
			}else {
				//System.err.println("The element with id "+id+" is holding the text "+actualText1+" is not matched with expected text "+text);
				reportStep("The element with id "+id+" is holding the text "+actualText1+" is not matched with expected text "+text, "fail");
			}

		} catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not found in the DOM");
			reportStep("The element with id "+id+" is not found in the DOM","fail");
		}  catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		} catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
			
		} catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with text "+text+" is not verified due to unknown error");
			reportStep("The element with text "+text+" is not verified due to unknown error","fail");
		
		}
		
	}

public void refresh() {
	try {
		driver.navigate().refresh();
		//System.out.println("Refreshed");
		reportStep("Refreshed", "pass");
	} catch (WebDriverException e) {
		// TODO Auto-generated catch block
		//System.err.println("Not refreshed due to unknown error");
		reportStep("Not refreshed due to unknown error", "fail");
	
	}
}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not clicked in the application");
			reportStep("The element with id "+id+" is not clicked in the application", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}
	     catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not present in the DOM");
	    	 reportStep("The element with id "+id+" is not present in the DOM", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application","fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified due to unknown error");
			reportStep("The element with id "+id+" is not verified due to unknown error", "fail");
		
		}
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with class "+classVal+" is clicked");
			reportStep("The element with class "+classVal+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with class "+classVal+" is not clicked in the application");
			reportStep("The element with class "+classVal+" is not clicked in the application", "fail");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with class "+classVal+" is not present in the DOM");
			reportStep("The element with class "+classVal+" is not present in the DOM", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with class "+classVal+" is not interactable in the application");
			reportStep("The element with class "+classVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with class "+classVal+" is not stable in the application");
			reportStep("The element with class "+classVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with class "+classVal+" is not verified due to unknown error");
			reportStep("The element with class "+classVal+" is not verified due to unknown error", "fail");
		
		}
	}

	

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+name+" is clicked");
			reportStep("The element with name "+name+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not clicked in the application");
			reportStep("The element with name "+name+" is not clicked in the application", "fail");
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not present in the DOM");
			reportStep("The element with name "+name+" is not present in the DOM","fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in the application");
			reportStep("The element with name "+name+" is not interactable in the application","fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in the application");
			reportStep("The element with name "+name+" is not stable in the application","fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not verified due to unknown error");
			reportStep("The element with name "+name+" is not verified due to unknown error","fail");
		
		}
	}
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
	try {
		driver.findElementByLinkText(name).click();
		//System.out.println("The element with link name "+name+" is clicked");
		reportStep("The element with link name "+name+" is clicked", "pass");
	} catch (ElementClickInterceptedException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with link "+name+" is not clicked in the application");
		reportStep("The element with link "+name+" is not clicked in the application","fail");
	}catch (NoSuchElementException e) {
		// TODO: handle exception
		//System.err.println("The element with link "+name+" is not present in the DOM");
		reportStep("The element with link "+name+" is not present in the DOM", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with link "+name+" is not interactable in the application");
		reportStep("The element with link "+name+" is not interactable in the application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with link "+name+" is not stable in the application");
		reportStep("The element with link "+name+" is not stable in the application","fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with link "+name+" is not verified due to unknown error");
		reportStep("The element with link "+name+" is not verified due to unknown error", "fail");
	
	}
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with link name "+name+" is clicked");
			reportStep("The element with link name "+name+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with link "+name+" is not clicked in the application");
			reportStep("The element with link "+name+" is not clicked in the application", "fail");
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not present in the DOM");
			reportStep("The element with link "+name+" is not present in the DOM", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not interactable in the application");
			reportStep("The element with link "+name+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not stable in the application");
			reportStep("The element with link "+name+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with link "+name+" is not verified due to unknown error");
			reportStep("The element with link "+name+" is not verified due to unknown error", "fail");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked","pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not clicked in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked in the application", "fail");
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not verified due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not verified due to unknown error", "fail");
	
		
		}
		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked", "pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not clicked in the application");
			reportStep("The element with xpath "+xpathVal+" is not clicked in the application", "fail");
			
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
			
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not verified due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not verified due to unknown error", "fail");
	
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
	String actualText=null;
		try {
			actualText=driver.findElementById(idVal).getText();
			//System.out.println("The element with id "+idVal+" is holding text text "+actualText);
			reportStep("The element with id "+idVal+" is holding text text "+actualText, "pass");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not visible in the application");
			reportStep("The element with id "+idVal+" is not visible in the application", "fail");
		}
	     catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not present in the DOM");
	    	 reportStep("The element with id "+idVal+" is not present in the DOM", "fail");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in the application");
			reportStep("The element with id "+idVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in the application");
			reportStep("The element with id "+idVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not verified due to unknown error");
			reportStep("The element with id "+idVal+" is not verified due to unknown error", "fail");
		}
		return actualText;
	}
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actualText1=null;
		try {
			actualText1=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" is holding the text "+actualText1);
			reportStep("The element with xpath "+xpathVal+" is holding the text "+actualText1, "pass");
		}catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not present in the DOM");
			reportStep("The element with xpath "+xpathVal+" is not present in the DOM", "fail");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in the application");
			reportStep("The element with xpath "+xpathVal+" is not visible in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in the application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in the application");
			reportStep("The element with xpath "+xpathVal+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not verified due to unknown error");
			reportStep("The element with xpath "+xpathVal+" is not verified due to unknown error", "fail");
	
		
		}
		return actualText1;
	}

	public void selectVisibileTextByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement Text=driver.findElementByName(name);
			Select sel=new Select(Text);
			sel.selectByVisibleText(value);
			//System.out.println("The element with name "+value+" is selected with visbile text "+value);
			reportStep("The element with name "+value+" is selected with visbile text "+value, "pass");
		} 
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+value+" is not visible in the application");
			reportStep("The element with name "+value+" is not visible in the application", "fail");
		}
	     catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+value+" is not present in the DOM");
	    	 reportStep("The element with name "+value+" is not present in the DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+value+" is not selected in the application");
			reportStep("The element with name "+value+" is not selected in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+value+" is not interactable in the application");
			reportStep("The element with name "+value+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+value+" is not stable in the application");
			reportStep("The element with name "+value+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+value+" is not verified due to unknown error");
			reportStep("The element with name "+value+" is not verified due to unknown error", "fail");
		
		}
		
	}
		public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement Text=driver.findElementById(id);
			Select sel=new Select(Text);
			sel.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected with visbile text "+value);
			reportStep("The element with id "+id+" is selected with visbile text "+value, "pass");
		} 
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not visible in the application");
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}
	     catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not present in the DOM");
			reportStep("The element with id "+id+" is not present in the DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not selected in the application");
			reportStep("The element with id "+id+" is not selected in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable in the application");
			reportStep("The element with id "+id+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in the application");
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not verified due to unknown error");
			reportStep("The element with id "+id+" is not verified due to unknown error", "fail");
		
		}
		
	}
		public void selectVisibileTextByXpath(String xpath, String value) {
			// TODO Auto-generated method stub
			try {
				WebElement Text=driver.findElementByXPath(xpath);
				Select sel=new Select(Text);
				sel.selectByVisibleText(value);
				//System.out.println("The element with xpath "+value+" is selected with visbile text "+value);
				reportStep("The element with xpath "+value+" is selected with visbile text "+value, "pass");
			} 
			catch (ElementNotVisibleException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+value+" is not visible in the application");
				reportStep("The element with xpath "+value+" is not visible in the application", "fail");
			}
		     catch (NoSuchElementException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+value+" is not present in the DOM");
		    	 reportStep("The element with xpath "+value+" is not present in the DOM", "fail");
			}catch (ElementNotSelectableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+value+" is not selected in the application");
				reportStep("The element with xpath "+value+" is not selected in the application", "fail");
			}
			catch (ElementNotInteractableException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+value+" is not interactable in the application");
				reportStep("The element with xpath "+value+" is not interactable in the application", "fail");
			}catch (StaleElementReferenceException e) {
				// TODO: handle exception
				//System.err.println("The element with xpath "+value+" is not stable in the application");
				reportStep("The element with xpath "+value+" is not stable in the application", "fail");
			}catch (WebDriverException e) {
				// TODO: handle exception
				//System.err.println("The element with  "+value+" is not verified due to unknown error");
				reportStep("The element with  "+value+" is not verified due to unknown error", "fail");
			}
			
		}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement index=driver.findElementById(id);
			Select sel1=new Select(index);
			sel1.selectByIndex(value);
			//System.out.println("The element with id "+value+" is selected with index "+value);
			reportStep("The element with id "+value+" is selected with index "+value, "pass");
		} catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+value+" is not visible in the application");
			reportStep("The element with id "+value+" is not visible in the application", "fail");
		}
	     catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+value+" is not present in the DOM");
	    	 reportStep("The element with id "+value+" is not present in the DOM", "fail");
		}catch (ElementNotSelectableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+value+" is not selected in the application");
			reportStep("The element with id "+value+" is not selected in the application", "fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+value+" is not interactable in the application");
			reportStep("The element with id "+value+" is not interactable in the application", "fail");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+value+" is not stable in the application");
			reportStep("The element with id "+value+" is not stable in the application", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+value+" is not verified due to unknown error");
			reportStep("The element with id "+value+" is not verified due to unknown error", "fail");
		
		}
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> allWinIdBeforeClick =driver.getWindowHandles();
			for(String eachID:allWinIdBeforeClick) {
				driver.switchTo().window(eachID);
				break;
			}//System.out.println("Switched to parent Window");
			reportStep("Switched to parent Window", "pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("Switching to invalid pop-up Window");
			reportStep("Switching to invalid pop-up Window", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
		//System.err.println("Switching is not verified due to unknown error");	
			reportStep("Switching is not verified due to unknown error", "fail");
		
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		try {
		Set<String> allWinIdAfterClick =driver.getWindowHandles();
		for(String eachID:allWinIdAfterClick) {
			driver.switchTo().window(eachID);
		}
		//System.out.println("Moved the control to last Window");
		reportStep("Moved the control to last Window", "pass");
	} catch (NoSuchWindowException e) {
		// TODO Auto-generated catch block
		//System.err.println("Switching to invalid pop-up Window");
		reportStep("Switching to invalid pop-up Window","fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
	//System.err.println("Switching is not verified due to unknown window");
		reportStep("Switching is not verified due to unknown window", "fail");
	}

	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("Accepted the alert ");
			reportStep("Accepted the alert ", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
		//System.err.println("Assessing an alert one is not present");
			reportStep("Assessing an alert one is not present","fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("switching is not verified due to unknown error");
			reportStep("switching is not verified due to unknown error", "fail");
		
		}
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("Dismissed the alert");
			reportStep("Dismissed the alert", "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Assessing an alert one is not present");
			reportStep("Assessing an alert one is not present", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("switching is not verified due to unknown error");
			reportStep("switching is not verified due to unknown error", "fail");
		
		}
	}

	public  String getAlertTextNoSnap() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
	  String alertText1= driver.switchTo().alert().getText();
			//System.out.println("The alert is holding the text "+alertText1);
	        reportStep("The alert is holding the text "+alertText1,"pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Capture text from NoAlert message");
			reportStep("Capture text from NoAlert message", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Capture text from UnhandledAlert message");
			reportStep("Capture text from UnhandledAlert message", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Switching is not verified due to unknown error");
			reportStep("Switching is not verified due to unknown error", "fail");
		
		}
		return alertText;
	}
	public  String getAlertText() {
		// TODO Auto-generated method stub
		String alertText=null;
		try {
	  String alertText1= driver.switchTo().alert().getText();
			//System.out.println("The alert is holding the text "+alertText1);
	        reportStep("The alert is holding the text "+alertText1, "pass");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("Capture text from NoAlert message");
			reportStep("Capture text from NoAlert message", "fail");
		}catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("Capture text from UnhandledAlert message");
			reportStep("Capture text from UnhandledAlert message", "fail");
		}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("Switching is not verified due to unknown error");
			reportStep("Switching is not verified due to unknown error", "fail");
		
		}
		return alertText;
	}



	public long takeSnap() {
		// TODO Auto-generated method stub
		
			long number = 0;
			try {
		
				number = (long) (Math.floor(Math.random()*100000000)+100000);
				
				File tmp=driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./reports/screenshots/"+number+".png"); 
				FileUtils.copyFile(tmp, dest);
			//System.out.println("I/O operations as Successfully");
			//reportStep("I/O operations as Successfully","pass");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//System.err.println("Failed I/O operations");
				reportStep("Failed I/O operations", "fail", false);
			}
		
			return number;
			
		}
	

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println(" Active window is closed");
			reportStep(" Active window is closed","pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unknown error");
			reportStep("Unknown error", "fail", false);
			
		}
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("Close all the browsers");
			reportStep("Close all the browsers","pass", false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("Unknown error");
			reportStep("Unknown error", "fail", false);
		}
		
	}
	public void waitProperty(long time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
			//System.out.println("pause the execution of current thread"); 
			reportStep("pause the execution of current thread","pass");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//System.err.println("Blocked State");
			reportStep("Blocked State", "fail");
		}
	
	
} 
	
	public void sendkeys() {
		try {
			driver.findElementByXPath("//html/body").sendKeys(Keys.PAGE_DOWN);
		//System.out.println("The element with xpath  is entered with data ");
			reportStep("The element with xpath  is entered with data ","pass");
	}
	catch (NoSuchElementException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element with xpath  is not found in the DOM");
		reportStep("The element with xpath  is not found in the DOM", "fail");
	}catch (ElementNotVisibleException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath  is not visible in the application");
		reportStep("The element with xpath  is not visible in the application", "fail");
	}catch (ElementNotInteractableException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath is not interactable in the application");
		reportStep("The element with xpath is not interactable in the application", "fail");
	}catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath  is not stable in the application");
		reportStep("The element with xpath  is not stable in the application", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath   due to unknown error");
		reportStep("The element with xpath   due to unknown error", "fail");
	
	}
}
public void frameid(String id) {
	try {
		WebElement myframe=driver.findElementById(id);
		driver.switchTo().frame(myframe);
		//System.out.println("The frame is located");
		reportStep("The frame is located","pass");
	} catch (NoSuchFrameException e) {
		// TODO Auto-generated catch block
		//System.err.println("The element is neither an iframe nor a frame element");
		reportStep("The element is neither an iframe nor a frame element", "fail");
	}	catch (StaleElementReferenceException e) {
		// TODO: handle exception
		//System.err.println("The element is not stable in the application");
		reportStep("The element is not stable in the application", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("switching is not verified due to unknown error");
		reportStep("switching is not verified due to unknown error", "fail");
	}
	}	

     public void framexpath() {
    try {	
    WebElement myframe=driver.findElementByXPath("//*[@id=\"iframeResult\"]");
     driver.switchTo().frame(myframe);
    //System.out.println("The frame is located");
    reportStep("The frame is located","pass");
} catch (NoSuchFrameException e) {
	// TODO Auto-generated catch block
	//System.err.println("The element is neither an iframe nor a frame element");
	reportStep("The element is neither an iframe nor a frame element", "fail");
}	catch (StaleElementReferenceException e) {
	// TODO: handle exception
	//System.err.println("The element is not stable in the application");
	reportStep("The element is not stable in the application", "fail");
}catch (WebDriverException e) {
	// TODO: handle exception
	//System.err.println("switching is not verified due to unknown error");
	reportStep("switching is not verified due to unknown error", "fail");
}	
}
public void sendkeys1(String xpath) {
	try {
	driver.findElementByXPath(xpath).sendKeys(Keys.ARROW_DOWN);
	//System.out.println("The element xpath " +xpath+" is entered with data ");
	reportStep("The element xpath " +xpath+" is entered with data ","pass");
}catch (NoSuchElementException e) {
	// TODO Auto-generated catch block
	//System.err.println("The element with xpath "+xpath+" is not found in the DOM");
	reportStep("The element with xpath "+xpath+" is not found in the DOM", "fail");
}catch (ElementNotVisibleException e) {
	// TODO: handle exception
	//System.err.println("The element with xpath "+xpath+" is not visible in the application");
	reportStep("The element with xpath "+xpath+" is not visible in the application", "fail");
}catch (ElementNotInteractableException e) {
	// TODO: handle exception
	//System.err.println("The element with xpath "+xpath+" is not interactable in the application");
	reportStep("The element with xpath "+xpath+" is not interactable in the application", "fail");
}catch (StaleElementReferenceException e) {
	// TODO: handle exception
	//System.err.println("The element with xpath "+xpath+" is not stable in the application");
	reportStep("The element with xpath "+xpath+" is not stable in the application", "fail");
}catch (WebDriverException e) {
	// TODO: handle exception
	//System.err.println("The element with xpath "+xpath+"  due to unknown error");
	reportStep("The element with xpath "+xpath+"  due to unknown error", "fail");

}
}
public void sendkeys(String data) {
	 try {
		driver.switchTo().alert().sendKeys(data);
		//System.out.println("Switching to alert " +data);
		reportStep("Switching to alert " +data,"pass");
	} catch (NoAlertPresentException e) {
		// TODO Auto-generated catch block
		//System.err.println("Capture text from NoAlert message");
		reportStep("Capture text from NoAlert message", "fail");
	}catch (UnhandledAlertException e) {
		// TODO: handle exception
		//System.err.println("Capture text from UnhandledAlert message");
		reportStep("Capture text from UnhandledAlert message", "fail");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("Switching is not verified due to unknown error");
		reportStep("Switching is not verified due to unknown error", "fail");
	
	}
	}
public void defaultContent() {
	try {
		driver.switchTo().defaultContent();
		//System.out.println("Focussed on default window");
		reportStep("Focussed on default window", "pass");
	}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("Switching is not verified due to unknown error");
		reportStep("Switching is not verified due to unknown error", "fail");
	}
}

public void selectByxpath(String data) {
	try {
		driver.findElementByXPath(data).click();
		//System.out.println("The element with xpath is selected");
	     reportStep("The element with xpath is selected", "pass");
		}catch (WebDriverException e) {
		// TODO: handle exception
		//System.err.println("The element with xpath not selected");
			reportStep("The element with xpath not selected", "fail");
}	
}
	public void mouseHoverByXPath(String data) {
		try {
		   driver.findElementByXPath(data).click();
			WebElement holidays = driver.findElementByLinkText(data);
			
			Actions builder = new Actions(driver);
			
			builder.moveToElement(holidays).perform();
			//System.out.println("The element with xpath is selected");
		    reportStep("The element with xpath is selected", "pass");
			}catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath not selected");
				reportStep("The element with xpath not selected", "fail"); 
		
	}}
	}
		
	

