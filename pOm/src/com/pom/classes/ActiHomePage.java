package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiHomePage
{
@FindBy(xpath = "//a[@class='content selected tt']")
private WebElement enterTimeTrack;

@FindBy(xpath = "(//div[contains(text(),'Settings')])[1]")
private WebElement settings;

@FindBy(linkText = "Licenses")
private WebElement liscence;

@FindBy(id = "logoutLink")
private WebElement logOut;


public ActiHomePage(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}

public void clickonTaskTab() 
{
	enterTimeTrack.click();
}
public void clickonSetting() 
{
	settings.click();
}
public void clickonLiscence() 
{
liscence.click();	
}
public void cliclonLogout()
{
	logOut.click();
}

public void getEnterTimeTrack() {
	 enterTimeTrack.click();;
}

public void getSettings() {
	 settings.click();;
}

public void getLiscence() {
	 liscence.click();
}

public void getLogOut() {
 logOut.click();;
}
public void verifyHomePage(WebDriver driver, String expectedPageTitle) 
{
	String actualPageTitle = driver.getTitle();
	if(actualPageTitle.equals(expectedPageTitle))
	{
		System.out.println("The Expected Page is displayed--"+expectedPageTitle);
		System.out.println("TestCase Is pass");
	}
	else
	{
		System.out.println("The Expected Page is not displayed--"+actualPageTitle);
		System.out.println("Error ");
	}
}
}
