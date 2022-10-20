package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.Invalidloginpage;
import com.actitime_automation_project.pom.loginpage;
import com.actitime_automation_project_generics.Excel;

public class VerfyInvalidLoginPageE extends Basetest 

{
	@Test
	public void VerfyInvalidLoginPageE1() throws InterruptedException
	
	{
		String sheet="VerfyInvalidLoginPageE";
		int totalrow = Excel.getRowCount(PATH,sheet);
		for (int i=0; i<totalrow; i++)
		{
			String un = Excel.getCellValue(PATH, sheet,i, 1);
			String pw= Excel.getCellValue(PATH, sheet, i, 2);
			loginpage a1=new loginpage(driver);
	          a1.setusername(un);
	          a1.setpassword(pw);
	          
	          Thread.sleep(5000);
	          
	      Invalidloginpage x1=new Invalidloginpage(driver);
	                       x1.verfyinvalidloginpage();
		}
		
		
	}

}
