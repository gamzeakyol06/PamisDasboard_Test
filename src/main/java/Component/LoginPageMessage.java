package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMessage {
    WebDriver driver;

    public LoginPageMessage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements (this.driver, this);
    }

    By emptyusername = By.xpath("//small[contains(text(),'The Email field is required')]");
    By emptypassword = By.xpath("//small[contains(text(),'The Password field is required')]");
    By invalidusername = By.xpath("");
    By invalidpassword = By.xpath ("");
    By minimumusername = By.xpath("//small[contains(text(),'The Email field must be at least 3 characters')]");
    By minimumpassword = By.xpath ("//small[contains(text(),'The Password field must be at least 4 characters')]");
    By successlogin = By.xpath ("//h5[contains(text(),'Welcome')]");
    By faillogin = By.xpath ("");
    By submitbutton = By.xpath ("");

    public final String Content_ErrorEmptyUsername = "The Email field is required";
    public final String Content_ErrorEmptyPassword = "The Password field is required";
    public final String Content_WrongLoginCredential = "";
    public final String Content_ErrorMinUsername = "The Email field must be at least 3 characters";
    public final String Content_ErrorMinPassword = "The Password field must be at least 4 characters";
    public final String Content_SuccessLogin = "Welcome";
    public final String Content_FailLogin = "Username password is not correct.";

    public String EmptyUsername() {
        String message = driver.findElement (emptyusername).getText ( );
        System.out.println (message);
        return message;
    }
    public String EmptyPassword() {
        String message = driver.findElement (emptypassword).getText ( );
        System.out.println (message);
        return message;
    }
    public String InvalidUsername() {
        String message = driver.findElement (invalidusername).getText ( );
        System.out.println (message);
        return message;
    }
    public String InvalidPassword() {
        String message = driver.findElement (invalidpassword).getText ( );
        System.out.println (message);
        return message;
    }
    public String MinimumUsername() {
        String message = driver.findElement (minimumusername).getText ();
        System.out.println (message);
        return message;
    }
    public String MinimumPassword() {
        String message = driver.findElement (minimumpassword).getText ();
        System.out.println (message);
        return message;
    }
    public String SuccessLogin() {
        String message = driver.findElement (successlogin).getText ();
        System.out.println (message);
        return message;
    }
    public String FailLogin() {
        String message = driver.findElement (faillogin).getText ();
        System.out.println (message);
        return message;
    }
    public String SubmitButton() {
        String message = driver.findElement (submitbutton).getText ();
        System.out.println (message);
        return message;
    }
}
