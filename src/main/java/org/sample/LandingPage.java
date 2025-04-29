package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sample.Abstractcomponents.common;

public class LandingPage extends common {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//PageFactory
	@FindBy(xpath="//a[contains(text(),'Enter the Store')]")
	WebElement enterstore;
	
	@FindBy(xpath="//div[@id='SidebarContent']/a[3]/img[1]")
	WebElement cats ;
	
	
	
	public void launchURL()
	{
		driver.get("https://petstore.octoperf.com");
		
	}
	
	public void enterstore_click()
	{
		enterstore.click();
		
		
	}

}
