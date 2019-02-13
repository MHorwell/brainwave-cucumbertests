package com.qa.brainwave.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.brainwave.cucumber.LandingPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BeachSteps {
	
	WebElement element;
	WebDriverWait wait;
	ExtentTest test;
	WebDriver driver;
	LandingPage landingPage;
		
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", Constant.FIREFOXDRIVERPATH + Constant.FIREFOXDRIVER);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		test = TestRunner.report.startTest("Test");
		wait = new WebDriverWait(driver, 10);
	}

	@After
	public void tearDown() {
		driver.quit();
		TestRunner.report.endTest(test);
	}

}
