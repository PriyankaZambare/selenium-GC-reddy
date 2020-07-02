package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BatchTesting {
	public static WebDriver driver;
	public static String url1;
	//Launch Browser
	public void LaunchBrowse() {
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}

	//Closed Browser
	public void ClosedDriver() {
	driver.close();
	}

	//Admin Login
	public void AdminLogin(String Uname,String Pwd)
	{
	driver.get("http://newtours.demoaut.com/mercurysignon.php");
	driver.findElement(By.name("userName")).sendKeys(Uname);
	driver.findElement(By.name("password")).sendKeys(Pwd);
	driver.findElement(By.name("login")).click();	
	}
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");		
	BatchTesting obj =new BatchTesting();

	//Test Case1: Verify admin Login (Positive test case)
	obj.LaunchBrowse();
	obj.AdminLogin("mercury","mercury");
	String url= driver.getCurrentUrl();

	if(url.contains("http://newtours.demoaut.com/mercuryreservation.php"))
	{
		System.out.println("Test Case1: Verify admin Login Successful"+" Passed");
	}
	else {
		System.out.println("Test Case1: Verify admin Login Unsuccessful"+"Failed");	
	}

	obj.ClosedDriver();

	////Test Case2: Verify redirecting functionality
	obj.LaunchBrowse();
	obj.AdminLogin("mercury","mercury");
	url1= driver.getCurrentUrl();

	if(url1.contains("http://newtours.demoaut.com/mercuryreservation.php")) {
	driver.findElement(By.linkText("SIGN-OFF")).click();
	Thread.sleep(3000);
	}

	if(url1.contains("http://newtours.demoaut.com/mercuryreservation.php")) {
	System.out.println("Test Case2:" + " Verify redirecting functionality -Passed") ;
	}
	else {
	System.out.println("Test Case2:" + " Not Verify redirecting functionality -Failed") ;	
	}
	obj.ClosedDriver();
	}
	}

