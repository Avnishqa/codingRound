package com.testVagrant.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.testVagrant.SetUp.SetUpDriverConfigration;

public class BaseTest {
	SetUpDriverConfigration setUp;

	@BeforeClass
	public void setUp() {
		setUp = new SetUpDriverConfigration("https://www.cleartrip.com/");
	}

	@AfterClass
	public void tearDown() {
		setUp.closeApplication();
	}

}
