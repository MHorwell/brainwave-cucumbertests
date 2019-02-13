package com.qa.brainwave.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	@FindBy(id = "beachName")
	private WebElement searchBar;
	
	@FindBy(id = "latitude")
	private WebElement latitudeInput;
	
	@FindBy(id = "longtitude")
	private WebElement longtitudeInput;
	
	@FindBy(id = "searchDistance")
	private WebElement searchLimit;
	
	@FindBy(id = "km")
	private WebElement kmButton;
	
	@FindBy(id = "miles")
	private WebElement milesButton;
	
	@FindBy(id = "searchButton")
	private WebElement searchButton;
	
	public void enterString(String searchString) {
		searchBar.sendKeys(searchString);
	}
	
	public void submitSearch() {
		searchButton.click();
	}
	
	public void inputLatitude(float latitude) {
		latitudeInput.sendKeys(String.valueOf(latitude));
	}
	
	public void inputLongtitude(float longtitude) {
		longtitudeInput.sendKeys(String.valueOf(longtitude));
	}
	
	public void setSearchLimit(int distance) {
		searchLimit.sendKeys(String.valueOf(distance));
	}
	
	public void selectKm() {
		kmButton.click();
	}
	
	public void selectMiles() {
		milesButton.click();
	}
	
	

}
