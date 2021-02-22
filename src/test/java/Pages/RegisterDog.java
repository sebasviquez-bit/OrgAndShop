package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(2) > div.registration__radio-menu__group-trigger > label > span")
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

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > ul > li:nth-child(5) > a")
    WebElement moreinfo;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > aside > div > nav > h4")
    WebElement registrationSideNav;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form")
    WebElement registrationRadioMenu;

    @FindBy(xpath = "//html/body/div[4]/div/div[4]/div/main/div[2]/div/p[5]/a")
    WebElement startdog;

   @FindBy(xpath = "//body/div/div/div/div/main/form/div[1]/div[1]/label[1]/span[1]")
    WebElement regpure;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > div > span.form-label")
    WebElement regpuretext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > div > span.form-description > a")
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

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > span")
    WebElement foreigreg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(1) > label > div > span.form-label")
    WebElement foreigregtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > span")
    WebElement fundstock;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(2) > label > div > span.form-label")
    WebElement fundstocktext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > label > span")
    WebElement openreg;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(3) > label > div > span.form-label")
    WebElement openregtext;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(4) > label > span")
    WebElement kenname;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div.registration__radio-option.active > div.registration__radio-menu__group-set > div:nth-child(4) > label > div > span.form-label")
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

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > div.article-body > div > div > div > p:nth-child(4) > a")
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

    @FindBy(css = "body > div:nth-child(7) > div > div.page-layout > main > div.article-body > div > div > div > p:nth-child(6) > a")
    WebElement certpedbut;

    @FindBy(css = "body > div:nth-child(37) > div > div.page-layout > main > div.article-body > div")
    WebElement contentBody;

    @FindBy(xpath = "//p[7]//a[1]")
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

    @FindBy(css = "body > div:nth-child(6) > div > div.page-layout > main > div.article-body > div > div > div > div > ul > li:nth-child(3) > span")
    WebElement feesched;

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


    //Driver
    WebDriver driver;

    // Constructor
    public RegisterDog(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    private void newWindow() {
        for(String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle);}
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));
    }

    private void newWindow2() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.urlContains("/register/information/canine-partners/enroll/"));
    }

    private void newWindow3() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.urlContains("https://images.akc.org/pdf/"));
    }

    private void newWindow4() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.urlContains("images.akc.org/pdf/"));
    }

    public void VerifyRegisterDog1() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(register));
        this.register.click();
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        wait.until(ExpectedConditions.visibilityOf(registerimg));
        this.registerimg.isDisplayed();
        this.online.isDisplayed();
        this.regdog.isDisplayed();
        this.reglitt.isDisplayed();
        this.transown.isDisplayed();
        this.purcped.isDisplayed();
        this.moreinfo.isDisplayed();
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(regpure));
        this.regpuretext.isDisplayed();
        this.checkreg.isDisplayed();
        this.enrolldog.isDisplayed();
        this.enrolldogtext.isDisplayed();
        this.enrollpure.isDisplayed();
        this.enrollpuretext.isDisplayed();
        this.registrationSideNav.isDisplayed();
        this.registrationRadioMenu.isDisplayed();
        this.other.isDisplayed();
        this.othertext.isDisplayed();
        this.regpure.click();
        wait.until(ExpectedConditions.visibilityOf(ownlitt));
        this.ownlitttext.isDisplayed();
        this.newown.isDisplayed();
        this.newowntext.isDisplayed();
        this.prepaid.isDisplayed();
        this.prepaidtext.isDisplayed();
        this.enrolldog.click();
        wait.until(ExpectedConditions.visibilityOf(joincantext));
        this.enrollpure.click();
        wait.until(ExpectedConditions.visibilityOf(akcpal));
        this.other.click();
        wait.until(ExpectedConditions.visibilityOf(foreigreg));
        this.foreigregtext.isDisplayed();
        this.fundstock.isDisplayed();
        this.fundstocktext.isDisplayed();
        this.openreg.isDisplayed();
        this.openregtext.isDisplayed();
        this.kenname.isDisplayed();
        this.kennametext.isDisplayed();
        this.buttoncont.isDisplayed();

    }


    public void VerifyRegisterDog2() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(regpure));
        this.regpure.click();
        this.newown.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow();
        wait.until(ExpectedConditions.visibilityOf(regform2));

    }

    public void VerifyRegisterDog3() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(regpure));
        this.regpure.click();
        wait.until(ExpectedConditions.visibilityOf(prepaid));
        this.prepaid.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow();
        wait.until(ExpectedConditions.urlContains("apps.akc.org//"));

    }

    public void VerifyRegisterDog4() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(enrolldog));
        this.enrolldog.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow2();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("body > div.landing-page > div.content-section.content-block-list--top-bottom-spacing > div > div.content-block__text > p:nth-child(7) > iframe")));

    }


    public void VerifyRegisterDog5() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.regdog.click();
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        wait.until(ExpectedConditions.visibilityOf(enrollpure));
        this.enrollpure.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow3();

    }


    public void VerifyRegisterDog6() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(other));
        this.other.click();
        wait.until(ExpectedConditions.visibilityOf(foreigreg));
        this.foreigreg.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }

    public void VerifyRegisterDog7() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(other));
        this.other.click();
        wait.until(ExpectedConditions.visibilityOf(fundstock));
        this.fundstock.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow3();

    }

    public void VerifyRegisterDog8() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(other));
        this.other.click();
        wait.until(ExpectedConditions.visibilityOf(openreg));
        this.openreg.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }

    public void VerifyRegisterDog9() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdog));
        this.regdog.click();
        wait.until(ExpectedConditions.elementToBeClickable(other));
        this.other.click();
        wait.until(ExpectedConditions.elementToBeClickable(kenname));
        this.kenname.click();
        wait.until(ExpectedConditions.elementToBeClickable(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }


    public void VerifyRegisterLitter() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(regalittext));
        this.mylitt.isDisplayed();
        this.mylitttext.isDisplayed();
        this.breezreg.isDisplayed();
        this.regalit.click();
        wait.until(ExpectedConditions.visibilityOf(damsire));
        this.damsiretext.isDisplayed();
        this.onlydam.isDisplayed();
        this.onlydamtext.isDisplayed();
        this.onlysire.isDisplayed();
        this.onlysiretext.isDisplayed();
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        this.mylitt.click();
        this.fresh.isDisplayed();
        this.freshtext.isDisplayed();
        this.freshext.isDisplayed();
        this.freshexttext.isDisplayed();
        this.froze.isDisplayed();
        this.frozetext.isDisplayed();
        this.special.isDisplayed();
        this.specialtext.isDisplayed();
        this.breezreg.click();
        wait.until(ExpectedConditions.visibilityOf(ezregopt));
        this.ezregopttext.isDisplayed();
        this.puppyman.isDisplayed();
        this.puppymantext.isDisplayed();
        this.regalit.click();
        this.damsire.click();
        this.buttoncont.click();
        newWindow();

    }

    public void VerifyRegisterLitter2() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(regalit));
        this.regalit.click();
        wait.until(ExpectedConditions.visibilityOf(onlydam));
        this.onlydam.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow();

    }

    public void VerifyRegisterLitter3() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(regalit));
        this.regalit.click();
        wait.until(ExpectedConditions.visibilityOf(onlysire));
        this.onlysire.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow();

    }

    public void VerifyRegisterLitter4() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        this.mylitt.click();
        wait.until(ExpectedConditions.visibilityOf(fresh));
        this.fresh.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }

    public void VerifyRegisterLitter5() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        this.mylitt.click();
        wait.until(ExpectedConditions.visibilityOf(freshext));
        this.freshext.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }

    public void VerifyRegisterLitter6() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        this.mylitt.click();
        wait.until(ExpectedConditions.visibilityOf(froze));
        this.froze.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }

    public void VerifyRegisterLitter7() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(mylitt));
        this.mylitt.click();
        wait.until(ExpectedConditions.visibilityOf(special));
        this.special.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow4();

    }

    public void VerifyRegisterLitter8() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(breezreg));
        this.breezreg.click();
        wait.until(ExpectedConditions.visibilityOf(ezregopt));
        this.ezregopt.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow();

    }

    public void VerifyRegisterLitter9() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(reglitt));
        this.reglitt.click();
        wait.until(ExpectedConditions.visibilityOf(breezreg));
        this.breezreg.click();
        wait.until(ExpectedConditions.visibilityOf(puppyman));
        this.puppyman.click();
        wait.until(ExpectedConditions.visibilityOf(buttoncont));
        this.buttoncont.click();
        newWindow();

    }

    public void VerifyTransOwner() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(transown));
        this.transown.click();
        wait.until(ExpectedConditions.elementToBeClickable(transownbut));
        this.transownbut.click();
        newWindow();

    }

    public void VerifyPurchPedig() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(purcped));
        this.purcped.click();
        wait.until(ExpectedConditions.visibilityOf(purcpedheader));
        wait.until(ExpectedConditions.elementToBeClickable(certpedbut));
        this.certpedbut.click();
        newWindow();

    }

    public void VerifyPurchPedig2() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(purcped));
        this.purcped.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", onlinesearButton);
        wait.until(ExpectedConditions.elementToBeClickable(onlinesearButton));
        this.onlinesearButton.click();
        newWindow();

    }

    public void VerifyMoreInformation() {

        this.register.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(moreinfo));
        this.moreinfo.click();
        wait.until(ExpectedConditions.visibilityOf(feesched));

    }


}
