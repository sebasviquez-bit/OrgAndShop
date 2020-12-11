package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopCollections {

    @FindBy(css = "#menu-bar > ul > li.collections > a")
    WebElement CollectionsMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CollectionsTitle;

    @FindBy(css = "#collections-side-nav")
    WebElement CollectionsSideNav;

    @FindBy(css = "#menu-bar > ul > li.collections > a")
    WebElement CollectionsMain;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CollectionsMainTitle;

    @FindBy(css = "#dog-lovers-pet-tech > li > a")
    WebElement PetTech;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PetTechTitle;

    @FindBy(css = "#dog-lovers-pet-remembrance > li > a")
    WebElement PetRememb;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PetRemembTitle;

    @FindBy(css = "#shop-by-breed > li > a")
    WebElement ShopByBreed;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > h4")
    WebElement ShopByBreedTitle;

    @FindBy(css = "#clearance > li > a")
    WebElement Clearance;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ClearanceTitle;

    //------------------------//

    WebDriver driver;

    // Constructor
    public ShopCollections (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickCollectionsMenu() throws InterruptedException {

        this.CollectionsMenu.isDisplayed();
        this.CollectionsMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CollectionsTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(CollectionsSideNav));

    }

    public void clickCollectionsMain() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.collections > a"));
        builder.moveToElement(element).build().perform();
        this.CollectionsMain.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CollectionsMainTitle));

    }

    public void clickPetTech() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.collections > a"));
        builder.moveToElement(element).build().perform();
        this.PetTech.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PetTechTitle));

    }

    public void clickPetRememb() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.collections > a"));
        builder.moveToElement(element).build().perform();
        this.PetRememb.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PetRemembTitle));

    }

    public void clickShopByBreed() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.collections > a"));
        builder.moveToElement(element).build().perform();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ShopByBreedTitle));

    }

    public void clickCollectShopByBreed() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.collections > a"));
        builder.moveToElement(element).build().perform();
        this.Clearance.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ClearanceTitle));

    }

}
