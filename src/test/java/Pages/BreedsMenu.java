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

public class BreedsMenu {


    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(1)")
    WebElement menubreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/a")
    WebElement viewbreeds;

    @FindBy(xpath = "//*[@id=\"breed-search-selectized\"]")
    WebElement searchbreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/form")
    WebElement searchbreedsDrop;

    @FindBy(xpath = "//*[@id='breed_group-selectized']")
    WebElement explorebreeds;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[1]/div/div/form/div[2]/div/div[2]/div/div[1]/div[2]")
    WebElement explorebreedsDrop;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[1]/div[2]/div/div/div/ul/li[1]/a/div")
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

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[4]/div/div/div/ul/li[6]/a")
    WebElement fordogowners;

    @FindBy(xpath = "//*[@id=\"page-title\"]/h1")
    WebElement chooseabreedElement;

    @FindBy(css = "#page-title > h1")
    WebElement whygetdogElement;

    @FindBy(css = "#page-title > h1")
    WebElement findrespbreederElement;

    @FindBy(css = "#page-title > h1")
    WebElement getstartdogsportsElement;

    @FindBy(css = "#page-title > h1")
    WebElement allaboutpuppiesElement;

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

    @FindBy(css = "body > div:nth-child(7) > div.page-container > div.page-layout > main > div.content-card-grid > div > div > div:nth-child(1) > div > div.content-card__body > a")
    WebElement newPuppyCheck;

    @FindBy(css = "#page-title > h1")
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

    @FindBy(css = "#main-content > div.article-body > div.content-body > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > p:nth-child(4) > a")
    WebElement breedsMoreButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/div[1]/div/div/table/tbody/tr[4]/td[2]/p[3]/a")
    WebElement dogHealthButton;

    @FindBy(xpath = "/html/body/div[15]/div/div/div/div/span")
    WebElement PopUpFrameClose;
    //


    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public BreedsMenu(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }

    public void Verifybreedsmenu() {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(viewbreeds));
        //this.viewbreeds.isDisplayed();
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


    public void Clickviewbreeds() throws InterruptedException {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(viewbreeds));
        this.viewbreeds.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(viewbreedsElement));

    }

    public void Clicksearchbreeds() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.searchbreeds.isDisplayed();
        this.searchbreeds.click();
        sleep(1000);
        this.searchbreedsDrop.isDisplayed();
        this.searchbreedsDrop.click();
        sleep(100);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.searchbreedsElement.isDisplayed();

    }

    public void Clickexplorebreeds() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.explorebreeds.isDisplayed();
        this.explorebreeds.click();
        sleep(1000);
        this.explorebreedsDrop.isDisplayed();
        this.explorebreedsDrop.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.explorebreedsElement.isDisplayed();

    }

    public void Clickfindmatch() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.findmatch.isDisplayed();
        this.findmatch.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.findmatchElement.isDisplayed();

    }

    public void Clickcomparebreeds() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.comparebreeds.isDisplayed();
        this.comparebreeds.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.comparebreedsElement.isDisplayed();

    }

    public void Clickfindapuppy() throws InterruptedException {  // New tab method :

        this.menubreeds.click();
        sleep(1000);
        this.findapuppy.isDisplayed();
        this.findapuppy.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/"));

    }

    public void Clickchooseabreed() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.chooseabreed.isDisplayed();
        this.chooseabreed.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.chooseabreedElement.isDisplayed();

    }

    public void Clickwhygetdog() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.whygetdog.isDisplayed();
        this.whygetdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.whygetdogElement.isDisplayed();

    }

    public void Clickfindrespbreeder() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.findrespbreeder.isDisplayed();
        this.findrespbreeder.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.findrespbreederElement.isDisplayed();

    }

    public void Clickgetstartdogsports() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.getstartdogsports.isDisplayed();
        this.getstartdogsports.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.getstartdogsportsElement.isDisplayed();

    }

    public void Clickallaboutpuppies() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.allaboutpuppies.isDisplayed();
        this.allaboutpuppies.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.allaboutpuppiesElement.isDisplayed();

    }

    public void Clickfindpurebreed() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.findpurebreed.isDisplayed();
        this.findpurebreed.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://marketplace.akc.org/puppies"));

    }

    public void Clickmenuregdog() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.menuregdog.isDisplayed();
        this.menuregdog.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.menuregdogElement.isDisplayed();

    }

    public void Clickfindbreedclub() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.findbreedclub.isDisplayed();
        this.findbreedclub.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/club-search/"));

    }

    public void Clickmostpopdogs() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dog-breeds\"]/div[4]/div/div/div/ul/li[4]/a")));
        this.mostpopdogs.isDisplayed();
        this.mostpopdogs.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.mostpopdogsElement.isDisplayed();

    }

    public void Clickfordogbreeders() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dog-breeds\"]/div[4]/div/div/div/ul/li[5]/a")));
        this.fordogbreeders.isDisplayed();
        this.fordogbreeders.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.fordogbreedersElement.isDisplayed();

    }

    public void Clickfordogowners() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.fordogowners.isDisplayed();
        this.fordogowners.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.fordogownersElement.isDisplayed();

    }

    //Articles methods >


    public void puppiesArticle1() throws InterruptedException {

        this.menubreeds.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(allaboutpuppies));
        Actions actions = new Actions(driver);
        actions.moveToElement(allaboutpuppies).perform();
        this.allaboutpuppies.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(preparingPuppy));
        this.preparingPuppy.click();
        wait.until(ExpectedConditions.visibilityOf(twoMonths));

    }

    public void puppiesArticle2() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.allaboutpuppies.isDisplayed();
        this.allaboutpuppies.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(preparingPuppy).perform();
        this.preparingPuppy.isDisplayed();
        this.preparingPuppy.click();
        actions.moveToElement(newPuppyCheck).perform();
        assert(newPuppyCheck.isEnabled());

    }

    public void puppiesArticle3() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.allaboutpuppies.isDisplayed();
        this.allaboutpuppies.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.preparingPuppy.isDisplayed();
        this.threeMonths.isDisplayed();


    }

    public void mostpopdogsArticle1() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.mostpopdogs.isDisplayed();
        this.mostpopdogs.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.mostpopdogsElement.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(accordion19).perform();
        assert(accordion19.isEnabled());
        this.accordion19.click();
        sleep(1000);
        this.frenchBull.isDisplayed();
        this.fullList.isDisplayed();
        this.fullList.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.listTittle.isDisplayed();

    }

    public void mostpopdogsArticle2() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.mostpopdogs.isDisplayed();
        this.mostpopdogs.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.mostpopdogsElement.isDisplayed();
        Actions actions = new Actions(driver);
        actions.moveToElement(accordion18).perform();
        assert(accordion18.isEnabled());
        this.accordion18.click();
        sleep(1000);
        this.germanShepherd.isDisplayed();
        this.germanShepherd.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.germanShepherdElement.isDisplayed();

    }

    public void fordogbreedersArticle1() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.fordogbreeders.isDisplayed();
        this.fordogbreeders.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(KennelNameReg));
        this.KennelNameReg.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.KeneelNameRegTitle.isDisplayed();

    }

    public void ForDogOwnerArticle1() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.fordogowners.isDisplayed();
        this.fordogowners.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.breedsMoreButton.isDisplayed();
        this.breedsMoreButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("akc.org/dog-breed-selector/"));

    }

    public void ForDogOwnerArticle2() throws InterruptedException {

        this.menubreeds.click();
        sleep(1000);
        this.fordogowners.isDisplayed();
        this.fordogowners.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 1000)");
        sleep(1000);
        this.dogHealthButton.isDisplayed();
        this.dogHealthButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlToBe("https://www.akc.org/expert-advice/health/"));

    }


}

