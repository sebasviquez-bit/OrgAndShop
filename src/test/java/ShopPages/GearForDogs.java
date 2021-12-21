package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GearForDogs {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(2)")
    WebElement GearForDogsMenu;

    @FindBy(css = "#main-content > div > h1")
    WebElement GearForDogsTitle;

    @FindBy(css = "#isp_left_container")
    WebElement GearForDogsSideNav;

    @FindBy(css = "#isp_search_results_container > li:nth-child(2) > div.isp_product_image_wrapper > a > img")
    WebElement GearForDogsProduct;

    @FindBy(css = "#isp_sorting_drop_container > a")
    WebElement SortBy;
    //

    @FindBy(css = "#dog-travel-accessories-car > li:nth-child(1) > a")
    WebElement Car;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CarTitle;

    @FindBy(css = "#dog-travel-accessories-car > li:nth-child(2) > a")
    WebElement CarCovers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CarCoversTitle;

    @FindBy(css = "#dog-travel-accessories-car > li:nth-child(3) > a")
    WebElement SeatsHarnesses;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SeatsHarnessesTitle;

    @FindBy(css = "#dog-travel-accessories-car > li:nth-child(4) > a")
    WebElement CarBarriers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CarBarriersTitle;

    @FindBy(css = "#dog-travel-accessories-car > li:nth-child(5) > a")
    WebElement CarRamps;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement CarRampsTitle;

    @FindBy(css = "#on-the-go-travel > li:nth-child(1) > a")
    WebElement Travel;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TravelTitle;

    @FindBy(css = "#on-the-go-travel > li:nth-child(2) > a")
    WebElement TravelBowls;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TravelBowlsTitle;

    @FindBy(css = "#on-the-go-travel > li:nth-child(2) > a")
    WebElement DogCarriers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogCarriersTitle;

    @FindBy(css = "#on-the-go-travel > li:nth-child(2) > a")
    WebElement DogStrollers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogStrollersTitle;

    @FindBy(css = "#on-the-go-travel > li:nth-child(2) > a")
    WebElement OutAdventure;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement OutAdventureTitle;

    @FindBy(css = "#on-the-go-clothing > li:nth-child(1) > a")
    WebElement ClothingWear;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ClothingWearTitle;

    @FindBy(css = "#on-the-go-clothing > li:nth-child(2) > a")
    WebElement JackCoats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement JackCoatsTitle;

    @FindBy(css = "#on-the-go-clothing > li:nth-child(3) > a")
    WebElement DogSweaters;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogSweatersTitle;

    @FindBy(css = "#on-the-go-clothing > li:nth-child(4) > a")
    WebElement SafetyWear;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SafetyWearTitle;

    @FindBy(css = "#on-the-go-clothing > li:nth-child(5) > a")
    WebElement DogAccessories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogAccessoriesTitle;

    //------------------------//

    WebDriver driver;

    // Constructor
    public GearForDogs(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickGearForDogsMenu() {

        this.GearForDogsMenu.isDisplayed();
        this.GearForDogsMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GearForDogsTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(GearForDogsSideNav));
        wait.until(ExpectedConditions.visibilityOf(GearForDogsProduct));
        wait.until(ExpectedConditions.visibilityOf(SortBy));

    }

    public void clickCar() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.Car.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CarTitle));

    }

    public void clickCarCovers() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.CarCovers.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CarCoversTitle));

    }

    public void clickSeatsHarnesses() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.SeatsHarnesses.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SeatsHarnessesTitle));

    }

    public void clickCarBarriers() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.CarBarriers.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CarBarriersTitle));

    }

    public void clickCarRapms() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.CarRamps.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CarRampsTitle));

    }

    public void clickTravel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.Travel.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TravelTitle));

    }

    public void clickTravelBolws() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.TravelBowls.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TravelBowlsTitle));

    }

    public void clickDogCarriers() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.DogCarriers.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogCarriersTitle));

    }

    public void clickDogStrollers() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.DogStrollers.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogStrollersTitle));

    }

    public void clickOutAdventure() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.OutAdventure.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(OutAdventureTitle));

    }

    public void clickClothingWear() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.ClothingWear.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ClothingWearTitle));

    }

    public void clickJackCoats() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.JackCoats.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(JackCoatsTitle));

    }

    public void clickDogSweaters() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.DogSweaters.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogSweatersTitle));

    }

    public void clickSafetyWear() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.SafetyWear.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SafetyWearTitle));

    }

    public void clickDogAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go-dog-travel-products > a"));
        builder.moveToElement(element).build().perform();
        this.DogAccessories.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogAccessoriesTitle));

    }

}
