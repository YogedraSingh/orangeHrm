package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage
{
@FindBy(xpath = "//div[text()='Add New']")
private WebElement AddNewButton;

@FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
private WebElement NewCustomer;

@FindBy(xpath = "//div[@class='item createNewProject ellipsis']")
private WebElement NewProject;

@FindBy(xpath = "(//div[@class='title ellipsis'])[4]")
private WebElement AddNewTask;


public TaskListPage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
public void clickonAddNewBtn()
{
	AddNewButton.click();
}
public void clickonAddNewCust()
{
NewCustomer.click();	
}
public void clickonAddNewProject()
{
NewProject.click();	
}
public void clickonAddNewTask()
{
AddNewTask.click();	
}
}

