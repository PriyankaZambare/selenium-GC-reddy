package GcrShopLogin;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaForSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		driver.findElement(By.id("wpName2")).sendKeys("krishna99");
		driver.findElement(By.id("wpPassword2")).sendKeys("krishna");
		driver.findElement(By.id("wpRetype")).sendKeys("krishna");
		driver.findElement(By.id("wpEmail")).sendKeys("priyankazambare@gmail.com");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter confirmation code");
		String captch= scan.nextLine();
		driver.findElement(By.id("mw-input-captchaWord")).sendKeys("captch");

		driver.findElement(By.id("wpCreateaccount")).click();
		
		
		
		
	}

}
