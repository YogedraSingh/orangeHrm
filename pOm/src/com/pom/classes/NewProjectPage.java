package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProjectPage
{
@FindBy()
private WebElement ProjectName;

@FindBy(id = "ext-gen65")
private WebElement SelectCustomer;

@FindBy()
private WebElement AddDescription;

@FindBy()
private WebElement CreateProject;

public NewProjectPage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void clickOnProjectName(String pn)
{
	ProjectName.sendKeys(pn);
}
public void clickOnSelectCust()
{
	SelectCustomer.click();
}
public void clickOnAddDesc(String desc)
{
	ProjectName.sendKeys(desc);
}
public void clickOnCreateProj()
{
	CreateProject.click();
}

}
