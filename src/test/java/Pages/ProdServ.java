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
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    public void VerifyProdServ() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.visibilityOf(products));
        wait.until(ExpectedConditions.visibilityOf(shopdog));
        wait.until(ExpectedConditions.visibilityOf(breedspecif));
        wait.until(ExpectedConditions.visibilityOf(toystreats));
        wait.until(ExpectedConditions.visibilityOf(trainingprod));
        wait.until(ExpectedConditions.visibilityOf(doggift));
        wait.until(ExpectedConditions.visibilityOf(dnaHealthTest));
        wait.until(ExpectedConditions.visibilityOf(DNAKitAct));
        wait.until(ExpectedConditions.visibilityOf(akcmag));
        wait.until(ExpectedConditions.visibilityOf(pedigrees));
        wait.until(ExpectedConditions.visibilityOf(breedrep));
        wait.until(ExpectedConditions.visibilityOf(akccomp));
        wait.until(ExpectedConditions.visibilityOf(services));
        wait.until(ExpectedConditions.visibilityOf(regdog));
        wait.until(ExpectedConditions.visibilityOf(regpure));
        wait.until(ExpectedConditions.visibilityOf(reglitter));
        wait.until(ExpectedConditions.visibilityOf(enroll));
        wait.until(ExpectedConditions.visibilityOf(regdown));
        wait.until(ExpectedConditions.visibilityOf(finddog));
        wait.until(ExpectedConditions.visibilityOf(finpuppy));
        wait.until(ExpectedConditions.visibilityOf(akcrescue));
        wait.until(ExpectedConditions.visibilityOf(breedrefer));
        wait.until(ExpectedConditions.visibilityOf(puppyvisor));
        wait.until(ExpectedConditions.visibilityOf(trainserv));
        wait.until(ExpectedConditions.visibilityOf(cgc));
        wait.until(ExpectedConditions.visibilityOf(gooddog));
        wait.until(ExpectedConditions.visibilityOf(findtrainclub));
        wait.until(ExpectedConditions.visibilityOf(akccaninecolle));
        wait.until(ExpectedConditions.visibilityOf(healthgen));
        wait.until(ExpectedConditions.visibilityOf(findgroom));
        wait.until(ExpectedConditions.visibilityOf(akcsafe));
        wait.until(ExpectedConditions.visibilityOf(akcpet));
        wait.until(ExpectedConditions.visibilityOf(akcvete));
        wait.until(ExpectedConditions.visibilityOf(akccanineretreat));
        wait.until(ExpectedConditions.visibilityOf(akcreunite));
        wait.until(ExpectedConditions.visibilityOf(breedprog));
        wait.until(ExpectedConditions.visibilityOf(bom));
        wait.until(ExpectedConditions.visibilityOf(bwh));
        wait.until(ExpectedConditions.visibilityOf(bez));
        wait.until(ExpectedConditions.visibilityOf(seall));
        wait.until(ExpectedConditions.visibilityOf(browseserv));
        wait.until(ExpectedConditions.visibilityOf(akcshop));

    }

    //Click on Menu links to validate element(s) methods >

    public void Clickshopdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(shopdog));
        wait.until(ExpectedConditions.elementToBeClickable(shopdog)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clickbreedspecif() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.visibilityOf(breedspecif));
        wait.until(ExpectedConditions.elementToBeClickable(breedspecif)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clicktoystreats() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(toystreats));
        wait.until(ExpectedConditions.elementToBeClickable(toystreats)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clicktrainingprod() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(trainingprod));
        wait.until(ExpectedConditions.elementToBeClickable(trainingprod)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clickdoggift() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(doggift));
        wait.until(ExpectedConditions.elementToBeClickable(doggift)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlToBe("https://shop.akc.org/collections/gear-for-dogs-gift-boxes"));

    }

    public void ClickdnaHealthTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dnaHealthTest)).click();
        wait.until(ExpectedConditions.visibilityOf(dnaElement));

    }

    public void ClickDNAKitActProdServ() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(DNAKitAct));
        wait.until(ExpectedConditions.elementToBeClickable(DNAKitAct)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://dna.akc.org/"));

    }

    public void ClickakcmagProdServ() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcmag));
        wait.until(ExpectedConditions.elementToBeClickable(akcmag)).click();
        wait.until(ExpectedConditions.visibilityOf(akcmagElement));


    }

    public void Clickpedigrees() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pedigrees));
        wait.until(ExpectedConditions.elementToBeClickable(pedigrees)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickbreedrep() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedrep));
        wait.until(ExpectedConditions.elementToBeClickable(breedrep)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/?view=category&cde_category=BRDR"));

    }

    public void Clickakccomp() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akccomp));
        wait.until(ExpectedConditions.elementToBeClickable(akccomp)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/"));

    }

    public void Clickregdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdog));
        wait.until(ExpectedConditions.elementToBeClickable(regdog)).click();
        wait.until(ExpectedConditions.visibilityOf(regdogElement));

    }

    public void Clickregpure() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regpure));
        wait.until(ExpectedConditions.elementToBeClickable(regpure)).click();
        wait.until(ExpectedConditions.visibilityOf(regpureElement));

    }

    public void reglitter() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(reglitter));
        wait.until(ExpectedConditions.elementToBeClickable(reglitter)).click();
        wait.until(ExpectedConditions.visibilityOf(reglitterRadiobutton));

    }

    public void Clickenroll() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(enroll));
        wait.until(ExpectedConditions.elementToBeClickable(enroll)).click();
        wait.until(ExpectedConditions.visibilityOf(AKCCaninePartners));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickregdown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(regdown));
        wait.until(ExpectedConditions.elementToBeClickable(regdown)).click();
        wait.until(ExpectedConditions.visibilityOf(regdownElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfinddog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(finddog));
        wait.until(ExpectedConditions.elementToBeClickable(finddog)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickfinpuppy() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(finpuppy));
        wait.until(ExpectedConditions.elementToBeClickable(finpuppy)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace"));

    }

    public void Clickakcrescue() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcrescue));
        wait.until(ExpectedConditions.elementToBeClickable(akcrescue)).click();
        wait.until(ExpectedConditions.visibilityOf(akcrescueElement));
        driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickbreedrefer() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedrefer));
        wait.until(ExpectedConditions.elementToBeClickable(breedrefer)).click();
        wait.until(ExpectedConditions.visibilityOf(breedreferElement));

    }

    public void Clickpuppyvisor() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(puppyvisor));
        wait.until(ExpectedConditions.elementToBeClickable(puppyvisor)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));


    }

    public void Clicktrainserv() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(trainserv));
        wait.until(ExpectedConditions.elementToBeClickable(trainserv)).click();
        wait.until(ExpectedConditions.visibilityOf(trainservElement));

    }

    public void Clickcgc() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(cgc));
        wait.until(ExpectedConditions.elementToBeClickable(cgc)).click();
        wait.until(ExpectedConditions.visibilityOf(cgcElement));

    }

    public void Clickgooddog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(gooddog));
        wait.until(ExpectedConditions.elementToBeClickable(gooddog)).click();
        wait.until(ExpectedConditions.visibilityOf(gooddogElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfindtrainclub() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findtrainclub));
        wait.until(ExpectedConditions.elementToBeClickable(findtrainclub)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/www.apps.akc.org/"));

    }

    public void Clickakccaninecolle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akccaninecolle));
        wait.until(ExpectedConditions.elementToBeClickable(akccaninecolle)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickhealthgen() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(healthgen));
        wait.until(ExpectedConditions.elementToBeClickable(healthgen)).click();
        wait.until(ExpectedConditions.visibilityOf(healthgenElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfindgroom() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findgroom));
        wait.until(ExpectedConditions.elementToBeClickable(findgroom)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickakcsafe() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcsafe));
        wait.until(ExpectedConditions.elementToBeClickable(akcsafe)).click();
        wait.until(ExpectedConditions.visibilityOf(akcsafeElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickakcpet() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcpet));
        wait.until(ExpectedConditions.elementToBeClickable(akcpet)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.akcpetinsurance.com/"));

    }

    public void Clickakcvete() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcvete));
        wait.until(ExpectedConditions.elementToBeClickable(akcvete)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("apps.akc.org/"));

    }

    public void Clickakccanineretreat() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akccanineretreat)); //This was removed from the ProdServMneu
        wait.until(ExpectedConditions.elementToBeClickable(akccanineretreat)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://akccanineretreat.com/"));

    }

    public void Clickakcreunite()  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcreunite));
        wait.until(ExpectedConditions.elementToBeClickable(akcreunite)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/akcreunite.org/"));

    }

    public void Clickbreedprog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(breedprog)).click();
        wait.until(ExpectedConditions.visibilityOf(breedprogElement));

    }

    public void Clickbom() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bom));
        wait.until(ExpectedConditions.elementToBeClickable(bom)).click();
        wait.until(ExpectedConditions.visibilityOf(bomElement));
        driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickbwh() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bwh));
        wait.until(ExpectedConditions.elementToBeClickable(bwh)).click();
        wait.until(ExpectedConditions.visibilityOf(bwhElement));

    }

    public void Clickbez() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(bez));
        wait.until(ExpectedConditions.elementToBeClickable(bez)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickseall() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(seall));
        wait.until(ExpectedConditions.elementToBeClickable(seall)).click();
        wait.until(ExpectedConditions.visibilityOf(seallElement));

    }


    public void Clickakcshop() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcshop));
        wait.until(ExpectedConditions.elementToBeClickable(akcshop)).click();
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
        wait.until(ExpectedConditions.elementToBeClickable(produservi)).click();
        wait.until(ExpectedConditions.elementToBeClickable(services)).click();
        wait.until(ExpectedConditions.urlContains("/products-services/"));


    }

}
