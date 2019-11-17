import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class LoginPageUI {
    public static void main(String args[]){
        ChromeDriver driver = new ChromeDriver();

        try{
            driver.get("https://demo.applitools.com/hackathon.html");
            driver.manage().window().maximize();

        } finally{
            driver.quit();
        }
    }

    public static void LoginPage(WebDriver driver){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Heading = wait.until(ExpectedConditions.visibilityOf((WebElement) By.className("auth-header")));
        driver.findElement(By.className("auth-header"));

    }
    public static final TextField Heading = new TextField("Login Form");

    public static final TextField usernameField = new TextField("Username");

    public static final TextField passwordField = new TextField("Password");

    /*public static void login(WebDriver driver){
        if(driver.getPageSource().contains("Login Form")){
        }

        driver.getPageSource().contains("Login Form");
    }*/

}
