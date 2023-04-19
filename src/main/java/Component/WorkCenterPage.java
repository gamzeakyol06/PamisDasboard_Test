package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WorkCenterPage {
    WebDriver driver;
    public WorkCenterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    By countrydatebutton = By.xpath("//select[@id='country-date-select']");
    public WebElement CountryDateButton() {return driver.findElement(countrydatebutton);}
    By dailydatebutton = By.xpath("//option[contains(text(),'Daily')]");
    public WebElement DailyDateButton() {return driver.findElement(dailydatebutton);}
    By weeklydatebutton = By.xpath("//option[contains(text(),'Weekly')]");
    public WebElement WeeklyDateButton() {return driver.findElement(weeklydatebutton);}
    By monthlydatebutton = By.xpath("//option[contains(text(),'Monthly')]");
    public WebElement MonthyDateButton() {return driver.findElement(monthlydatebutton);}
    By yearlydatebutton = By.xpath("//option[contains(text(),'Yearly')]");
    public WebElement YearlyDateButton() {return driver.findElement(yearlydatebutton);}
    By yesterdaydatebutton = By.xpath("//option[contains(text(),'Yesterday')]");
    public WebElement YesterdayDateButton() {return driver.findElement(yesterdaydatebutton);}
    By lastweekdatebutton = By.xpath("//option[contains(text(),'Last Week')]");
    public WebElement LastweekDateButton() {return driver.findElement(lastweekdatebutton);}
    By lastmonthdatebutton = By.xpath("//option[contains(text(),'Last Month')]");
    public WebElement LastmonthDateButton() {return driver.findElement(lastmonthdatebutton);}
    By lastyeardatebutton = By.xpath("//option[contains(text(),'Last Year')]");
    public WebElement LastyearDateButton() {return driver.findElement(lastyeardatebutton);}

    // Site
    By productionvalue = By.xpath("");
    public WebElement Productionvalue() {return driver.findElement(productionvalue);}
    By  defectvalue= By.xpath("");
    public WebElement DefectValue() {return driver.findElement(defectvalue);}
    By ppmvalue = By.xpath("");
    public WebElement PPMValue () {return driver.findElement(ppmvalue);}
    By breakdownratevalue = By.xpath("");
    public WebElement BreakDownRateValue() {return driver.findElement(breakdownratevalue);}
    By oeevalue = By.xpath("");
    public WebElement OEEValue () {return driver.findElement(oeevalue);}
    By availabilityvalue = By.xpath("");
    public WebElement AvailabilityValue() {return driver.findElement(availabilityvalue);}
    By performancevalue = By.xpath("");
    public WebElement PerformanceValue() {return driver.findElement(performancevalue);}
    By qualityvalue = By.xpath("");
    public WebElement QualityValue() {return driver.findElement(qualityvalue);}

    By oeetarget = By.xpath("");
    public WebElement OEETarget() {return driver.findElement(oeetarget);}
    By availabilitytarget = By.xpath("");
    public WebElement AvailabilityTarget() {return driver.findElement(availabilitytarget);}
    By performancetarget = By.xpath("");
    public WebElement PerformanceTarget() {return driver.findElement(performancetarget);}
    By qualitytarget = By.xpath("");
    public WebElement QualityTarget() {return driver.findElement(qualitytarget);}


    // Site WorkCenters
    By pt7 = By.xpath("//h3[contains(text(),'PT7')]");
    public WebElement PT7() {return driver.findElement(pt7);}
    By pt9 = By.xpath("//h3[contains(text(),'PT9')]");
    public WebElement PT9() {return driver.findElement(pt9);}
    By pt11 = By.xpath("//h3[contains(text(),'PT11')]");
    public WebElement PT11() {return driver.findElement(pt11);}
    By pt13 = By.xpath("// h3[contains(text(),'PT13')]");
    public WebElement PT13() {return driver.findElement(pt13);}
    By pt15 = By.xpath("// h3[contains(text(),'PT15')]");
    public WebElement PT15() {return driver.findElement(pt15);}
    By pt19 = By.xpath("// h3[contains(text(),'PT19')]");
    public WebElement PT19() {return driver.findElement(pt19);}
    By pt23 = By.xpath("// h3[contains(text(),'PT23')]");
    public WebElement PT23() {return driver.findElement(pt23);}
    By pt27 = By.xpath("// h3[contains(text(),'PT27')]");
    public WebElement PT27() {return driver.findElement(pt27);}
    By pt12 = By.xpath("// h3[contains(text(),'PT12')]");
    public WebElement PT12() {return driver.findElement(pt12);}
    By pt20 = By.xpath("//h3[contains(text(),'PT20')]");
    public WebElement PT20() {return driver.findElement(pt20);}
    By pt24 = By.xpath("//h3[contains(text(),'PT24')]");
    public WebElement PT24() {return driver.findElement(pt24);}
    By pt44 = By.xpath("//h3[contains(text(),'PT44')]");
    public WebElement PT44() {return driver.findElement(pt44);}
    By pt63 = By.xpath("//h3[contains(text(),'PT63')]");
    public WebElement PT63() {return driver.findElement(pt63);}

    // highcharts


}
