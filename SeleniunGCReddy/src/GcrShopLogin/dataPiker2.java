package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataPiker2 {

public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html"); 
	
	//data picker  --  click data picker button
	driver.findElement(By.xpath("//*[@id=\'sandbox-container1\']/div/span")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[2]/th[2]")).click();
	
	for (int i=1;i<11;i++)
	{
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/thead/tr[2]/th[1]")).click();    //click on backword array
	}
	driver.findElement(By.xpath("/html/body/div[3]/div[2]/table/tbody/tr/td/span[11]")).click();      //click on maonth
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[5]/td[1]")).click();        //click on date
}

}
