package GcrShopLogin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForDataGriven1 {
public static WebDriver driver;
public static void main(String[] args) throws IOException {
	
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
driver  = new ChromeDriver();
driver.manage().window().maximize();

FileReader file =new FileReader("C://Users//Priya//Desktop//Mercury.txt");
BufferedReader br=new BufferedReader(file);

int count=0;
int iteration=0;
String line;

while((line=br.readLine()) != null) {
count=count+1;
iteration=iteration+1;
 
if(count>1) {
iteration=iteration+1;
String inputData[]=line.split(",", 2);
driver.get("http://newtours.demoaut.com/mercurysignon.php");
driver.findElement(By.name("userName")).sendKeys(inputData[0]);
driver.findElement(By.name("password")).sendKeys(inputData[1]);
driver.findElement(By.name("login")).click();


String url=driver.getCurrentUrl();
if(url.contains("http://newtours.demoaut.com/mercuryreservation.php")) {
	System.out.println("Admin login is successful -Passed");
}
	
else {
	System.out.println("Admin login is Unsuccessful - Failed");
}
	
	
	
	
}
}
br.close();
file.close();
driver.close();	
}
}
