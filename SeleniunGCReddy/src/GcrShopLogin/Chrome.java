package GcrShopLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");   
   String browsertitle= driver.getTitle();         // get title
   System.out.println(browsertitle);
   
   String browerUrl=driver.getCurrentUrl();           //get current url
   System.out.println(browerUrl);
   driver.navigate().to("http://www.yahoo.com");   //navigate to one url to another url
   browerUrl = driver.getCurrentUrl();
   System.out.println(browerUrl);
   driver.navigate().back();                     //navigate back command
   
   driver.navigate().forward();
   
   
		
		
		
		

	}

}