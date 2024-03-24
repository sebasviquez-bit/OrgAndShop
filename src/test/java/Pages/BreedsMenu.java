package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class BreedsMenu {


    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(1)")
    WebElement menubreeds;

    @FindBy(css = "#dog-breeds > div:nth-child(1) > div > div > a")
    WebElement viewbreeds;

    @FindBy(xpath = "//select[@id='breed-search']")
    WebElement searchbreeds;

    @FindBy(css = "#dog-breeds > div:nth-child(1) > div > div > form > div:nth-child(1) > div > div.selectize-input.items.full.has-options.has-items > div")
    WebElement searchbreedsDrop;

    @FindBy(xpath = "//*[@id='breed_group-selectized']")
    WebElement explorebreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/form/div[2]/div/div[2]/div/div[1]/div[2]")
    WebElement explorebreedsDrop;

    @FindBy(css = "#dog-breeds > div:nth-child(2) > div > div > div > ul > li:nth-child(1) > a > div")
    WebElement findmatch;

    @FindBy(css = "#dog-breeds > div:nth-child(2) > div > div > div > ul > li:nth-child(2) > a > div")
    WebElement comparebreeds;

    @FindBy(css = "#dog-breeds > div:nth-child(2) > div > div > div > ul > li:nth-child(3) > a > div")
    WebElement findapuppy;

    @FindBy(css = "#dog-breeds > div:nth-child(3) > div > div > div > ul > li:nth-child(1) > a")
    WebElement chooseabreed;

    @FindBy(css = "#dog-breeds > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a")
    WebElement whygetdog;

    @FindBy(css = "#dog-breeds > div:nth-child(3) > div > div > div > ul > li:nth-child(3) > a")
    WebElement findrespbreeder;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[3]/div/div/div/ul/li[4]/a")
    WebElement getstartdogsports;

    @FindBy(css = "#dog-breeds > div:nth-child(3) > div > div > div > ul > li:nth-child(5) > a")
    WebElement allaboutpuppies;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(1) > a")
    WebElement findpurebreed;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(2) > a")
    WebElement menuregdog;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(3) > a")
    WebElement findbreedclub;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(4) > a")
    WebElement mostpopdogs;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(5) > a")
    WebElement fordogbreeders;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(6) > a")
    WebElement fordogowners;

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
    WebElement chooseabreedElement;

    @FindBy(css = "#page-title > h1")
    WebElement whygetdogElement;

    @FindBy(css = "#page-title > h1")
    WebElement findrespbreederElement;

    @FindBy(css = "#page-title > h1")
    WebElement getstartdogsportsElement;

    @FindBy(css = "#\\ exploring\\  > div > h2")
    WebElement puppiesPageTitle;

    @FindBy(css = "#page-title > div > h1")
    WebElement menuregdogElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
    WebElement mostpopdogsElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement fordogbreedersElement;

    @FindBy(css = "#page-title > h1")
    WebElement fordogownersElement;

    @FindBy(css = "#page-title > h1")
    WebElement viewbreedsElement;

    @FindBy(xpath = "//*[@id=\"mega-menu\"]")
    WebElement searchbreedsElement;

    @FindBy(xpath = "//*[@id=\"mega-menu\"]")
    WebElement explorebreedsElement;

    @FindBy(xpath = "//*[@id=\"breed-select-template\"]/div/div/div[2]/main/div[2]/div[1]/h1")
    WebElement findmatchElement;

    @FindBy(css = "body > div.breed-select-wrap > div > div > div.page-layout > main > div.breed-select-intro-title.mb2.bps-mb8 > div.breed-select-intro-title__title > h1")
    WebElement comparebreedsElement;

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div > ul:nth-child(11) > li:nth-child(1) > a")
    WebElement preparingPuppy;

    @FindBy(css = "body > div:nth-child(6) > div.page-container > div.page-layout > aside > div > nav > ul > li:nth-child(2) > a")
    WebElement twoMonths;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div[2]/div/div/ul[2]/li[3]/a")
    WebElement threeMonths;

    @FindBy(css = "ntent-card-grid > div > div > div:nth-child(1) > div > div.content-card__body > a")
    WebElement newPuppyCheck;

    @FindBy(css = "#page-title > div > h1")
    WebElement newPuppyCheckElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement threeMonthsElement;

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div.content-body__text.content-body__text-long > div > ul > li:nth-child(1) > span")
    WebElement accordion19;

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div.content-body__text.content-body__text-long > div > ul > li:nth-child(2) > div > ol > li:nth-child(4) > a > span")
    WebElement frenchBull;

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div.content-body__text.content-body__text-long > div > ul > li:nth-child(1) > div > p.p1 > a")
    WebElement fullList;

    @FindBy(css = "#page-title > h1")
    WebElement listTittle;

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div.content-body__text.content-body__text-long > div > ul > li:nth-child(2) > span")
    WebElement accordion18;

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div.content-body__text.content-body__text-long > div > ul > li:nth-child(2) > div > ol > li:nth-child(2) > span > a > span")
    WebElement germanShepherd;

    @FindBy(css = "#page-title > h1")
    WebElement germanShepherdElement;

    @FindBy(css = "body > div:nth-child(6) > div > div.page-layout > main > div.article-body > div > div > div > p:nth-child(10) > a")
    WebElement KennelNameReg;

    @FindBy(css = "#page-title > div > h1")
    WebElement KeneelNameRegTitle;

    @FindBy(css = "#main-content > div.article-body > div > div > div.content-body__text.content-body__text-long > table > tbody > tr:nth-child(1) > td:nth-child(2) > p:nth-child(3) > a")
    WebElement breedsMoreButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div[1]/div/div/table/tbody/tr[4]/td[2]/p[3]/a")
    WebElement dogHealthButton;

    @FindBy(css = "body > div.bcpNotificationBar.bcpNotificationBarStickyBottom")
    WebElement BottomBanner;


    //Driver
    WebDriver driver;

    // Constructor
    public BreedsMenu(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);
    }

    public void Verifybreedsmenu() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(viewbreeds));
        searchbreeds.isDisplayed();
        explorebreeds.isDisplayed();
        findmatch.isDisplayed();
        comparebreeds.isDisplayed(); //fix this locator
        findapuppy.isDisplayed();
        chooseabreed.isDisplayed();
        whygetdog.isDisplayed();
        findrespbreeder.isDisplayed();
        getstartdogsports.isDisplayed();
        allaboutpuppies.isDisplayed();
        findpurebreed.isDisplayed();
        menuregdog.isDisplayed();
        findbreedclub.isDisplayed();
        mostpopdogs.isDisplayed();
        fordogbreeders.isDisplayed();
        fordogowners.isDisplayed();

    }


    //Click methods for Breeds.Menu tabs


    public void Clickviewbreeds() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(viewbreeds));
        viewbreeds.click();
        wait.until(ExpectedConditions.visibilityOf(viewbreedsElement));

    }

    public void Clicksearchbreeds() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchbreeds)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchbreedsDrop)).click();
        wait.until(ExpectedConditions.visibilityOf(searchbreedsElement));

    }

    public void ClickExploreSmallBreeds() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(explorebreeds));
        explorebreeds.click();
        wait.until(ExpectedConditions.elementToBeClickable(explorebreedsDrop));
        explorebreedsDrop.click();
        wait.until(ExpectedConditions.visibilityOf(explorebreedsElement));

    }

    public void Clickfindmatch() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findmatch)).click();
        wait.until(ExpectedConditions.visibilityOf(findmatchElement));

    }

    public void Clickcomparebreeds() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(comparebreeds));
        comparebreeds.click();
        wait.until(ExpectedConditions.visibilityOf(comparebreedsElement));

    }

    public void Clickfindapuppy() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy));
        findapuppy.click();
        for (String winHandle : driver.getWindowHandles()) {driver.switchTo().window(winHandle);}
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void ClickChooseBreed() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(chooseabreed));
        chooseabreed.click();
        wait.until(ExpectedConditions.visibilityOf(chooseabreedElement));

    }

    public void Clickwhygetdog() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(whygetdog));
        whygetdog.click();
        wait.until(ExpectedConditions.visibilityOf(whygetdogElement));

    }

    public void Clickfindrespbreeder() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findrespbreeder));
        findrespbreeder.click();
        wait.until(ExpectedConditions.visibilityOf(findrespbreederElement));

    }

    public void Clickgetstartdogsports() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(getstartdogsports));
        getstartdogsports.click();
        wait.until(ExpectedConditions.visibilityOf(getstartdogsportsElement));

    }

    public void Clickallaboutpuppies() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(allaboutpuppies));
        allaboutpuppies.click();
        wait.until(ExpectedConditions.visibilityOf(puppiesPageTitle));
        //driver.get(driver.getCurrentUrl() + "?test=true");


    }

    public void Clickfindpurebreed() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findpurebreed));
        findpurebreed.click();
        for (String winHandle : driver.getWindowHandles()) {driver.switchTo().window(winHandle);}
        wait.until(ExpectedConditions.urlContains("/puppies"));

    }

    public void Clickmenuregdog() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuregdog));
        menuregdog.click();
        wait.until(ExpectedConditions.visibilityOf(menuregdogElement));

    }

    public void Clickfindbreedclub() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findbreedclub));
        findbreedclub.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("/club-search/"));

    }

    public void Clickmostpopdogs() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mostpopdogs));
        mostpopdogs.click();
        wait.until(ExpectedConditions.visibilityOf(mostpopdogsElement));

    }

    public void Clickfordogbreeders() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fordogbreeders));
        fordogbreeders.click();
        wait.until(ExpectedConditions.visibilityOf(fordogbreedersElement));

    }

    public void Clickfordogowners() {

        menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fordogowners));
        fordogowners.click();
        wait.until(ExpectedConditions.visibilityOf(fordogownersElement));

    }

    //Use below method to hide banners and popUps

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }

}

