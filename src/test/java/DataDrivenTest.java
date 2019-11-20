import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

/*Test the following login functionality by entering different values to username and password fields.
        If you don’t enter the username and password and click the login button, it should throw an error
        If you only enter the username and click the login button, it should throw an error
        If you only enter the password and click the login button, it should throw an error
        If you enter both username (any value) and password (any value), it should log you in.*/

public class DataDrivenTest extends LoginPageUI {

    @Before
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lhunn/IdeaProjects/functional-test-suite/src/main/libs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        driver.manage().window().maximize();
    }

    @Test
    public void UsernameVerification(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("username@user.com");
        //driver.quit();
    }
    @Test
    public void PasswordVerification(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Password");
        //driver.quit();
    }
    @Test
    public void LoginButton(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        WebElement loginButton = driver.findElement(By.cssSelector("#log-in"));
        loginButton.click();
    }
}