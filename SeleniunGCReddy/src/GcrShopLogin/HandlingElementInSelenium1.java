package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingElementInSelenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://2020 Selenium Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:/www.google.com/");
		driver.manage().window().maximize();
		/*
		 * driver.navigate().to("http:/www.gmail.com/"); 
		 * driver.navigate().back();
		 * driver.navigate().forward();
		 *  driver.navigate().refresh();
		 * 
		 * driver.getCurrentUrl(); 
		 * System.out.println(driver.getCurrentUrl());
		 * driver.getTitle(); 
		 * System.out.println(driver.getTitle()); //
		 * driver.getPageSource();
		 */	//	System.out.println(driver.getPageSource());
		boolean linkPresent=driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(linkPresent);
		boolean link=driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println(link);
		
		driver.quit();
	}
}
