package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");

WebDriver driver=new ChromeDriver();   // launches chrome with blank url

driver.manage().window().maximize();

/*//navigate to the url
driver.get("http://www.gmail.com/");

//Enter username
driver.findElement(By.name("identifier")).sendKeys("priyankazambare10mail.com");

//Enter password
//driver.findElement(By.xpath('//*[@id='identifierNext']/span/span')).click();

//click login button
//driver.findElement(By.id("tdb1")).click();

*/

driver.get("http://www.google.com/");
driver.findElement(By.linkText("Gmail")).click();

	}

}
