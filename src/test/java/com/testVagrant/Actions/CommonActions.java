package com.testVagrant.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class CommonActions {
WebDriver driver;
	
	public CommonActions(WebDriver driver) {
		this.driver=driver;
	}
	
	public void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    
    
    public void performClick(WebElement ele){
    	ele.click();
    	
    }
    
    public void clearAndEnterDetailInTextBox(WebElement ele,String detail){
    	ele.clear();
    	ele.sendKeys(detail);
    	logMessage("User entered "+detail);
    }
    
    public void switchFrameById(String id){
    	WebElement ele=driver.findElement(By.id(id));
    	driver.switchTo().frame(ele);
    	
    }
    
    public void logMessage(String message){
    	Reporter.log(message+"\n",true);
    }
	
}
