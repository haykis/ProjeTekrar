package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaMainPage {

    public MedunnaMainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath="//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement signInOpsiyon;
    @FindBy(xpath="//a[@id='login-item']//span")
    public WebElement signIn;
    @FindBy(xpath="//div[@role='menu']//a[2]//span")
    public WebElement signRegister;

    @FindBy(xpath ="//input[@id='ssn']")
    public WebElement SSN;
    @FindBy(className ="is-touched is-dirty av-valid form-control")
    public WebElement SSnCheckPositive;
    @FindBy(className = "is-touched is-dirty av-invalid is-invalid form-control")
    public WebElement SSnCheckNegative;




}
