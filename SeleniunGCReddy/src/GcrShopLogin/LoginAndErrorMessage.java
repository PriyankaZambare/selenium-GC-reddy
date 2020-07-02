package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndErrorMessage {
static String ErrorMessage;	
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://localhost/index.php");
driver.findElement(By.name("login[email]")).sendKeys("admin3@localhost.com");
driver.findElement(By.name("login[password]")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[4]/button")).click();

String url=driver.getCurrentUrl();

if(!url.contains("http://localhost/index.php/")){
ErrorMessage =driver.findElement(By.id("userAlertContainer")).getText();
System.out.println(ErrorMessage);

}
}
}