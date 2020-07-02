package HtmlTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPickTestp {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.manage().window();
driver.get("http://www.jquerycookbook.com/demos/S9-General/67-datepicker.html");

driver.findElement(By.id("datep")).click();       //open the data picker
driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).click();

for(int i=8;i>=1;i--) {
	driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[2]/span")).click();         ///click on the forward arrow
	String m= driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();   //inspect month 
    
	if(m.equals("June")) {
		driver.findElement(By.linkText("20")).click();
		break;
	}
	

	
}




	}

}
