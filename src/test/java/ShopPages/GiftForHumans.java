package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftForHumans {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(1)")
    WebElement GiftForHumansMenu;

    @FindBy(css = "#main-content > div > h1")
    WebElement GiftForHumansTitle;

    @FindBy(css = "#isp_left_container_facets > div")
    WebElement GiftForHumansSideNav;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a > img")
    WebElement GiftForHumansProduct;

    @FindBy(css = "#isp_sorting_drop_container > a")
    WebElement GiftForHumansSortBy;

    @FindBy(css = "#tag_filter_0\\.937_Affenpinscher > div.isp_facet_check_box_icon.isp_facet_check_box_icon_not_checked")
    WebElement SideMenu_Affenpinscher;

    @FindBy(css = "#isp_search_results_container > li:nth-child(3) > div.isp_product_info > a > div")
    WebElement AffenpinscherProduct;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > a")
    WebElement Jewelry;

    @FindBy(css = "#main-content > div > h1")
    WebElement JewelryTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement Bracelets;

    @FindBy(css = "#main-content > div > h1")
    WebElement BraceletsTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement CharmsPedants;

    @FindBy(css = "#main-content > div > h1")
    WebElement CharmsPedantsTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement Earings;

    @FindBy(css = "#main-content > div > div.breadcrumbs > span:nth-child(3)")
    WebElement EaringsBreadcrumbs;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement Rings;

    @FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[3]/div[3]/div[6]/ul[1]/li[2]")
    WebElement RingsProduct;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement JewelryChains;

    @FindBy(css = "#Type_Chain > div.isp_facet_check_box_icon.isp_facet_check_box_icon_not_checked")
    WebElement SideMenuChainCheckBox;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement SportingJewelry;

    @FindBy(css = "#isp_custom_price_min")
    WebElement PriceFilter; //Filter price box(minimum price)

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(1) > ul > li:nth-child(7) > a")
    WebElement MemorialJewelry;

    @FindBy(css = "#tag_filter_0\\.937_Akita > div.isp_facet_value_name > span.isp_facet_value_name_not_selected")
    WebElement MemorialJewelryAkitaCheckBox;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(2) > a")
    WebElement BreedEmbrodeiry;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1)")
    WebElement BreedEmbrodeiryProduct;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement BreedEmbrodeiryApparel;

    @FindBy(css = "#main-content > div > h1")
    WebElement BreedEmbrodeiryApparelTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement BreedEmbrodeiryAccesGear;

    @FindBy(css = "#main-content > div > h1")
    WebElement BreedEmbrodeiryAccesGearTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(3) > a")
    WebElement ClothingAccessories;

    @FindBy(css = "#main-content > div > h1")
    WebElement ClothingAccessoriesTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(3) > ul > li:nth-child(1) > a")
    WebElement Apparel;

    @FindBy(css = "#main-content > div > h1")
    WebElement ApparelTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(3) > ul > li:nth-child(2) > a")
    WebElement OuterWear;

    @FindBy(css = "#main-content > div > h1")
    WebElement OuterWearTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(3) > ul > li:nth-child(3) > a")
    WebElement LoungeWear;

    @FindBy(css = "#main-content > div > h1")
    WebElement LoungeWearTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(3) > ul > li:nth-child(4) > a")
    WebElement Hats;

    @FindBy(css = "#main-content > div > h1")
    WebElement HatsTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(3) > ul > li:nth-child(5) > a")
    WebElement TechAccessories;

    @FindBy(css = "#main-content > div > h1")
    WebElement TechAccessoriesTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(4) > a")
    WebElement TotesBags;

    @FindBy(css = "#main-content > div > h1")
    WebElement TotesBagsTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(4) > ul > li:nth-child(1) > a")
    WebElement DuffleBags;

    @FindBy(css = "#main-content > div > h1")
    WebElement DuffleBagsTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(4) > ul > li:nth-child(2) > a")
    WebElement PrintedTotes;

    @FindBy(css = "#main-content > div > h1")
    WebElement PrintedTotesTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(4) > ul > li:nth-child(3) > a")
    WebElement CustomEmbroTotes;

    @FindBy(css = "#main-content > div > h1")
    WebElement CustomEmbroTotesTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(4) > ul > li:nth-child(4) > a")
    WebElement LunchTotes;

    @FindBy(css = "#main-content > div > h1")
    WebElement LunchTotesTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > a")
    WebElement HomeKitchen;

    @FindBy(css = "#main-content > div > h1")
    WebElement HomeKitchenTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > ul > li:nth-child(1) > a")
    WebElement EveryDayHome;

    @FindBy(css = "#main-content > div > h1")
    WebElement EveryDayHomeTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > ul > li:nth-child(2) > a")
    WebElement HolidayDecor;

    @FindBy(css = "#main-content > div > h1")
    WebElement HolidayDecorTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > ul > li:nth-child(3) > a")
    WebElement ArtWork;

    @FindBy(css = "#main-content > div > h1")
    WebElement ArtWorkTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > ul > li:nth-child(4) > a")
    WebElement BlanketsThrows;

    @FindBy(css = "#main-content > div > h1")
    WebElement BlanketsThrowsTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > ul > li:nth-child(5) > a")
    WebElement Drinkware;

    @FindBy(css = "#main-content > div > h1")
    WebElement DrinkwareTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(5) > ul > li:nth-child(6) > a")
    WebElement KitchenAccessories;

    @FindBy(css = "#main-content > div > h1")
    WebElement KitchenAccessoriesTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(6) > a")
    WebElement RemembranceMemorial;

    @FindBy(css = "#main-content > div > h1")
    WebElement RemembranceMemorialTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(6) > ul > li:nth-child(1) > a")
    WebElement RemebranceMemorialJewelry;

    @FindBy(css = "#main-content > div > h1")
    WebElement RemembranceMemorialJewelryTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(6) > ul > li:nth-child(2) > a")
    WebElement SomewhereOverThe;

    @FindBy(css = "#main-content > div > h1")
    WebElement SomewhereOverTheTitle;

    @FindBy(css = "#main-menu-gifts-for-humans > div:nth-child(6) > ul > li:nth-child(3) > a")
    WebElement MemoryBoxesUrns;

    @FindBy(css = "#main-content > div > h1")
    WebElement MemoryBoxesUrnsTitle;



    //------------------------//

    WebDriver driver;

    // Constructor
    public GiftForHumans(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickGiftForHumansMenu() {

        this.GiftForHumansMenu.isDisplayed();
        this.GiftForHumansMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GiftForHumansTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(GiftForHumansSideNav));
        wait.until(ExpectedConditions.visibilityOf(GiftForHumansProduct));
        wait.until(ExpectedConditions.visibilityOf(GiftForHumansSortBy));

    }

    public void clickSideMenu() {

        this.GiftForHumansMenu.isDisplayed();
        this.GiftForHumansMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.elementToBeClickable(SideMenu_Affenpinscher));
        this.SideMenu_Affenpinscher.click();
        wait.until(ExpectedConditions.visibilityOf(AffenpinscherProduct));

    }

    public void clickJewelryMenu()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.Jewelry.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(JewelryTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickBraceletsMenu()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.Bracelets.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(BraceletsTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickharmsPedants()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.CharmsPedants.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CharmsPedantsTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickEarings()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.Earings.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(EaringsBreadcrumbs));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickRigns()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.Rings.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RingsProduct));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickJewelryChain()  {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.JewelryChains.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SideMenuChainCheckBox));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void SportingJewelry() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.SportingJewelry.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PriceFilter));

    }

    public void clickMemorialJewelry() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOf(MemorialJewelry));
        this.MemorialJewelry.click();
        wait.until(ExpectedConditions.visibilityOf(MemorialJewelryAkitaCheckBox));

    }

    public void clickBreedEmbrodeiry() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        this.BreedEmbrodeiry.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreedEmbrodeiryProduct));

    }

    public void clickBreedEmbrodeiryApparel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(BreedEmbrodeiryApparel));
        this.BreedEmbrodeiryApparel.click();
        wait.until(ExpectedConditions.visibilityOf(BreedEmbrodeiryApparelTitle));

    }

    public void clickBreedEmbrodeiryAccesGear() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(BreedEmbrodeiryAccesGear));
        this.BreedEmbrodeiryAccesGear.click();
        wait.until(ExpectedConditions.visibilityOf(BreedEmbrodeiryAccesGearTitle));

    }

    public void clickClothingAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(ClothingAccessories));
        this.ClothingAccessories.click();
        wait.until(ExpectedConditions.visibilityOf(ClothingAccessoriesTitle));

    }

    public void clickApparel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(Apparel));
        this.Apparel.click();
        wait.until(ExpectedConditions.visibilityOf(ApparelTitle));

    }

    public void clickOuterWear() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(OuterWear));
        this.OuterWear.click();
        wait.until(ExpectedConditions.visibilityOf(OuterWearTitle));

    }

    public void clickLoungeWear() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(LoungeWear));
        this.LoungeWear.click();
        wait.until(ExpectedConditions.visibilityOf(LoungeWearTitle));

    }

    public void clickHats() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(Hats));
        this.Hats.click();
        wait.until(ExpectedConditions.visibilityOf(HatsTitle));

    }

    public void clickTechAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(TechAccessories));
        this.TechAccessories.click();
        wait.until(ExpectedConditions.visibilityOf(TechAccessoriesTitle));

    }

    public void clickTotesBags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(TotesBags));
        this.TotesBags.click();
        wait.until(ExpectedConditions.visibilityOf(TotesBagsTitle));

    }

    public void clickDuffleBags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(DuffleBags));
        this.DuffleBags.click();
        wait.until(ExpectedConditions.visibilityOf(DuffleBagsTitle));

    }

    public void clickPrintedTotes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(DuffleBags));
        this.PrintedTotes.click();
        wait.until(ExpectedConditions.visibilityOf(PrintedTotesTitle));

    }

    public void clickCustomEmbroTotes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(CustomEmbroTotes));
        this.CustomEmbroTotes.click();
        wait.until(ExpectedConditions.visibilityOf(CustomEmbroTotesTitle));

    }

    public void clickLunchTotes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(CustomEmbroTotes));
        this.LunchTotes.click();
        wait.until(ExpectedConditions.visibilityOf(LunchTotesTitle));

    }

    public void clickHomeKitchen() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(HomeKitchen));
        this.HomeKitchen.click();
        wait.until(ExpectedConditions.visibilityOf(HomeKitchenTitle));

    }

    public void clickEveryDayHome() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(EveryDayHome));
        this.EveryDayHome.click();
        wait.until(ExpectedConditions.visibilityOf(EveryDayHomeTitle));

    }

    public void clickHolidayDecor() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(HolidayDecor));
        this.HolidayDecor.click();
        wait.until(ExpectedConditions.visibilityOf(HolidayDecorTitle));

    }

    public void clickArtWork() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(ArtWork));
        this.ArtWork.click();
        wait.until(ExpectedConditions.visibilityOf(ArtWorkTitle));

    }

    public void clickBlanketsThrows() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(BlanketsThrows));
        this.BlanketsThrows.click();
        wait.until(ExpectedConditions.visibilityOf(BlanketsThrowsTitle));

    }

    public void clickDrinkware() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(Drinkware));
        this.Drinkware.click();
        wait.until(ExpectedConditions.visibilityOf(DrinkwareTitle));

    }

    public void clickKitchenAccessories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(KitchenAccessories));
        this.KitchenAccessories.click();
        wait.until(ExpectedConditions.visibilityOf(KitchenAccessoriesTitle));

    }

    public void clickRemembranceMemorial() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(RemembranceMemorial));
        this.RemembranceMemorial.click();
        wait.until(ExpectedConditions.visibilityOf(RemembranceMemorialTitle));

    }

    public void clickRemebranceMemorialJewelry() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(RemebranceMemorialJewelry));
        this.RemebranceMemorialJewelry.click();
        wait.until(ExpectedConditions.visibilityOf(RemembranceMemorialJewelryTitle));

    }

    public void clickSomewhereOverThe() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(SomewhereOverThe));
        this.SomewhereOverThe.click();
        wait.until(ExpectedConditions.visibilityOf(SomewhereOverTheTitle));

    }

    public void clickMemoryBoxesUrns() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(1)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(MemoryBoxesUrns));
        this.MemoryBoxesUrns.click();
        wait.until(ExpectedConditions.visibilityOf(MemoryBoxesUrnsTitle));

    }
//

}
