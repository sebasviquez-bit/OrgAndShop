package Pages;

import Helpers.DriverHelper;
import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.utility-header > nav.utility-nav.sign-in-nav > a")
    WebElement iconsignin;

    @FindBy(css = "#tb-links > ul > li:nth-child(5) > a")
    WebElement iconsigninShop;

    @FindBy(css = "#gigya-login-form > div:nth-child(3) > div.gigya-layout-row.gigya-layout-row-login-create-account > a")
    WebElement CreateAccount;

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

    //Driver
    DriverHelper driverHelper;
    WebDriver driver;

    // Constructor
    public Register(WebDriver _driver, DriverHelper _driverHelper){
        driver = _driver;
        driverHelper = _driverHelper;
        PageFactory.initElements(driver,this);
    }

    //Methods

    // Registro de usuario .ORG
    public void registerUser(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin));
        wait.until(ExpectedConditions.elementToBeClickable(iconsignin)).click();
        wait.until(ExpectedConditions.visibilityOf(CreateAccount));
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount)).click();
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(_testUser.username);
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(_testUser.firstName);
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(_testUser.lastName);
        wait.until(ExpectedConditions.visibilityOf(password1));
        password1.sendKeys(_testUser.password1);
        wait.until(ExpectedConditions.visibilityOf(password2));
        password2.sendKeys(_testUser.password2);
        wait.until(ExpectedConditions.visibilityOf(registrarse));
        wait.until(ExpectedConditions.elementToBeClickable(registrarse)).click();
        wait.until(ExpectedConditions.visibilityOf(iconsignin));
        wait.until(ExpectedConditions.visibilityOf(iconsignin));

    }

    // Registro de usuario SHOP
    public void registerUserShop(User _testUser) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(iconsigninShop));
        wait.until(ExpectedConditions.elementToBeClickable(iconsigninShop)).click();
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount));
        wait.until(ExpectedConditions.elementToBeClickable(CreateAccount)).click();
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys(_testUser.username);
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(_testUser.firstName);
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(_testUser.lastName);
        wait.until(ExpectedConditions.visibilityOf(password1));
        password1.sendKeys(_testUser.password1);
        wait.until(ExpectedConditions.visibilityOf(password2));
        password2.sendKeys(_testUser.password2);
        wait.until(ExpectedConditions.elementToBeClickable(registrarse));
        wait.until(ExpectedConditions.elementToBeClickable(registrarse)).click();
        wait.until(ExpectedConditions.visibilityOf(NameProfileShop));

    }

}
