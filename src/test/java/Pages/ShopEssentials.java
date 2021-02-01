package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopEssentials {

    @FindBy(css = "#menu-bar > ul > li.dog-essentials-supplies > a")
    WebElement EssentialsMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogEssentialsTitle;

    @FindBy(css = "#essentials-side-nav")
    WebElement EssentialsSideNav;

    @FindBy(css = "#play > li:nth-child(3) > a")
    WebElement SideMenuFetchToys;
    //

    @FindBy(css = "#essentials-eat-drink > li:nth-child(1) > a")
    WebElement EatDrinkMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement EatDrinkMenuTitle;

    @FindBy(css = "#essentials-play > li:nth-child(1) > a")
    WebElement PlayMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PlayMenuTitle;

    @FindBy(css = "#essentials-rest > li:nth-child(1) > a")
    WebElement RestMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement RestMenuTitle;

    @FindBy(css = "#essentials-walk > li:nth-child(1) > a")
    WebElement WalkMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WalkMenuTitle;

    @FindBy(css = "#puppychecklist > li > a")
    WebElement PuppyCheckList;

    @FindBy(id = "s-bc1b1ca1-f502-466b-addf-1d06d58082c2")
    WebElement PuppyCheckListSection;

    @FindBy(css = "#essentials-eat-drink > li:nth-child(2) > a")
    WebElement Treats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TreatsTitle;

    @FindBy(css = "#essentials-eat-drink > li:nth-child(3) > a")
    WebElement DogFood;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement DogFoodTitle;

    @FindBy(css = "#essentials-eat-drink > li:nth-child(4) > a")
    WebElement DogBowls;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogBowlsTitle;

    @FindBy(css = "#essentials-eat-drink > li:nth-child(5) > a")
    WebElement DogBowlsPlaceMats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogBowlsPlaceMatsTittle;

    @FindBy(css = "#essentials-play > li:nth-child(2) > a")
    WebElement PlushToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PlushToysTitle;

    @FindBy(css = "#essentials-play > li:nth-child(3) > a")
    WebElement FetchToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement FetchToysTitle;

    @FindBy(css = "#essentials-play > li:nth-child(4) > a")
    WebElement TugToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TugToysTitle;

    @FindBy(css = "#essentials-play > li:nth-child(5) > a")
    WebElement TeethingToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TeethingToysTitle;

    @FindBy(css = "#essentials-play > li:nth-child(6) > a")
    WebElement InteractiveToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement InteractiveToysTtile;

    @FindBy(css = "#essentials-play > li:nth-child(7) > a")
    WebElement DogGiftPacks;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogGiftPacksTitle;

    @FindBy(css = "#essentials-play > li:nth-child(7) > a")
    WebElement Beds;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BedsTitle;

    @FindBy(css = "#essentials-play > li:nth-child(7) > a")
    WebElement Crates;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CratesTitle;

    @FindBy(css = "#essentials-play > li:nth-child(7) > a")
    WebElement CrateMats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CrateMatsTitle;

    @FindBy(css = "#essentials-walk > li:nth-child(2) > a")
    WebElement Collars;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CollarsTitle;

    @FindBy(css = "#essentials-walk > li:nth-child(2) > a")
    WebElement Leashes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement LeashesTitle;

    @FindBy(css = "#essentials-walk > li:nth-child(2) > a")
    WebElement Harnesses;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HarnessesTitle;

    @FindBy(css = "#essentials-walk > li:nth-child(2) > a")
    WebElement BreedCLS;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BreedCLSTitle;


    //------------------------//

    WebDriver driver;

    // Constructor
    public ShopEssentials (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickEssentialsMenu() {

        this.EssentialsMenu.isDisplayed();
        this.EssentialsMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogEssentialsTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(EssentialsSideNav));

    }

    public void clickSideMenu() {

        this.EssentialsMenu.isDisplayed();
        this.EssentialsMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogEssentialsTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(EssentialsSideNav));
        wait.until(ExpectedConditions.elementToBeClickable(SideMenuFetchToys));
        this.SideMenuFetchToys.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/collections/essentials-play-tough-toys"));

    }

    public void clickEatDrinkMenu()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.EatDrinkMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(EatDrinkMenuTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickPlayMenu()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.PlayMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PlayMenuTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickRestMenu()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.RestMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RestMenuTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickWalkMenu()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.WalkMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(WalkMenuTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickPuppyChekList()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.PuppyCheckList.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PuppyCheckListSection));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickTreats()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.Treats.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TreatsTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickDogFood() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.DogFood.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogFoodTitle));

    }

    public void clickDogBowls() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.DogBowls.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogBowlsTitle));

    }

    public void clickDogBowlsPlaceMats() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.DogBowlsPlaceMats.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogBowlsPlaceMatsTittle));

    }

    public void clickPlushToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.PlushToys.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PlushToysTitle));

    }

    public void clickFetchToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.FetchToys.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(FetchToysTitle));

    }

    public void clickTugToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.TugToys.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TugToysTitle));

    }

    public void clickTeethingToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.TeethingToys.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TeethingToysTitle));

    }

    public void clickInteractiveToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.InteractiveToys.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(InteractiveToysTtile));

    }

    public void clickDogGiftPaks() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.DogGiftPacks.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogGiftPacksTitle));

    }

    public void clickBeds() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.Beds.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BedsTitle));

    }

    public void clickCrates() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.Crates.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CratesTitle));

    }

    public void clickCrateMats() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.CrateMats.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CrateMatsTitle));

    }

    public void clickCollars() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.Collars.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CollarsTitle));

    }

    public void clickLeashes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.Leashes.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(LeashesTitle));

    }

    public void clickHarnesses() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.Harnesses.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(HarnessesTitle));

    }

    public void clickBreedCLS() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-essentials-supplies > a"));
        builder.moveToElement(element).build().perform();
        this.BreedCLS.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreedCLSTitle));

    }


}
