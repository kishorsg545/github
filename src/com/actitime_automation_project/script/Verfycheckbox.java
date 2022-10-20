package com.actitime_automation_project.script;

import java.awt.Checkbox;

import org.testng.annotations.Test;

import com.actitime_automation_project.pom.CheckBox;

public class Verfycheckbox extends Basetest
{
	@Test
	public void verfycheckbox()
	{
		logger.debug("verfy the checkbox");
		CheckBox r=new CheckBox(driver);
				 r.clickoncheckbox();
	}
	

}
