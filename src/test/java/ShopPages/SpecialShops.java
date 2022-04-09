package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecialShops {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(6)")
    WebElement SpecialShopMenu;

    @FindBy(css = "#main-menu-special-shops")
    WebElement SpecialShopDropdown;

    @FindBy(css = "#main-menu-special-shops > div:nth-child(1) > a")
    WebElement NewArrivals;

    @FindBy(css = "#isp_search_results_container > li:nth-child(44) > div.isp_product_image_wrapper > a")
    WebElement NewArrivalsProduct;

    @FindBy(css = "#main-menu-special-shops > div:nth-child(2) > a")
    WebElement PuppyEssentials;

    @FindBy(css = "#main-menu-special-shops > div:nth-child(3) > a")
    WebElement CozzyCollection;

    @FindBy(css = "#isp_search_results_container > li:nth-child(17) > div.isp_product_image_wrapper > a")
    WebElement CozzyCollectionProduct;

    @FindBy(css = "#main-menu-special-shops > div:nth-child(4) > a")
    WebElement Chewy;

    @FindBy(css = "#single_facet_Price")
    WebElement ChewyPageSideMenuBar;
    //

    //------------------------//

    WebDriver driver;

    // Constructor
    public SpecialShops(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void SpecialShopDropDown() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(6)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SpecialShopDropdown));

    }

    public void ClickNewArrivals() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(6)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(NewArrivals));
        this.NewArrivals.click();
        wait.until(ExpectedConditions.visibilityOf(NewArrivalsProduct));

    }

    public void ClickPuppyEssentials() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(6)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(PuppyEssentials));
        this.PuppyEssentials.click();
        wait.until(ExpectedConditions.urlContains("essentials/bringing-home-a-new-puppy-essentials/"));

    }

    public void ClickCozzyCollection() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(6)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(CozzyCollection));
        this.CozzyCollection.click();
        wait.until(ExpectedConditions.visibilityOf(CozzyCollectionProduct));

    }

    public void ClickChewy() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(6)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Chewy));
        this.Chewy.click();
        wait.until(ExpectedConditions.visibilityOf(ChewyPageSideMenuBar));

    }
    //

}
