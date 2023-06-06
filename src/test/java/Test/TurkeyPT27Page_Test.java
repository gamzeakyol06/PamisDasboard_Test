package Test;
import Base.Base;
import Component.CountryPage;
import Component.HomePage;
import Component.WorkCenterPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TurkeyPT27Page_Test extends Base {

    @BeforeTest
    public void beforemethod() {
        super.beforemethod();
        driver.get(MAIN_PAGE_URL);
        super.loginmethod();
    }
    
    @Test
    public void Test_WorkcenterPT27OEEValue() throws InterruptedException {
        SoftAssert softassert = new SoftAssert();
        HomePage main = new HomePage(driver, wait);
        CountryPage country = new CountryPage(driver, wait);
        WorkCenterPage workcenter = new WorkCenterPage(driver, wait);
        try {

            Actions actions = new Actions(driver);
            driver.get(TURKEY_PAGE_URL);
            country.CountryDateButton().click();
            Thread.sleep(3000);
            country.MonthyDateButton().click();
            Thread.sleep(5000);
            country.PT27().click();
            Thread.sleep(5000);
            System.out.println(workcenter.OEEValue().getText());
            System.out.println(driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
            softassert.assertAll();
        }
    }
    @Test
    public void Test_WorkcenterPT27AvailabilityValue() throws InterruptedException {
        SoftAssert softassert = new SoftAssert();
        HomePage main = new HomePage(driver, wait);
        CountryPage country = new CountryPage(driver, wait);
        WorkCenterPage workcenter = new WorkCenterPage(driver, wait);
        try {

            Actions actions = new Actions(driver);
            driver.get(TURKEY_PAGE_URL);
            country.CountryDateButton().click();
            Thread.sleep(3000);
            country.MonthyDateButton().click();
            Thread.sleep(5000);
            country.PT27().click();
            Thread.sleep(5000);
            System.out.println(workcenter.AvailabilityValue().getText());
            System.out.println(driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
            softassert.assertAll();
        }
    }
    @Test
    public void Test_WorkcenterPT27PerformanceValue() throws InterruptedException {
        SoftAssert softassert = new SoftAssert();
        HomePage main = new HomePage(driver, wait);
        CountryPage country = new CountryPage(driver, wait);
        WorkCenterPage workcenter = new WorkCenterPage(driver, wait);
        try {

            Actions actions = new Actions(driver);
            driver.get(TURKEY_PAGE_URL);
            country.CountryDateButton().click();
            Thread.sleep(3000);
            country.MonthyDateButton().click();
            Thread.sleep(5000);
            country.PT27().click();
            Thread.sleep(5000);
            System.out.println(workcenter.PerformanceValue().getText());
            System.out.println(driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
            softassert.assertAll();
        }
    }
    @Test
    public void Test_WorkcenterPT27QualityValue() throws InterruptedException {
        SoftAssert softassert = new SoftAssert();
        HomePage main = new HomePage(driver, wait);
        CountryPage country = new CountryPage(driver, wait);
        WorkCenterPage workcenter = new WorkCenterPage(driver, wait);
        try {

            Actions actions = new Actions(driver);
            driver.get(TURKEY_PAGE_URL);
            country.CountryDateButton().click();
            Thread.sleep(3000);
            country.MonthyDateButton().click();
            Thread.sleep(5000);
            country.PT27().click();
            Thread.sleep(5000);
            System.out.println(workcenter.QualityValue().getText());
            System.out.println(driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
            softassert.assertAll();
        }
    }

    @AfterTest
    public void aftermethod() {
        super.aftermethod();
    }
}