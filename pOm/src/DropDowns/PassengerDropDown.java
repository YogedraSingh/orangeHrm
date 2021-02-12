package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassengerDropDown
{
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		WebElement PassengerDropDown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
		Select DropDown = new Select(PassengerDropDown);
		List<WebElement> Options = DropDown.getOptions();
		for (WebElement option : Options) {
			System.out.println(option.getText());
			}
		DropDown.selectByIndex(3);
		
		WebElement ChildDD=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
		Select CDD = new Select(ChildDD);
		CDD.selectByIndex(3);
		
		
		WebElement InfantDD=driver.findElement(By.id("ctl00_mainContent_ddl_Infant"));
		Select IDD = new Select(InfantDD);
		IDD.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
