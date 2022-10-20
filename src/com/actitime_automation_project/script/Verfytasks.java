package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.loginpage;
import com.actitime_automation_project.pom.logouthomapage;
import com.actitime_automation_project.pom.tasks;

public class Verfytasks extends Basetest

{
	@Test
	public void verfyvalidloginpage()
	{
		loginpage l1=new loginpage(driver);
		          l1.setusername("admin");
		          l1.setpassword("manager");
	
		         l1.ClickonLoginButton();
		         
		         tasks c=new tasks(driver);
		               c.clickontask();
		        	   c.sendfiltetaskbyrname("kishor");
		        	   
		        	   logouthomapage z=new  logouthomapage(driver);
		                z.clickonlogoutbutton();
	}

}
