package GcrShopLogin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdownBox {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.testandquiz.com/selenium/testing.html");

WebDriverWait wait = new WebDriverWait(driver, 100);

WebElement box=driver.findElement(By.id("testingDropdown"));
Select s= new Select(box);
s.selectByIndex(1);

System.out.println(s.getOptions().size());               //no of element resent in dropdown box

List originalList = new ArrayList();

List<WebElement>object=s.getOptions();        //s select all the option and that stored in one variable ad that variable is List type ad that list is WebElement type

for(WebElement e:object) {                //we can read all value from dropdown box

	originalList.add(e.getText());

//driver.findElement(By.id("female")).click();
	}
System.out.println(originalList);

/*List templList = new ArrayList();

templList=	originalList;
System.out.println( templList);

Collections.sort(templList);         //sorting the tempList
System.out.println( templList);

if(templList==templList)
{
	System.out.println("dropdown sorted");
}

else {
	System.out.println("dropdown not sorted");
}*/
	}
}
