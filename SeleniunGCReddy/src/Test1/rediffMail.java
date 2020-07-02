package Test1;
///not give error but list dose not fount in console window
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediffMail {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\2020 Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[2]/div/a/u")).click();


/// login page varification
driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[3]/td[3]/input")).sendKeys("abcd xyz");
driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[1]")).sendKeys("abcd");


String ExpectText ="Sorry, the ID that you are looking for is taken.";
//String ExpectText1 ="Type a new ID or choose from the suggested IDs";
driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[7]/td[3]/input[2]")).click();

String Act = driver.findElement(By.xpath("//*[@id=\'check_availability\']/font[1]/b")).getText();
//String act1=driver.findElement(By.xpath("//*[@id=\'check_availability\']/font[1]/b")).getText();

if(ExpectText.equals(Act)==true)
{
	System.out.println("test is pass");
}

driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("abcdxyz");
driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("abcdxyz");

WebElement day = driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[1]"));
Select s =new Select(day);

System.out.println(s.getOptions().size());

List daylist = new ArrayList();
List<WebElement>option=s.getOptions();     //s select all the option and that stored in one variable ad that variable is List type ad that list is WebElement type

for(WebElement d:option)
{
	daylist.add( d.getText());
}
s.selectByVisibleText("23");



/*WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
Select se =new Select(month);

System.out.println(se.getOptions());
List monthlist = new ArrayList();
List<WebElement>obt=se.getOptions();

for(WebElement m:obt)
{
	monthlist.add(m.getText());
}
se.selectByVisibleText("OCT");

*/

WebElement year =driver.findElement(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[22]/td[3]/select[3]"));
Select sel =new Select(year);
sel.selectByVisibleText("1994");


}

}
