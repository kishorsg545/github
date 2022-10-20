package com.actitime_automation_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tasks extends Basepage

{
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasks;
	
	@FindBy(name = "visiableFilterString")
	private WebElement filtername;
	
	public tasks(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver,this);
	}
	public void clickontask()
	{
		tasks.click();
	}
	public void sendfiltetaskbyrname(String ftn)
	{
		filtername.sendKeys(ftn);
	}
	

}
