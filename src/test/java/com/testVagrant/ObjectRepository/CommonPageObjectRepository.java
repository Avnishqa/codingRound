package com.testVagrant.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPageObjectRepository {
	WebDriver driver;
	WebDriverWait wait;
	int timeout = 60;

	public CommonPageObjectRepository(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, timeout);
	}

	public WebElement waitForElementToBeVisible(By locator) {

		WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}

	public List<WebElement> waitForElementsToBeVisible(By locator) {
		List<WebElement> webElements = (List<WebElement>) wait
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

		return webElements;
	}
	
	public void selectDropdownValue(WebElement ele,String option){
		 new Select(ele).selectByVisibleText(option);
		 
		 
	}
}
