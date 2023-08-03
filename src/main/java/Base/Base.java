package Base;

import Component.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.net.MalformedURLException;

public class Base {
    protected static WebDriver driver;

    public final static String MAIN_PAGE_URL = "https://pamisdashboard.niso.dev/login";
    public final static String TURKEY_PAGE_URL = "https://pamisdashboard.niso.dev/pamis-country/Turkey/id=34";

    public void beforemethod()throws MalformedURLException, InterruptedException  {

//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
//        chromeOptions.addArguments("--disable-notifications");
//
//        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
//        System.out.println(System.getProperty("webdriver.chrome.driver"));
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName","chrome");
        chromeOptions.setCapability("platformName","LINUX");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);

        System.setProperty("webdriver.chrome.driver","/src/main/driver/chromedriver");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        driver.manage().deleteAllCookies();
        Dimension d = new Dimension(1920,1080);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);


        /*
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName","chrome");
        chromeOptions.setCapability("platformName","LINUX");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--remote-allow-origins=*");


        driver = new ChromeDriver(chromeOptions);
        System.setProperty("webdriver.chrome.driver","/src/main/driver/chromedriver");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
*/
        /*
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        //chromeOptions.addArguments("--headless");
        //chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--remote-allow-origins=*");
*/
        // wait = new WebDriverWait(driver, 3000);
        // For jenkins server github
        /*  ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setCapability("browserName", "chrome");
            chromeOptions.setCapability("platformName", "LINUX");
            chromeOptions.addArguments("start-maximized");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(chromeOptions);
            System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/spc_github_test/src/main/driver/chromedriver_win32_x/chromedriver.exe");
            System.out.println(System.getProperty("webdriver.chrome.driver"));

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            System.out.println("hello spc jenkins");*/
    }

    public void aftermethod() {
        driver.quit();
    }

    public void loginmethod() {
        try {
            LoginPage login = new LoginPage (driver);

            System.out.println(driver.getTitle());
            login.Username ( ).sendKeys ("akyolg");
            Thread.sleep (3000);
            login.Password ( ).sendKeys ("Niso.2022!");
            Thread.sleep (3000);
            Actions actions = new Actions(driver);
            Thread.sleep(4000);
            actions.moveToElement(login.LoginButton ( )).click().build().perform();
            //login.LoginButton ( ).click ( );
            Thread.sleep (6000);
            System.out.println(driver.getTitle());
//            LoginPageMessage mlogin = new LoginPageMessage (driver);
//            Assert.assertEquals (mlogin.SuccessLogin(),(mlogin.Content_SuccessLogin));
//            System.out.println ("Success Login");
        }
        catch(Exception e){
            e.printStackTrace ();
            Assert.fail ("Login is Fail");
        }
    }

    public static String generateRandomData() {
        String generateAlpha = RandomStringUtils.randomAlphanumeric(10);
        return generateAlpha;

    }
}