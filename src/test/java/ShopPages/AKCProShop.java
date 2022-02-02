package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AKCProShop {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(3)")
    WebElement AKCProShopMenu;

    @FindBy(css = "#shopify-section-collection-headline-tiles > h1")
    WebElement AKCProShopTitle;

    @FindBy(css = "#shopify-section-collection-headline-tiles > div.collection-landing-page__tiles > a:nth-child(1) > div > img")
    WebElement AKCProShopPointsProgression;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(1) > a")
    WebElement AKCBrandedGears;

    @FindBy(css = "#main-content > div > h1")
    WebElement AKCBrandedGearsTitle;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(2) > a")
    WebElement ForBreeders;

    @FindBy(css = "#main-content > div > h1")
    WebElement ForBreedersTitle;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(3) > a")
    WebElement Exhibitors;

    @FindBy(css = "#main-content > div > h1")
    WebElement ExhibitorsTitle;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(4) > a")
    WebElement ForJudges;

    @FindBy(css = "#main-content > div > h1")
    WebElement ForJudgesTitle;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(5) > a")
    WebElement ForClubs;

    @FindBy(css = "#main-content > div > h1")
    WebElement ForClubsTitle;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(6) > a")
    WebElement ForTrainers;

    @FindBy(css = "#main-content > div > h1")
    WebElement ForTrainersTitle;

    @FindBy(css = "#main-menu-akc-pro-shop > div:nth-child(7) > a")
    WebElement PointsProgressionProShop;

    @FindBy(css = "#main-content > div > h1")
    WebElement PointsProgressionProShopTitle;


    //------------------------//

    WebDriver driver;

    // Constructor
    public AKCProShop(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickAKCProShopMenu()  {

        this.AKCProShopMenu.isDisplayed();
        this.AKCProShopMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(AKCProShopTitle));
        wait.until(ExpectedConditions.visibilityOf(AKCProShopPointsProgression));

    }

    public void clickAKCBrandedGears() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(AKCBrandedGears));
        this.AKCBrandedGears.click();
        wait.until(ExpectedConditions.visibilityOf(AKCBrandedGearsTitle));

    }

    public void clickForBreeders() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ForBreeders));
        this.ForBreeders.click();
        wait.until(ExpectedConditions.visibilityOf(ForBreedersTitle));

    }

    public void clickExhibitors() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Exhibitors));
        this.Exhibitors.click();
        wait.until(ExpectedConditions.visibilityOf(ExhibitorsTitle));

    }

    public void clickForJudges() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ForJudges));
        this.ForJudges.click();
        wait.until(ExpectedConditions.visibilityOf(ForJudgesTitle));

    }

    public void clickForClubs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ForClubs));
        this.ForClubs.click();
        wait.until(ExpectedConditions.visibilityOf(ForClubsTitle));

    }

    public void clickForTrainers() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ForTrainers));
        this.ForTrainers.click();
        wait.until(ExpectedConditions.visibilityOf(ForTrainersTitle));

    }

    public void clickPointsProgressionProShop() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(3)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(PointsProgressionProShop));
        this.PointsProgressionProShop.click();
        wait.until(ExpectedConditions.visibilityOf(PointsProgressionProShopTitle));

    }



}
