package Test;

import Base.Base;
import Component.HomePage;
import Component.LoginPage;
import Component.LoginPageMessage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;

public class LoginPageTest extends Base {

    @BeforeTest
    public void BeforeMethod() throws IOException, InterruptedException {
        super.beforemethod ( );
        driver.get (MAIN_PAGE_URL);
    }

    @Test(description = "Empty Username")
    public void EmptyUsername() throws IOException, InterruptedException {

        try {
            LoginPage login = new LoginPage (driver);

            login.Username ( ).click ( );
            login.LoginButton ( ).click ( );
            Thread.sleep (3000L);

            LoginPageMessage mlogin = new LoginPageMessage (driver);

            Assert.assertEquals (mlogin.EmptyUsername ( ), (mlogin.Content_ErrorEmptyUsername));
            System.out.println ("Empty Username Check is Pass");

        } catch (Exception e) {
            e.printStackTrace ();
            Assert.fail ("Empty Username Check is Fail");
    }
        Thread.sleep(5000);
    }
    @Test(description = "Empty Password")
    public void EmptyPassword() throws InterruptedException {

        try {
            LoginPage login = new LoginPage (driver);
            login.Password ().click ();
            login.LoginButton ().click ();

            LoginPageMessage mlogin = new LoginPageMessage(driver);
            Assert.assertEquals (mlogin.EmptyPassword (), (mlogin.Content_ErrorEmptyPassword));
            System.out.println ("Empty Password Check is Pass");
            }
        catch (Exception e) {
             Assert.fail ("Empty Password Check is Fail");
            }
        Thread.sleep(5000);
    }
    @Test(description = "Invalid Username")
    public void InvalidUsername() throws InterruptedException {

        try {
            LoginPage login = new LoginPage (driver);
            Thread.sleep (3000);
            login.Username ().sendKeys ("akyolgg");
            Thread.sleep (3000);
            login.Password ().sendKeys ("Niso.2022!");
            Thread.sleep (3000);
            login.LoginButton().click ();
            Thread.sleep (3000);

            LoginPageMessage mlogin = new LoginPageMessage (driver);
            Assert.assertEquals (mlogin.InvalidUsername (),mlogin.Content_WrongLoginCredential);
            System.out.println ("Invalid Username Check is Pass");
        }
        catch (Exception e) {
            Assert.fail ("Invalid Username Check is Fail");
        }
    }
    @Test(description = "Invalid Password")
    public void InvalidPassword() throws InterruptedException{

        try {
            LoginPage login = new LoginPage (driver);
            Thread.sleep (3000);
            login.Username ().sendKeys ("akyolg");
            Thread.sleep (3000);
            login.Password ().sendKeys ("Niso.2022");
            Thread.sleep (3000);
            login.LoginButton ().click ();
            Thread.sleep (3000);

            LoginPageMessage mlogin = new LoginPageMessage (driver);
            Assert.assertEquals (mlogin.InvalidPassword (),mlogin.Content_WrongLoginCredential);
            System.out.println ("Invalid Password Check is Pass");
        }
        catch (Exception e) {
            Assert.fail("Invalid Password Check is Fail");
        }
    }
    @Test(description = "Minimum Username") // min 2 characters
    public void MinimumUsername() throws InterruptedException{

        try {
            LoginPage login = new LoginPage (driver);
            login.Username ().sendKeys ("xx");
         // login.Password ().sendKeys ("12345678");
            login.LoginButton ().click ();

            LoginPageMessage mlogin = new LoginPageMessage (driver);

            Assert.assertEquals (mlogin.MinimumUsername (),(mlogin.Content_ErrorMinUsername));
            System.out.println ("Minimum Username Check is Pass");
        }
        catch (Exception e) {
            Assert.fail("Minimum Username Check is Fail");
        }
    }
    @Test (description = "Minimum Password") // min 4 characters
    public void MinimumPassword() throws InterruptedException{

        try {
            LoginPage login = new LoginPage (driver);
            //login.Username ().sendKeys ("xy");
            login.Password ().sendKeys ("12");
            login.LoginButton ().click ();

            LoginPageMessage mlogin= new LoginPageMessage(driver);
            Assert.assertEquals (mlogin.MinimumPassword (), mlogin.Content_ErrorMinPassword);
            System.out.println ("Minumum Password Check is Pass");

        }
        catch (Exception e){
            Assert.fail ("Minumum Password Check is Fail");
        }
    }
    @Test (description = "Password Masked")
    public void PasswordMasked() throws InterruptedException{

        try{
            LoginPage login = new LoginPage (driver);
            Assert.assertEquals (login.Password ().getAttribute ("type"),"password");
            System.out.println ("Password Masked Check is Pass");
        }
        catch (Exception e) {
            e.printStackTrace ();
            Assert.fail ("Password Masked Check is Fail");
        }
    }
    @Test(description = "after logout back login")
    public void logoutbacklogin() throws InterruptedException{

        try {
            LoginPage login = new LoginPage (driver);
            login.Username ( ).sendKeys ("akyolg");
            Thread.sleep (3000);
            login.Password ( ).sendKeys ("Niso.2022!");
            Thread.sleep (3000);
            login.LoginButton().click();
            Thread.sleep (5000);

            HomePage home = new HomePage (driver);
            home.UserButton ( ).click ( );
            Thread.sleep (3000);
            home.LogOutButton ( ).click ( );
            Thread.sleep (3000);
            driver.navigate ( ).back ( );
            Thread.sleep (3000);
            String currentURL = driver.getCurrentUrl();
            LoginPageMessage mlogin = new LoginPageMessage (driver);
            System.out.println (currentURL);
            System.out.println (MAIN_PAGE_URL);

            Thread.sleep (3000);
            Assert.assertNotSame (currentURL,MAIN_PAGE_URL);
            Thread.sleep (3000);
            System.out.println ("Checking Login page after logout is Pass");


        File test = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
        FileUtils.copyFile (test, new File ("png"));
    }
        catch (Exception e){
            e.printStackTrace ();
            Assert.fail ("Checking Login page after logout is Fail");
        }
    }
    @Test(description = "Success Login")
    public void SuccessLogin () throws InterruptedException {
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
            LoginPageMessage mlogin = new LoginPageMessage (driver);
            Assert.assertEquals (mlogin.SuccessLogin(),(mlogin.Content_SuccessLogin));
            System.out.println ("Trying Success Login is Pass");
        }
        catch(Exception e){
            e.printStackTrace ();
            Assert.fail ("Trying Success Login is Fail");
        }
    }
    @Test (description = "Locked After Wrong Credentials 3 Times")
    public void LockedAfterWrongCredentials3Times() throws InterruptedException{

        for (int attempt = 1; attempt < 4; attempt++) {
            try {
                LoginPage login = new LoginPage(driver);
                Thread.sleep(3000);
                login.Username().clear();
                login.Username().sendKeys(generateRandomData());
                Thread.sleep(3000);
                login.Password().clear();
                login.Password().sendKeys(generateRandomData());
                Thread.sleep(3000);
                login.LoginButton().click();
                Thread.sleep(3000);

                // hesap kilitlendi mesajını al ve karşılaştır
                //LoginPageMessage mlogin = new LoginPageMessage(driver);
                //Assert.assertEquals(mlogin.InvalidPassword(), mlogin.Content_WrongLoginCredential);
                //System.out.println("Invalid Password Check is Pass");
            }

            catch (Exception e){
          //  Assert.fail("Invalid Password Check is Fail");
        }
        }
        Assert.fail("Account Locked Test i Fail");
    }

    @AfterTest
    public void afterMethod(){
        super.aftermethod();
    }
}
