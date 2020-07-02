package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html	");   		
		
 //  1st popUp window

/*driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/button")).click();

System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();

*/

//  2nd popUp  window

driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/button")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();

driver.findElement(By.xpath("//*[@id=\'easycont\']/div/div[2]/div[2]/div[2]/button")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();




// 3Rd popup window

/*driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
driver.switchTo().alert().sendKeys("hey good morning");
driver.switchTo().alert().accept();
*/
}

}
