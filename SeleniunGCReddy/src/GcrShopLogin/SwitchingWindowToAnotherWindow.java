package GcrShopLogin;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindowToAnotherWindow {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Windows.html");
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\'Tabbed\']/a/button")).click();	
	System.out.println(driver.getTitle());                //we got 1st window title
	
	Set <String>s=driver.getWindowHandles();   //driver.getWindowHandle()-how many window will open and write their id,those id stored in a variable and what king of varible so we use Set class and that value is string type.

	//how read vlue
	for(String i:s){
		String t=driver.switchTo().window(i).getTitle();
		System.out.println(t);
		
		//if we want to close the window "Frames & windows" then,
		if(t.equals("Sakinalium | Home")) {
			driver.close();
		}
	}
	
	
	
	
	
	

}
}
