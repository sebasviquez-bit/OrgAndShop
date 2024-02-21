package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ProdServ {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(3)")
    WebElement produservi;

    @FindBy(css = "#product-services > div:nth-child(1) > div > a")
    WebElement products;

    //#product-services > div:nth-child(1) > div > a

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > a")
    WebElement shopdog;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement breedspecif;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement toystreats;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement trainingprod;

    @FindBy(xpath = "//*[@id=\"product-services\"]/div[1]/div/div/div/ul/li[1]/ul/li[4]/a")
    WebElement doggift;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(3) > a")
    WebElement dnaHealthTest;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(4) > a")
    WebElement DNAKitAct;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(4) > a")
    WebElement akcmag;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(5) > a")
    WebElement pedigrees;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(6) > a")
    WebElement breedrep;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(7) > a")
    WebElement akccomp;

    @FindBy(css = "#product-services > div:nth-child(2) > div > a")
    WebElement services;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement regdog;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement regpure;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement reglitter;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement enroll;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement regdown;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement finddog;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement finpuppy;

    @FindBy(xpath = "//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[2]/ul/li[2]/a")
    WebElement akcrescue;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement breedrefer;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement puppyvisor;

    @FindBy(xpath = "//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[3]/a")
    WebElement trainserv;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement cgc;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement gooddog;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(3) > a")
    WebElement findtrainclub;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement akccaninecolle;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement healthgen;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement findgroom;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement akcsafe;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement akcpet;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement akcvete;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement akccanineretreat;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement akcreunite;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/ul/li[7]/a")
    WebElement linkakc;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement breedprog;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement bom;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement bwh;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement bez;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement seall;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement browseserv;

    @FindBy(css = "#product-services > div:nth-child(3) > div > a")
    WebElement akcshop;

    @FindBy(css = "#page-title > div > h1")
    WebElement dnaElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcmagElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement regdogElement;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__header > img")
    WebElement regpureElement;

    @FindBy(css = "body > div.registration.cmw.bgc-white > div > div.registration__content.pb4.bpm-pb6 > div > main > form > div:nth-child(1) > div.registration__radio-menu__group-trigger > label > span")
    WebElement reglitterRadiobutton;

    @FindBy(xpath = "//html/body/div[4]/div/div[4]/div/main/form/div[1]/div[2]/div[1]/label/span")
    WebElement OwnDamandSire;

    @FindBy(xpath = "//html/body/div[4]/div/div[4]/div/main/form/a")
    WebElement continueReg;

    @FindBy(css = "body > div.landing-page > div.section-title.section-title--top-spacing.section-title--center > h2")
    WebElement AKCCaninePartners;

    @FindBy(xpath = "//html/body/div[5]/div/ul/li[2]/span")
    WebElement regdownElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcrescueElement;

    @FindBy(xpath = "//h1[contains(text(),'AKC Breeder Referral Contacts')]")
    WebElement breedreferElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement trainservElement;

    @FindBy(css = "body > div.landing-page > div.anchored-nav.bgc-blue.anchored-nav--light > div.show-at-medium > div > a:nth-child(2)")
    WebElement cgcElement;

    @FindBy(css = "body > div.landing-page > div.anchored-nav.bgc-blue.anchored-nav--light > div.show-at-medium > div > a:nth-child(1)")
    WebElement gooddogElement;

    @FindBy(css = "#page-title > h1")
    WebElement healthgenElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcsafeElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement breedprogElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement bomElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement bwhElement;

    @FindBy(css = "#page-title")
    WebElement seallElement;

    @FindBy(xpath = "#page-title > h1")
    WebElement browseservElement;

    @FindBy(xpath = "//html/body/div[1]/div[1]/header/div[2]/a[2]/img")
    WebElement akcshopElement;

    //Articles Elements >

    @FindBy(css = "body > div:nth-child(7) > div > div.page-layout > aside > div > nav > ul > li > a")
    WebElement dnaResCenter;

    @FindBy(xpath = "//html/body/div[5]/div/div[3]/aside/div/div[2]/div/div[1]/div/div/div/div[1]/div[2]/a")
    WebElement RecomForYouTitle;

    @FindBy(xpath = "//html/body/div[5]/div/div[3]/aside/div/div[2]/div/div[1]/div/div/div/div[4]/div[2]/div/a")
    WebElement RecomForYouTitle2;

    @FindBy(css = "body > div:nth-child(6) > div > div.page-layout > aside > div > nav > ul > li:nth-child(1) > a")
    WebElement familyDog;

    @FindBy(xpath = "//*[@id=\"google_ads_iframe_/120519536/AKC.Products-Services/magazines_1__container__\"]")
    WebElement addMidle;

    @FindBy(css = "body > div.landing-page > div.anchored-nav.bgc-blue.anchored-nav--light > div.show-at-medium > div > a.anchored-nav__anchor.text-white.px3.is-active")
    WebElement cgcMenu;

    @FindBy(css = "body > div.landing-page > div.anchored-nav.bgc-blue.anchored-nav--light > div.show-at-medium > div > a:nth-child(1)")
    WebElement whatiscgcMenu;

    @FindBy(css = "body > div.landing-page > div:nth-child(4) > div > div.side-by-side__content > div > h2")
    WebElement whatiscgcTite;

    @FindBy(css = "body > div.landing-page > div.anchored-nav.bgc-blue.anchored-nav--light > div.show-at-medium > div > a:nth-child(3)")
    WebElement trainresMenu;

    @FindBy(css = "body > div.landing-page > div.side-by-side.bgc-white.py7.bpm-my7.side-by-side--not-full-width > div > div.side-by-side__content > div > h2")
    WebElement trainresTitle;

    // Driver
    WebDriver driver;

    // Constructor
    public ProdServ(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    public void VerifyProdServ() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi));
        this.produservi.click();
        this.products.isDisplayed();
        this.shopdog.isDisplayed();
        this.breedspecif.isDisplayed();
        this.toystreats.isDisplayed();
        this.trainingprod.isDisplayed();
        this.doggift.isDisplayed();
        this.dnaHealthTest.isDisplayed();
        this.DNAKitAct.isDisplayed();
        this.akcmag.isDisplayed();
        this.pedigrees.isDisplayed();
        this.breedrep.isDisplayed();
        this.akccomp.isDisplayed();
        this.services.isDisplayed();
        this.regdog.isDisplayed();
        this.regpure.isDisplayed();
        this.reglitter.isDisplayed();
        this.enroll.isDisplayed();
        this.regdown.isDisplayed();
        this.finddog.isDisplayed();
        this.finpuppy.isDisplayed();
        this.akcrescue.isDisplayed();
        this.breedrefer.isDisplayed();
        this.puppyvisor.isDisplayed();
        this.trainserv.isDisplayed();
        this.cgc.isDisplayed();
        this.gooddog.isDisplayed();
        this.findtrainclub.isDisplayed();
        this.akccaninecolle.isDisplayed();
        this.healthgen.isDisplayed();
        this.findgroom.isDisplayed();
        this.akcsafe.isDisplayed();
        this.akcpet.isDisplayed();
        this.akcvete.isDisplayed();
        this.akccanineretreat.isDisplayed();
        this.akcreunite.isDisplayed();
        this.breedprog.isDisplayed();
        this.bom.isDisplayed();
        this.bwh.isDisplayed();
        this.bez.isDisplayed();
        this.seall.isDisplayed();
        this.browseserv.isDisplayed();
        this.akcshop.isDisplayed();

    }

    //Click on Menu links to validate element(s) methods >

    public void Clickshopdog() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(shopdog));
        this.shopdog.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clickbreedspecif() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(breedspecif));
        this.breedspecif.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clicktoystreats() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(toystreats));
        this.toystreats.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clicktrainingprod() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(trainingprod));
        this.trainingprod.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clickdoggift() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(doggift));
        this.doggift.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlToBe("https://shop.akc.org/collections/gear-for-dogs-gift-boxes"));

    }

    public void ClickdnaHealthTest() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dnaHealthTest)).click();
        wait.until(ExpectedConditions.visibilityOf(dnaElement));

    }

    public void ClickDNAKitActProdServ() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(DNAKitAct));
        this.DNAKitAct.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://dna.akc.org/"));

    }

    public void ClickakcmagProdServ() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcmag));
        this.akcmag.click();
        wait.until(ExpectedConditions.visibilityOf(akcmagElement));


    }

    public void Clickpedigrees() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pedigrees));
        this.pedigrees.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickbreedrep() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(breedrep));
        this.breedrep.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/?view=category&cde_category=BRDR"));

    }

    public void Clickakccomp() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akccomp));
        this.akccomp.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/"));

    }

    public void Clickregdog() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        this.regdog.click();
        wait.until(ExpectedConditions.visibilityOf(regdogElement));

    }

    public void Clickregpure() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(regpure));
        this.regpure.click();
        wait.until(ExpectedConditions.visibilityOf(regpureElement));

    }

    public void reglitter() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(reglitter));
        this.reglitter.click();
        wait.until(ExpectedConditions.visibilityOf(reglitterRadiobutton));

    }

    public void Clickenroll() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(enroll));
        this.enroll.click();
        wait.until(ExpectedConditions.visibilityOf(AKCCaninePartners));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickregdown() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(regdown));
        this.regdown.click();
        wait.until(ExpectedConditions.visibilityOf(regdownElement));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfinddog() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(finddog));
        this.finddog.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickfinpuppy() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(finpuppy));
        this.finpuppy.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace"));

    }

    public void Clickakcrescue() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcrescue));
        this.akcrescue.click();
        wait.until(ExpectedConditions.visibilityOf(akcrescueElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickbreedrefer() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(breedrefer));
        this.breedrefer.click();
        wait.until(ExpectedConditions.visibilityOf(breedreferElement));

    }

    public void Clickpuppyvisor() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(puppyvisor));
        this.puppyvisor.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));


    }

    public void Clicktrainserv() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(trainserv));
        this.trainserv.click();
        wait.until(ExpectedConditions.visibilityOf(trainservElement));

    }

    public void Clickcgc() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cgc));
        this.cgc.click();
        wait.until(ExpectedConditions.visibilityOf(cgcElement));

    }

    public void Clickgooddog() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(gooddog));
        this.gooddog.click();
        wait.until(ExpectedConditions.visibilityOf(gooddogElement));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfindtrainclub() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findtrainclub));
        this.findtrainclub.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/www.apps.akc.org/"));

    }

    public void Clickakccaninecolle() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akccaninecolle));
        this.akccaninecolle.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickhealthgen() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(healthgen));
        this.healthgen.click();
        wait.until(ExpectedConditions.visibilityOf(healthgenElement));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfindgroom() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findgroom));
        this.findgroom.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickakcsafe() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcsafe));
        this.akcsafe.click();
        wait.until(ExpectedConditions.visibilityOf(akcsafeElement));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickakcpet() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcpet));
        this.akcpet.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.akcpetinsurance.com/"));

    }

    public void Clickakcvete() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcvete));
        this.akcvete.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("apps.akc.org/"));

    }

    public void Clickakccanineretreat() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akccanineretreat)); //This was removed from the ProdServMneu
        this.akccanineretreat.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://akccanineretreat.com/"));

    }

    public void Clickakcreunite()  {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcreunite));
        this.akcreunite.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/akcreunite.org/"));

    }

    public void Clickbreedprog() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(breedprog)).click();
        wait.until(ExpectedConditions.visibilityOf(breedprogElement));

    }

    public void Clickbom() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(bom));
        this.bom.click();
        wait.until(ExpectedConditions.visibilityOf(bomElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickbwh() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(bwh));
        this.bwh.click();
        wait.until(ExpectedConditions.visibilityOf(bwhElement));

    }

    public void Clickbez() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(bez));
        this.bez.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickseall() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(seall));
        this.seall.click();
        wait.until(ExpectedConditions.visibilityOf(seallElement));

    }


    public void Clickakcshop() {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcshop));
        this.akcshop.click();
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void ClickProducts() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(products)).click();
        wait.until(ExpectedConditions.urlContains("/products-services/"));

    }

    public void ClickServices() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi));
        this.produservi.click();
        this.services.click();
        wait.until(ExpectedConditions.urlContains("/products-services/"));


    }

}
