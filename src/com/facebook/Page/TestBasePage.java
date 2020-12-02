package com.facebook.Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBasePage {
	
	public WebDriver driver;
	public Properties prop;
	
	public TestBasePage() throws IOException
	{
		FileInputStream ip = new FileInputStream("D:\\Bipin\\11th April 2020\\Page Object Model\\src\\com\\facebook\\OR\\settings.properties");
		prop = new Properties();
		prop.load(ip);
		
		if(prop.getProperty("browserName").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\com\\facebook\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browserName").equalsIgnoreCase("firefox"))
		{
			System.getProperty("webdriver.gecko.driver", "D:\\Bipin\\11th April 2020\\Page Object Model\\src\\com\\facebook\\drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("open IE");
		}
			
			
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
public void sendKeys(String xpathKey, String userData)
{
	driver.findElement(By.xpath(prop.getProperty(xpathKey))).sendKeys(userData);;
}
	
public void click(String xpathKey)
{
	driver.findElement(By.xpath(prop.getProperty(xpathKey))).click();
}

public boolean isLinkPresent(String xpathKey) 
{
	try
	{
	driver.findElement(By.xpath(prop.getProperty(xpathKey)));
	return true;
	}
	catch(Exception e)
	{
		return false;
	}
	
}





}

















