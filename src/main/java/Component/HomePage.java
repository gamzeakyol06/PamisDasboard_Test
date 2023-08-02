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
        By workcenterbttn = By.xpath("//span[contains(text(),'Workcenter')]");  //h2[contains(text(),'Workcenter')]
        public WebElement WorkCenterButton() {return driver.findElement(workcenterbttn);}
        By generalbttn = By.xpath("//span[contains(text(),'General')]");
        public WebElement GeneralButton() {return driver.findElement(generalbttn);}
        By countrybttn = By.xpath("//span[contains(text(),'Countries')]");
        public WebElement CountryButton() {return driver.findElement(countrybttn);}
        By leaflet = By.xpath("//div[contains(@class,'leaflet-interactive']");
        //By leaflet = By.xpath("//*[@id='app']/div/div[3]/div[3]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[12]/div[3]/svg/g/path");
        public WebElement Leaflet() {return driver.findElement(leaflet);}

        public WebElement TurkeyButton() {return driver.findElement(turkey);}
        By turkey = By.xpath("//body/div[@id='app']/div[1]/div[1]/ul[1]/ul[1]/li[4]/a[1]");
        //By turkey = By.xpath("//span[contains(text(),'Turkey')]");
        public WebElement PlasticPlant() {return driver.findElement(plastic);}
        By plastic = By.xpath("//body/div[@id='app']/div[1]/div[1]/ul[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]");
        //By plastic = By.xpath("//span[contains(text(),'Plastics Plant')]");
        public WebElement BreakdownButton() {return driver.findElement(breakdown);}
        By breakdown = By.xpath("//span[contains(text(),'Breakdown Machine')]");
        public WebElement Home() {return driver.findElement(home);}
        By home = By.xpath("//span[contains(text(),'Home')]");

        public WebElement WorkCenterText() {return driver.findElement(workcentertext);}
        By workcentertext = By.xpath("//h2[contains(text(),'Workcenter')]");
    }
