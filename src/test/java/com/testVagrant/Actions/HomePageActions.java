package com.testVagrant.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testVagrant.ObjectRepository.HomePageObjectRepository;

public class HomePageActions extends HomePageObjectRepository {
	WebDriver driver;
	CommonActions commonActions;

	public HomePageActions(WebDriver driver) {
		super(driver);
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		commonActions = new CommonActions(driver);
	}

	public void userPerformClickOnOneWay() {
		commonActions.performClick(getOneWay());
		commonActions.logMessage("perform click for One Way");
	}

	public void userEnterDetailsForFromTag(String from) {
		commonActions.clearAndEnterDetailInTextBox(getFromTag(), from);

	}

	public void userEnterDetailsForToTag(String To) {
		commonActions.clearAndEnterDetailInTextBox(getToTag(), To);

	}

	public void performClickForFirstOriginOption() {
		commonActions.performClick(getListOfOrginOption().get(0));
		commonActions.logMessage("perform click for first origin option");
	}

	public void performClickForFirstDestinationOption() {
		commonActions.performClick(getListOfdestination().get(0));
		commonActions.logMessage("perform click for first destination option");
	}

	public void userSelectTodaysDate() {
		commonActions.performClick(getTodayDate());
		commonActions.logMessage("perform click for today");
	}

	public void userClickOnSearchButton() {
		commonActions.performClick(getSearchButton());
		commonActions.logMessage("perform click for search button");
	}

	public void verifySearchSummary() {
		Assert.assertTrue(getSearchSummary().isDisplayed());
		commonActions.logMessage("verify Search Summary");
	}
	
	public void userNavigatedToHotels(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		commonActions.performClick(hotelLink);
		commonActions.logMessage("user Navigated To Hotels");
	}
	
	
	
	
	public void userEnterLocalityDetail(String locality) {
		commonActions.clearAndEnterDetailInTextBox(localityTextBox, locality);

	}
	
	public void travellerSelection(String option){
		selectDropdownValue(travellerSelection, option);
		commonActions.logMessage("traveller Selection");
	}
	
	public void userClickOnSearchHotelsButton(){
		commonActions.performClick(searchButton);
		commonActions.logMessage("perform click for search hotels button");
	}
	public void userNavigatedToYourTrips(){
		commonActions.performClick(getYourTrips());
		commonActions.logMessage("user Navigated To Your Trips");
	}
	
	public void userNavigatedToSignIn(){
		commonActions.performClick(getSignIn());
		commonActions.logMessage("user Navigated To Sign In");
	}
	
	public void userClickOnSignInButton(){
		
		commonActions.switchFrameById("modal_window");
		commonActions.performClick(getSignInButton());
		commonActions.logMessage("user Click on sign In button");
	}
	
	public void verifyErrorMessage(String message) {
		Assert.assertTrue(getError1().getText().contains(message));
		commonActions.logMessage("verify Error Message as"+message);
	}
	
}
