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

    @FindBy(xpath = "//*[@id=\"breed-search-selectized\"]")
    WebElement searchbreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/form")
    WebElement searchbreedsDrop;

    @FindBy(xpath = "//*[@id='breed_group-selectized']")
    WebElement explorebreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/form/div[2]/div/div[2]/div/div[1]/div[2]")
    WebElement explorebreedsDrop;

    @FindBy(css = "#dog-breeds > div:nth-child(2) > div > div > div > ul > li:nth-child(1) > a > div")
    WebElement findmatch;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[2]/a/div")
    WebElement comparebreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[3]/a/div")
    WebElement findapuppy;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[3]/div/div/div/ul/li[1]/a")
    WebElement chooseabreed;

    @FindBy(css = "#dog-breeds > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a")
    WebElement whygetdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[3]/div/div/div/ul/li[3]/a")
    WebElement findrespbreeder;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[3]/div/div/div/ul/li[4]/a")
    WebElement getstartdogsports;

    @FindBy(css = "#dog-breeds > div:nth-child(3) > div > div > div > ul > li:nth-child(5) > a")
    WebElement allaboutpuppies;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]/a")
    WebElement findpurebreed;

    @FindBy(css = "#dog-breeds > div:nth-child(4) > div > div > div > ul > li:nth-child(2) > a")
    WebElement menuregdog;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[3]/a")
    WebElement findbreedclub;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[4]/div/div/div/ul/li[4]/a")
    WebElement mostpopdogs;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[4]/div/div/div/ul/li[5]/a")
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
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }

    public void Verifybreedsmenu() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(viewbreeds));
        this.searchbreeds.isDisplayed();
        this.explorebreeds.isDisplayed();
        this.findmatch.isDisplayed();
        this.comparebreeds.isDisplayed();
        this.findapuppy.isDisplayed();
        this.chooseabreed.isDisplayed();
        this.whygetdog.isDisplayed();
        this.findrespbreeder.isDisplayed();
        this.getstartdogsports.isDisplayed();
        this.allaboutpuppies.isDisplayed();
        this.findpurebreed.isDisplayed();
        this.menuregdog.isDisplayed();
        this.findbreedclub.isDisplayed();
        this.mostpopdogs.isDisplayed();
        this.fordogbreeders.isDisplayed();
        this.fordogowners.isDisplayed();

    }


    //Click methods for Breeds.Menu tabs


    public void Clickviewbreeds() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(viewbreeds));
        this.viewbreeds.click();
        wait.until(ExpectedConditions.visibilityOf(viewbreedsElement));

    }

    public void Clicksearchbreeds() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchbreeds));
        this.searchbreeds.click();
        wait.until(ExpectedConditions.elementToBeClickable(searchbreedsDrop));
        this.searchbreedsDrop.click();
        wait.until(ExpectedConditions.visibilityOf(searchbreedsElement));

    }

    public void ClickExploreSmallBreeds() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(explorebreeds));
        this.explorebreeds.click();
        wait.until(ExpectedConditions.elementToBeClickable(explorebreedsDrop));
        this.explorebreedsDrop.click();
        wait.until(ExpectedConditions.visibilityOf(explorebreedsElement));

    }

    public void Clickfindmatch() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findmatch));
        this.findmatch.click();
        wait.until(ExpectedConditions.visibilityOf(findmatchElement));

    }

    public void Clickcomparebreeds() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(comparebreeds));
        this.comparebreeds.click();
        wait.until(ExpectedConditions.visibilityOf(comparebreedsElement));

    }

    public void Clickfindapuppy() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findapuppy));
        this.findapuppy.click();
        for (String winHandle : driver.getWindowHandles()) {driver.switchTo().window(winHandle);}
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void ClickChooseBreed() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(chooseabreed));
        this.chooseabreed.click();
        wait.until(ExpectedConditions.visibilityOf(chooseabreedElement));

    }

    public void Clickwhygetdog() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(whygetdog));
        this.whygetdog.click();
        wait.until(ExpectedConditions.visibilityOf(whygetdogElement));

    }

    public void Clickfindrespbreeder() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findrespbreeder));
        this.findrespbreeder.click();
        wait.until(ExpectedConditions.visibilityOf(findrespbreederElement));

    }

    public void Clickgetstartdogsports() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(getstartdogsports));
        this.getstartdogsports.click();
        wait.until(ExpectedConditions.visibilityOf(getstartdogsportsElement));

    }

    public void Clickallaboutpuppies() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(allaboutpuppies));
        this.allaboutpuppies.click();
        wait.until(ExpectedConditions.visibilityOf(puppiesPageTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");


    }

    public void Clickfindpurebreed() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findpurebreed));
        this.findpurebreed.click();
        for (String winHandle : driver.getWindowHandles()) {driver.switchTo().window(winHandle);}
        wait.until(ExpectedConditions.urlContains("/puppies"));

    }

    public void Clickmenuregdog() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuregdog));
        this.menuregdog.click();
        wait.until(ExpectedConditions.visibilityOf(menuregdogElement));

    }

    public void Clickfindbreedclub() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findbreedclub));
        this.findbreedclub.click();
        for (String winHandle : driver.getWindowHandles()) { driver.switchTo().window(winHandle); }
        wait.until(ExpectedConditions.urlContains("/club-search/"));

    }

    public void Clickmostpopdogs() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(mostpopdogs));
        this.mostpopdogs.click();
        wait.until(ExpectedConditions.visibilityOf(mostpopdogsElement));

    }

    public void Clickfordogbreeders() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fordogbreeders));
        this.fordogbreeders.click();
        wait.until(ExpectedConditions.visibilityOf(fordogbreedersElement));

    }

    public void Clickfordogowners() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(fordogowners));
        this.fordogowners.click();
        wait.until(ExpectedConditions.visibilityOf(fordogownersElement));

    }

    //Use below method to hide banners and popUps

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }

}

