package com.pom.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass
{
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
public static WebDriver driver;

public static void OpenBrowser(String browser)
{
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
public static void openTheApplication() {
	driver.get("http://localhost/login.do");
}

public static void closeTheBrowser() {
	driver.close();	
}
	


}
