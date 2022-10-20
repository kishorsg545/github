package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.loginpage;
import com.actitime_automation_project.pom.logouthomapage;

public class VerfyTitel extends Basetest

{
	@Test
	public void VerfyTitel1()
	{
		loginpage a=new loginpage(driver);
				  a.verfyTitel("actiTIME - Login");
		
		          a.setusername("admin");
		          a.setpassword("manager");
		          a.ClickonLoginButton();
		   
		          logouthomapage c=new logouthomapage(driver);
		                         c.verfyTitel("actiTIME - Enter Time-Track");
		                         
		                         c.clickonlogoutbutton();
		          
	}

}
