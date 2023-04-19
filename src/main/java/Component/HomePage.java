package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
        WebDriver driver;
        public HomePage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
        }
        By userbutton = By.xpath("//p[contains(text(),'Gamze')]");
        public WebElement UserButton() {return driver.findElement(userbutton);}
        By logoutbttn = By.xpath("//span[contains(text(),'Logout')]");
        public WebElement LogOutButton() {return driver.findElement(logoutbttn);}
        By workcenterbttn = By.xpath("//span[contains(text(),'Workcenter')]");
        public WebElement WorkCenterButton() {return driver.findElement(workcenterbttn);}
        By generalbttn = By.xpath("//span[contains(text(),'General')]");
        public WebElement GeneralButton() {return driver.findElement(generalbttn);}
        By sitebttn = By.xpath("//span[contains(text(),'Site')]");
        public WebElement SiteButton() {return driver.findElement(sitebttn);}
    }
