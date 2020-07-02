package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

Actions act=new Actions(driver);

WebElement copy = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));            
	
act.contextClick(copy).build().perform();
//driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();       //right click on button
//System.out.println(driver.switchTo().alert().getText());
//driver.switchTo().alert().accept();	
}
}

//html/body/ul/li[3]
///html/body/ul/li[2]/span