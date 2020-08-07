package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class ShopHomepage {

    @FindBy(id = "promo-bar")
    WebElement TopHeaderPromoBar;

    @FindBy(css = "#akc-org")
    WebElement AKCorgLink;

    @FindBy(css = "#tb-links > ul > li:nth-child(1) > a")
    WebElement PointsProgression;

    @FindBy(css = "#tb-links > ul > li:nth-child(2) > a")
    WebElement CompetitorReports;

    @FindBy(css = "#tb-links > ul > li:nth-child(3) > a")
    WebElement BreederReports;

    @FindBy(css = "#tb-links > ul > li:nth-child(4) > a")
    WebElement Pedigrees;

    @FindBy(css = "#tb-cart > a")
    WebElement ShoppingCart;

    @FindBy(css = "#cart > div > p")
    WebElement ShoppingCartEmpty;

    @FindBy(id = "ispbxii_0")
    WebElement ShopSearch;

    @FindBy(id = "isp_main_search_box")
    WebElement SecondarySearch;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a.isp_product_image_href > img")
    WebElement ProductImageResult;

    @FindBy(css = "#ui-id-1 > li:nth-child(5)")
    WebElement ProductResultClick;

    @FindBy(css = "#homepage-banners > a.homepage-banner.active > h2 > span.cta")
    WebElement ShopNowBanner0;

    @FindBy(css = "#menu-bar > ul > li.essentials > a")
    WebElement DogBasicsMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogEssentialsTitle;

    @FindBy(css = "#menu-bar > ul > li.on-the-go > a")
    WebElement OnTheGoMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogTravelTitle;

    @FindBy(css = "#menu-bar > ul > li.grooming-wellness > a")
    WebElement GromingWellnessMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GromingWellnessTitle;

    @FindBy(css = "#menu-bar > ul > li.training > a")
    WebElement TrainingMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogTrainingTitle;

    @FindBy(css = "#menu-bar > ul > li.dog-lovers > a")
    WebElement dogLoversMenu;

    @FindBy(css = "#menu-bar > ul > li.akc-professional > a")
    WebElement AKCProMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AKCServicesTitle;

    @FindBy(css = "#menu-bar > ul > li.collections > a")
    WebElement CollectionsMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CollectionsTitle;

    @FindBy(css = "#eat-drink > li:nth-child(1) > a")
    WebElement EatDrinkMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement EatDrinkMenuTitle;

    @FindBy(css = "#play > li:nth-child(1) > a")
    WebElement PlayMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PlayMenuTitle;

    @FindBy(css = "#rest > li:nth-child(1) > a")
    WebElement RestMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement RestMenuTitle;

    @FindBy(css = "#walk > li:nth-child(1) > a")
    WebElement WalkMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WalkMenuTitle;

    @FindBy(css = "#new-puppy-checklist > li > a")
    WebElement PuppyCheckList;

    @FindBy(id = "s-bc1b1ca1-f502-466b-addf-1d06d58082c2")
    WebElement PuppyCheckListSection;

    @FindBy(css = "#eat-drink > li:nth-child(2) > a")
    WebElement Treats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TreatsTitle;

    @FindBy(css = "#eat-drink > li:nth-child(3) > a")
    WebElement DogBowls;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogBowlsTitle;

    @FindBy(css = "#eat-drink > li:nth-child(4) > a")
    WebElement DogBowlsPlaceMats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogBowlsPlaceMatsTittle;

    @FindBy(css = "#play > li:nth-child(2) > a")
    WebElement PlushToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PlushToysTitle;

    @FindBy(css = "#play > li:nth-child(3) > a")
    WebElement FetchToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement FetchToysTitle;

    @FindBy(css = "#play > li:nth-child(4) > a")
    WebElement TugToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TugToysTitle;

    @FindBy(css = "#play > li:nth-child(5) > a")
    WebElement TeethingToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TeethingToysTitle;

    @FindBy(css = "#play > li:nth-child(6) > a")
    WebElement InteractiveToys;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement InteractiveToysTtile;

    @FindBy(css = "#play > li:nth-child(7) > a")
    WebElement DogGiftPacks;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogGiftPacksTitle;

    @FindBy(css = "#rest > li:nth-child(2) > a")
    WebElement Beds;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BedsTitle;

    @FindBy(css = "#rest > li:nth-child(3) > a")
    WebElement Crates;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CratesTitle;

    @FindBy(css = "#rest > li:nth-child(4) > a")
    WebElement CrateMats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CrateMatsTitle;

    @FindBy(css = "#walk > li:nth-child(2) > a")
    WebElement Collars;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CollarsTitle;

    @FindBy(css = "#walk > li:nth-child(3) > a")
    WebElement Leashes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement LeashesTitle;

    @FindBy(css = "#walk > li:nth-child(4) > a")
    WebElement Harnesses;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement HarnessesTitle;

    @FindBy(css = "#walk > li:nth-child(5) > a")
    WebElement BreedCLS;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BreedCLSTitle;

    @FindBy(css = "#car > li:nth-child(1) > a")
    WebElement Car;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CarTitle;

    ////

    @FindBy(css = "#car > li:nth-child(2) > a")
    WebElement CarCovers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CarCoversTitle;

    @FindBy(css = "#car > li:nth-child(3) > a")
    WebElement SeatsHarnesses;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SeatsHarnessesTitle;

    @FindBy(css = "#car > li:nth-child(4) > a")
    WebElement CarBarriers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CarBarriersTitle;

    @FindBy(css = "#car > li:nth-child(5) > a")
    WebElement CarRamps;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement CarRampsTitle;

    @FindBy(css = "#travel > li:nth-child(2) > a")
    WebElement TravelBowls;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TravelBowlsTitle;

    @FindBy(css = "#travel > li:nth-child(3) > a")
    WebElement DogCarriers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogCarriersTitle;

    @FindBy(css = "#travel > li:nth-child(4) > a")
    WebElement DogStrollers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogStrollersTitle;

    @FindBy(css = "#travel > li:nth-child(5) > a")
    WebElement OutAdventure;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement OutAdventureTitle;

    @FindBy(css = "#clothing-and-active-wear > li:nth-child(2) > a")
    WebElement JackCoats;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement JackCoatsTitle;

    @FindBy(css = "#clothing-and-active-wear > li:nth-child(3) > a")
    WebElement DogSweaters;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogSweatersTitle;

    @FindBy(css = "#clothing-and-active-wear > li:nth-child(4) > a")
    WebElement SafetyWear;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SafetyWearTitle;

    @FindBy(css = "#clothing-and-active-wear > li:nth-child(5) > a")
    WebElement DogAccessories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogAccessoriesTitle;

    @FindBy(css = "#grooming > li:nth-child(1) > a")
    WebElement Grooming;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GroomingTitle;

    @FindBy(css = "#wellness > li:nth-child(1) > a")
    WebElement Wellness;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WellnessTitle;

    @FindBy(css = "#grooming > li:nth-child(2) > a")
    WebElement ShampoConditio;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ShampoConditioTitle;

    @FindBy(css = "#grooming > li:nth-child(3) > a")
    WebElement NailPaw;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement NailPawTitle;

    @FindBy(css = "#grooming > li:nth-child(4) > a")
    WebElement SkinCoat;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement SkinCoatTitle;

    @FindBy(css = "#grooming > li:nth-child(5) > a")
    WebElement DogDentalCare;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogDentalCareTitle;

    @FindBy(css = "#grooming > li:nth-child(6) > a")
    WebElement DogEarEyeCare;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement DogEarEyeCareTitle;

    @FindBy(css = "#grooming > li:nth-child(7) > a")
    WebElement GrommingKits;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement GrommingKitsTitle;

    @FindBy(css = "#grooming > li:nth-child(8) > a")
    WebElement ClippersAccessories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement ClippersAccessoriesTtile;

    @FindBy(css = "#wellness > li:nth-child(2) > a")
    WebElement AKCVetline;

    @FindBy(css = "#wellness > li:nth-child(3) > a")
    WebElement AnxietyRelief;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AnxietyReliefTitle;

    @FindBy(css = "#wellness > li:nth-child(4) > a")
    WebElement InsectProtection;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement InsectProtectionTitle;

    @FindBy(css = "#wellness > li:nth-child(5) > a")
    WebElement MobilitySupport;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement MobilitySupportTitle;

    @FindBy(css = "#wellness > li:nth-child(6) > a")
    WebElement WellnessAccessories;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement WellnessAccessoriesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(1) > a")
    WebElement TrainingSupplies;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrainingSuppliesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(2) > a")
    WebElement AgilityEquip;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AgilityEquipTitle;

    @FindBy(css = "#training-supplies > li:nth-child(3) > a")
    WebElement TrainingLeashes;

    @FindBy(css = "#training-supplies > li:nth-child(3) > a")
    WebElement TrainingLeashesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(4) > a")
    WebElement TreatsPouches;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TreatsPouchesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(5) > a")
    WebElement PuppySupplies;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PuppySuppliesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(6) > a")
    WebElement Muzzles;

    @FindBy(css = "#training-supplies > li:nth-child(6) > a")
    WebElement MuzzlesTitle;

    @FindBy(css = "#books-dvds > li:nth-child(1) > a")
    WebElement BooksDVDs;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BooksDVDsTitle;

    @FindBy(css = "#books-dvds > li:nth-child(2) > a")
    WebElement BasicTraining;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BasicTrainingTitle;

    @FindBy(css = "#books-dvds > li:nth-child(3) > a")
    WebElement TricksTraining;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TricksTrainingTitle;

    @FindBy(css = "#books-dvds > li:nth-child(4) > a")
    WebElement BreedTraining;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BreedTrainingTitle;
    //

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement dropDown;

    @FindBy(id = "#breed-collection-filter > div > div > a")
    WebElement chevronDown;

    @FindBy(css = "section.department-block:nth-child(2) > div:nth-child(4) > a:nth-child(1)")
    WebElement FurYourOwnGoodCampButton;

    @FindBy(css = "section.department-block:nth-child(3) > div:nth-child(4) > a:nth-child(1)")
    WebElement ViewMoreChewyProdCampButton;

    @FindBy(css = "#collection-main > ul.pagination.clearfix > li:nth-child(3) > a")
    WebElement NextButton;

    @FindBy(css = "#collection-main > ul.pagination.clearfix > li:nth-child(1) > a")
    WebElement PrevButton;

    @FindBy(css = "#index > section:nth-child(4) > div:nth-child(4) > a:nth-child(1)")
    WebElement ViewMoreBreedEmbroideryButton;

    @FindBy(css = "section.department-block:nth-child(5) > div:nth-child(4) > a:nth-child(1)")
    WebElement ViewMoreNewArrivalsButton;

    @FindBy(id = "collection-header")
    WebElement CollectionHeader;

    @FindBy(id = "form-subscribe-input")
    WebElement emailCaseNewProducts;

    @FindBy(id = "form-subscribe-success")
    WebElement formSubscribeSuccess;

    @FindBy(id = "form-subscribe-button")
    WebElement EmailSubscribeButton;

    @FindBy(css = "#footer-connect > div > ul")
    WebElement SocialMediaIcons;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(1) > a")
    WebElement SocialMediaIconTwitter;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(2) > a > span.icon.icon-facebook")
    WebElement SocialMediaIconFb;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(3) > a > span.icon.icon-pinterest")
    WebElement SocialMediaIconPin;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(4) > a > span.icon.icon-instagram")
    WebElement SocialMediaIconIt;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(5) > a > span.icon.icon-youtube")
    WebElement SocialMediaIconYouT;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(1) > a")
    WebElement CustServ;

    @FindBy(css = "#page-content > h4")
    WebElement CustServRefundsTitle;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(2) > a")
    WebElement AKCShopExp;

    @FindBy(css = "#side-nav > ul > li > div > ul")
    WebElement AKCShopExpList;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(3) > a")
    WebElement PrivacyPoli;

    @FindBy(css = "#collection-header > div > h1")
    WebElement PrivacyPoliTitle;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(4) > a")
    WebElement TermsUse;

    @FindBy(css = "#collection-header > div > h1")
    WebElement TermsUseTitle;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(5) > a")
    WebElement CaliPrivacyRight;

    @FindBy(css = "#collection-header > div > h1")
    WebElement CaliPrivacyRightTitle;


    //


    WebDriver driver;

    // Constructor
    public ShopHomepage (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void checkTopHeaderPromoBar() throws InterruptedException {

        this.TopHeaderPromoBar.isDisplayed();
        this.TopHeaderPromoBar.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/dog-owners/coronavirus-covid19-outbreak-resources-dog-lovers"));

    }

    public void checkAKCorgLink() throws InterruptedException {

        this.AKCorgLink.isDisplayed();
        this.AKCorgLink.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/"));

    }

    public void checkPointsProgression() throws InterruptedException {

        this.PointsProgression.isDisplayed();
        this.PointsProgression.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkCompetitorReports() throws InterruptedException {

        this.CompetitorReports.isDisplayed();
        this.CompetitorReports.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkBreederReports() throws InterruptedException {

        this.BreederReports.isDisplayed();
        this.BreederReports.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkPedigrees() throws InterruptedException {

        this.Pedigrees.isDisplayed();
        this.Pedigrees.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkShoppingCart() throws InterruptedException {

        this.ShoppingCart.isDisplayed();
        this.ShoppingCart.click();
        sleep(1000);
        this.ShoppingCartEmpty.isDisplayed();

    }

    public void SecondarySearch() throws InterruptedException {

        this.ShopSearch.isDisplayed();
        this.ShopSearch.sendKeys("Jackets");
        sleep(2000);
        this.ProductResultClick.click();
        sleep(1000);
        this.SecondarySearch.isDisplayed();
        driver.findElement(By.id("isp_main_search_box")).clear();
        sleep(1000);
        this.SecondarySearch.sendKeys("tshirts");
        sleep(1000);
        driver.findElement(By.id("isp_main_search_box")).sendKeys(Keys.RETURN);
        sleep(1000);
        this.ProductImageResult.isDisplayed();

    }

    public void checkShopNowBanner0() throws InterruptedException {

        this.ShopNowBanner0.isDisplayed();
        this.ShopNowBanner0.click();
        sleep(1000);
        this.CollectionHeader.isDisplayed();

    }

    public void clickDogBasicsMenu() throws InterruptedException {

        this.DogBasicsMenu.isDisplayed();
        this.DogBasicsMenu.click();
        sleep(1000);
        this.DogEssentialsTitle.isDisplayed();

    }

    public void clickOnTheGoMenu() throws InterruptedException {

        this.OnTheGoMenu.isDisplayed();
        this.OnTheGoMenu.click();
        sleep(1000);
        this.DogTravelTitle.isDisplayed();

    }

    public void clickGromingWellnessMenu() throws InterruptedException {

        this.GromingWellnessMenu.isDisplayed();
        this.GromingWellnessMenu.click();
        sleep(1000);
        this.GromingWellnessTitle.isDisplayed();

    }

    public void clickTrainingMenu() throws InterruptedException {

        this.TrainingMenu.isDisplayed();
        this.TrainingMenu.click();
        sleep(1000);
        this.DogTrainingTitle.isDisplayed();

    }

    public void clickGiftShopMenu() throws InterruptedException {

        this.dogLoversMenu.isDisplayed();
        this.dogLoversMenu.click();
        sleep(1000);
        this.dropDown.isDisplayed();

    }

    public void clickAKCProMenu() throws InterruptedException {

        this.AKCProMenu.isDisplayed();
        this.AKCProMenu.click();
        sleep(1000);
        this.AKCServicesTitle.isDisplayed();

    }

    public void clickCollectionsMenu() throws InterruptedException {

        this.CollectionsMenu.isDisplayed();
        this.CollectionsMenu.click();
        sleep(1000);
        this.CollectionsTitle.isDisplayed();

    }

    public void clickEatDrinkMenu() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.EatDrinkMenu.click();
        sleep(1000);
        this.EatDrinkMenuTitle.isDisplayed();

    }

    public void clickPlayMenu() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.PlayMenu.click();
        sleep(1000);
        this.PlayMenuTitle.isDisplayed();

    }

    public void clickRestMenu() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.RestMenu.click();
        sleep(1000);
        this.RestMenuTitle.isDisplayed();

    }

    public void clickWalkMenu() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.WalkMenu.click();
        sleep(1000);
        this.WalkMenuTitle.isDisplayed();

    }

    public void clickPuppyChekList() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.PuppyCheckList.click();
        sleep(1000);
        this.PuppyCheckListSection.isDisplayed();

    }

    public void clickTreats() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Treats.click();
        sleep(1000);
        this.TreatsTitle.isDisplayed();

    }

    public void clickDogBowls() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.DogBowls.click();
        sleep(1000);
        this.DogBowlsTitle.isDisplayed();

    }

    public void clickDogBowlsPlaceMats() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.DogBowlsPlaceMats.click();
        sleep(1000);
        this.DogBowlsPlaceMatsTittle.isDisplayed();

    }

    public void clickPlushToys() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.PlushToys.click();
        sleep(1000);
        this.PlushToysTitle.isDisplayed();

    }

    public void clickFetchToys() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.FetchToys.click();
        sleep(1000);
        this.FetchToysTitle.isDisplayed();

    }

    public void clickTugToys() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.TugToys.click();
        sleep(1000);
        this.TugToysTitle.isDisplayed();

    }

    public void clickTeethingToys() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.TeethingToys.click();
        sleep(1000);
        this.TeethingToysTitle.isDisplayed();

    }

    public void clickInteractiveToys() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.InteractiveToys.click();
        sleep(1000);
        this.InteractiveToysTtile.isDisplayed();

    }

    public void clickDogGiftPaks() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.DogGiftPacks.click();
        sleep(1000);
        this.DogGiftPacksTitle.isDisplayed();

    }

    public void clickBeds() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Beds.click();
        sleep(1000);
        this.BedsTitle.isDisplayed();

    }

    public void clickCrates() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Crates.click();
        sleep(1000);
        this.CratesTitle.isDisplayed();

    }

    public void clickCrateMats() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.CrateMats.click();
        sleep(1000);
        this.CrateMatsTitle.isDisplayed();

    }

    public void clickCollars() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Collars.click();
        sleep(1000);
        this.CollarsTitle.isDisplayed();

    }

    public void clickLeashes() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Leashes.click();
        sleep(1000);
        this.LeashesTitle.isDisplayed();

    }

    public void clickHarnesses() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Harnesses.click();
        sleep(1000);
        this.HarnessesTitle.isDisplayed();

    }

    public void clickBreedCLS() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.BreedCLS.click();
        sleep(1000);
        this.BreedCLSTitle.isDisplayed();

    }

    public void clickCar() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.essentials > a"));
        builder.moveToElement(element).build().perform();
        this.Car.click();
        sleep(1000);
        this.CarTitle.isDisplayed();

    }
    //Add Car + Travel + Dog Apparel tests ^


    public void clickCarCovers() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.CarCovers.click();
        sleep(1000);
        this.CarCoversTitle.isDisplayed();

    }

    public void clickSeatsHarnesses() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.SeatsHarnesses.click();
        sleep(1000);
        this.SeatsHarnessesTitle.isDisplayed();

    }

    public void clickCarBarriers() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.CarBarriers.click();
        sleep(1000);
        this.CarBarriersTitle.isDisplayed();

    }

    public void clickCarRapms() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.CarRamps.click();
        sleep(1000);
        this.CarRampsTitle.isDisplayed();

    }

    public void clickTravelBolws() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.TravelBowls.click();
        sleep(1000);
        this.TravelBowlsTitle.isDisplayed();

    }

    public void clickDogCarriers() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.DogCarriers.click();
        sleep(1000);
        this.DogCarriersTitle.isDisplayed();

    }

    public void clickDogStrollers() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.DogStrollers.click();
        sleep(1000);
        this.DogStrollersTitle.isDisplayed();

    }

    public void clickOutAdventure() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.OutAdventure.click();
        sleep(1000);
        this.OutAdventureTitle.isDisplayed();

    }

    public void clickJackCoats() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.JackCoats.click();
        sleep(1000);
        this.JackCoatsTitle.isDisplayed();

    }

    public void clickDogSweaters() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.DogSweaters.click();
        sleep(1000);
        this.DogSweatersTitle.isDisplayed();

    }

    public void clickSafetyWear() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.SafetyWear.click();
        sleep(1000);
        this.SafetyWearTitle.isDisplayed();

    }

    public void clickDogAccessories() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.on-the-go > a"));
        builder.moveToElement(element).build().perform();
        this.DogAccessories.click();
        sleep(1000);
        this.DogAccessoriesTitle.isDisplayed();

    }

    public void clickGrooming() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.Grooming.click();
        sleep(1000);
        this.GroomingTitle.isDisplayed();

    }

    public void clickWellness() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.Wellness.click();
        sleep(1000);
        this.WellnessTitle.isDisplayed();

    }

    public void clickShampoConditio() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.ShampoConditio.click();
        sleep(1000);
        this.ShampoConditioTitle.isDisplayed();

    }

    public void clickNailPaw() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.NailPaw.click();
        sleep(1000);
        this.NailPawTitle.isDisplayed();

    }

    public void clickSkinCoat() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.SkinCoat.click();
        sleep(1000);
        this.SkinCoatTitle.isDisplayed();

    }

    public void clickDogDentalCare() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.DogDentalCare.click();
        sleep(1000);
        this.DogDentalCareTitle.isDisplayed();

    }

    public void clickDogEarEyeCare() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.DogEarEyeCare.click();
        sleep(1000);
        this.DogEarEyeCareTitle.isDisplayed();

    }

    public void clickGrommingKits() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.GrommingKits.click();
        sleep(1000);
        this.GrommingKitsTitle.isDisplayed();

    }

    public void clickClippersAccessories() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.ClippersAccessories.click();
        sleep(1000);
        this.ClippersAccessoriesTtile.isDisplayed();

    }

    public void clickAKCVetline() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.AKCVetline.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/products/vet-helpline"));

    }

    public void clickAnxietyRelief() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.AnxietyRelief.click();
        sleep(1000);
        this.AnxietyReliefTitle.isDisplayed();

    }

    public void clickInsectProtection() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.InsectProtection.click();
        sleep(1000);
        this.InsectProtectionTitle.isDisplayed();

    }

    public void clickMobilitySupport() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.MobilitySupport.click();
        sleep(1000);
        this.MobilitySupportTitle.isDisplayed();

    }

    public void clickWellnessAccess() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.grooming-wellness > a"));
        builder.moveToElement(element).build().perform();
        this.WellnessAccessories.click();
        sleep(1000);
        this.WellnessAccessoriesTitle.isDisplayed();

    }

    public void clickTrainingSupplies() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TrainingSupplies.click();
        sleep(1000);
        this.TrainingSuppliesTitle.isDisplayed();

    }

    public void clickAgilityEquip() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.AgilityEquip.click();
        sleep(1000);
        this.AgilityEquipTitle.isDisplayed();

    }

    public void clickTrainingLeashes() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TrainingLeashes.click();
        sleep(1000);
        this.TrainingLeashesTitle.isDisplayed();

    }

    public void clickTreatsPouches() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TreatsPouches.click();
        sleep(1000);
        this.TreatsPouchesTitle.isDisplayed();

    }

    public void clickPuppySupplies() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.PuppySupplies.click();
        sleep(1000);
        this.PuppySuppliesTitle.isDisplayed();

    }

    public void clickMuzzles() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.Muzzles.click();
        sleep(1000);
        this.MuzzlesTitle.isDisplayed();

    }

    public void clickBooksDVDs() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.BooksDVDs.click();
        sleep(1000);
        this.BooksDVDsTitle.isDisplayed();

    }

    public void clickBasicTraining() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.BasicTraining.click();
        sleep(1000);
        this.BasicTrainingTitle.isDisplayed();

    }

    public void clickTrickTraining() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TricksTraining.click();
        sleep(1000);
        this.TricksTrainingTitle.isDisplayed();

    }

    public void clickBreedTraining() throws InterruptedException {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.BreedTraining.click();
        sleep(1000);
        this.BreedTrainingTitle.isDisplayed();

    }
    //
    //Continue with  On the Groming Wellness menu ^


    public void FurYourOwnGoodCampButton() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 600);");
        this.FurYourOwnGoodCampButton.isDisplayed();
        this.FurYourOwnGoodCampButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/collections/dog-lovers-human-apparel-its-fur-your-own-good-donation-campaign"));

    }

    public void ViewMoreChewyProdCampButton() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1000);");
        this.ViewMoreChewyProdCampButton.isDisplayed();
        this.ViewMoreChewyProdCampButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/collections/collections-chewy-products"));
        jse.executeScript("scroll(0, 6800);");
        sleep(2000);
        this.NextButton.click();
        wait.until(ExpectedConditions.urlContains("/collections/collections-chewy-products?page=2"));
        jse.executeScript("scroll(0, 6500);");
        sleep(2000);
        this.NextButton.click();
        wait.until(ExpectedConditions.urlContains("/collections/collections-chewy-products?page=3"));
        jse.executeScript("scroll(0, 6500);");
        sleep(2000);
        this.NextButton.click();
        wait.until(ExpectedConditions.urlContains("/collections/collections-chewy-products?page=4"));
        jse.executeScript("scroll(0, 6500);");
        sleep(2000);
        this.NextButton.click();
        wait.until(ExpectedConditions.urlContains("/collections/collections-chewy-products?page=5"));
        jse.executeScript("scroll(0, 6500);");
        sleep(2000);
        this.PrevButton.click();
        wait.until(ExpectedConditions.urlContains("/collections/collections-chewy-products?page=4"));

    }

    public void ViewMoreBreedEmbroideryButton() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1500);");
        this.ViewMoreBreedEmbroideryButton.isDisplayed();
        this.ViewMoreBreedEmbroideryButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/collections/dog-lovers-human-apparel-embroidered-products"));

    }

    public void ViewMoreNewArrivalsButton() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2000);");
        this.ViewMoreNewArrivalsButton.isDisplayed();
        this.ViewMoreNewArrivalsButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/collections/new-arrivals"));

    }


    //Footer Tests >


    public void checkSubsEmail() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2500);");
    this.emailCaseNewProducts.isDisplayed();
    this.emailCaseNewProducts.click();
    sleep(1000);
    this.emailCaseNewProducts.sendKeys("sebas.viquez@hotmail.com");
    sleep(1000);
    this.EmailSubscribeButton.click();
    sleep(1000);
    this.formSubscribeSuccess.isDisplayed();

    }

    public void SocialMediaIcons() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIcons.isDisplayed();
    this.SocialMediaIconTwitter.isDisplayed();
    this.SocialMediaIconTwitter.click();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.urlContains("https://twitter.com/akcdoglovers"));
    driver.navigate().to("https://shop.akc.org");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconFb.isDisplayed();
    this.SocialMediaIconFb.click();
    wait.until(ExpectedConditions.urlContains("https://www.facebook.com/AmericanKennelClub/"));
    driver.navigate().to("https://shop.akc.org");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconPin.isDisplayed();
    this.SocialMediaIconPin.click();
    wait.until(ExpectedConditions.urlContains("https://www.pinterest.com/akcshop/"));
    driver.navigate().to("https://shop.akc.org");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconIt.isDisplayed();
    this.SocialMediaIconIt.click();
    wait.until(ExpectedConditions.urlContains("https://www.instagram.com/americankennelclub/"));
    driver.navigate().to("https://shop.akc.org");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconYouT.isDisplayed();
    this.SocialMediaIconYouT.click();
    wait.until(ExpectedConditions.urlContains("https://www.youtube.com/americankennelclub"));
    driver.navigate().to("https://shop.akc.org");
    sleep(1000);

    }

    public void ClickCustServ() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.CustServ.click();
        sleep(2000);
        this.CustServRefundsTitle.isDisplayed();

    }

    public void ClickAKCShopExp() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.AKCShopExp.click();
        sleep(2000);
        this.AKCShopExpList.isDisplayed();

    }

    public void ClickPrivacyPoli() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.PrivacyPoli.click();
        sleep(2000);
        this.PrivacyPoliTitle.isDisplayed();

    }

    public void ClickTermsUse() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.TermsUse.click();
        sleep(2000);
        this.TermsUseTitle.isDisplayed();

    }

    public void ClickCaliPrivacyRight() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.CaliPrivacyRight.click();
        sleep(2000);
        this.CaliPrivacyRightTitle.isDisplayed();

    }

}
