package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.loginpage;

public class verfyvalidloginpage extends Basetest 

{
	@Test
	public void verfyvalidloginpage1()
	{
		loginpage l1=new loginpage(driver);                               
		          l1.setusername("admin");
		          l1.setpassword("manager");
		          l1.ClickonLoginButton();
	}

}