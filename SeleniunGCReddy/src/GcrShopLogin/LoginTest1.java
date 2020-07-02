package GcrShopLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest1 {
WebDriver driver;



By uname =By.name("userName");
By pwd = By.name("password");
By signIn =By.name("login");
By ClickLinkButton = By.linkText("ITINERARY");

public LoginTest1 (WebDriver UserDefine) {
this.driver= UserDefine;
}

//Create Customized Commands
public void typeUsername (String Uname) {
driver.findElement(uname).sendKeys(Uname);
}

public void typePassword (String password) {
driver.findElement(pwd).sendKeys(password);
}

public void ClickLogin () {
driver.findElement(signIn).click();
}

public void ClickLinkText() {
driver.findElement(ClickLinkButton).click();
}

}
