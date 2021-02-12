package com.pom.scripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pom.classes.ActiHomePage;
import com.pom.classes.ActiTimeLoginPage;
import com.pom.classes.NewCustomerPage;
import com.pom.classes.NewProjectPage;
import com.pom.classes.TaskListPage;
import com.pom.generic.BaseClass;

public class TestCreateCustomer extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		OpenBrowser("chrome");
		openTheApplication();
		ActiTimeLoginPage lp = new ActiTimeLoginPage(driver);
		lp.login();
		ActiHomePage etp = new ActiHomePage(driver);
		
		
		TaskListPage tlp = new TaskListPage(driver);
		etp.clickonTaskTab();
		Thread.sleep(1000);
		tlp.clickonAddNewBtn();
		tlp.clickonAddNewCust();
		NewCustomerPage cc = new NewCustomerPage(driver);
		cc.clickonEnterNamwe("Yogi");
		cc.clickonCreateCust();
		tlp.clickonAddNewBtn();
		tlp.clickonAddNewProject();
		NewProjectPage pr = new NewProjectPage(driver);
		pr.clickOnProjectName("Jimmy");
		pr.clickOnSelectCust();
		List<WebElement> listCustomers = driver.findElements(By.xpath("//li[contains(@id,'ext-gen1')]"));
        int count = listCustomers.size();
        System.out.println(count);
        
        for(WebElement customer:listCustomers) {
        	String cn = customer.getText();
        	if(cn.equals("Karthik")) {
        		customer.click();
        		break;
        	}
        }
		pr.clickOnCreateProj();
		etp.cliclonLogout();
		closeTheBrowser();
	}

}
