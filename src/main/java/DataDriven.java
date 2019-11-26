import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven extends LoginPageUI {
    public By Username = By.cssSelector("#username");
    public String usernm = "username@username.com";

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:/Users/lhunn/IdeaProjects/functional-test-suite/src/main/libs/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        try{
            driver.get(LOGINPAGE);
            driver.manage().window().maximize();
        }finally{
            driver.quit();
        }
    }


    public void getUsername(){
        driver.findElement(By.cssSelector("#username"));
    }


    public void UsernameVerification() {
        ChromeDriver driver = new ChromeDriver();
        driver.get(LOGINPAGE);
        WebElement username = driver.findElement(By.cssSelector("#username"));
        username.sendKeys("username@user.com");
    }
    public void PasswordVerification() {
        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.sendKeys("Password");
    }
    public void LoginButton(){
        WebElement loginButton = driver.findElement(By.cssSelector("#log-in"));
        loginButton.click();
    }
}
