package Test;

import Base.Base;
import Component.LoginPage;
import Component.LoginPageMessage;
import org.testng.Assert;
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
    @Test
    public void HomePage () throws InterruptedException {
        try {
            LoginPage login = new LoginPage (driver);

            System.out.println(driver.getTitle());
            login.Username ( ).sendKeys ("akyolg");
            Thread.sleep (3000);
            login.Password ( ).sendKeys ("Niso.2022!");
            Thread.sleep (3000);
            login.LoginButton ( ).click ( );
            Thread.sleep (3000);
            System.out.println(driver.getTitle());

            System.out.println ("Success");
        }
        catch(Exception e){
            e.printStackTrace ();
            Assert.fail ("Fail");
        }
    }
    @AfterTest
    public void afterMethod(){
        super.aftermethod();
    }
}
