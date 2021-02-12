package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiscencePage 
{
	@FindBy(xpath = "//nobr[contains(text(),'Product Edition:')]/../../td[2]")
	private WebElement ProductEdition;
	
	@FindBy(xpath = "//nobr[contains(text(),'Issue Date:')]/../../td[2]")
	private WebElement IssueDate;
	
	public LiscencePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyProductEdition( String expectedProductedition) 
	{
		String actualProductedition = ProductEdition.getText();
		if(actualProductedition.equals(expectedProductedition))
		{
			System.out.println("Expectted product edition is displayed--"+expectedProductedition);
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("expected Product edition is not displayed--"+actualProductedition);
			System.out.println("Test case is Failed");
		}
	}
	public void verifyIssueDate(String expectedIssueDate)
	{
		String actualIssueDate = IssueDate.getText();
		if(actualIssueDate.equals(expectedIssueDate))
		{
		System.out.println("Expected Issue date is displayed--"+expectedIssueDate);
		System.out.println("test case is pass");
		}
		else
		{
			System.out.println("Expected issue date is not displayed--"+actualIssueDate);
			System.out.println("test case is fail");
		}
		
	}

	public void getProductEdition() {
		 System.out.println("ProductEdition.getText()");
	}

	public void getIssueDate() {
	System.out.println(" IssueDate.getText()");
	}
	
	

}
