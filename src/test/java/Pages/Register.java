package Pages;

import Helpers.DriverHelper;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class Register {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.utility-header > nav.utility-nav.sign-in-nav > a")
    WebElement iconsignin;

    @FindBy(css = "#tb-links > ul > li:nth-child(5) > a")
    WebElement iconsigninShop;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[3]/label/a")
    WebElement signup;

    @FindBy(xpath = "//*[@id=\"gigya-register-form\"]/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(5) > div.gigya-composite-control.gigya-composite-control-textbox > input")
    WebElement firstName;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(6) > div.gigya-composite-control.gigya-composite-control-textbox > input")
    WebElement lastName;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(5) > div.gigya-composite-control.gigya-composite-control-password > input")
    WebElement password1;

    @FindBy(css = "#gigya-register-form > div:nth-child(1) > div:nth-child(6) > div.gigya-composite-control.gigya-composite-control-password > input")
    WebElement password2;

    @FindBy(xpath = "//*[@id=\"gigya-register-form\"]/div[5]/div/input")
    WebElement registrarse;

    @FindBy(css = "#tb-links > ul > li:nth-child(5) > a")
    WebElement NameProfileShop;

    @FindBy(xpath = "//div[contains(@class, 'alert-danger')]")
    WebElement alertDanger;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    WebElement alertSuccess;

    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public Register(WebDriver _driver, DriverHelper _driveHelper){
        this.driver = _driver;
        this.driverHelper = _driveHelper;
        PageFactory.initElements(driver,this);
    }

    // Registro de usuario .ORG
    public void registerUser(User _testUser) throws InterruptedException {

        this.iconsignin.click();
        sleep(1000);
        this.signup.click();
        sleep(1000);
        this.userName.sendKeys(_testUser.username);
        sleep(1000);
        this.firstName.sendKeys(_testUser.firstName);
        sleep(1000);
        this.lastName.sendKeys(_testUser.lastName);
        sleep(1000);
        this.password1.sendKeys(_testUser.password1);
        sleep(1000);
        this.password2.sendKeys(_testUser.password2);
        sleep(1000);
        this.registrarse.click();
        sleep(2000);
        this.iconsignin.isDisplayed();
    }

    // Registro de usuario SHOP
    public void registerUserShop(User _testUser) throws InterruptedException {

        this.iconsigninShop.click();
        sleep(1000);
        this.signup.click();
        sleep(1000);
        this.userName.sendKeys(_testUser.username);
        sleep(1000);
        this.firstName.sendKeys(_testUser.firstName);
        sleep(1000);
        this.lastName.sendKeys(_testUser.lastName);
        sleep(1000);
        this.password1.sendKeys(_testUser.password1);
        sleep(1000);
        this.password2.sendKeys(_testUser.password2);
        sleep(1000);
        this.registrarse.click();
        sleep(2000);
        this.NameProfileShop.isDisplayed();

    }

}
