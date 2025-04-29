package sample.Abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class common {
	WebDriver driver;
	public common(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Return to Main Menu')]")
	WebElement mainmenu;
	
	

	public void maximize()
	{
		driver.manage().window().maximize();
	}
	public void waitsample() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	public void mainmenu()
	{
		mainmenu.click();
	}
	public void dquit()
	{
		driver.quit();
	}
	
	

}
