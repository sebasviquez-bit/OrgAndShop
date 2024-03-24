package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterDog {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.utility-header > nav:nth-child(1) > a:nth-child(3)")
    WebElement register;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__header > img")
    WebElement registerimg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__header > div > span")
    WebElement online;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > ul > li:nth-child(1) > a")
    WebElement regdog;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > ul > li:nth-child(2) > a")
    WebElement reglitt;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > span")
    WebElement regalit;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > div > span.form-description")
    WebElement regalittext;

    @FindBy(xpath = "/html/body/div[4]/div/div[4]/div/main/form/div[2]/div[1]/label/span")
    WebElement mylitt;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(2) > div.registration__radio-menu__group-trigger > label > div > span.form-label")
    WebElement mylitttext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(3) > div.registration__radio-menu__group-trigger > label > span")
    WebElement breezreg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > span")
    WebElement damsire;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > div")
    WebElement damsiretext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > span")
    WebElement onlydam;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > div > span.form-label")
    WebElement onlydamtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > label > span")
    WebElement onlysire;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > label > div > span.form-label")
    WebElement onlysiretext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(1) > label > span")
    WebElement fresh;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(1) > label > div > span")
    WebElement freshtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(2) > label > span")
    WebElement freshext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > span")
    WebElement freshRegisterOnline;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(2) > label > div > span")
    WebElement freshexttext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(3) > label > span")
    WebElement froze;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(3) > label > div > span")
    WebElement frozetext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(4) > label > span")
    WebElement special;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set.registration__radio-menu__group-set--tight > div:nth-child(4) > label > div > span")
    WebElement specialtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > span")
    WebElement ezregopt;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > div > span.form-label")
    WebElement ezregopttext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > span")
    WebElement puppyman;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > div > span.form-label")
    WebElement puppymantext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > ul > li:nth-child(3) > a")
    WebElement transown;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > ul > li:nth-child(4) > a")
    WebElement purcped;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > ul > li:nth-child(6) > a")
    WebElement moreinfo;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > h4")
    WebElement registrationSideNav;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form")
    WebElement registrationRadioMenu;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > div > label > span")
    WebElement registerOnline;

   @FindBy(xpath = "//body/div/div/div/div/main/form/div[1]/div[1]/label[1]/span[1]")
    WebElement regpure;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > div > span.form-label")
    WebElement regpuretext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-trigger > label > div > span.form-description > p > a")
    WebElement checkreg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(2) > div.registration__radio-menu__group-trigger > label > span")
    WebElement enrolldog;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(2) > div.registration__radio-menu__group-trigger > label > div > span.form-label")
    WebElement enrolldogtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(3) > div.registration__radio-menu__group-trigger > label > span")
    WebElement enrollpure;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(3) > div.registration__radio-menu__group-trigger > label > div > span.form-label")
    WebElement enrollpuretext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(4) > div.registration__radio-menu__group-trigger > label > span")
    WebElement other;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(4) > div.registration__radio-menu__group-trigger > label > div > span.form-label")
    WebElement othertext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > span")
    WebElement ownlitt;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > div > span.form-label")
    WebElement ownlitttext;

    @FindBy(xpath = "//body/div/div/div/div/main/form/div[1]/div[2]/div[2]/label[1]/span[1]")
    WebElement newown;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > div > span.form-label")
    WebElement newowntext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > label > span")
    WebElement prepaid;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > label > div > span.form-label")
    WebElement prepaidtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > p")
    WebElement joincantext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > p")
    WebElement akcpal;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > span")
    WebElement foreigreg;

    @FindBy(xpath = "//span[normalize-space()='FOREIGN REGISTRATION']")
    WebElement foreigregtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > span")
    WebElement RegisterOnline;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > div > span.form-label")
    WebElement RegOnlineText;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > span")
    WebElement RegisterOnPapper;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > div > span.form-label")
    WebElement RegOnPapperText;
    //

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > div > label > span")
    WebElement fundstock;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > div > label > div > span.form-label")
    WebElement fundstocktext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > div > label > span")
    WebElement openreg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > div > label > div > span.form-label")
    WebElement openregtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(4) > div > label > span")
    WebElement kenname;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(4) > div > label > div > span.form-label")
    WebElement kennametext;

    @FindBy(xpath = "//html/body/div[4]/div/div[4]/div/main/form")
    WebElement continuereg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > a")
    WebElement buttoncont;

    @FindBy(xpath = "//html/body/div[5]/div/div/main/div[3]/div/div/div/div[3]/div/form/div/div[8]")
    WebElement regform1;

    @FindBy(xpath = "//html/body/div[6]/div/div/main/h1")
    WebElement regform2;

    @FindBy(xpath = "//html/body/div[4]/div/div/div/div[3]/div/form/div/h1")
    WebElement regform3;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/p[4]/iframe")
    WebElement regform4;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement transownheader;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > div.article-body > div > div > div")
    WebElement transownbody;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > div.article-body > div > div > div > p:nth-child(5) > a")
    WebElement transownbut;

    @FindBy(xpath = "//html/body/div[5]/div/div/main/div[2]/div/div[2]/app-root/main/div/app-login/div/div[2]/div/img")
    WebElement transownform;

    @FindBy(css = "#page-title > div > h1")
    WebElement purcpedheader;

    @FindBy(css = "body > div:nth-child(6) > div > div.page-layout > main > div.article-body > div > div > div > h2:nth-child(7)")
    WebElement OnlineResearchTitle;
    //

    @FindBy(css = "body > div:nth-child(6) > div > div.page-layout > main > div.article-body > div > div > div > h2:nth-child(3)")
    WebElement certped;

    @FindBy(xpath = "//body/div[5]/div[1]/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/p[5]/a[1]")
    WebElement certpedbut;

    @FindBy(css = "body > div:nth-child(37) > div > div.page-layout > main > div.article-body > div")
    WebElement contentBody;

    @FindBy(xpath = "//body/div[5]/div[1]/div[2]/main[1]/div[3]/div[1]/div[1]/div[1]/p[7]/a[1]")
    WebElement onlinesearButton;

    @FindBy(css = "body > div:nth-child(37) > div > div.page-layout > main > div.article-body > div > div > div > div > ul > li:nth-child(1) > span")
    WebElement dogregmenu;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[1]/span/span")
    WebElement dogregmenuexp;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[1]/div/ul")
    WebElement dogregmenubody;

    @FindBy(css = "body > div:nth-child(37) > div > div.page-layout > main > div.article-body > div > div > div > div > ul > li:nth-child(1) > span")
    WebElement littregmenu;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[2]/span/span")
    WebElement littregmenuexp;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[2]/div")
    WebElement littregmenubody;

    @FindBy(xpath = "//h1[contains(text(),'More Information')]")
    WebElement moreInfoTitle;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[3]/span/span")
    WebElement feeschedexp;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[3]/div")
    WebElement feeschedbody;

    @FindBy(css = "body > div:nth-child(37) > div > div.page-layout > main > div.article-body > div > div > div > div > ul > li:nth-child(4) > span")
    WebElement rulregmenu;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[4]/span/span")
    WebElement rulregmenuexp;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[4]/div")
    WebElement rulregmenubody;

    @FindBy(css = "body > div:nth-child(37) > div > div.page-layout > main > div.article-body > div > div > div > div > ul > li:nth-child(4) > span")
    WebElement dowforms;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[5]/span/span")
    WebElement dowformsexp;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/main/div[3]/div/div/ul/li[5]/div/ul")
    WebElement dowformsbody;

    @FindBy(css = "#a268951c-b028-44ad-99ed-5af71765e083")
    WebElement BottomBanner;
    //


    //Driver
    WebDriver driver;

    // Constructor
    public RegisterDog(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    private void newWindow() {
        for(String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle);}
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));
    }

    private void newWindow2() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/register/information/canine-partners/enroll/"));
    }

    private void newWindow3() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("https://images.akc.org/pdf/"));
    }

    private void newWindow4() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/images.akc.org/"));
    }

    private void newWindow5() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/register/dog/foreign/"));
    }

    public void VerifyRegisterDog1() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.visibilityOf(registerimg));
        wait.until(ExpectedConditions.visibilityOf(online));
        wait.until(ExpectedConditions.visibilityOf(regdog));
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        wait.until(ExpectedConditions.visibilityOf(transown));
        wait.until(ExpectedConditions.visibilityOf(purcped));
        wait.until(ExpectedConditions.visibilityOf(moreinfo));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regpure)).click();
        wait.until(ExpectedConditions.visibilityOf(regpuretext));
        wait.until(ExpectedConditions.visibilityOf(checkreg));
        wait.until(ExpectedConditions.visibilityOf(enrolldog));
        wait.until(ExpectedConditions.visibilityOf(enrolldogtext));
        wait.until(ExpectedConditions.visibilityOf(enrollpure));
        wait.until(ExpectedConditions.visibilityOf(enrollpuretext));
        wait.until(ExpectedConditions.visibilityOf(registrationSideNav));
        wait.until(ExpectedConditions.visibilityOf(registrationRadioMenu));
        wait.until(ExpectedConditions.visibilityOf(other));
        wait.until(ExpectedConditions.visibilityOf(othertext));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regpure));
        wait.until(ExpectedConditions.elementToBeClickable(regpure)).click();
        wait.until(ExpectedConditions.visibilityOf(ownlitt));
        wait.until(ExpectedConditions.visibilityOf(ownlitttext));
        wait.until(ExpectedConditions.visibilityOf(newown));
        wait.until(ExpectedConditions.visibilityOf(newowntext));
        wait.until(ExpectedConditions.visibilityOf(prepaid));
        wait.until(ExpectedConditions.visibilityOf(prepaidtext));
        wait.until(ExpectedConditions.elementToBeClickable(enrolldog)).click();
        wait.until(ExpectedConditions.visibilityOf(joincantext));
        wait.until(ExpectedConditions.elementToBeClickable(enrollpure)).click();
        wait.until(ExpectedConditions.visibilityOf(akcpal));
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        wait.until(ExpectedConditions.visibilityOf(foreigreg));
        wait.until(ExpectedConditions.visibilityOf(foreigregtext));
        wait.until(ExpectedConditions.visibilityOf(fundstock));
        wait.until(ExpectedConditions.visibilityOf(fundstocktext));
        wait.until(ExpectedConditions.visibilityOf(openreg));
        wait.until(ExpectedConditions.visibilityOf(openregtext));
        wait.until(ExpectedConditions.visibilityOf(kenname));
        wait.until(ExpectedConditions.visibilityOf(kennametext));
        wait.until(ExpectedConditions.visibilityOf(buttoncont));

    }


    public void VerifyRegisterDog2() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regpure)).click();
        wait.until(ExpectedConditions.elementToBeClickable(newown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();
        wait.until(ExpectedConditions.urlContains("/apps/dogreg/index.cfm"));

    }

    public void VerifyRegisterDog3() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regpure));
        wait.until(ExpectedConditions.elementToBeClickable(regpure)).click();
        wait.until(ExpectedConditions.visibilityOf(prepaid));
        wait.until(ExpectedConditions.elementToBeClickable(prepaid)).click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();
        wait.until(ExpectedConditions.urlContains("apps.akc.org"));

    }

    public void VerifyRegisterDog4() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(enrolldog));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(enrolldog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow2();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("body > div.landing-page > div.content-section.content-block-list--top-bottom-spacing > div > div.content-block__text > p:nth-child(7) > iframe")));

    }


    public void VerifyRegisterDog5() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(enrollpure));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(enrollpure)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow3();

    }


    public void VerifyRegisterDog6() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        wait.until(ExpectedConditions.elementToBeClickable(foreigreg));
        wait.until(ExpectedConditions.elementToBeClickable(foreigreg)).click();
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(RegisterOnline));
        wait.until(ExpectedConditions.elementToBeClickable(RegisterOnline)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow5();

    }

    public void VerifyRegisterDog7() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fundstock));
        wait.until(ExpectedConditions.elementToBeClickable(fundstock)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow3();

    }

    public void VerifyRegisterDog8() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        wait.until(ExpectedConditions.elementToBeClickable(openreg)).click();
        wait.until(ExpectedConditions.elementToBeClickable(registerOnline)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();

    }

    public void VerifyRegisterDog9() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        wait.until(ExpectedConditions.elementToBeClickable(kenname));
        wait.until(ExpectedConditions.elementToBeClickable(kenname)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow4();

    }

    public void VerifyRegisterDog10() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.elementToBeClickable(other)).click();
        wait.until(ExpectedConditions.elementToBeClickable(foreigreg)).click();
        wait.until(ExpectedConditions.elementToBeClickable(RegisterOnPapper)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow4();

    }


    public void VerifyRegisterLitter() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.visibilityOf(regalittext));
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        wait.until(ExpectedConditions.visibilityOf(mylitttext));
        wait.until(ExpectedConditions.visibilityOf(breezreg));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regalit)).click();
        wait.until(ExpectedConditions.visibilityOf(damsire));
        wait.until(ExpectedConditions.visibilityOf(damsiretext));
        wait.until(ExpectedConditions.visibilityOf(onlydam));
        wait.until(ExpectedConditions.visibilityOf(onlydamtext));
        wait.until(ExpectedConditions.visibilityOf(onlysire));
        wait.until(ExpectedConditions.visibilityOf(onlysiretext));
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        wait.until(ExpectedConditions.elementToBeClickable(mylitt)).click();
        wait.until(ExpectedConditions.visibilityOf(fresh));
        wait.until(ExpectedConditions.visibilityOf(freshtext));
        wait.until(ExpectedConditions.visibilityOf(freshext));
        wait.until(ExpectedConditions.visibilityOf(freshexttext));
        wait.until(ExpectedConditions.visibilityOf(froze));
        wait.until(ExpectedConditions.visibilityOf(frozetext));
        wait.until(ExpectedConditions.visibilityOf(special));
        wait.until(ExpectedConditions.visibilityOf(specialtext));
        wait.until(ExpectedConditions.elementToBeClickable(breezreg)).click();
        wait.until(ExpectedConditions.visibilityOf(ezregopt));
        wait.until(ExpectedConditions.visibilityOf(ezregopttext));
        wait.until(ExpectedConditions.visibilityOf(puppyman));
        wait.until(ExpectedConditions.visibilityOf(puppymantext));
        wait.until(ExpectedConditions.elementToBeClickable(regalit)).click();
        wait.until(ExpectedConditions.elementToBeClickable(damsire)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();

    }

    public void VerifyRegisterLitter2() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regalit));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regalit)).click();
        wait.until(ExpectedConditions.elementToBeClickable(onlydam));
        wait.until(ExpectedConditions.elementToBeClickable(onlydam)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();

    }

    public void VerifyRegisterLitter3() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regalit));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(regalit)).click();
        wait.until(ExpectedConditions.visibilityOf(onlysire));
        wait.until(ExpectedConditions.elementToBeClickable(onlysire)).click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();

    }

    public void VerifyRegisterLitter4() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fresh));
        wait.until(ExpectedConditions.elementToBeClickable(fresh)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow4();

    }

    public void VerifyRegisterLitter5() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(freshext));
        wait.until(ExpectedConditions.elementToBeClickable(freshext)).click();
        wait.until(ExpectedConditions.elementToBeClickable(freshRegisterOnline));
        wait.until(ExpectedConditions.elementToBeClickable(freshRegisterOnline)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        wait.until(ExpectedConditions.urlContains("apps.akc.org/registration-litter/register"));

    }

    public void VerifyRegisterLitter6() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(froze));
        wait.until(ExpectedConditions.elementToBeClickable(froze)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow4();

    }

    public void VerifyRegisterLitter7() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(mylitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(special));
        wait.until(ExpectedConditions.elementToBeClickable(special)).click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow4();

    }

    public void VerifyRegisterLitter8() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breezreg));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(breezreg)).click();
        wait.until(ExpectedConditions.elementToBeClickable(ezregopt));
        wait.until(ExpectedConditions.elementToBeClickable(ezregopt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();

    }

    public void VerifyRegisterLitter9() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(reglitt)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breezreg));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(breezreg)).click();
        wait.until(ExpectedConditions.elementToBeClickable(puppyman));
        wait.until(ExpectedConditions.elementToBeClickable(puppyman)).click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont)).click();
        newWindow();  //This fails because of missing redirection Waiting on Jake confirmation

    }

    public void VerifyTransOwner() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(transown));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(transown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(transownbut));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(transownbut)).click();
        newWindow();

    }

    public void VerifyPurchPedig() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(purcped));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(purcped)).click();
        wait.until(ExpectedConditions.visibilityOf(purcpedheader));
        wait.until(ExpectedConditions.elementToBeClickable(certpedbut));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(certpedbut)).click();
        newWindow();

    }

    public void VerifyPurchPedig2() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(purcped));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(purcped)).click();
        wait.until(ExpectedConditions.elementToBeClickable(onlinesearButton));
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(onlinesearButton)).click();
        newWindow();

    }

    public void VerifyMoreInformation() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(register)).click();
        wait.until(ExpectedConditions.elementToBeClickable(moreinfo));
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(moreinfo)).click();
        wait.until(ExpectedConditions.visibilityOf(moreInfoTitle));

    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }


}
