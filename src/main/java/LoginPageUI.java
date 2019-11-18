import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LoginPageUI {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lhunn/IdeaProjects/functional-test-suite/src/main/libs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        try{
            driver.get("https://demo.applitools.com/hackathon.html");
            driver.manage().window().maximize();

        } finally{
            driver.quit();
        }
    }

    public static void LoginPage(WebDriver driver){

    }
    public static final TextField Heading = new TextField("Login Form");

    public static final TextField usernameField = new TextField("Username");

    public static final TextField passwordField = new TextField("Password");


}
