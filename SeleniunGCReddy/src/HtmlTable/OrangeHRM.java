package HtmlTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "C://Selenium Drivers//chromedriver_win32//chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	   driver.manage().window().maximize();
	   
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
	   driver.findElement(By.id("menu_admin_UserManagement")).click();
	   driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	   
	int RowCount=   driver.findElements(By.xpath("//*[@id=\'resultTable\']/tbody/tr")).size();
	int statusCount=0;
	
	for(int i=1;i<=RowCount;i++) {
String status=driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr[" + i + " ]/td[5]")).getText();
		if(status.equals("Enabled"))
		{
			statusCount	=statusCount+1;
		}
	}
	
	System.out.println("No of emplyee is Enabled:" +statusCount);
	}

}
