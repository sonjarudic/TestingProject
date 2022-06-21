package tests;

import org.junit.After;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {
    public WebDriver driver;
    String validUsername  = "standard_user";
    String validPassword = "secret_sauce";

    @Before 
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\QA23\\Desktop\\SELENIUM\\TestProjectSelenium\\lib\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true); // <--headless set here
        driver = new FirefoxDriver(options);

        //driver.manage().window().maximize();
    }
    @After
    public void teardown(){
        driver.quit();

    }


    
}
