package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.loginpage;
import com.actitime_automation_project.pom.logouthomapage;
import com.actitime_automation_project_generics.Excel;

public class VerfyValidLoginPageE  extends Basetest
{
	@Test
	public void VerfyValidLoginPageE1()
	{
		
		String sheet="ValidLoginpageE";
		String un = Excel.getCellValue(PATH, sheet, 1, 1);
		String pw = Excel.getCellValue(PATH, sheet, 1, 2);
		String lpt = Excel.getCellValue(PATH, sheet, 1, 3);
		String hpt = Excel.getCellValue(PATH, sheet, 1, 4);
		
		loginpage a1=new loginpage(driver);
		          a1.verfyTitel(lpt);
		          a1.setusername(un);
		          a1.setpassword(pw);
		          a1.ClickonLoginButton();
		          
		          
		logouthomapage b1=new logouthomapage(driver);
		               b1.verfyTitel(hpt);
		               
		               b1.clickonlogoutbutton();
	}

}
