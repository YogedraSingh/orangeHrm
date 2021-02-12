package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage
{
@FindBy(id="username")
private WebElement unTb;

@FindBy(name="pwd")
private WebElement pwtb;

@FindBy(id="keepLoggedInCheckBox")
private WebElement chkBOX;

@FindBy(xpath = "//div[text()='Login ']")
private WebElement lgnBtn;

@FindBy(linkText = "actiTIME Inc.")
private WebElement actiINC;

@FindBy(linkText = "View License")
private WebElement liscencePg;


public ActiTimeLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void getUserName(String un)
{
	unTb.sendKeys(un);
}
public void getPassWord(String pw)
{
pwtb.sendKeys(pw);	
}
public void clickchkBox()
{
chkBOX.click();
}
public void lgnBtn() 
{
	lgnBtn.click();
}
public void clickInc() 
{
	actiINC.click();
}
public void clickLiscence() 
{
	liscencePg.click();
}
public void login() 
{
	unTb.sendKeys("admin");
	pwtb.sendKeys("manager");
	lgnBtn.click();
	
}
public void name(String un, String pw) 
{
	unTb.sendKeys(un);
	pwtb.sendKeys(pw);
	lgnBtn.click();
	
}
}



