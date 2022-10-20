package com.actitime_automation_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends Basepage
{
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
public loginpage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver,this);
}
public void setusername(String un)
{
	username.sendKeys(un);
}

public void setpassword(String pw)
{
	password.sendKeys(pw);
}

public void ClickonLoginButton()
{
	loginButton.click();
}

}
