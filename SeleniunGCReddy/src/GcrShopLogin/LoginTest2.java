package GcrShopLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest2 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver1=new ChromeDriver();
driver1.manage().window().maximize();

LoginTest1 test =new LoginTest1(driver1);
driver1.get("http://newtours.demoaut.com/mercurysignon.php");

test.typeUsername("mercury");
test.typePassword("mercury");
test.ClickLogin();
Thread.sleep(3300);
test.ClickLinkText();
Thread.sleep(3300);
driver1.close();




}
}
