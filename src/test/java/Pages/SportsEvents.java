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

public class SportsEvents {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(4)")
    WebElement sportevent;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/h3")
    WebElement getstart;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[1]/a")
    WebElement introdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[2]/a")
    WebElement canpartenro;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[3]/a")
    WebElement titleabrev;

    @FindBy(css = "#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(4) > a")
    WebElement whichsports;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[5]/a")
    WebElement getstartdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[2]/h3")
    WebElement featurevent;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[1]/div[2]/div/div/ul/li[1]/a")
    WebElement upcomevent;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[2]/div/div/ul/li[2]/a")
    WebElement natiotrack;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[1]/div[2]/div/div/ul/li[3]/a")
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

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/ul/li[3]/a")
    WebElement puppyachiev;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/ul/li[4]/a")
    WebElement natiohand;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[1]/ul/li[5]/a")
    WebElement openshow;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[2]/a")
    WebElement compsport;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[2]/ul/li[1]/a")
    WebElement agility;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[2]/ul/li[2]/a")
    WebElement obedience;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[2]/ul/li[3]/a")
    WebElement rally;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[2]/ul/li[4]/a")
    WebElement tracking;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/a")
    WebElement tittlereco;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/ul/li[1]/a")
    WebElement barnhunt;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[2]/div/div/div[1]/ul/li[3]/ul/li[2]/a")
    WebElement discdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[1]/ul/li[3]/ul/li[3]/a")
    WebElement divingdog;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(3) > a")
    WebElement flyball;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
    WebElement searchresc;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")
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

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[1]/ul/li[5]/a")
    WebElement pointbreed;

    @FindBy(css = "#sports-events > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement retrievers;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[1]/ul/li[7]/a")
    WebElement scentWork;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[1]/ul/li[8]/a")
    WebElement spaniels;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/a")
    WebElement sportsjun;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/ul/li[1]/a")
    WebElement junshow;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")
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

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[3]/div/div/div/ul/li[3]/a")
    WebElement rulesreg;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[4]/a")
    WebElement oem;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[5]/a")
    WebElement pointaward;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[3]/div/div/div/ul/li[6]/a")
    WebElement judgingres;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[7]/a")
    WebElement judgesdirec;

    @FindBy(css = "#sports-events > div:nth-child(3) > div > div > div > ul > li:nth-child(8) > a")
    WebElement judgeseduc;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[4]/div[3]/div/div/div/ul/li[9]/a")
    WebElement akcweeklywin;

    @FindBy(xpath = "//*[@id=\"sports-events\"]/div[3]/div/div/div/ul/li[10]/a")
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

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
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



    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public SportsEvents(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void VerifySportsEvents() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.getstart.isDisplayed();
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


    public void Clickintrodog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.introdog.isDisplayed();
        this.introdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.introdogElement.isDisplayed();

    }

    public void Clickcanpartenro() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.canpartenro.isDisplayed();
        this.canpartenro.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 500);");
        this.AKCCaninePartnersTitle.isDisplayed();

    }

    public void Clicktitleabrev() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.titleabrev.isDisplayed();
        this.titleabrev.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.titleabrevElement.isDisplayed();

    }

    public void Clickwhichsports() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.whichsports.isDisplayed();
        this.whichsports.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.whichsportsElement.isDisplayed();

    }

    public void Clickgetstartdog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.getstartdog.isDisplayed();
        this.getstartdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.getstartdogElement.isDisplayed();

    }

    public void Clickupcomevent() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.upcomevent.isDisplayed();
        this.upcomevent.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.upcomeventElement.isDisplayed();

    }

    public void Clicknatiotrack() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.natiotrack.isDisplayed();
        this.natiotrack.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.natiotrackElement.isDisplayed();

    }

    public void Clicknatiochamp() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.natiochamp.isDisplayed();
        this.natiochamp.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.natiochampElement.isDisplayed();

    }

    public void Clickakcagility() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.akcagility.isDisplayed();
        this.akcagility.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcagilityElement.isDisplayed();

    }

    public void Clickobediencecla() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.obediencecla.isDisplayed();
        this.obediencecla.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.obedienceclaElement.isDisplayed();

    }

    public void Clickakcmeet() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.akcmeet.isDisplayed();
        this.akcmeet.click();
        sleep(2000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcmeetElement.isDisplayed();

    }

    public void Clickakcnatobechamp() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.akcnatobechamp.isDisplayed();
        this.akcnatobechamp.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcnatobechampElement.isDisplayed();

    }

    public void Clickakcrallynatchamp() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.akcrallynatchamp.isDisplayed();
        this.akcrallynatchamp.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcrallynatchampElement.isDisplayed();

    }

    public void Clickconfdogshow() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.confdogshow.isDisplayed();
        this.confdogshow.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.confdogshowElement.isDisplayed();

    }

    public void Clickmatchshow() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.matchshow.isDisplayed();
        this.matchshow.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.matchshowElement.isDisplayed();

    }

    public void Clickfourtosix() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.fourtosix.isDisplayed();
        this.fourtosix.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.fourtosixElement.isDisplayed();

    }

    public void Clickpuppyachiev() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.puppyachiev.isDisplayed();
        this.puppyachiev.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.puppyachievElement.isDisplayed();

    }

    public void Clicknatiohand() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.natiohand.isDisplayed();
        this.natiohand.click();
        sleep(1000);
        driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.natiohandElement.isDisplayed();

    }

    public void Clickopenshow() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.openshow.isDisplayed();
        this.openshow.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.openshowElement.isDisplayed();

    }

    public void Clickcompsport() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.compsport.isDisplayed();
        this.compsport.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.compsportElement.isDisplayed();

    }

    public void Clickagility() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.agility.isDisplayed();
        this.agility.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.agilityElement.isDisplayed();

    }

    public void Clickobedience() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.obedience.isDisplayed();
        this.obedience.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.obedienceElement.isDisplayed();

    }

    public void Clickrally() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.rally.isDisplayed();
        this.rally.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.rallyElement.isDisplayed();

    }

    public void Clicktracking() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.tracking.isDisplayed();
        this.tracking.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.trackingElement.isDisplayed();

    }

    public void Clicktittlereco() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.tittlereco.isDisplayed();
        this.tittlereco.click();
        sleep(1000);
        driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.tittlerecoElement.isDisplayed();

    }

    public void Clickbarnhunt() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.barnhunt.isDisplayed();
        this.barnhunt.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.barnhuntElement.isDisplayed();

    }

    public void Clickdiscdog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.discdog.isDisplayed();
        this.discdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.discdogElement.isDisplayed();

    }

    public void Clickdivingdog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.divingdog.isDisplayed();
        this.divingdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.divingdogElement.isDisplayed();

    }

    public void Clickflyball() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.flyball.isDisplayed();
        this.flyball.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.flyballElement.isDisplayed();

    }

    public void Clicksearchresc() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(tempTest).perform();
        assert(searchresc.isEnabled());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#sports-events > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > ul > li:nth-child(5) > a")));
        this.searchresc.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.searchrescElement.isDisplayed();

    }

    public void Clickparentclubrec() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.parentclubrec.isDisplayed();
        this.parentclubrec.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.parentclubrecElement.isDisplayed();

    }

    public void Clickperfsport() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.perfsport.isDisplayed();
        this.perfsport.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.perfsportElement.isDisplayed();

    }

    public void Clickfieldevnthound() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.fieldevnthound.isDisplayed();
        this.fieldevnthound.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.fieldevnthoundElement.isDisplayed();

    }

    public void Clickcourscat() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.courscat.isDisplayed();
        this.courscat.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.courscatElement.isDisplayed();

    }

    public void Clickearthdog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.earthdog.isDisplayed();
        this.earthdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.earthdogElement.isDisplayed();

    }

    public void Clickherding() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.herding.isDisplayed();
        this.herding.click();
        sleep(2000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.herdingElement.isDisplayed();

    }

    public void Clickpointbreed() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.pointbreed.isDisplayed();
        this.pointbreed.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.pointbreedElement.isDisplayed();

    }

    public void Clickretrievers() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.retrievers.isDisplayed();
        this.retrievers.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.retrieversElement.isDisplayed();

    }

    public void ClickscentWork() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.scentWork.isDisplayed();
        this.scentWork.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.scentWorkElement.isDisplayed();

    }

    public void Clickspaniels() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.spaniels.isDisplayed();
        this.spaniels.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.spanielsElement.isDisplayed();

    }

    public void Clicksportsjun() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.sportsjun.isDisplayed();
        this.sportsjun.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.sportsjunElement.isDisplayed();

    }

    public void Clickjunshow() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.junshow.isDisplayed();
        this.junshow.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.junshowElement.isDisplayed();

    }

    public void Clickjuncomp() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.juncomp.isDisplayed();
        this.juncomp.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.juncompElement.isDisplayed();

    }

    public void Clickjunperf() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.junperf.isDisplayed();
        this.junperf.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.junperfElement.isDisplayed();

    }

    public void Clickpeewee() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.peewee.isDisplayed();
        this.peewee.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.peeweeElement.isDisplayed();


    }

    public void Clickakcfamdog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.akcfamdog.isDisplayed();
        this.akcfamdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcfamdogElement.isDisplayed();

    }

    public void Clickcgcstar() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(tempTest).perform();
        assert(cgcstar.isEnabled());
        this.cgcstar.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        actions.moveToElement(cgcstarElement).perform();
        assert(cgcstarElement.isEnabled());
        this.cgcstarElement.isDisplayed();

    }

    public void ClicktrickVirtual() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.trickVirtual.isDisplayed();
        this.trickVirtual.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.trickVirtualElement.isDisplayed();

    }

    public void ClicktherapyDog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.therapyDog.isDisplayed();
        this.therapyDog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.therapyDogElement.isDisplayed();

    }

    public void ClickfitDog() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 200);");
        this.fitDog.isDisplayed();
        this.fitDog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.fitDogElement.isDisplayed();

    }

    public void ClicktempTest() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.tempTest.isDisplayed();
        this.tempTest.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.tempTestElement.isDisplayed();

    }

    public void Clickeventse() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.eventse.isDisplayed();
        this.eventse.click();
        for (String winHandle : driver.getWindowHandles()) {
                driver.switchTo().window(winHandle);
            }
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickdownform() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.downform.isDisplayed();
        this.downform.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.downformElement.isDisplayed();

    }

    public void Clickrulesreg() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.rulesreg.isDisplayed();
        this.rulesreg.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.rulesregElement.isDisplayed();

    }

    public void Clickoem() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.oem.isDisplayed();
        this.oem.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickpointaward() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.pointaward.isDisplayed();
        this.pointaward.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgingres() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.judgingres.isDisplayed();
        this.judgingres.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.judgingresElement.isDisplayed();

    }

    public void Clickjudgesdirec() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.judgesdirec.isDisplayed();
        this.judgesdirec.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgeseduc() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.judgeseduc.isDisplayed();
        this.judgeseduc.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickakcweeklywin() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.akcweeklywin.isDisplayed();
        this.akcweeklywin.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.akcwinners.com/"));

    }

    public void Clickeventcanc() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.eventcanc.isDisplayed();
        this.eventcanc.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.eventcancElement.isDisplayed();

    }

    public void Clickakccontact() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(juniorRes).perform();
        assert(akccontact.isEnabled());
        this.akccontact.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akccontactElement.isDisplayed();

    }

    public void Clickakcrhp() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.akcrhp.isDisplayed();
        this.akcrhp.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcrhpElement.isDisplayed();

    }

    public void ClickjuniorRes() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.juniorRes.isDisplayed();
        this.juniorRes.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.juniorResElement.isDisplayed();

    }


    //Menu Articles Methods >


    public void SportsEventsArticle1() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.whichsports.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sports-events > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(4) > a")));
        this.whichsports.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        //this.add1.isDisplayed();

    }

    public void SportsEventArticle2() throws InterruptedException {

        this.sportevent.click();
        sleep(1000);
        this.retrievers.isDisplayed();
        this.retrievers.click();
        sleep(1000);
        driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

}






