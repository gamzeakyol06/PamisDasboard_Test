package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    By username = By.xpath("//input[@id='login-email']");
    public WebElement Username() {return driver.findElement(username);}
    By password = By.xpath("//input[@id='login-password']");
    public WebElement Password() {return driver.findElement(password);}
    By loginbttn = By.xpath("//button[contains(text(),'Sign in')]");
    public WebElement LoginButton() {return driver.findElement(loginbttn);}
}
