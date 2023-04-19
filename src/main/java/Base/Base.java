package Base;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
    protected static WebDriver driver;

    public final static String MAIN_PAGE_URL = "https://pamisdashboard.niso.dev/login";


    public void beforemethod() {
        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();


        // For jenkins server github
/*            ChromeOptions chromeOptions = new ChromeOptions();

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

    public static String generateRandomData() {
        String generateAlpha = RandomStringUtils.randomAlphanumeric(10);
        return generateAlpha;

    }
}