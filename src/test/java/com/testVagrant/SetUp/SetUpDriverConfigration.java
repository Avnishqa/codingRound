package com.testVagrant.SetUp;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.sun.javafx.PlatformUtil;
import com.testVagrant.Actions.CommonActions;
import com.testVagrant.Actions.HomePageActions;

public class SetUpDriverConfigration {
	
	WebDriver driver;
	public CommonActions commonAc;
	public HomePageActions homePageAc;
	public SetUpDriverConfigration(String url) {
		driver=launchChromeDriver();		
		pageInit(driver);
		
	}
	
	@SuppressWarnings("deprecation")
	public WebDriver launchChromeDriver(){
		setDriverPath();
    	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	    chromePrefs.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	options.setExperimentalOption("prefs", chromePrefs);
	DesiredCapabilities cap = DesiredCapabilities.chrome();
	cap.setCapability("chrome.verbose", false);
	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	cap.setCapability(ChromeOptions.CAPABILITY, options);
	driver = new ChromeDriver(cap);
	driver.manage().window().maximize();
	
	return driver;
    }
	
	private void pageInit(WebDriver driver){
		commonAc=new CommonActions(driver);
		homePageAc=new HomePageActions(driver);
		
	}
	
	public void launchApplication(String url){
		driver.get(url);
		commonAc.logMessage("Application url "+url+" has launched");
	}
	
	public void closeApplication(){
		driver.quit();
		commonAc.logMessage("Application has closed");
	}
	
	private void setDriverPath() {
        if (PlatformUtil.isMac()) {
        	
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
        	
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
        	
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }
}
