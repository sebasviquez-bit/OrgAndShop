package ORGPages;

import Model.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class SignIn {


    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[4]/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[3]/div/input")
    WebElement ingresar;

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.utility-header > nav.utility-nav.sign-in-nav > a")
    WebElement iconsignin;

    @FindBy(css = "#tb-links > ul > li:nth-child(5) > a")
    WebElement iconsigninShop;

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.utility-header > nav.utility-nav.sign-in-nav > div > a:nth-child(1)")
    WebElement myakc;

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.utility-header > nav.utility-nav.sign-in-nav > div > a:nth-child(2)")
    WebElement logout;

    @FindBy (css = "#tb-links > ul > li:nth-child(6) > a")
    WebElement logoutShop;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[1]/div/div/table/tbody/tr/td/center/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/center/div/div/div")
    WebElement gigyabox;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[4]/label/span/a")
    WebElement forgot;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[3]/label/a")
    WebElement signup;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/h2")
    WebElement signinlogo;

    @FindBy(id = "form-subscribe-input")
    WebElement emailCaseNewProducts;

    @FindBy(id = "form-subscribe-success")
    WebElement formSubscribeSuccess;

    @FindBy(xpath = "//html/body/div[2]/div[2]/div[2]/div/form/div[1]/div[3]/label/span")
    WebElement otheroption;


    //Driver
    WebDriver driver;

    //Constructor
    public SignIn(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    //Methods

    public void signInUser(User _testUser) {

        this.iconsignin.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(signup));
        this.forgot.isDisplayed();
        this.signinlogo.isDisplayed();
        this.userName.sendKeys(_testUser.username);
        this.password.sendKeys(_testUser.password);
        this.ingresar.click();
        wait.until(ExpectedConditions.visibilityOf(iconsignin));

    }


}
