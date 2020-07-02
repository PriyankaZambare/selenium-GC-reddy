package GcrShopLogin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTest {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
	FileReader file=new FileReader("C://Users//Priya//Desktop//Mercury.txt");
	BufferedReader br =new BufferedReader(file);
	int count=0;
	int iteration=0;
	String line;
	while((line=br.readLine())!=null)
	{
		count =count+1;
		if(count>1)
		{
		
			iteration = iteration+1;
		String[]inputData=line.split(",", 2);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");

		driver.findElement(By.name("userName")).sendKeys(inputData[0]);
		driver.findElement(By.name("password")).sendKeys(inputData[1]);
		driver.findElement(By.name("login")).click();
		
		String url =driver.getCurrentUrl();
		if(url.contains("http://newtours.demoaut.com/mercuryreservation.php"))
		{
			System.out.println(iteration+"Admin login is successful-passed");
		}
		else {
			System.out.println(iteration+"Admin login is Unsuccessful-Failed");
		}
			
		driver.close();
		
	}
		
		
	
		
	}
	br.close();
	file.close();
	}

}
