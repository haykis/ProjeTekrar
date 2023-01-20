package stepdefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class deneme {
    @Test
    public void test1(){
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
//        WebDriver driver;
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.get("https://medunna.com/");
    }
}
