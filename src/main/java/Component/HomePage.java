package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
        WebDriver driver;
        public HomePage(WebDriver driver, WebDriverWait wait){
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
        By countrybttn = By.xpath("//span[contains(text(),'Country')]");
        public WebElement CountryButton() {return driver.findElement(countrybttn);}
        By leaflet = By.xpath("//div[contains(@class,'leaflet-interactive']");
        //By leaflet = By.xpath("//*[@id='app']/div/div[3]/div[3]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[12]/div[3]/svg/g/path");
        public WebElement Leaflet() {return driver.findElement(leaflet);}
    }
