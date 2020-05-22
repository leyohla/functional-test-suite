import org.junit.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.*;

/*  Login Page UI Elements Test
    Open the login page and write assertions to ensure everything looks OK on that page. i.e. add assertions to ensure all the fields,
    labels and all other items exist. */

public class LoginPageUITest extends LoginPageUI {

    @Before
        public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lhunn/IdeaProjects/functional-test-suite/src/main/libs/chromedriver.exe");
    }

    @Test
    public void Heading(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        assertTrue(driver.getPageSource().contains("Login Form"));
    }
    @Test
    public void toggleButton(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        assertTrue(driver.getPageSource().contains("logo-w"));
    }
    @Test
    public void Username(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        assertTrue(driver.getPageSource().contains("Username"));
    }
    @Test
    public void Password(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        assertTrue(driver.getPageSource().contains("Password"));
    }
    @Test
    public void LoginButton(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        assertTrue(driver.getPageSource().contains("Log In"));
    }
    @Test
    public void TickBox(){
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        assertTrue(driver.getPageSource().contains("Remember Me"));
    }
    @After
    public void setDown(){
        ChromeDriver driver = new ChromeDriver();
        driver.quit();
    }


    /*@FindBy(id = "[class='auth-header']")
    private WebElement username;*/
}


//for the data driven tests:
//  WebElement TextboxContent = driver.findElement(By.cssSelector(".auth-header"));
//  TextboxContent.getText();
//  assertEquals(".auth-header", TextboxContent);
