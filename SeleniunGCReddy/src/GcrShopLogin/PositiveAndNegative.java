package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveAndNegative {
static String Uname, Password;
static int iteration=0;

public static void main(String[] args) {
for(int i=1; i<=2;i++) {
iteration=iteration+1;

if(i==1) {
Uname="mercury"; 
Password="mercury";
}
else if(i==2) {
Uname="Mercury";
Password="Mercury";
}
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://newtours.demoaut.com/mercurysignon.php");
driver.findElement(By.name("userName")).sendKeys(Uname);
driver.findElement(By.name("password")).sendKeys(Password);
driver.findElement(By.name("login")).click();	

String url=driver.getCurrentUrl();
if(url.contains("http://newtours.demoaut.com/mercuryreservation.php"))
{
System.out.println(iteration+"Admin Login is Successful: - Passed");
}
else {
System.out.println(iteration+"Admin Login is Unsuccessful: - Failed");	
}
driver.close();
}
}
	
	
	
	
}

