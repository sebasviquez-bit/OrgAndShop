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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.visibilityOf(getstart));
        wait.until(ExpectedConditions.visibilityOf(introdog));
        wait.until(ExpectedConditions.visibilityOf(canpartenro));
        wait.until(ExpectedConditions.visibilityOf(titleabrev));
        wait.until(ExpectedConditions.visibilityOf(whichsports));
        wait.until(ExpectedConditions.visibilityOf(getstartdog));
        wait.until(ExpectedConditions.visibilityOf(featurevent));
        wait.until(ExpectedConditions.visibilityOf(upcomevent));
        wait.until(ExpectedConditions.visibilityOf(natiotrack));
        wait.until(ExpectedConditions.visibilityOf(natiochamp));
        wait.until(ExpectedConditions.visibilityOf(akcagility));
        wait.until(ExpectedConditions.visibilityOf(obediencecla));
        wait.until(ExpectedConditions.visibilityOf(akcmeet));
        wait.until(ExpectedConditions.visibilityOf(akcnatobechamp));
        wait.until(ExpectedConditions.visibilityOf(akcrallynatchamp));
        wait.until(ExpectedConditions.visibilityOf(browsealldog));
        wait.until(ExpectedConditions.visibilityOf(confdogshow));
        wait.until(ExpectedConditions.visibilityOf(matchshow));
        wait.until(ExpectedConditions.visibilityOf(fourtosix));
        wait.until(ExpectedConditions.visibilityOf(puppyachiev));
        wait.until(ExpectedConditions.visibilityOf(natiohand));
        wait.until(ExpectedConditions.visibilityOf(openshow));
        wait.until(ExpectedConditions.visibilityOf(compsport));
        wait.until(ExpectedConditions.visibilityOf(agility));
        wait.until(ExpectedConditions.visibilityOf(obedience));
        wait.until(ExpectedConditions.visibilityOf(rally));
        wait.until(ExpectedConditions.visibilityOf(tracking));
        wait.until(ExpectedConditions.visibilityOf(tittlereco));
        wait.until(ExpectedConditions.visibilityOf(barnhunt));
        wait.until(ExpectedConditions.visibilityOf(discdog));
        wait.until(ExpectedConditions.visibilityOf(divingdog));
        wait.until(ExpectedConditions.visibilityOf(flyball));
        wait.until(ExpectedConditions.visibilityOf(searchresc));
        wait.until(ExpectedConditions.visibilityOf(parentclubrec));
        wait.until(ExpectedConditions.visibilityOf(perfsport));
        wait.until(ExpectedConditions.visibilityOf(fieldevnthound));
        wait.until(ExpectedConditions.visibilityOf(courscat));
        wait.until(ExpectedConditions.visibilityOf(earthdog));
        wait.until(ExpectedConditions.visibilityOf(herding));
        wait.until(ExpectedConditions.visibilityOf(pointbreed));
        wait.until(ExpectedConditions.visibilityOf(retrievers));
        wait.until(ExpectedConditions.visibilityOf(scentWork));
        wait.until(ExpectedConditions.visibilityOf(spaniels));
        wait.until(ExpectedConditions.visibilityOf(sportsjun));
        wait.until(ExpectedConditions.visibilityOf(junshow));
        wait.until(ExpectedConditions.visibilityOf(juncomp));
        wait.until(ExpectedConditions.visibilityOf(junperf));
        wait.until(ExpectedConditions.visibilityOf(peewee));
        wait.until(ExpectedConditions.visibilityOf(akcfamdog));
        wait.until(ExpectedConditions.visibilityOf(cgcstar));
        wait.until(ExpectedConditions.visibilityOf(trickVirtual));
        wait.until(ExpectedConditions.visibilityOf(therapyDog));
        wait.until(ExpectedConditions.visibilityOf(fitDog));
        wait.until(ExpectedConditions.visibilityOf(tempTest));
        wait.until(ExpectedConditions.visibilityOf(resfordog));
        wait.until(ExpectedConditions.visibilityOf(eventse));
        wait.until(ExpectedConditions.visibilityOf(downform));
        wait.until(ExpectedConditions.visibilityOf(rulesreg));
        wait.until(ExpectedConditions.visibilityOf(oem));
        wait.until(ExpectedConditions.visibilityOf(pointaward));
        wait.until(ExpectedConditions.visibilityOf(judgingres));
        wait.until(ExpectedConditions.visibilityOf(judgesdirec));
        wait.until(ExpectedConditions.visibilityOf(judgeseduc));
        wait.until(ExpectedConditions.visibilityOf(akcweeklywin));
        wait.until(ExpectedConditions.visibilityOf(eventcanc));
        wait.until(ExpectedConditions.visibilityOf(akccontact));
        wait.until(ExpectedConditions.visibilityOf(akcrhp));

    }


    public void Clickintrodog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(introdog));
        wait.until(ExpectedConditions.elementToBeClickable(introdog)).click();
        wait.until(ExpectedConditions.visibilityOf(introdogElement));

    }

    public void Clickcanpartenro() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(canpartenro));
        wait.until(ExpectedConditions.elementToBeClickable(canpartenro)).click();
        wait.until(ExpectedConditions.visibilityOf(AKCCaninePartnersTitle));

    }

    public void Clicktitleabrev() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(titleabrev));
        wait.until(ExpectedConditions.elementToBeClickable(titleabrev)).click();
        wait.until(ExpectedConditions.visibilityOf(titleabrevElement));

    }

    public void Clickwhichsports() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(whichsports));
        wait.until(ExpectedConditions.elementToBeClickable(whichsports)).click();
        wait.until(ExpectedConditions.visibilityOf(whichsportsElement));

    }

    public void Clickgetstartdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(getstartdog));
        wait.until(ExpectedConditions.elementToBeClickable(getstartdog)).click();
        wait.until(ExpectedConditions.visibilityOf(getstartdogElement));

    }

    public void Clickupcomevent() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(upcomevent));
        wait.until(ExpectedConditions.elementToBeClickable(upcomevent)).click();
        wait.until(ExpectedConditions.visibilityOf(upcomeventElement));
        wait.until(ExpectedConditions.visibilityOf(upcomeventElement));

    }

    public void Clicknatiotrack() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(natiotrack));
        wait.until(ExpectedConditions.elementToBeClickable(natiotrack)).click();
        wait.until(ExpectedConditions.visibilityOf(natiotrackElement));

    }

    public void Clicknatiochamp() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(natiochamp));
        wait.until(ExpectedConditions.elementToBeClickable(natiochamp)).click();
        wait.until(ExpectedConditions.visibilityOf(natiochampElement));

    }

    public void Clickakcagility() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcagility));
        wait.until(ExpectedConditions.elementToBeClickable(akcagility)).click();
        wait.until(ExpectedConditions.visibilityOf(akcagilityElement));

    }

    public void Clickobediencecla() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(obediencecla));
        wait.until(ExpectedConditions.elementToBeClickable(obediencecla)).click();
        wait.until(ExpectedConditions.visibilityOf(obedienceclaElement));

    }

    public void Clickakcmeet() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcmeet);
        wait.until(ExpectedConditions.elementToBeClickable(akcmeet));
        wait.until(ExpectedConditions.elementToBeClickable(akcmeet)).click();
        wait.until(ExpectedConditions.visibilityOf(akcmeetElement));

    }

    public void Clickakcnatobechamp() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcnatobechamp);
        wait.until(ExpectedConditions.elementToBeClickable(akcnatobechamp));
        wait.until(ExpectedConditions.elementToBeClickable(akcnatobechamp)).click();
        wait.until(ExpectedConditions.visibilityOf(akcnatobechampElement));

    }

    public void Clickakcrallynatchamp() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcrallynatchamp);
        wait.until(ExpectedConditions.elementToBeClickable(akcrallynatchamp));
        wait.until(ExpectedConditions.elementToBeClickable(akcrallynatchamp)).click();
        wait.until(ExpectedConditions.visibilityOf(akcrallynatchampElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickconfdogshow() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(confdogshow));
        wait.until(ExpectedConditions.elementToBeClickable(confdogshow)).click();
        wait.until(ExpectedConditions.visibilityOf(confdogshowElement));

    }

    public void Clickmatchshow() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(matchshow));
        wait.until(ExpectedConditions.elementToBeClickable(matchshow)).click();
        wait.until(ExpectedConditions.visibilityOf(matchshowElement));

    }

    public void Clickfourtosix() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fourtosix));
        wait.until(ExpectedConditions.elementToBeClickable(fourtosix)).click();
        wait.until(ExpectedConditions.visibilityOf(fourtosixElement));

    }

    public void Clickpuppyachiev() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(puppyachiev));
        wait.until(ExpectedConditions.elementToBeClickable(puppyachiev)).click();
        wait.until(ExpectedConditions.visibilityOf(puppyachievElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clicknatiohand() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(natiohand));
        wait.until(ExpectedConditions.elementToBeClickable(natiohand)).click();
        wait.until(ExpectedConditions.visibilityOf(natiohandElement));

    }

    public void Clickopenshow() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(openshow));
        wait.until(ExpectedConditions.elementToBeClickable(openshow)).click();
        wait.until(ExpectedConditions.visibilityOf(openshowElement));

    }

    public void Clickcompsport() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(compsport));
        wait.until(ExpectedConditions.elementToBeClickable(compsport)).click();
        wait.until(ExpectedConditions.visibilityOf(compsportElement));

    }

    public void Clickagility() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(agility));
        wait.until(ExpectedConditions.elementToBeClickable(agility)).click();
        wait.until(ExpectedConditions.visibilityOf(agilityElement));

    }

    public void Clickobedience() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(obedience));
        wait.until(ExpectedConditions.elementToBeClickable(obedience)).click();
        wait.until(ExpectedConditions.visibilityOf(obedienceElement));

    }

    public void Clickrally() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rally));
        wait.until(ExpectedConditions.elementToBeClickable(rally)).click();
        wait.until(ExpectedConditions.visibilityOf(rallyElement));

    }

    public void Clicktracking() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tracking));
        wait.until(ExpectedConditions.elementToBeClickable(tracking)).click();
        wait.until(ExpectedConditions.visibilityOf(trackingElement));

    }

    public void Clicktittlereco() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tittlereco));
        wait.until(ExpectedConditions.elementToBeClickable(tittlereco)).click();
        wait.until(ExpectedConditions.visibilityOf(tittlerecoElement));

    }

    public void Clickbarnhunt() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(barnhunt));
        wait.until(ExpectedConditions.elementToBeClickable(barnhunt)).click();
        wait.until(ExpectedConditions.visibilityOf(barnhuntElement));

    }

    public void Clickdiscdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(discdog));
        wait.until(ExpectedConditions.elementToBeClickable(discdog)).click();
        wait.until(ExpectedConditions.visibilityOf(discdogElement));

    }

    public void Clickdivingdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(divingdog));
        wait.until(ExpectedConditions.elementToBeClickable(divingdog)).click();
        wait.until(ExpectedConditions.visibilityOf(divingdogElement));

    }

    public void Clickflyball() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", flyball);
        wait.until(ExpectedConditions.elementToBeClickable(flyball));
        wait.until(ExpectedConditions.elementToBeClickable(flyball)).click();
        wait.until(ExpectedConditions.visibilityOf(flyballElement));

    }

    public void Clicksearchresc() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", searchresc);
        wait.until(ExpectedConditions.visibilityOf(searchresc));
        wait.until(ExpectedConditions.elementToBeClickable(searchresc)).click();
        wait.until(ExpectedConditions.visibilityOf(searchrescElement));

    }

    public void Clickparentclubrec() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", parentclubrec);
        wait.until(ExpectedConditions.elementToBeClickable(parentclubrec));
        wait.until(ExpectedConditions.elementToBeClickable(parentclubrec)).click();
        wait.until(ExpectedConditions.elementToBeClickable(parentclubrecElement));

    }

    public void Clickperfsport() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(perfsport));
        wait.until(ExpectedConditions.elementToBeClickable(perfsport)).click();
        wait.until(ExpectedConditions.visibilityOf(perfsportElement));

    }

    public void Clickfieldevnthound() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(fieldevnthound));
        wait.until(ExpectedConditions.elementToBeClickable(fieldevnthound)).click();
        wait.until(ExpectedConditions.visibilityOf(fieldevnthoundElement));

    }

    public void Clickcourscat() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(courscat));
        wait.until(ExpectedConditions.elementToBeClickable(courscat)).click();
        wait.until(ExpectedConditions.visibilityOf(courscatElement));

    }

    public void Clickearthdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(earthdog));
        wait.until(ExpectedConditions.elementToBeClickable(earthdog)).click();
        wait.until(ExpectedConditions.visibilityOf(earthdogElement));

    }

    public void Clickherding() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(herding));
        wait.until(ExpectedConditions.elementToBeClickable(herding)).click();
        wait.until(ExpectedConditions.visibilityOf(herdingElement));

    }

    public void Clickpointbreed() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pointbreed));
        wait.until(ExpectedConditions.elementToBeClickable(pointbreed)).click();
        wait.until(ExpectedConditions.visibilityOf(pointbreedElement));

    }

    public void Clickretrievers() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(retrievers));
        wait.until(ExpectedConditions.elementToBeClickable(retrievers)).click();
        wait.until(ExpectedConditions.visibilityOf(retrieversElement));

    }

    public void ClickscentWork() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(scentWork));
        wait.until(ExpectedConditions.elementToBeClickable(scentWork)).click();
        wait.until(ExpectedConditions.visibilityOf(scentWorkElement));

    }

    public void Clickspaniels() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(spaniels));
        wait.until(ExpectedConditions.elementToBeClickable(spaniels)).click();
        wait.until(ExpectedConditions.visibilityOf(spanielsElement));

    }

    public void Clicksportsjun() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sportsjun)); //fix this
        wait.until(ExpectedConditions.elementToBeClickable(sportsjun)).click();
        wait.until(ExpectedConditions.visibilityOf(sportsjunElement));

    }

    public void Clickjunshow() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(junshow));
        wait.until(ExpectedConditions.elementToBeClickable(junshow)).click();
        wait.until(ExpectedConditions.visibilityOf(junshowElement));

    }

    public void Clickjuncomp() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(juncomp));
        wait.until(ExpectedConditions.elementToBeClickable(juncomp)).click();
        wait.until(ExpectedConditions.visibilityOf(juncompElement));

    }

    public void Clickjunperf() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(junperf));
        wait.until(ExpectedConditions.elementToBeClickable(junperf)).click();
        wait.until(ExpectedConditions.visibilityOf(junperfElement));

    }

    public void Clickpeewee() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(peewee));
        wait.until(ExpectedConditions.elementToBeClickable(peewee)).click();
        wait.until(ExpectedConditions.visibilityOf(peeweeElement));

    }

    public void Clickakcfamdog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcfamdog));
        wait.until(ExpectedConditions.elementToBeClickable(akcfamdog)).click();
        wait.until(ExpectedConditions.visibilityOf(akcfamdogElement));

    }

    public void Clickcgcstar() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(cgcstar));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", cgcstar);
        wait.until(ExpectedConditions.elementToBeClickable(cgcstar)).click();
        wait.until(ExpectedConditions.visibilityOf(cgcstarElement));


    }

    public void ClicktrickVirtual() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", trickVirtual);
        wait.until(ExpectedConditions.elementToBeClickable(trickVirtual));
        wait.until(ExpectedConditions.elementToBeClickable(trickVirtual)).click();
        wait.until(ExpectedConditions.visibilityOf(trickVirtualElement));

    }

    public void ClicktherapyDog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(therapyDog));
        wait.until(ExpectedConditions.elementToBeClickable(therapyDog)).click();
        wait.until(ExpectedConditions.visibilityOf(therapyDogElement));

    }

    public void ClickfitDog() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", fitDog);
        wait.until(ExpectedConditions.elementToBeClickable(fitDog));
        wait.until(ExpectedConditions.elementToBeClickable(fitDog)).click();
        wait.until(ExpectedConditions.visibilityOf(fitDogElement));

    }

    public void ClicktempTest() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", tempTest);
        wait.until(ExpectedConditions.elementToBeClickable(tempTest)).click();
        wait.until(ExpectedConditions.elementToBeClickable(tempTestElement));
        wait.until(ExpectedConditions.visibilityOf(tempTestElement));

    }

    public void Clickeventse() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(eventse));
        wait.until(ExpectedConditions.elementToBeClickable(eventse)).click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickdownform() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(downform));
        wait.until(ExpectedConditions.elementToBeClickable(downform)).click();
        wait.until(ExpectedConditions.visibilityOf(downformElement));

    }

    public void Clickrulesreg() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rulesreg));
        wait.until(ExpectedConditions.elementToBeClickable(rulesreg)).click();
        wait.until(ExpectedConditions.visibilityOf(rulesregElement));

    }

    public void Clickoem() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(oem));
        wait.until(ExpectedConditions.elementToBeClickable(oem)).click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickpointaward() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        //wait.until(ExpectedConditions.visibilityOf(pointaward));
        wait.until(ExpectedConditions.elementToBeClickable(pointaward));
        wait.until(ExpectedConditions.elementToBeClickable(pointaward)).click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgingres() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(judgingres));
        wait.until(ExpectedConditions.elementToBeClickable(judgingres)).click();
        wait.until(ExpectedConditions.visibilityOf(judgingresElement));

    }

    public void Clickjudgesdirec() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(judgesdirec));
        wait.until(ExpectedConditions.elementToBeClickable(judgesdirec)).click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickjudgeseduc() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(judgeseduc));
        wait.until(ExpectedConditions.elementToBeClickable(judgeseduc)).click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickakcweeklywin() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcweeklywin));
        wait.until(ExpectedConditions.elementToBeClickable(akcweeklywin)).click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("https://www.akcwinners.com/"));

    }

    public void Clickeventcanc() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(eventcanc));
        wait.until(ExpectedConditions.elementToBeClickable(eventcanc)).click();
        wait.until(ExpectedConditions.visibilityOf(eventcancElement));

    }

    public void Clickakccontact() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akccontact);
        wait.until(ExpectedConditions.elementToBeClickable(akccontact));
        wait.until(ExpectedConditions.elementToBeClickable(akccontact)).click();
        wait.until(ExpectedConditions.visibilityOf(akccontactElement));

    }

    public void Clickakcrhp() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", akcrhp);
        wait.until(ExpectedConditions.elementToBeClickable(akcrhp));
        wait.until(ExpectedConditions.elementToBeClickable(akcrhp)).click();
        wait.until(ExpectedConditions.visibilityOf(akcrhpElement));

    }

    public void ClickjuniorRes() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", juniorRes);
        wait.until(ExpectedConditions.elementToBeClickable(juniorRes));
        wait.until(ExpectedConditions.elementToBeClickable(juniorRes)).click();
        wait.until(ExpectedConditions.visibilityOf(juniorResElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    //Menu Articles Methods >

    public void SportsEventsArticle1() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(sportevent)).click();
        wait.until(ExpectedConditions.elementToBeClickable(whichsports));
        wait.until(ExpectedConditions.elementToBeClickable(whichsports)).click();

    }


}






