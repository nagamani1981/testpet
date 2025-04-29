package org.sample;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sample.Abstractcomponents.common;

public class Testpet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "/Users/Admin/Downloads/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		LandingPage landing=new LandingPage(driver);
		landing.launchURL();
		common com= new common(driver);
		com.maximize();
		//com.waitsample();
		Thread.sleep(5000);
		landing.enterstore_click();
		Addtocart cat=new Addtocart(driver);
				cat.cat_add_to_cart();
				com.mainmenu();
				cat.parrot_add_to_cart();
				com.mainmenu();
				fish fi=new fish(driver);
				fi.fish_click();
				fi.fish_menu_click();
				shoppingcart shop=new shoppingcart(driver);
				shop.sumup();
				com.dquit();
		
		
		
		
		}

	}

