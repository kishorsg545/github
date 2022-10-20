package com.actitime_automation_project.script;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class Basetest implements AutomationConstant 
{
	public WebDriver driver; 
	
	Logger logger;
	
  @BeforeMethod
  
  public void precondtion() throws InterruptedException
	{
	  logger=logger.getLogger("devpinoyLogger");
	  logger.debug("open the browser");
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
	Thread.sleep(5000);
	logger.debug("windows sheet maximize");
	driver.manage().window().maximize();
	
	logger.debug("enter the URL");
	driver.get("http://localhost/login.do");
	
	logger.debug("enter the implicity");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);	
	}

  @AfterMethod
  public void postcondtion() throws InterruptedException
  {
	  logger.debug("browser close");
	  Thread.sleep(5000);
	  driver.close();
  }
}
