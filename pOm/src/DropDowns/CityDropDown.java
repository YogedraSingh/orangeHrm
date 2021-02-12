package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CityDropDown {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@text='Indore (IDR)']")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@text='Ahmedabad (AMD)'])[2]")).click();

		WebElement OneWay = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		OneWay.click();
		Assert.assertTrue(OneWay.isSelected());
		
Thread.sleep(1000);
		driver.close();



	}
}

