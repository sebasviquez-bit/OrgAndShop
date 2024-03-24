package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class SportsEvents {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(4)")
    WebElement sportevent;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > h3")
    WebElement getstart;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")
    WebElement introdog;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")
    WebElement canpartenro;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(3) > a")
    WebElement titleabrev;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(4) > a")
    WebElement whichsports;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(5) > a")
    WebElement getstartdog;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > h3")
    WebElement featurevent;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(1) > a")
    WebElement upcomevent;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(2) > a")
    WebElement natiotrack;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(3) > a")
    WebElement natiochamp;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement akcagility;

    @FindBy(xpath = "//a[contains(@class,'menu-link')][normalize-space()='Obedience Classic']")
    WebElement obediencecla;

    @FindBy(xpath = "//a[contains(@class,'menu-link')][normalize-space()='AKC Meet the Breeds']")
    WebElement akcmeet;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(7) > a")
    WebElement akcnatobechamp;

    @FindBy(xpath = "//body/div[@id='site-header']/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[8]/a[1]")
    WebElement akcrallynatchamp;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > h3")
    WebElement browsealldog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement confdogshow;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement matchshow;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement fourtosix;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement puppyachiev;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement natiohand;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement openshow;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[2]/a")
    WebElement compsport;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement agility;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[2]/ul/li[2]/a")
    WebElement obedience;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement rally;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement tracking;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement tittlereco;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/ul/li[1]/a")
    WebElement barnhunt;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement discdog;

    @FindBy(xpath = "//a[contains(text(),'Diving Dogs')]")
    WebElement divingdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(4) > a")
    WebElement flyball;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
    WebElement searchresc;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(6) > a")
    WebElement parentclubrec;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement perfsport;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement fieldevnthound;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement courscat;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[2]/ul/li[1]/ul/li[3]/a")
    WebElement earthdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement herding;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement pointbreed;

    @FindBy(xpath = "//a[contains(text(),'Retrievers')]")
    WebElement retrievers;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(7) > a")
    WebElement scentWork;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(8) > a")
    WebElement spaniels;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement sportsjun;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement junshow;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement juncomp;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement junperf;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement peewee;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement akcfamdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement cgcstar;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement trickVirtual;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[2]/ul/li[3]/ul/li[3]/a")
    WebElement therapyDog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(4) > a")
    WebElement fitDog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
    WebElement tempTest;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > h3")
    WebElement resfordog;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(1) > a")
    WebElement eventse;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(3) > a")
    WebElement downform;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(4) > a")
    WebElement rulesreg;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(5) > a")
    WebElement oem;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(5) > a")
    WebElement pointaward;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(7) > a")
    WebElement judgingres;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(8) > a")
    WebElement judgesdirec;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(9) > a")
    WebElement judgeseduc;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(10) > a")
    WebElement akcweeklywin;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(11) > a")
    WebElement eventcanc;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[13]/a")
    WebElement akccontact;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(14) > a")
    WebElement akcrhp;

    //After click Elements >

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
    WebElement introdogElement;

    @FindBy(css = "body > div.landing-page > div.section-title.section-title--top-spacing.section-title--center > h2")
    WebElement AKCCaninePartnersTitle;

    @FindBy(css = "#page-title > h1")
    WebElement titleabrevElement;

    @FindBy(css = "#page-title > h1")
    WebElement whichsportsElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement getstartdogElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
    WebElement upcomeventElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement natiotrackElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement natiochampElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcagilityElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement obedienceclaElement;

    @FindBy(css = "body > div.landing-page > section:nth-child(3) > div.call-to-action-block__button > a")
    WebElement akcmeetElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcnatobechampElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcrallynatchampElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement confdogshowElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement matchshowElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement fourtosixElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement puppyachievElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement natiohandElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement openshowElement;

    @FindBy(css = "#page-title > h1")
    WebElement compsportElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement agilityElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement obedienceElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement rallyElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement trackingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement tittlerecoElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement barnhuntElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement discdogElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement divingdogElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement flyballElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement searchrescElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement parentclubrecElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
    WebElement perfsportElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement fieldevnthoundElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement courscatElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement earthdogElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement herdingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement pointbreedElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement retrieversElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement scentWorkElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement spanielsElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement sportsjunElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement junshowElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement juncompElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement junperfElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement peeweeElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcfamdogElement;

    @FindBy(css = "body > div.landing-page > div.anchored-nav.bgc-blue.anchored-nav--light > div.show-at-medium > div > a:nth-child(1)")
    WebElement cgcstarElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement trickVirtualElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement therapyDogElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement fitDogElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement tempTestElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement downformElement;

    @FindBy(css = "#page-title > h1")
    WebElement rulesregElement;

    @FindBy(css = "#page-title > h1")
    WebElement judgingresElement;

    @FindBy(css = "#page-title > h1")
    WebElement eventcancElement;

    @FindBy(css = "#page-title > h1")
    WebElement akccontactElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcrhpElement;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(14) > a")
    WebElement juniorRes;

    @FindBy(css = "#page-title > div > h1")
    WebElement juniorResElement;


    //Articles Elements >

    @FindBy(xpath = "//*[@id=\"google_ads_iframe_/120519536/AKC.Expert-Advice/lifestyle_2__container__\"]")
    WebElement add1;

    @FindBy(xpath = "//*[@id=\"google_ads_iframe_/120519536/AKC.Expert-Advice/lifestyle_3__container__\"]")
    WebElement add2;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div[7]/div/div/div[1]/div/div[2]/a")
    WebElement famdogTitle;

    @FindBy(xpath = "//*[@id=\"newsletter-widget-bottom__content-title\"]")
    WebElement newsLetter;

    @FindBy(id = "gallery-20246")
    WebElement galleryButton;

    @FindBy(xpath = "//html/body/div[5]/div/div[2]/aside/div/nav/ul/li[4]/a")
    WebElement retrieversNat;


    //Driver
    WebDriver driver;

    // Constructor
    public SportsEvents(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    public void VerifySportsEvents() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(getstart));
        introdog.isDisplayed();
        canpartenro.isDisplayed();
        titleabrev.isDisplayed();
        whichsports.isDisplayed();
        getstartdog.isDisplayed();
        featurevent.isDisplayed();
        upcomevent.isDisplayed();
        natiotrack.isDisplayed();
        natiochamp.isDisplayed();
        akcagility.isDisplayed();
        obediencecla.isDisplayed();
        akcmeet.isDisplayed();
        akcnatobechamp.isDisplayed();
        akcrallynatchamp.isDisplayed();
        browsealldog.isDisplayed();
        confdogshow.isDisplayed();
        matchshow.isDisplayed();
        fourtosix.isDisplayed();
        puppyachiev.isDisplayed();
        natiohand.isDisplayed();
        openshow.isDisplayed();
        compsport.isDisplayed();
        agility.isDisplayed();
        obedience.isDisplayed();
        rally.isDisplayed();
        tracking.isDisplayed();
        tittlereco.isDisplayed();
        barnhunt.isDisplayed();
        discdog.isDisplayed();
        divingdog.isDisplayed();
        flyball.isDisplayed();
        searchresc.isDisplayed();
        parentclubrec.isDisplayed();
        perfsport.isDisplayed();
        fieldevnthound.isDisplayed();
        courscat.isDisplayed();
        earthdog.isDisplayed();
        herding.isDisplayed();
        pointbreed.isDisplayed();
        retrievers.isDisplayed();
        scentWork.isDisplayed();
        spaniels.isDisplayed();
        sportsjun.isDisplayed();
        junshow.isDisplayed();
        juncomp.isDisplayed();
        junperf.isDisplayed();
        peewee.isDisplayed();
        akcfamdog.isDisplayed();
        cgcstar.isDisplayed();
        trickVirtual.isDisplayed();
        therapyDog.isDisplayed();
        fitDog.isDisplayed();
        tempTest.isDisplayed();
        resfordog.isDisplayed();
        eventse.isDisplayed();
        downform.isDisplayed();
        rulesreg.isDisplayed();
        oem.isDisplayed();
        pointaward.isDisplayed();
        judgingres.isDisplayed();
        judgesdirec.isDisplayed();
        judgeseduc.isDisplayed();
        akcweeklywin.isDisplayed();
        eventcanc.isDisplayed();
        akccontact.isDisplayed();
        akcrhp.isDisplayed();

    }


    public void Clickintrodog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(introdog));
        introdog.click();
        wait.until(ExpectedConditions.visibilityOf(introdogElement));

    }

    public void Clickcanpartenro() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(canpartenro));
        canpartenro.click();
        wait.until(ExpectedConditions.visibilityOf(AKCCaninePartnersTitle));

    }

    public void Clicktitleabrev() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(titleabrev));
        titleabrev.click();
        wait.until(ExpectedConditions.visibilityOf(titleabrevElement));

    }

    public void Clickwhichsports() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(whichsports));
        whichsports.click();
        wait.until(ExpectedConditions.visibilityOf(whichsportsElement));

    }

    public void Clickgetstartdog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(getstartdog));
        getstartdog.click();
        wait.until(ExpectedConditions.visibilityOf(getstartdogElement));

    }

    public void Clickupcomevent() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(upcomevent));
        upcomevent.click();
        wait.until(ExpectedConditions.visibilityOf(upcomeventElement));
        upcomeventElement.isDisplayed();

    }

    public void Clicknatiotrack() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(natiotrack));
        natiotrack.click();
        wait.until(ExpectedConditions.visibilityOf(natiotrackElement));

    }

    public void Clicknatiochamp() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(natiochamp));
        natiochamp.click();
        wait.until(ExpectedConditions.visibilityOf(natiochampElement));

    }

    public void Clickakcagility() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcagility));
        akcagility.click();
        wait.until(ExpectedConditions.visibilityOf(akcagilityElement));

    }

    public void Clickobediencecla() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(obediencecla));
        obediencecla.click();
        wait.until(ExpectedConditions.visibilityOf(obedienceclaElement));

    }

    public void Clickakcmeet() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcmeet);
        wait.until(ExpectedConditions.elementToBeClickable(akcmeet));
        akcmeet.click();
        wait.until(ExpectedConditions.visibilityOf(akcmeetElement));

    }

    public void Clickakcnatobechamp() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcnatobechamp);
        wait.until(ExpectedConditions.elementToBeClickable(akcnatobechamp));
        akcnatobechamp.click();
        wait.until(ExpectedConditions.visibilityOf(akcnatobechampElement));

    }

    public void Clickakcrallynatchamp() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcrallynatchamp);
        wait.until(ExpectedConditions.elementToBeClickable(akcrallynatchamp));
        akcrallynatchamp.click();
        wait.until(ExpectedConditions.visibilityOf(akcrallynatchampElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickconfdogshow() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(confdogshow));
        confdogshow.click();
        wait.until(ExpectedConditions.visibilityOf(confdogshowElement));

    }

    public void Clickmatchshow() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(matchshow));
        matchshow.click();
        wait.until(ExpectedConditions.visibilityOf(matchshowElement));

    }

    public void Clickfourtosix() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fourtosix));
        fourtosix.click();
        wait.until(ExpectedConditions.visibilityOf(fourtosixElement));

    }

    public void Clickpuppyachiev() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(puppyachiev));
        puppyachiev.click();
        wait.until(ExpectedConditions.visibilityOf(puppyachievElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clicknatiohand() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(natiohand));
        natiohand.click();
        wait.until(ExpectedConditions.visibilityOf(natiohandElement));

    }

    public void Clickopenshow() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(openshow));
        openshow.click();
        wait.until(ExpectedConditions.visibilityOf(openshowElement));

    }

    public void Clickcompsport() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(compsport));
        compsport.click();
        wait.until(ExpectedConditions.visibilityOf(compsportElement));

    }

    public void Clickagility() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(agility));
        agility.click();
        wait.until(ExpectedConditions.visibilityOf(agilityElement));

    }

    public void Clickobedience() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(obedience));
        obedience.click();
        wait.until(ExpectedConditions.visibilityOf(obedienceElement));

    }

    public void Clickrally() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(rally));
        rally.click();
        wait.until(ExpectedConditions.visibilityOf(rallyElement));

    }

    public void Clicktracking() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(tracking));
        tracking.click();
        wait.until(ExpectedConditions.visibilityOf(trackingElement));

    }

    public void Clicktittlereco() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(tittlereco));
        tittlereco.click();
        wait.until(ExpectedConditions.visibilityOf(tittlerecoElement));

    }

    public void Clickbarnhunt() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(barnhunt));
        barnhunt.click();
        wait.until(ExpectedConditions.visibilityOf(barnhuntElement));

    }

    public void Clickdiscdog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(discdog));
        discdog.click();
        wait.until(ExpectedConditions.visibilityOf(discdogElement));

    }

    public void Clickdivingdog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(divingdog));
        divingdog.click();
        wait.until(ExpectedConditions.visibilityOf(divingdogElement));

    }

    public void Clickflyball() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", flyball);
        wait.until(ExpectedConditions.elementToBeClickable(flyball));
        flyball.click();
        wait.until(ExpectedConditions.visibilityOf(flyballElement));

    }

    public void Clicksearchresc() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", searchresc);
        wait.until(ExpectedConditions.visibilityOf(searchresc));
        searchresc.click();
        wait.until(ExpectedConditions.visibilityOf(searchrescElement));

    }

    public void Clickparentclubrec() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", parentclubrec);
        wait.until(ExpectedConditions.elementToBeClickable(parentclubrec));
        parentclubrec.click();
        wait.until(ExpectedConditions.elementToBeClickable(parentclubrecElement));

    }

    public void Clickperfsport() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(perfsport));
        perfsport.click();
        wait.until(ExpectedConditions.visibilityOf(perfsportElement));

    }

    public void Clickfieldevnthound() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fieldevnthound));
        fieldevnthound.click();
        wait.until(ExpectedConditions.visibilityOf(fieldevnthoundElement));

    }

    public void Clickcourscat() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(courscat));
        courscat.click();
        wait.until(ExpectedConditions.visibilityOf(courscatElement));

    }

    public void Clickearthdog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(earthdog));
        earthdog.click();
        wait.until(ExpectedConditions.visibilityOf(earthdogElement));

    }

    public void Clickherding() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(herding));
        herding.click();
        wait.until(ExpectedConditions.visibilityOf(herdingElement));

    }

    public void Clickpointbreed() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pointbreed));
        pointbreed.click();
        wait.until(ExpectedConditions.visibilityOf(pointbreedElement));

    }

    public void Clickretrievers() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(retrievers));
        retrievers.click();
        wait.until(ExpectedConditions.visibilityOf(retrieversElement));

    }

    public void ClickscentWork() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(scentWork));
        scentWork.click();
        wait.until(ExpectedConditions.visibilityOf(scentWorkElement));

    }

    public void Clickspaniels() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(spaniels));
        spaniels.click();
        wait.until(ExpectedConditions.visibilityOf(spanielsElement));

    }

    public void Clicksportsjun() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportsjun)); //fix this
        sportsjun.click();
        wait.until(ExpectedConditions.visibilityOf(sportsjunElement));

    }

    public void Clickjunshow() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(junshow));
        junshow.click();
        wait.until(ExpectedConditions.visibilityOf(junshowElement));

    }

    public void Clickjuncomp() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(juncomp));
        juncomp.click();
        wait.until(ExpectedConditions.visibilityOf(juncompElement));

    }

    public void Clickjunperf() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(junperf));
        junperf.click();
        wait.until(ExpectedConditions.visibilityOf(junperfElement));

    }

    public void Clickpeewee() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(peewee));
        peewee.click();
        wait.until(ExpectedConditions.visibilityOf(peeweeElement));

    }

    public void Clickakcfamdog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcfamdog));
        akcfamdog.click();
        wait.until(ExpectedConditions.visibilityOf(akcfamdogElement));

    }

    public void Clickcgcstar() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cgcstar));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", cgcstar);
        cgcstar.click();
        wait.until(ExpectedConditions.visibilityOf(cgcstarElement));


    }

    public void ClicktrickVirtual() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", trickVirtual);
        wait.until(ExpectedConditions.elementToBeClickable(trickVirtual));
        trickVirtual.click();
        wait.until(ExpectedConditions.visibilityOf(trickVirtualElement));

    }

    public void ClicktherapyDog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(therapyDog));
        therapyDog.click();
        wait.until(ExpectedConditions.visibilityOf(therapyDogElement));

    }

    public void ClickfitDog() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", fitDog);
        wait.until(ExpectedConditions.elementToBeClickable(fitDog));
        fitDog.click();
        wait.until(ExpectedConditions.visibilityOf(fitDogElement));

    }

    public void ClicktempTest() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", tempTest);
        tempTest.click();
        wait.until(ExpectedConditions.elementToBeClickable(tempTestElement));
        tempTestElement.isDisplayed();

    }

    public void Clickeventse() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(eventse));
        eventse.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickdownform() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(downform));
        downform.click();
        wait.until(ExpectedConditions.visibilityOf(downformElement));

    }

    public void Clickrulesreg() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(rulesreg));
        rulesreg.click();
        wait.until(ExpectedConditions.visibilityOf(rulesregElement));

    }

    public void Clickoem() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(oem));
        oem.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickpointaward() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(pointaward));
        wait.until(ExpectedConditions.elementToBeClickable(pointaward));
        pointaward.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgingres() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(judgingres));
        judgingres.click();
        wait.until(ExpectedConditions.visibilityOf(judgingresElement));

    }

    public void Clickjudgesdirec() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(judgesdirec));
        judgesdirec.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgeseduc() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(judgeseduc));
        judgeseduc.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickakcweeklywin() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcweeklywin));
        akcweeklywin.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.akcwinners.com/"));

    }

    public void Clickeventcanc() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(eventcanc));
        eventcanc.click();
        wait.until(ExpectedConditions.visibilityOf(eventcancElement));

    }

    public void Clickakccontact() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akccontact);
        wait.until(ExpectedConditions.elementToBeClickable(akccontact));
        akccontact.click();
        wait.until(ExpectedConditions.visibilityOf(akccontactElement));

    }

    public void Clickakcrhp() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcrhp);
        wait.until(ExpectedConditions.elementToBeClickable(akcrhp));
        akcrhp.click();
        wait.until(ExpectedConditions.visibilityOf(akcrhpElement));

    }

    public void ClickjuniorRes() {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", juniorRes);
        wait.until(ExpectedConditions.elementToBeClickable(juniorRes));
        juniorRes.click();
        wait.until(ExpectedConditions.visibilityOf(juniorResElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    //Menu Articles Methods >

    public void SportsEventsArticle1() throws InterruptedException {

        sportevent.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(whichsports));
        whichsports.click();
        sleep(1000);

    }


}






