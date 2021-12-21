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
        this.BreedEmbrodeiryAccesGear.click();
        wait.until(ExpectedConditions.visibilityOf(BreedEmbrodeiryAccesGearTitle));

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
