package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fish {
	
	WebDriver driver;
	public fish(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id='SidebarContent']/a[1]/img[1]")
	WebElement fish;
	
	@FindBy(xpath="//a[contains(text(),'FI-SW-01')]")
	WebElement fishmenu;
	
	@FindBy(xpath="//a[contains(text(),'Add to Cart')]")
	WebElement Addtcart;
	
	
	public void fish_click()
	{
		fish.click();
	}
	public void fish_menu_click()
	{
		fishmenu.click();
		Addtcart.click();
	}


}
