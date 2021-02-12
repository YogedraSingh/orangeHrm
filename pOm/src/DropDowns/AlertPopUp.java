package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp 
{
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args)
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.findElement(By.id("name")).sendKeys("Yogendra");
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			driver.close();
			
			
			
	}

}
