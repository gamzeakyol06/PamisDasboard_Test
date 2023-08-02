package Test;

import Base.Base;
import Component.CountryPage;
import Component.HomePage;
import Component.WorkCenterPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class MainPageTest extends Base {
    @BeforeTest
    public void BeforeMethod() throws IOException, InterruptedException {
        super.beforemethod ( );
        driver.get (MAIN_PAGE_URL);
    }
//    @Test
//    public void HomePage () throws InterruptedException {
//        try {
//
//            LoginPage login = new LoginPage (driver);
//            System.out.println(driver.getTitle());
//            login.Username ( ).sendKeys ("akyolg");
//            Thread.sleep (3000);
//            login.Password ( ).sendKeys ("Niso.2022!");
//            Thread.sleep (3000);
//            login.LoginButton ( ).click ( );
//            Thread.sleep (3000);
//            System.out.println(driver.getTitle());
//            Thread.sleep(6000);
//            System.out.println ("Success");
//
//        }
//        catch(Exception e){
//            e.printStackTrace ();
//            Assert.fail ("Fail");
//        }
//    }
    @Test
    public void CountriesTest() throws InterruptedException {
        loginmethod();

        System.out.printf("ok");
        HomePage home = new HomePage(driver);
        CountryPage country = new CountryPage(driver);
        WorkCenterPage workcenter = new WorkCenterPage(driver);
        Actions actions = new Actions(driver);
        Thread.sleep(10000);
        //System.out.printf(home.WorkCenterText().getText());
        actions.moveToElement(home.TurkeyButton()).click().build().perform();
        Thread.sleep(4000);
        //home.TurkeyButton().click();
        Thread.sleep(3000);
        home.PlasticPlant().click();
        Thread.sleep(3000);
        country.PT9().click();
        Thread.sleep(5000);
        System.out.printf("PT9 performance value: ");
        System.out.println(workcenter.PerformanceValue().getText());
    }
    @AfterTest
    public void afterMethod(){
        super.aftermethod();
    }
}
