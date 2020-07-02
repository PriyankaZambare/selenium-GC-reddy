package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
driver.manage().window().maximize();

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();

Actions act =new Actions(driver);
WebElement Admin=driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
WebElement Usemanagement =driver.findElement(By.id("menu_admin_UserManagement"));
WebElement use =driver.findElement(By.id("menu_admin_viewSystemUsers"));

/*
 * act.moveToElement(Admin).build().perform();                    //mouse over to admin tap
 * act.moveToElement(Usemanagement).build().perform();               // mouse over to usermanagerment tap 
 * act.moveToElement(use).click().build().perform();      //mouse  over to user tap and click.
 * driver.close();
 * 
 */

act.moveToElement(Admin).moveToElement(Usemanagement).moveToElement(use).click().build().perform();
driver.close();



}
}
