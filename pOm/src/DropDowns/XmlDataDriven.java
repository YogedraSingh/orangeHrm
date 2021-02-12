package DropDowns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XmlDataDriven
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		String filepath = "./dataProvider/input.xlsx";
		
		Workbook wb = WorkbookFactory.create(new FileInputStream(filepath));
		String un= wb.getSheet("sheet1").getRow(1).getCell(0).toString();
		String pwd = wb.getSheet("sheet1").getRow(1).getCell(1).toString();
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		driver.close();
		

	

}

}
