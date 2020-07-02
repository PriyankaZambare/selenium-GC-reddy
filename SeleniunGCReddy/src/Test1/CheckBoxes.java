package Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\2020 Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		
	
		
	List<WebElement> ele= driver.findElements(By.xpath("//input[@type='checkbox']"));
/*	for (WebElement checkBox: ele)
	{
	   checkBox.getText();
	
	}
	System.out.println(ele);

	*/
		for(int i=0;i<ele.size();i++)
	{
		WebElement web=ele.get(i);
		String value = web.getAttribute("value");
		System.out.println(value);
	}
	
	}
}
