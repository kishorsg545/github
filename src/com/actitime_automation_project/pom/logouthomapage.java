package com.actitime_automation_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logouthomapage extends Basepage
{
	@FindBy(id="logoutLink")
	private WebElement logoutpage;
	
	public logouthomapage(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver,this);
		
	}
	public void clickonlogoutbutton()
	{
		
	}

}
