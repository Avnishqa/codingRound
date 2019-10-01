package com.testVagrant.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignInTest extends BaseTest {

	WebDriver driver;

	@Test
	public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

		setUp.launchApplication("https://www.cleartrip.com/");
		setUp.homePageAc.userNavigatedToYourTrips();
		setUp.homePageAc.userNavigatedToSignIn();
		setUp.homePageAc.userClickOnSignInButton();
		setUp.homePageAc.verifyErrorMessage("There were errors in your submission");

	}

}
