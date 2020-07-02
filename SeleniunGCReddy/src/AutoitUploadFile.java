import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitUploadFile {

public static void main(String[] args) throws IOException, InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.automationtesting.in/Register.html");

// click on the Choose File Button
//driver.findElement(By.xpath("//*[@id='imagesrc']")).click();        //Its not working for this so ...........

WebElement button =driver.findElement(By.xpath("//*[@id=\'imagesrc\']"));             // webElement for Choose File Button
JavascriptExecutor js =(JavascriptExecutor)driver;

Thread.sleep(9000);
js.executeScript("arguments[0].click();", button);
Runtime.getRuntime().exec("C:\\Selenium Drivers\\AutoitFile\\UploadFile.exe "+" "+"C:/Users/Priya/Pictures/birds img/Beautiful-Birds.jpg");         


Thread.sleep(5000);
js.executeScript("arguments[0].click();", button);
Runtime.getRuntime().exec("C:\\Selenium Drivers\\AutoitFile\\UploadFile.exe "+" "+"C:\\Users\\Priya\\Pictures\\birds img\\Peachock.jpg");         


Thread.sleep(5000);
js.executeScript("arguments[0].click();", button);
Runtime.getRuntime().exec("C:\\Selenium Drivers\\AutoitFile\\UploadFile.exe "+" "+"C:\\Users\\Priya\\Pictures\\birds img\\FiveBirds.jpg");         











}

}
