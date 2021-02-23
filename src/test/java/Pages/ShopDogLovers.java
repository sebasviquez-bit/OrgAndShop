package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopDogLovers {

    @FindBy(css = "#menu-bar > ul > li.dog-lovers > a")
    WebElement dogLoversMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement dogLoversMenuTitle;

    @FindBy(css = "#dog-lovers-side-nav")
    WebElement dogLoversSideNav;

    @FindBy(css = "#dog-lovers-human-apparel > li:nth-child(1) > a")
    WebElement HumanApparel;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HumanApparelTitle;

    @FindBy(css = "#dog-lovers-human-apparel > li:nth-child(2) > a")
    WebElement GraphicApparel;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GraphicApparelTitle;

    @FindBy(css = "#dog-lovers-human-apparel > li:nth-child(3) > a")
    WebElement BreedEmbroidery;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BreedEmbroideryTitle;

    @FindBy(css = "#dog-lovers-human-apparel > li:nth-child(4) > a")
    WebElement Scarves;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ScarvesTitle;

    @FindBy(css = "#dog-lovers-human-apparel > li:nth-child(5) > a")
    WebElement Hats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HatsTitle;

    @FindBy(css = "#dog-lovers-human-apparel > li:nth-child(6) > a")
    WebElement Pajamas;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PajamasTtile;

    @FindBy(css = "#human-apparel > li:nth-child(7) > a")
    WebElement Robes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement RobesTitle;

    @FindBy(css = "#jewelry > li:nth-child(1) > a")
    WebElement Jewelry;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement JewelryTitle;

    @FindBy(css = "#jewelry > li:nth-child(2) > a")
    WebElement Pins;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PinsTitle;

    @FindBy(css = "#jewelry > li:nth-child(3) > a")
    WebElement Rigns;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement RingsTtile;

    @FindBy(css = "#jewelry > li:nth-child(4) > a")
    WebElement Earings;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement EaringsTitle;

    @FindBy(css = "#jewelry > li:nth-child(5) > a")
    WebElement Bracelets;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BraceletsTitle;

    @FindBy(css = "#jewelry > li:nth-child(6) > a")
    WebElement JewelryChains;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement JewelryChainsTitle;

    @FindBy(css = "#jewelry > li:nth-child(7) > a")
    WebElement CharmsPendants;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CharmsPendantsTitle;

    @FindBy(css = "#jewelry > li:nth-child(8) > a")
    WebElement FineJewelry;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement FineJewelryTitle;

    @FindBy(css = "#jewelry > li:nth-child(9) > a")
    WebElement Sportjewlery;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SportjewleryTitle;

    @FindBy(css = "#jewelry > li:nth-child(10) > a")
    WebElement OvalBreedPendants;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement OvalBreedPendantsTitle;

    @FindBy(css = "#dog-lovers-tote-bags > li:nth-child(1) > a")
    WebElement ToteBags;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ToteBagsTitle;

    @FindBy(css = "#dog-lovers-tote-bags > li:nth-child(2) > a")
    WebElement DuffelBags;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DuffelBagsTitle;

    @FindBy(css = "#dog-lovers-tote-bags > li:nth-child(3) > a")
    WebElement PrintToteBags;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PrintToteBagsTitle;

    @FindBy(css = "#dog-lovers-tote-bags > li:nth-child(4) > a")
    WebElement HandPaintTotes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HandPaintTotesTitle;

    @FindBy(css = "#dog-lovers-tote-bags > li:nth-child(5) > a")
    WebElement EmbroToteBags;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement EmbroToteBagsTitle;

    @FindBy(css = "#tote-bags > li:nth-child(6) > a")
    WebElement WineTotes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WineTotesTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(1) > a")
    WebElement kitchen;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement kitchenTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(2) > a")
    WebElement CoffeMugs;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CoffeMugsTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(3) > a")
    WebElement TravelMugs;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TravelMugsTitle;

    @FindBy(css = "#kitchen > li:nth-child(4) > a")
    WebElement Tumblers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TumblersTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(4) > a")
    WebElement WineGlasses;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WineGlassesTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(5) > a")
    WebElement Aprons;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ApronsTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(6) > a")
    WebElement OvenPot;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement OvenPotTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(7) > a")
    WebElement CuttingBoards;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CuttingBoardsTitle;

    @FindBy(css = "#dog-lovers-kitchen > li:nth-child(8) > a")
    WebElement DrinkAccesories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DrinkAccesoriesTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(1) > a")
    WebElement Home;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HomeTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(2) > a")
    WebElement Decorative;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DecorativeTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(3) > a")
    WebElement CardHolders;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CardHoldersTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(4) > a")
    WebElement CustomPetsArt;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CustomPetsArtTitle;

    @FindBy(css = "#home > li:nth-child(5) > a")
    WebElement Coasters;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CoastersTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(5) > a")
    WebElement TeaTowels;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TeaTowelsTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(6) > a")
    WebElement Blankets;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BlanketsTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(7) > a")
    WebElement Pillows;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PillowsTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(8) > a")
    WebElement HolyDecor;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HolyDecorTitle;

    @FindBy(css = "#dog-lovers-breed-merchandise-home > li:nth-child(9) > a")
    WebElement OutdoorAcces;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement OutdoorAccesTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(1) > a")
    WebElement TravelAcces;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TravelAccesTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(4) > a")
    WebElement KeyRings;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement KeyRingsTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(4) > a")
    WebElement PhoneCases;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PhoneCasesTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(4) > a")
    WebElement LuggageTags;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement LuggageTagsTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(5) > a")
    WebElement Stationary;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement StationaryTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(6) > a")
    WebElement Umbrellas;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement UmbrellasTitle;

    @FindBy(css = "#dog-lovers-travel-accessories > li:nth-child(7) > a")
    WebElement SportsChairs;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SportsChairsTitle;

    //------------------------//

    WebDriver driver;

    // Constructor
    public ShopDogLovers (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickDogLoversMenu()  {

        this.dogLoversMenu.isDisplayed();
        this.dogLoversMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dogLoversMenuTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(dogLoversSideNav));

    }

    public void clickHumanApparel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.HumanApparel.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(HumanApparelTitle));

    }

    public void clickGraphicApparel() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.GraphicApparel.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GraphicApparelTitle));

    }

    public void clickBreedEmbroidery() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.BreedEmbroidery.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreedEmbroideryTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void clickScarves() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Scarves.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ScarvesTitle));

    }

    public void clickHats() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Hats.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(HatsTitle));

    }

    public void clickPajamas() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Pajamas.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PajamasTtile));

    }

    public void clickRobes() {

        this.dogLoversMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RobesTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.Robes.click();
        wait.until(ExpectedConditions.visibilityOf(RobesTitle));

    }

    public void clickJewelry() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Jewelry.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(JewelryTitle));

    }

    public void clickPins() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Pins.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PinsTitle));

    }

    public void clickRings() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Rigns.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RingsTtile));

    }

    public void clickEarigns() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Earings.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(EaringsTitle));

    }

    public void clickBracelets() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Bracelets.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BraceletsTitle));

    }

    public void clickJewelryChains() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.JewelryChains.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(JewelryChainsTitle));

    }

    public void clickCharmsPendants() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.CharmsPendants.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CharmsPendantsTitle));

    }

    public void clickFineJewelry() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.FineJewelry.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(FineJewelryTitle));

    }

    public void clickSportJewlery() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Sportjewlery.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SportjewleryTitle));

    }

    public void clickOvalBreedPendants() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.OvalBreedPendants.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(OvalBreedPendantsTitle));

    }

    public void clickToteBags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.ToteBags.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ToteBagsTitle));

    }

    public void clickDuffelBags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.DuffelBags.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DuffelBagsTitle));

    }

    public void clickPrintToteBags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.PrintToteBags.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PrintToteBagsTitle));

    }

    public void clickHandPaintTotes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.HandPaintTotes.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(HandPaintTotesTitle));

    }

    public void clickEmbroToteBags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.EmbroToteBags.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(EmbroToteBagsTitle));

    }

    public void clickWineTotes() {

        this.dogLoversMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(WineTotes));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.WineTotes.click();
        wait.until(ExpectedConditions.visibilityOf(WineTotesTitle));

    }

    public void clickKitchen() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.kitchen.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(kitchenTitle));

    }

    public void clickCoffeMugs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.CoffeMugs.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CoffeMugsTitle));

    }

    public void clickTravelMugs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.TravelMugs.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TravelMugsTitle));

    }

    public void clickTumblers() {

        this.dogLoversMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(Tumblers));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.Tumblers.click();
        wait.until(ExpectedConditions.visibilityOf(TumblersTitle));

    }

    public void clickWineGlasses() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.WineGlasses.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(WineGlassesTitle));

    }

    public void clickAprons() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Aprons.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ApronsTitle));

    }

    public void clickOvenPot() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.OvenPot.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(OvenPotTitle));

    }

    public void clickCuttingBoards() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.CuttingBoards.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CuttingBoardsTitle));

    }

    public void clickDrinkAccesories() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.DrinkAccesories.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DrinkAccesoriesTitle));

    }

    public void clickHome() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Home.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(HomeTitle));

    }

    public void clickDecorative() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Decorative.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DecorativeTitle));

    }

    public void clickCardHolders() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.CardHolders.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CardHoldersTitle));

    }

    public void clickCustomPetArt() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.CustomPetsArt.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CustomPetsArtTitle));

    }

    public void clickCoasters() {

        this.dogLoversMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Coasters));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.Coasters.click();
        wait.until(ExpectedConditions.visibilityOf(CoastersTitle));

    }

    public void clickTeaTowels() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.TeaTowels.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TeaTowelsTitle));

    }

    public void clickBlankets() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Blankets.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BlanketsTitle));

    }

    public void clickPillows() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Pillows.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PillowsTitle));

    }

    public void clickHolyDecor() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.HolyDecor.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(HolyDecorTitle));

    }

    public void clickOutdoorAcces() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.OutdoorAcces.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(OutdoorAccesTitle));

    }

    public void clickTravelAcces() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.TravelAcces.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TravelAccesTitle));

    }

    public void clickKeyRings() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.KeyRings.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(KeyRingsTitle));

    }

    public void clickPhoneCases() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.PhoneCases.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PhoneCasesTitle));

    }

    public void clickLuggageTags() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.LuggageTags.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(LuggageTagsTitle));

    }

    public void clickStationary() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Stationary.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(StationaryTitle));

    }

    public void clickUmbrellas() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.Umbrellas.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(UmbrellasTitle));

    }

    public void clickSportsChairs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.dog-lovers > a"));
        builder.moveToElement(element).build().perform();
        this.SportsChairs.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SportsChairsTitle));

    }

}
