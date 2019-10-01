package com.testVagrant.Tests;

import org.testng.annotations.Test;

public class HotelBookingTest extends BaseTest {
	@Test
	public void shouldBeAbleToSearchForHotels() {
		setUp.launchApplication("https://www.cleartrip.com/");
		setUp.homePageAc.userNavigatedToHotels();
		setUp.homePageAc.userEnterLocalityDetail("Indiranagar, Bangalore");
		setUp.homePageAc.travellerSelection("1 room, 2 adults");
		setUp.homePageAc.userClickOnSearchHotelsButton();

	}

}
