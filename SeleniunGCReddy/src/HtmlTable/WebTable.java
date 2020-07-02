package HtmlTable;
/////////////////////error////////////////////////
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	driver.findElement(By.id("menu_admin_UserManagement")).click();
	driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	
	
	int rowCount=driver.findElements(By.xpath("//*[@id=\'resultTable\']/tbody/tr")).size();
	System.out.println(rowCount);
	int cellCount =driver.findElements(By.xpath("//*[@id=\'resultTable\']/tbody/tr/td")).size();
	System.out.println(cellCount);
	
	
	for(int i=1;i<rowCount;i++) {
		for(int j=1;j<cellCount;j++) {
		
//String status=driver.findElement(By.xpath("//*[@id='resultTable]/tbody/tr[1]/td[1]")).getText();
  String status = driver.findElement(By.xpath("//*[@id=\'resultTable\']/tbody/tr[i]/td[j]")).getText();
  
System.out.println(status);
			
		}
	}
System.out.println();
driver.close();
	}

}
