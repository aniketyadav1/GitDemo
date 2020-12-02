package com.facebook.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebook.Pages.LoginPage;

public class LoginTest {

	@Test
	public void login() throws IOException {
		
		LoginPage lp = new LoginPage();
		Assert.assertTrue(lp.doLogin(), "login failed");
		
		
	}

}
