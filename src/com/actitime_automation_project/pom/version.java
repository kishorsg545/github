package com.actitime_automation_project.pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class version extends Basepage
{
@FindBy(xpath = "//nobr[.='actiTIME 2015.1']")
private WebElement version; 

public version(WebDriver driver)
{
	super(driver);
	
	PageFactory.initElements(driver,this);
}

public void verfyversion(String eVersion)
{
	String aVersion =version.getText();
	Assert.assertEquals(aVersion, eVersion);
}


}
