package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US01 {
    MedunnaMainPage medunnaMainPage=new MedunnaMainPage();
    Faker faker = new Faker();
    @Given("Get Medunna")
    public void getMedunna() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @And("Get login")
    public void getLogin() {
        medunnaMainPage.signInOpsiyon.click();
        Driver.waitBasic(1);
        medunnaMainPage.signRegister.click();
        Driver.waitBasic(2);
    }
    @And("Enter new SSN")
    public void enterNewSSN() {
        //   medunnaMainPage.SSN.sendKeys("545-52-3254"+ Keys.TAB);
        medunnaMainPage.SSN.sendKeys(faker.random().nextInt(100,899)+"-"+faker.random().nextInt(10,89)+"-"+faker.random().nextInt(1010,8968));
        Driver.waitBasic(2);
    }
    @And("Check SSN is correct")
    public void checkSSNIsCorrect() {
        Assert.assertTrue("positive test problem",medunnaMainPage.SSnCheckPositive.isDisplayed());
    }

    @And("Enter wrong SSN")
    public void enterWrongSSN() {
        medunnaMainPage.SSN.sendKeys("523-52-53265"+ Keys.TAB);
        Driver.waitBasic(2);
    }
    @And("Check SSN is wrong")
    public void checkSSNIsWrong() {
        Assert.assertTrue("negative test problem",medunnaMainPage.SSnCheckNegative.isDisplayed());
    }

}
