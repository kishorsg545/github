package com.actitime_automation_project.script;

import org.testng.annotations.Test;
import org.testng.internal.Version;

import com.actitime_automation_project.pom.version;

public class verfyversion extends Basetest 
{

	@Test
	
	public void vefyversion()
	{
		version a1=new version(driver);
				a1.verfyversion("actiTIME 2015.1");
			
	}
	
}
 