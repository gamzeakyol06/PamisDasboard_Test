/*
package Test;

import Base.Base;
import Component.CountryPage;
import Component.HomePage;
import Component.WorkCenterPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HomePage_Test extends Base {

    @BeforeMethod
    public void beforemethod(){
        super.beforemethod();
        driver.get (MAIN_PAGE_URL);
        super.loginmethod();
    }
    @Test
    public void Test_Country() throws InterruptedException {
        HomePage main = new HomePage(driver,wait);
        CountryPage country = new CountryPage(driver,wait);
        wait.until(ExpectedConditions.elementToBeClickable( main.CountryButton()));
        main.CountryButton().click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
*/
/*        wait.until(ExpectedConditions.elementToBeClickable( country.CountryDateButton()));
        country.CountryDateButton().click();
        wait.until(ExpectedConditions.elementToBeClickable( country.DailyDateButton()));
        country.DailyDateButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(country.LastmonthDateButton()));
        country.LastmonthDateButton().click();
        Thread.sleep(3000);
        main.WorkCenterButton().click();
        Thread.sleep(3000);
        WorkCenterPage workcenter = new WorkCenterPage(driver);*//*

        //System.out.println(workcenter.OEETarget().getText());
        Thread.sleep(6000);
    }
    @Test
    public void Test_Workcenter() throws InterruptedException{
        SoftAssert softassert = new SoftAssert();

        HomePage main = new HomePage(driver,wait);
        CountryPage country = new CountryPage(driver,wait);
        WorkCenterPage workcenter = new WorkCenterPage(driver,wait);
        try {
            Thread.sleep(5000);
            Actions actions = new Actions(driver);
            driver.get (TURKEY_PAGE_URL);
            country.CountryDateButton().click();
            Thread.sleep(3000);
            country.MonthyDateButton().click();
            Thread.sleep(5000);
            country.PT27().click();
            Thread.sleep(5000);

            System.out.println(workcenter.OEEValue().getText());

            System.out.println(driver.getTitle());
        }
        catch (Exception e){
            e.printStackTrace();
            softassert.assertAll();
        }
    }

    @AfterMethod
    public void aftermethod(){
        super.aftermethod();
    }
    // Test adımları
    // Daily seçenekleri aç
    // herhangi birini seçtir
    // sonuçlarını gözlemle
}
*/
