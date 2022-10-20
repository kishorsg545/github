package com.actitime_automation_project.script;

import java.sql.Driver;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.Invalidloginpage;
import com.actitime_automation_project.pom.loginpage;

public class Verfyinvalidpage extends Basetest

{
	@Test
	
	public void Verfyinvalidpage1()
	{
		logger.debug("enter username ");
		loginpage a=new loginpage(driver);
				 a.setusername("admin");
				 logger.debug("enter password");
		         a.setpassword("12345");
		         a.ClickonLoginButton();
		         
		Invalidloginpage d=new Invalidloginpage(driver);
				          d.verfyinvalidloginpage();
	}

}
                           