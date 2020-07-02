package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slidder {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/slider/");
driver.switchTo().frame(0);
WebElement slid = driver.findElement(By.xpath("//*[@id=\'slider\']/span"));

Actions act =new Actions (driver);

act.moveToElement(slid).dragAndDropBy(slid, 250, 0);







}
}
