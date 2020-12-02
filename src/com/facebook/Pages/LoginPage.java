package com.facebook.Pages;

import java.io.IOException;

import com.facebook.Page.TestBasePage;

public class LoginPage extends TestBasePage {
	// all the features which belong to Signin Page
	// login, create account, forgot password, change language etc
	
	
	
	public LoginPage() throws IOException {
		super();
		
	}

	public boolean doLogin()
	{
				
		//userName
		//driver.findElement(By.xpath("")).sendKeys("Seleniumforsure@gmail.com");
		sendKeys("EmailAddressOrPhoneNumber", "Seleniumforsure@gmail.com");
		
		
		//password
		//driver.findElement(By.xpath("")).sendKeys("Password_123");
		sendKeys("password", "Password_123");
		
		
		//click on login button
		//driver.findElement(By.xpath("")).click();
		click("LogIn");
		
		//check whether log in is succesful or not
		boolean result=isLinkPresent("Home");
		return result;
	
	
	}

	
	public void changeLanguage()
	{
		System.out.println("change language");
		
	}
}
