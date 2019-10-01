package com.testVagrant.Tests;

import org.testng.annotations.Test;

public class FlightBookingTest extends BaseTest {

	@Test
	public void testThatResultsAppearForAOneWayJourney() {
		setUp.launchApplication("https://www.cleartrip.com/");
		setUp.homePageAc.userPerformClickOnOneWay();
		setUp.homePageAc.userEnterDetailsForFromTag("Bangalore");
		setUp.homePageAc.performClickForFirstOriginOption();
		setUp.homePageAc.userEnterDetailsForToTag("Delhi");
		setUp.homePageAc.performClickForFirstDestinationOption();
		setUp.homePageAc.userSelectTodaysDate();
		setUp.homePageAc.userClickOnSearchButton();
		setUp.homePageAc.verifySearchSummary();
	}

	
}
