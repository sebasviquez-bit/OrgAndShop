package Pages;

import Helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class ProdServ {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(3)")
    WebElement produservi;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[1]/div/h3")
    WebElement products;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[1]/div/div/div/ul/li[1]/a")
    WebElement shopdog;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement breedspecif;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement toystreats;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement trainingprod;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement doggift;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(2) > a")
    WebElement dna;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(3) > a")
    WebElement akctv;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(4) > a")
    WebElement akcmag;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(5) > a")
    WebElement pedigrees;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(6) > a")
    WebElement breedrep;

    @FindBy(css = "#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(7) > a")
    WebElement akccomp;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/h3")
    WebElement services;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/ul/li[1]/a")
    WebElement regdog;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement regpure;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement reglitter;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement enroll;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement regdown;

    @FindBy(xpath = "//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[2]/a")
    WebElement finddog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/ul/li[2]/ul/li[1]/a")
    WebElement finpuppy;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement akcrescue;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement breedrefer;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement puppyvisor;

    @FindBy(xpath = "//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[3]/a")
    WebElement trainserv;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement cgc;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement gooddog;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(3) > a")
    WebElement findtrainclub;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[3]/a")
    WebElement akccaninecolle;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/a")
    WebElement healthgen;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/ul/li[1]/a")
    WebElement findgroom;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/ul/li[2]/a")
    WebElement akcsafe;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/ul/li[3]/a")
    WebElement akcpet;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/ul/li[4]/a")
    WebElement akcvete;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement akccanineretreat;

    @FindBy(css = "#product-services > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement akcreunite;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[1]/ul/li[7]/a")
    WebElement linkakc;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[2]/a")
    WebElement breedprog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a")
    WebElement bom;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")
    WebElement bwh;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[2]/ul/li[3]/a")
    WebElement bez;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[2]/ul/li[4]/a")
    WebElement seall;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[2]/ul/li[4]/a")
    WebElement browseserv;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[3]/div[3]/div/div/a/img")
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

    @FindBy(css = "#page-title > h1")
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

    @FindBy(css = "#page-title > div > h1")
    WebElement seallElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
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



    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public ProdServ(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void VerifyProdServ(){

        this.produservi.click();
        this.products.isDisplayed();
        this.shopdog.isDisplayed();
        this.breedspecif.isDisplayed();
        this.toystreats.isDisplayed();
        this.trainingprod.isDisplayed();
        this.doggift.isDisplayed();
        this.dna.isDisplayed();
        this.akctv.isDisplayed();
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


    public void Clickshopdog() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.shopdog.isDisplayed();
        this.shopdog.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clickbreedspecif() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(1) > a")));
        this.breedspecif.isDisplayed();
        this.breedspecif.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clicktoystreats() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(2) > a")));
        this.toystreats.isDisplayed();
        this.toystreats.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clicktrainingprod() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(3) > a")));
        this.trainingprod.isDisplayed();
        this.trainingprod.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://shop.akc.org/"));

    }

    public void Clickdoggift() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(1) > ul > li:nth-child(4) > a")));
        this.doggift.isDisplayed();
        this.doggift.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlToBe("https://shop.akc.org/collections/essentials-play-dog-gift-packs"));

    }

    public void Clickdna() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.dna.isDisplayed();
        this.dna.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.dnaElement.isDisplayed();

    }

    public void ClickakctvProdServ() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(3) > a")));
        this.akctv.isDisplayed();
        this.akctv.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://akc.tv/"));

    }

    public void ClickakcmagProdServ() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(4) > a")));
        this.akcmag.isDisplayed();
        this.akcmag.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcmagElement.isDisplayed();

    }

    public void Clickpedigrees() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(5) > a")));
        this.pedigrees.isDisplayed();
        this.pedigrees.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickbreedrep() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(6) > a")));
        this.breedrep.isDisplayed();
        this.breedrep.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/?view=category&cde_category=BRDR"));

    }

    public void Clickakccomp() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#product-services > div:nth-child(1) > div > div > div > ul > li:nth-child(7) > a")));
        this.akccomp.isDisplayed();
        this.akccomp.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/"));

    }

    public void Clickregdog() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.regdog.isDisplayed();
        this.regdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.regdogElement.isDisplayed();

    }

    public void Clickregpure() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")));
        this.regpure.isDisplayed();
        this.regpure.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.regpureElement.isDisplayed();

    }

    public void reglitter() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a")));
        this.reglitter.isDisplayed();
        this.reglitter.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        this.reglitterRadiobutton.isDisplayed();

    }

    public void Clickenroll() throws InterruptedException {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(3) > a")));
        this.enroll.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(AKCCaninePartners).perform();
        assert(AKCCaninePartners.isEnabled());
        this.AKCCaninePartners.isDisplayed();

    }

    public void Clickregdown() throws InterruptedException {

        this.produservi.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(regdown));
        this.regdown.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(regdownElement));

    }

    public void Clickfinddog() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[2]/a")));
        this.finddog.isDisplayed();
        this.finddog.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickfinpuppy() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[2]/ul/li[1]/a")));
        this.finpuppy.isDisplayed();
        this.finpuppy.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickakcrescue() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akcrescue));
        this.akcrescue.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcrescueElement.isDisplayed();

    }

    public void Clickbreedrefer() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.breedrefer.isDisplayed();
        this.breedrefer.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.breedreferElement.isDisplayed();

    }

    public void Clickpuppyvisor() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")));
        this.puppyvisor.isDisplayed();
        this.puppyvisor.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));


    }

    public void Clicktrainserv() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-services\"]/div[2]/div/div/div[1]/ul/li[3]/a")));
        this.trainserv.isDisplayed();
        this.trainserv.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.trainservElement.isDisplayed();

    }

    public void Clickcgc() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.cgc.isDisplayed();
        this.cgc.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        this.cgcElement.isDisplayed();

    }

    public void Clickgooddog() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")));
        this.gooddog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.gooddogElement.isDisplayed();

    }

    public void Clickfindtrainclub() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#product-services > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(3) > a")));
        this.findtrainclub.isDisplayed();
        this.findtrainclub.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://webapps.akc.org"));

    }

    public void Clickakccaninecolle() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akccaninecolle.isDisplayed();
        this.akccaninecolle.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickhealthgen() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.healthgen.isDisplayed();
        this.healthgen.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.healthgenElement.isDisplayed();

    }

    public void Clickfindgroom() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.findgroom.isDisplayed();
        this.findgroom.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickakcsafe() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akcsafe.isDisplayed();
        this.akcsafe.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.akcsafeElement.isDisplayed();
    }

    public void Clickakcpet() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akcpet.isDisplayed();
        this.akcpet.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.akcpetinsurance.com/"));

    }

    public void Clickakcvete() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akcvete.isDisplayed();
        this.akcvete.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickakccanineretreat() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akccanineretreat.isDisplayed();
        this.akccanineretreat.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://akccanineretreat.com/"));

    }

    public void Clickakcreunite() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akcreunite.isDisplayed();
        this.akcreunite.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akcreunite.org/"));

    }

    public void Clickbreedprog() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.breedprog.isDisplayed();
        this.breedprog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.breedprogElement.isDisplayed();

    }

    public void Clickbom() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.bom.isDisplayed();
        this.bom.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.bomElement.isDisplayed();

    }

    public void Clickbwh() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.bwh.isDisplayed();
        this.bwh.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.bwhElement.isDisplayed();

    }

    public void Clickbez() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.bez.isDisplayed();
        this.bez.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickseall() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.seall.isDisplayed();
        this.seall.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.seallElement.isDisplayed();

    }

    public void Clickbrowseserv() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.browseserv.isDisplayed();
        this.browseserv.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.browseservElement.isDisplayed();

    }

    public void Clickakcshop() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akcshop.isDisplayed();
        this.akcshop.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlToBe("https://shop.akc.org/"));

    }

     //ProdServ Menu Articles methods >


    public void ProdServArticle1() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.dna.isDisplayed();
        this.dna.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

    public void ProdServArticle2() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.akcmag.isDisplayed();
        this.akcmag.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

    public void ProdServArticle3() throws InterruptedException {

        this.produservi.click();
        sleep(1000);
        this.cgc.isDisplayed();
        this.cgc.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        //this.cgcMenu.isDisplayed();
        this.whatiscgcMenu.isDisplayed();

    }

}
