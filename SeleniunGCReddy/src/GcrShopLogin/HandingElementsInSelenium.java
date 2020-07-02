package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandingElementsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://2020 Selenium Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/www.google.com");
		boolean linkPresent =driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println(linkPresent);
		boolean link =driver.findElement(By.linkText("Gmail")).isEnabled();
		System.out.println(link);
		
	}

}
