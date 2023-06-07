package Base;
import Component.LoginPage;
import Component.LoginPageMessage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {
    protected static WebDriver driver;
    protected  static WebDriverWait wait;
    public final static String MAIN_PAGE_URL = "https://pamisdashboard.niso.dev/login";
    public final static String TURKEY_PAGE_URL = "https://pamisdashboard.niso.dev/pamis-country/Turkey/id=34";

    public void beforemethod() {
        //System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        //System.out.println(System.getProperty("webdriver.chrome.driver"));

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName","chrome");
        chromeOptions.setCapability("platformName","LINUX");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(chromeOptions);
        System.setProperty("webdriver.chrome.driver","/src/main/driver/chromedriver_win32_x/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        System.out.println("hello git");

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

    public static String generateRandomData() {
        String generateAlpha = RandomStringUtils.randomAlphanumeric(10);
        return generateAlpha;

    }
}