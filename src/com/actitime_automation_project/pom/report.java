package com.actitime_automation_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class report extends Basepage
{
	@FindBy(xpath = "//div[.='Reports']")
	private WebElement reports;
	
	@FindBy(id = "ext-gen20")
	private WebElement creatreports;
	@FindBy(xpath = "//body/div[@id='ext-gen373']/ul[@id='ext-gen377']/li[@id='ext-gen397']/a[@id='ext-gen398']/span[1]/div[2]")
	private WebElement last7days;
	
	public report(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonrepots()
	{
		reports.click();
	}
	public void clickoncreatreports()
	{
		creatreports.click();
	}
	Actions action=new Actions(driver);
	public void selectlast7days()
	{
		action.moveToElement(last7days).click().perform();
	}
	

}
