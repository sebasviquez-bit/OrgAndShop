package ShopPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopByBreed {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(5)")
    WebElement ShopByBreed;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > a")
    WebElement ShopByBreedTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(5) > a")
    WebElement dogBreedAlaskan;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(78) > a")
    WebElement dogBreedFrenchBull;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(188) > a")
    WebElement dogBreedYorkshireTerrier;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > a")
    WebElement ChooseABreedDropdown;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > div > ul > li:nth-child(5)")
    WebElement DropdownAkita;

    @FindBy(css = "#main-content > div > h1")
    WebElement AkitaProductPageTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > div > ul > li")
    WebElement DropdownGoldenRetriever;

    @FindBy(css = "#the-chosen-input-hack-2")
    WebElement InputCase;

    @FindBy(css = "#main-content > div > h1")
    WebElement RetrieverProductPageTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > div > ul > li")
    WebElement DropdownYorkShire;

    @FindBy(css = "#main-content > div > h1")
    WebElement YorkShireProductPageTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(17) > a > img")
    WebElement BeaglePicture;

    @FindBy(css = "#main-content > div > h1")
    WebElement BeagleProductPageTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(43) > a > img")
    WebElement BulldogPicture;

    @FindBy(css = "#main-content > div > h1")
    WebElement BulldogProductPageTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(130) > a > img")
    WebElement PapillonPicture;

    @FindBy(css = "#main-content > div > h1")
    WebElement PapillonProductPageTitle;

    //

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
    public ShopByBreed(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickShopByBreedMenu()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ShopByBreedTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(dogBreedAlaskan));
        wait.until(ExpectedConditions.visibilityOf(dogBreedFrenchBull));
        wait.until(ExpectedConditions.visibilityOf(dogBreedYorkshireTerrier));

    }

    public void ChooseABreedDropdown()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseABreedDropdown));
        this.ChooseABreedDropdown.click();
        this.DropdownAkita.click();
        wait.until(ExpectedConditions.visibilityOf(AkitaProductPageTitle));

    }

    public void ChooseABreedDropdown2()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseABreedDropdown));
        this.ChooseABreedDropdown.click();
        this.InputCase.sendKeys("Golden");
        this.DropdownGoldenRetriever.click();
        wait.until(ExpectedConditions.visibilityOf(RetrieverProductPageTitle));

    }

    public void ChooseABreedDropdown3()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseABreedDropdown));
        this.ChooseABreedDropdown.click();
        this.InputCase.sendKeys("YorkShire");
        this.DropdownYorkShire.click();
        wait.until(ExpectedConditions.visibilityOf(YorkShireProductPageTitle));

    }

    public void ChooseABreedBeagle()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseABreedDropdown));
        this.BeaglePicture.click();
        wait.until(ExpectedConditions.visibilityOf(BeagleProductPageTitle));

    }

    public void ChooseABreedBulldog()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseABreedDropdown));
        this.BulldogPicture.click();
        wait.until(ExpectedConditions.visibilityOf(BulldogProductPageTitle));

    }

    public void ChooseABreedPapillon()  {

        this.ShopByBreed.isDisplayed();
        this.ShopByBreed.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ChooseABreedDropdown));
        this.PapillonPicture.click();
        wait.until(ExpectedConditions.visibilityOf(PapillonProductPageTitle));

    }
    

}
