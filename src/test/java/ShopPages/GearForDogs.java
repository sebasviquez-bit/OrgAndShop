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

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(1) > a")
    WebElement GiftBoxes;

    @FindBy(css = "#main-content > div > h1")
    WebElement GiftBoxesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(2) > a")
    WebElement ToysPay;

    @FindBy(css = "#main-content > div > h1")
    WebElement ToysPayTitleTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement PlushTugFetch;

    @FindBy(css = "#main-content > div > h1")
    WebElement PlushTugFetchTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement TeethingToys;

    @FindBy(css = "#main-content > div > h1")
    WebElement TeethingToysTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement InteractiveToys;

    @FindBy(css = "#main-content > div > h1")
    WebElement InteractiveToysTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(3) > a")
    WebElement CollarsLeashes;

    @FindBy(css = "#main-content > div > h1")
    WebElement CollarsLeashesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement Collars;

    @FindBy(css = "#main-content > div > h1")
    WebElement CollarsTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement Leashes;

    @FindBy(css = "#main-content > div > h1")
    WebElement LeashesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(3) > ul > li:nth-child(3) > a")
    WebElement Harnesses;

    @FindBy(css = "#main-content > div > h1")
    WebElement HarnessesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(4) > a")
    WebElement CarTravel;

    @FindBy(css = "#main-content > div > h1")
    WebElement CarTravelTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(4) > ul > li:nth-child(1) > a")
    WebElement Car;

    @FindBy(css = "#main-content > div > h1")
    WebElement CarTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(4) > ul > li:nth-child(2) > a")
    WebElement Travel;

    @FindBy(css = "#main-content > div > h1")
    WebElement TravelTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(4) > ul > li:nth-child(3) > a")
    WebElement OutdoorAdventure;

    @FindBy(css = "#main-content > div > h1")
    WebElement OutdoorAdventureTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(5) > a")
    WebElement ClothingAccessories;

    @FindBy(css = "#main-content > div > h1")
    WebElement ClothingAccessoriesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(5) > ul > li:nth-child(1) > a")
    WebElement Accessories;

    @FindBy(css = "#main-content > div > h1")
    WebElement AccessoriesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(5) > ul > li:nth-child(2) > a")
    WebElement Jackets;

    @FindBy(css = "#main-content > div > h1")
    WebElement JacketsTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(5) > ul > li:nth-child(3) > a")
    WebElement SweatersShirts;

    @FindBy(css = "#main-content > div > h1")
    WebElement SweatersShirtsTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(6) > a")
    WebElement GroomingWellness;

    @FindBy(css = "#main-content > div > h1")
    WebElement GroomingWellnessTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(6) > ul > li:nth-child(1) > a")
    WebElement Grooming;

    @FindBy(css = "#main-content > div > h1")
    WebElement GroomingTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(6) > ul > li:nth-child(2) > a")
    WebElement Wellness;

    @FindBy(css = "#main-content > div > h1")
    WebElement WellnessTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(6) > ul > li:nth-child(3) > a")
    WebElement AKCVetline;

    @FindBy(css = "#ProductPrice")
    WebElement AKCVetlinePricing;

    @FindBy(css = "#outlink_button1644803358814")
    WebElement AKCVetlineViewNowButton;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(7) > a")
    WebElement TrainingSupplies;

    @FindBy(css = "#main-content > div > h1")
    WebElement TrainingSuppliesTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(7) > ul > li:nth-child(1) > a")
    WebElement PuppyTraining;

    @FindBy(css = "#main-content > div > h1")
    WebElement PuppyTrainingTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(7) > ul > li:nth-child(2) > a")
    WebElement TrainingEssentials;

    @FindBy(css = "#main-content > div > h1")
    WebElement TrainingEssentialsTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(7) > ul > li:nth-child(3) > a")
    WebElement SportsAgilityTraining;

    @FindBy(css = "#main-content > div > h1")
    WebElement SportsAgilityTrainingTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(7) > ul > li:nth-child(4) > a")
    WebElement DogTreats;

    @FindBy(css = "#main-content > div > h1")
    WebElement DogTreatsTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(7) > ul > li:nth-child(5) > a")
    WebElement GoodDogHelpLine;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(8) > a")
    WebElement PetTech;

    @FindBy(css = "#main-content > div > h1")
    WebElement PetTechTitle;

    @FindBy(css = "#main-menu-gear-for-dogs > div:nth-child(9) > a")
    WebElement DogFood;

    @FindBy(css = "#main-content > div > h1")
    WebElement DogFoodTitle;

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

    public void clickGiftBoxes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(GiftBoxes));
        this.GiftBoxes.click();
        wait.until(ExpectedConditions.visibilityOf(GiftBoxesTitle));

    }

    public void clickToysPay() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ToysPay));
        this.ToysPay.click();
        wait.until(ExpectedConditions.visibilityOf(ToysPayTitleTitle));

    }
    //

    public void clickPlushTugFetch() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(PlushTugFetch));
        this.PlushTugFetch.click();
        wait.until(ExpectedConditions.visibilityOf(PlushTugFetchTitle));

    }

    public void clickTeethingToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(TeethingToys));
        this.TeethingToys.click();
        wait.until(ExpectedConditions.visibilityOf(TeethingToysTitle));

    }

    public void clickInteractiveToys() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(InteractiveToys));
        this.InteractiveToys.click();
        wait.until(ExpectedConditions.visibilityOf(InteractiveToysTitle));

    }

    public void clickCollarsLeashes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(CollarsLeashes));
        this.CollarsLeashes.click();
        wait.until(ExpectedConditions.visibilityOf(CollarsLeashesTitle));

    }

    public void clickCollars() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Collars));
        this.Collars.click();
        wait.until(ExpectedConditions.visibilityOf(CollarsTitle));

    }

    public void clickLeashes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Leashes));
        this.Leashes.click();
        wait.until(ExpectedConditions.visibilityOf(LeashesTitle));

    }

    public void clickHarnesses() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Harnesses));
        this.Harnesses.click();
        wait.until(ExpectedConditions.visibilityOf(HarnessesTitle));

    }

    public void clickCarTravel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(CarTravel));
        this.CarTravel.click();
        wait.until(ExpectedConditions.visibilityOf(CarTravelTitle));

    }

    public void clickCar() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Car));
        this.Car.click();
        wait.until(ExpectedConditions.visibilityOf(CarTitle));

    }

    public void clickTravel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Travel));
        this.Travel.click();
        wait.until(ExpectedConditions.visibilityOf(TravelTitle));

    }

    public void clickOutdoorAdventure() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(OutdoorAdventure));
        this.OutdoorAdventure.click();
        wait.until(ExpectedConditions.visibilityOf(OutdoorAdventureTitle));

    }

    public void ClothingAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ClothingAccessories));
        this.ClothingAccessories.click();
        wait.until(ExpectedConditions.visibilityOf(ClothingAccessoriesTitle));

    }

    public void ClickAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Accessories));
        this.Accessories.click();
        wait.until(ExpectedConditions.visibilityOf(AccessoriesTitle));

    }

    public void ClickJackets() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Jackets));
        this.Jackets.click();
        wait.until(ExpectedConditions.visibilityOf(JacketsTitle));

    }

    public void ClickSweatersShirts() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(SweatersShirts));
        this.SweatersShirts.click();
        wait.until(ExpectedConditions.visibilityOf(SweatersShirtsTitle));

    }

    public void ClickGroomingWellness() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(GroomingWellness));
        this.GroomingWellness.click();
        wait.until(ExpectedConditions.visibilityOf(GroomingWellnessTitle));

    }

    public void ClickGrooming() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Grooming));
        this.Grooming.click();
        wait.until(ExpectedConditions.visibilityOf(GroomingTitle));

    }

    public void ClickWellness() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Wellness));
        this.Wellness.click();
        wait.until(ExpectedConditions.visibilityOf(WellnessTitle));

    }

    public void ClickAKCVetline() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(AKCVetline));
        this.AKCVetline.click();
        wait.until(ExpectedConditions.visibilityOf(AKCVetlinePricing));
        wait.until(ExpectedConditions.visibilityOf(AKCVetlineViewNowButton));

    }

    public void ClickTrainingSupplies() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(TrainingSupplies));
        this.TrainingSupplies.click();
        wait.until(ExpectedConditions.visibilityOf(TrainingSuppliesTitle));

    }

    public void ClickPuppyTraining() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(PuppyTraining));
        this.PuppyTraining.click();
        wait.until(ExpectedConditions.visibilityOf(PuppyTrainingTitle));

    }

    public void ClickTrainingEssentials() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(TrainingEssentials));
        this.TrainingEssentials.click();
        wait.until(ExpectedConditions.visibilityOf(TrainingEssentialsTitle));

    }

    public void ClickSportsAgilityTraining() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(SportsAgilityTraining));
        this.SportsAgilityTraining.click();
        wait.until(ExpectedConditions.visibilityOf(SportsAgilityTrainingTitle));

    }

    public void ClickDogTreats() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(DogTreats));
        this.DogTreats.click();
        wait.until(ExpectedConditions.visibilityOf(DogTreatsTitle));

    }

    public void ClickGoodDogHelpLine() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(GoodDogHelpLine));
        this.GoodDogHelpLine.click();
        wait.until(ExpectedConditions.urlContains("/akc-gooddog-helpline/"));

    }

    public void ClickPetTech() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(PetTech));
        this.PetTech.click();
        wait.until(ExpectedConditions.visibilityOf(PetTechTitle));

    }

    public void ClickDogFood() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(2)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(DogFood));
        this.DogFood.click();
        wait.until(ExpectedConditions.visibilityOf(DogFoodTitle));

    }



}
