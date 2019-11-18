import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LoginPageUITest extends LoginPageUI {

    @Test
    public void LoginTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lhunn/IdeaProjects/functional-test-suite/src/main/libs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/hackathon.html");

        assertTrue(driver.getPageSource().contains("Login Form"));
    }
}

//for the data driven tests:
//WebElement TextboxContent = driver.findElement(By.cssSelector(".auth-header"));
//TextboxContent.getText();
//assertEquals(".auth-header", TextboxContent);

//Assert.assertEquals("Login Fgdrm", true, true);
//Assert.assertEquals("Userngsede", true, true);
//Assert.assertEquals("Passwue", true, true);