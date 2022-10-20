package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.loginpage;
import com.actitime_automation_project.pom.logouthomapage;

public class Verfyhomepage extends Basetest

{
	@Test
	
	public void verfyhomepage() throws InterruptedException
	
	{
		logger.debug("verfy the login page");
		Thread.sleep(5000);
		loginpage l1=new loginpage(driver);
		logger.debug("enter the sername");
		
        l1.setusername("admin");
        logger.debug("enter the password");
        l1.setpassword("manager");
        l1.ClickonLoginButton();
		          Thread.sleep(5000);      
		 logouthomapage z=new  logouthomapage(driver);
		                z.clickonlogoutbutton();
	}
	
}






