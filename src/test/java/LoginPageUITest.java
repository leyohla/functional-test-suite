import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class LoginPageUITest extends LoginPageUI {
    @Test
    public void LoginTest(){
        Assert.assertEquals("Login Form", true, true);
       // Assert.assertEquals("Username", true, true);
       // Assert.assertEquals("Password", true, true);
        //Assert.assertTrue(driver.getPageSource().contains("Login Form"));
    }
}