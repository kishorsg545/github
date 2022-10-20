package com.actitime_automation_project.script;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.version;
import com.actitime_automation_project_generics.Excel;

public class verfyversionE extends Basetest

{

	@Test
	public void verfyversionE1()
	{
		String sheet="VersionE";
		String ver = Excel.getCellValue(PATH,sheet, 1, 1);
		
		version v1=new version(driver);
		         v1.verfyversion(ver);
	}
	
	
}
