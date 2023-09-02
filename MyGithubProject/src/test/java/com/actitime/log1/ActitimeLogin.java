package com.actitime.log1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActitimeLogin {

	@Test
	public void loginActi()
	{
		Reporter.log("Login",true);
	}
@Test
	public void logOut()
	{
		Reporter.log("LOGOUT",true);
	}
	
}
