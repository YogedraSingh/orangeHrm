package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage 
{
@FindBy(id = "customerLightBox_nameField")
private WebElement EnterName;

@FindBy(id = "customerLightBox_descriptionField")
private WebElement AddDescription;

@FindBy(id = "customerLightBox_commitBtn")
private WebElement CreateCustomerBtn;


public NewCustomerPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
	}
public void clickonEnterNamwe(String cn)
{
	EnterName.sendKeys(cn);
}
public void clickonDescription(String des)
{
	AddDescription.sendKeys(des);
}
public void clickonCreateCust()
{
	CreateCustomerBtn.click();
}
}

