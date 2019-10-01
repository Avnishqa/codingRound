package com.testVagrant.ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjectRepository extends CommonPageObjectRepository {

	@FindBy(xpath = "//a[text()='Hotels']")
	protected
	WebElement hotelLink;

	@FindBy(id = "Tags")
	protected WebElement localityTextBox;

	@FindBy(id = "SearchHotelsButton")
	protected WebElement searchButton;

	@FindBy(id = "travellersOnhome")
	protected WebElement travellerSelection;
	
	
	WebDriver driver;
	WebDriverWait wait;
	int timeout = 60;

	public HomePageObjectRepository(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, timeout);

	}

	public WebElement getOneWay() {
		return waitForElementToBeVisible(By.id("OneWay"));
	}

	public WebElement getFromTag() {
		return waitForElementToBeVisible(By.id("FromTag"));
	}

	public WebElement getToTag() {
		return waitForElementToBeVisible(By.id("ToTag"));
	}

	public List<WebElement> getListOfOrginOption() {
		return waitForElementToBeVisible(By.id("ui-id-1")).findElements(By.tagName("li"));
	}

	public List<WebElement> getListOfdestination() {
		return waitForElementToBeVisible(By.id("ui-id-2")).findElements(By.tagName("li"));
	}

	public WebElement getTodayDate() {
		return waitForElementToBeVisible(By.xpath(
				"//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td[@data-handler='selectDay']/a[contains(@class,'active')]"));
	}

	public WebElement getSearchButton() {
		return waitForElementToBeVisible(By.id("SearchBtn"));
	}

	public WebElement getSearchSummary() {
		return waitForElementToBeVisible(By.className("searchSummary"));
	}
	
	public WebElement getYourTrips() {
		return waitForElementToBeVisible(By.linkText("Your trips"));
	}
	
	public WebElement getSignIn() {
		return waitForElementToBeVisible(By.id("SignIn"));
	}
	
	public WebElement getSignInButton() {
		return waitForElementToBeVisible(By.id("signInButton"));
	}
	
	
	public WebElement getError1() {
		return waitForElementToBeVisible(By.id("errors1"));
	}
}
