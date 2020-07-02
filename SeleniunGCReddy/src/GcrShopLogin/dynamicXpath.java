package GcrShopLogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpath {

public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.yahoo.com");

driver.findElement(By.xpath("//*[@id=\'header-search-input\']")).sendKeys("selenium");

List <WebElement> list = driver.findElements(By.xpath("//*[@id=\'header-search-form\']/div[1]/div/div/ul/li[2]/span/span/b"));
Thread.sleep(5000);

list.get(0).click();



}
}
