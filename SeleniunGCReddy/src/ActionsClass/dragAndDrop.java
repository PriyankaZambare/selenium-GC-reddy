package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");

WebElement source = driver.findElement(By.id("drag1"));

WebElement target = driver.findElement(By.xpath("//*[@id=\'div2\']"));

Actions act =new Actions(driver);
	
act.clickAndHold(source).moveToElement(target).release().build().perform();	

//act.dragAndDrop(source, target);
	
	
System.out.println("pass");	
	
driver.close();

	
	
	
}
}
