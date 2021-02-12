package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown 
{
static
{
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	
	WebElement staticDropDown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select DropDown = new Select(staticDropDown);
	List<WebElement> options = DropDown.getOptions();
	for (WebElement option : options) {
		System.out.println(option.getText());
	}

	DropDown.selectByIndex(4);
	DropDown.selectByValue("INR");
	DropDown.selectByVisibleText("USD");
	
	Thread.sleep(3000);
	driver.close();
	
	}

}
