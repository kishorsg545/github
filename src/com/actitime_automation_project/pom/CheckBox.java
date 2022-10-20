package com.actitime_automation_project.pom;

import java.awt.Checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import graphql.Assert;

public class CheckBox extends Basepage 
{
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkbox;
	
	
	public CheckBox(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickoncheckbox()
	{
		checkbox.click();	
		Assert.assertTrue(checkbox.isSelected());
	}

}
