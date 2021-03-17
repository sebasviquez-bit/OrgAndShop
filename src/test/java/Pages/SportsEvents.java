package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class SportsEvents {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(4)")
    WebElement sportevent;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/h3")
    WebElement getstart;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[1]/a")
    WebElement introdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[2]/a")
    WebElement canpartenro;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(3) > a")
    WebElement titleabrev;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(4) > a")
    WebElement whichsports;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[5]/a")
    WebElement getstartdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[2]/h3")
    WebElement featurevent;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[1]/div[2]/div/div/ul/li[1]/a")
    WebElement upcomevent;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(2) > a")
    WebElement natiotrack;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(3) > a")
    WebElement natiochamp;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[2]/div/div/ul/li[4]/a")
    WebElement akcagility;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[2]/div/div/ul/li[5]/a")
    WebElement obediencecla;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(6) > a")
    WebElement akcmeet;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(7) > a")
    WebElement akcnatobechamp;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(2) > div > div > ul > li:nth-child(8) > a")
    WebElement akcrallynatchamp;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/h3")
    WebElement browsealldog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/a")
    WebElement confdogshow;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/ul/li[1]/a")
    WebElement matchshow;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/ul/li[2]/a")
    WebElement fourtosix;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement puppyachiev;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement natiohand;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/ul/li[5]/a")
    WebElement openshow;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement compsport;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement agility;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[2]/ul/li[2]/a")
    WebElement obedience;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement rally;

    @FindBy(xpath = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement tracking;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/a")
    WebElement tittlereco;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/ul/li[1]/a")
    WebElement barnhunt;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/ul/li[2]/a")
    WebElement discdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[3]/ul/li[3]/a")
    WebElement divingdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(4) > a")
    WebElement flyball;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
    WebElement searchresc;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(6) > a")
    WebElement parentclubrec;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[1]/a")
    WebElement perfsport;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement fieldevnthound;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[1]/ul/li[2]/a")
    WebElement courscat;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[2]/ul/li[1]/ul/li[3]/a")
    WebElement earthdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement herding;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement pointbreed;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement retrievers;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[1]/ul/li[7]/a")
    WebElement scentWork;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(8) > a")
    WebElement spaniels;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/a")
    WebElement sportsjun;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a")
    WebElement junshow;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement juncomp;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/ul/li[3]/a")
    WebElement junperf;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/ul/li[4]/a")
    WebElement peewee;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[3]/a")
    WebElement akcfamdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement cgcstar;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement trickVirtual;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(3) > a")
    WebElement therapyDog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(4) > a")
    WebElement fitDog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
    WebElement tempTest;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[3]/div/h3")
    WebElement resfordog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[3]/div/div/div/ul/li[1]/a")
    WebElement eventse;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[2]/a")
    WebElement downform;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(3) > a")
    WebElement rulesreg;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[4]/a")
    WebElement oem;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[5]/a")
    WebElement pointaward;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[3]/div/div/div/ul/li[6]/a")
    WebElement judgingres;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(7) > a")
    WebElement judgesdirec;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(8) > a")
    WebElement judgeseduc;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(9) > a")
    WebElement akcweeklywin;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(10) > a")
    WebElement eventcanc;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(12) > a")
    WebElement akccontact;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(12) > a")
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

    @FindBy(css = "#page-title > div > h1")
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

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
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

    @FindBy(css = "#page-title > h1")
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
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    //Methods

    public void VerifySportsEvents() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(getstart));
        this.introdog.isDisplayed();
        this.canpartenro.isDisplayed();
        this.titleabrev.isDisplayed();
        this.whichsports.isDisplayed();
        this.getstartdog.isDisplayed();
        this.featurevent.isDisplayed();
        this.upcomevent.isDisplayed();
        this.natiotrack.isDisplayed();
        this.natiochamp.isDisplayed();
        this.akcagility.isDisplayed();
        this.obediencecla.isDisplayed();
        this.akcmeet.isDisplayed();
        this.akcnatobechamp.isDisplayed();
        this.akcrallynatchamp.isDisplayed();
        this.browsealldog.isDisplayed();
        this.confdogshow.isDisplayed();
        this.matchshow.isDisplayed();
        this.fourtosix.isDisplayed();
        this.puppyachiev.isDisplayed();
        this.natiohand.isDisplayed();
        this.openshow.isDisplayed();
        this.compsport.isDisplayed();
        this.agility.isDisplayed();
        this.obedience.isDisplayed();
        this.rally.isDisplayed();
        this.tracking.isDisplayed();
        this.tittlereco.isDisplayed();
        this.barnhunt.isDisplayed();
        this.discdog.isDisplayed();
        this.divingdog.isDisplayed();
        this.flyball.isDisplayed();
        this.searchresc.isDisplayed();
        this.parentclubrec.isDisplayed();
        this.perfsport.isDisplayed();
        this.fieldevnthound.isDisplayed();
        this.courscat.isDisplayed();
        this.earthdog.isDisplayed();
        this.herding.isDisplayed();
        this.pointbreed.isDisplayed();
        this.retrievers.isDisplayed();
        this.scentWork.isDisplayed();
        this.spaniels.isDisplayed();
        this.sportsjun.isDisplayed();
        this.junshow.isDisplayed();
        this.juncomp.isDisplayed();
        this.junperf.isDisplayed();
        this.peewee.isDisplayed();
        this.akcfamdog.isDisplayed();
        this.cgcstar.isDisplayed();
        this.trickVirtual.isDisplayed();
        this.therapyDog.isDisplayed();
        this.fitDog.isDisplayed();
        this.tempTest.isDisplayed();
        this.resfordog.isDisplayed();
        this.eventse.isDisplayed();
        this.downform.isDisplayed();
        this.rulesreg.isDisplayed();
        this.oem.isDisplayed();
        this.pointaward.isDisplayed();
        this.judgingres.isDisplayed();
        this.judgesdirec.isDisplayed();
        this.judgeseduc.isDisplayed();
        this.akcweeklywin.isDisplayed();
        this.eventcanc.isDisplayed();
        this.akccontact.isDisplayed();
        this.akcrhp.isDisplayed();

    }


    public void Clickintrodog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(introdog));
        this.introdog.click();
        wait.until(ExpectedConditions.visibilityOf(introdogElement));

    }

    public void Clickcanpartenro() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(canpartenro));
        this.canpartenro.click();
        wait.until(ExpectedConditions.visibilityOf(AKCCaninePartnersTitle));

    }

    public void Clicktitleabrev() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(titleabrev));
        this.titleabrev.click();
        wait.until(ExpectedConditions.visibilityOf(titleabrevElement));

    }

    public void Clickwhichsports() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(whichsports));
        this.whichsports.click();
        wait.until(ExpectedConditions.visibilityOf(whichsportsElement));

    }

    public void Clickgetstartdog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(getstartdog));
        this.getstartdog.click();
        wait.until(ExpectedConditions.visibilityOf(getstartdogElement));

    }

    public void Clickupcomevent() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(upcomevent));
        this.upcomevent.click();
        wait.until(ExpectedConditions.visibilityOf(upcomeventElement));
        this.upcomeventElement.isDisplayed();

    }

    public void Clicknatiotrack() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(natiotrack));
        this.natiotrack.click();
        wait.until(ExpectedConditions.visibilityOf(natiotrackElement));

    }

    public void Clicknatiochamp() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(natiochamp));
        this.natiochamp.click();
        wait.until(ExpectedConditions.visibilityOf(natiochampElement));

    }

    public void Clickakcagility() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akcagility));
        this.akcagility.click();
        wait.until(ExpectedConditions.visibilityOf(akcagilityElement));

    }

    public void Clickobediencecla() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(obediencecla));
        this.obediencecla.click();
        wait.until(ExpectedConditions.visibilityOf(obedienceclaElement));

    }

    public void Clickakcmeet() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcmeet);
        this.akcmeet.click();
        wait.until(ExpectedConditions.visibilityOf(akcmeetElement));

    }

    public void Clickakcnatobechamp() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcnatobechamp);
        this.akcnatobechamp.click();
        wait.until(ExpectedConditions.visibilityOf(akcnatobechampElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickakcrallynatchamp() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcrallynatchamp);
        this.akcrallynatchamp.click();
        wait.until(ExpectedConditions.visibilityOf(akcrallynatchampElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickconfdogshow() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(confdogshow));
        this.confdogshow.click();
        wait.until(ExpectedConditions.visibilityOf(confdogshowElement));
        this.confdogshowElement.isDisplayed();

    }

    public void Clickmatchshow() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(matchshow));
        this.matchshow.click();
        wait.until(ExpectedConditions.visibilityOf(matchshowElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickfourtosix() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(fourtosix));
        this.fourtosix.click();
        wait.until(ExpectedConditions.visibilityOf(fourtosixElement));

    }

    public void Clickpuppyachiev() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(puppyachiev));
        this.puppyachiev.click();
        wait.until(ExpectedConditions.visibilityOf(puppyachievElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clicknatiohand() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(natiohand));
        this.natiohand.click();
        wait.until(ExpectedConditions.visibilityOf(natiohandElement));

    }

    public void Clickopenshow() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(openshow));
        this.openshow.click();
        wait.until(ExpectedConditions.visibilityOf(openshowElement));

    }

    public void Clickcompsport() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(compsport));
        this.compsport.click();
        wait.until(ExpectedConditions.visibilityOf(compsportElement));

    }

    public void Clickagility() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(agility));
        this.agility.click();
        wait.until(ExpectedConditions.visibilityOf(agilityElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickobedience() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(obedience));
        wait.until(ExpectedConditions.elementToBeClickable(obedience));
        this.obedience.click();
        wait.until(ExpectedConditions.visibilityOf(obedienceElement));

    }

    public void Clickrally() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(rally));
        this.rally.click();
        wait.until(ExpectedConditions.visibilityOf(rallyElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clicktracking() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(tracking));
        this.tracking.click();
        wait.until(ExpectedConditions.visibilityOf(trackingElement));

    }

    public void Clicktittlereco() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(tittlereco));
        this.tittlereco.click();
        wait.until(ExpectedConditions.visibilityOf(tittlerecoElement));

    }

    public void Clickbarnhunt() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(barnhunt));
        this.barnhunt.click();
        wait.until(ExpectedConditions.visibilityOf(barnhuntElement));

    }

    public void Clickdiscdog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(discdog));
        this.discdog.click();
        wait.until(ExpectedConditions.visibilityOf(discdogElement));

    }

    public void Clickdivingdog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(divingdog));
        this.divingdog.click();
        wait.until(ExpectedConditions.visibilityOf(divingdogElement));

    }

    public void Clickflyball() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", flyball);
        wait.until(ExpectedConditions.elementToBeClickable(flyball));
        this.flyball.click();
        wait.until(ExpectedConditions.visibilityOf(flyballElement));

    }

    public void Clicksearchresc() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", searchresc);
        this.searchresc.click();
        wait.until(ExpectedConditions.visibilityOf(searchrescElement));
        this.searchrescElement.isDisplayed();

    }

    public void Clickparentclubrec() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", parentclubrec);
        this.parentclubrec.click();
        wait.until(ExpectedConditions.elementToBeClickable(parentclubrecElement));

    }

    public void Clickperfsport() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(perfsport));
        this.perfsport.click();
        wait.until(ExpectedConditions.visibilityOf(perfsportElement));

    }

    public void Clickfieldevnthound() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(fieldevnthound));
        this.fieldevnthound.click();
        wait.until(ExpectedConditions.visibilityOf(fieldevnthoundElement));

    }

    public void Clickcourscat() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(courscat));
        this.courscat.click();
        wait.until(ExpectedConditions.visibilityOf(courscatElement));

    }

    public void Clickearthdog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(earthdog));
        wait.until(ExpectedConditions.elementToBeClickable(earthdog));
        this.earthdog.click();
        wait.until(ExpectedConditions.visibilityOf(earthdogElement));

    }

    public void Clickherding() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(herding));
        this.herding.click();
        wait.until(ExpectedConditions.visibilityOf(herdingElement));

    }

    public void Clickpointbreed() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pointbreed));
        this.pointbreed.click();
        wait.until(ExpectedConditions.visibilityOf(pointbreedElement));

    }

    public void Clickretrievers() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(retrievers));
        this.retrievers.click();
        wait.until(ExpectedConditions.visibilityOf(retrieversElement));

    }

    public void ClickscentWork() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(scentWork));
        this.scentWork.click();
        wait.until(ExpectedConditions.visibilityOf(scentWorkElement));

    }

    public void Clickspaniels() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(spaniels));
        this.spaniels.click();
        wait.until(ExpectedConditions.visibilityOf(spanielsElement));

    }

    public void Clicksportsjun() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sportsjun));
        this.sportsjun.click();
        wait.until(ExpectedConditions.visibilityOf(sportsjunElement));

    }

    public void Clickjunshow() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(junshow));
        wait.until(ExpectedConditions.elementToBeClickable(junshow));
        this.junshow.click();
        wait.until(ExpectedConditions.visibilityOf(junshowElement));
        this.junshowElement.isDisplayed();

    }

    public void Clickjuncomp() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(juncomp));
        this.juncomp.click();
        wait.until(ExpectedConditions.visibilityOf(juncompElement));

    }

    public void Clickjunperf() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(junperf));
        this.junperf.click();
        wait.until(ExpectedConditions.visibilityOf(junperfElement));

    }

    public void Clickpeewee() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(peewee));
        this.peewee.click();
        wait.until(ExpectedConditions.visibilityOf(peeweeElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickakcfamdog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akcfamdog));
        wait.until(ExpectedConditions.elementToBeClickable(akcfamdog));
        this.akcfamdog.click();
        wait.until(ExpectedConditions.visibilityOf(akcfamdogElement));

    }

    public void Clickcgcstar() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(cgcstar));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", cgcstar);
        this.cgcstar.click();
        wait.until(ExpectedConditions.visibilityOf(cgcstarElement));


    }

    public void ClicktrickVirtual() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", trickVirtual);
        this.trickVirtual.click();
        wait.until(ExpectedConditions.visibilityOf(trickVirtualElement));

    }

    public void ClicktherapyDog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", therapyDog);
        this.therapyDog.click();
        wait.until(ExpectedConditions.visibilityOf(therapyDogElement));

    }

    public void ClickfitDog() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", fitDog);
        wait.until(ExpectedConditions.elementToBeClickable(fitDog));
        this.fitDog.click();
        wait.until(ExpectedConditions.visibilityOf(fitDogElement));

    }

    public void ClicktempTest() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", tempTest);
        this.tempTest.click();
        wait.until(ExpectedConditions.elementToBeClickable(tempTestElement));
        this.tempTestElement.isDisplayed();

    }

    public void Clickeventse() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(eventse));
        this.eventse.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickdownform() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(downform));
        this.downform.click();
        wait.until(ExpectedConditions.visibilityOf(downformElement));

    }

    public void Clickrulesreg() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(rulesreg));
        this.rulesreg.click();
        wait.until(ExpectedConditions.visibilityOf(rulesregElement));

    }

    public void Clickoem() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(oem));
        this.oem.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickpointaward() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(pointaward));
        wait.until(ExpectedConditions.elementToBeClickable(pointaward));
        this.pointaward.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgingres() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(judgingres));
        this.judgingres.click();
        wait.until(ExpectedConditions.visibilityOf(judgingresElement));

    }

    public void Clickjudgesdirec() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(judgesdirec));
        this.judgesdirec.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgeseduc() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(judgeseduc));
        this.judgeseduc.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickakcweeklywin() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akcweeklywin));
        this.akcweeklywin.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.akcwinners.com/"));

    }

    public void Clickeventcanc() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(eventcanc));
        this.eventcanc.click();
        wait.until(ExpectedConditions.visibilityOf(eventcancElement));

    }

    public void Clickakccontact() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akccontact));
        this.akccontact.click();
        wait.until(ExpectedConditions.visibilityOf(akccontactElement));

    }

    public void Clickakcrhp() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcrhp);
        wait.until(ExpectedConditions.elementToBeClickable(akcrhp));
        this.akcrhp.click();
        wait.until(ExpectedConditions.visibilityOf(akcrhpElement));

    }

    public void ClickjuniorRes() {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", juniorRes);
        this.juniorRes.click();
        wait.until(ExpectedConditions.elementToBeClickable(juniorResElement));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }


    //Menu Articles Methods >


    public void SportsEventsArticle1() throws InterruptedException {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(whichsports));
        this.whichsports.isDisplayed();
        wait.until(ExpectedConditions.visibilityOf(whichsports));
        this.whichsports.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

    public void SportsEventArticle2() throws InterruptedException {

        this.sportevent.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(retrievers));
        this.retrievers.click();
        sleep(1000);
        driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

}






