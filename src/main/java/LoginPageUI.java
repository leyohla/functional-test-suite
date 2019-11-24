import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LoginPageUI {
    public static final String LOGINPAGE = "https://demo.applitools.com/hackathon.html";

    WebDriver driver;

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lhunn/IdeaProjects/functional-test-suite/src/main/libs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        try{
            driver.get(LOGINPAGE);
            driver.manage().window().maximize();

        } finally{
            driver.quit();
        }
    }

    public static void Heading(WebDriver driver){
    }
    public static void toggleButton(WebDriver driver){
    }
    public static void Username(WebDriver driver){
    }
    public static void Password(WebDriver driver){
    }
    public static void LoginButton(WebDriver driver){
    }

    public static final TextField Heading = new TextField("Login Form");

    public static final TextField usernameField = new TextField("Username");

    public static final TextField passwordField = new TextField("Password");


}
