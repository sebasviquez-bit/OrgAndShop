
package Specs;

import Helpers.DataHelper;
import Model.User;
import Model.Word;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;

public class ShopTestSuite extends SpecsBaseClass {


    @Test (dataProvider = "RegisterUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulRegister(String sUserName, String sFirstName, String sLastName, String sPassword1, String sPassword2) throws InterruptedException {

        User testUser;
        testUser = new User(sUserName, sFirstName, sLastName, sPassword1, sPassword2);
        register.registerUserShop(testUser);

    }

    @Test (dataProvider = "ExistingUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulLogin(String sEmail, String sPassword) throws InterruptedException {

        User testUser = new User(sEmail, sPassword);
        signIn.signInUserShop(testUser);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopSearch(String sWord) throws InterruptedException {

        Word searchWord;
        searchWord = new Word(sWord);
        search.ShopSearch(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopSearchBreed(String sWord) throws InterruptedException {

        Word searchWord;
        searchWord = new Word(sWord);
        search.ShopSearchBreed(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopDogLoversSearch(String sWord) throws InterruptedException {

        Word searchWord;
        searchWord = new Word(sWord);
        search.ShopDogLoversSearch(searchWord);

    }

    //@Test ---------------  Secondary test bar was removed in Sprint 052720 *****
    public void SecondarySearch() throws InterruptedException {

        shopHomepage.SecondarySearch();

    }

    @Test
    public void checkTopHeaderPromoBar() throws InterruptedException {

        shopHomepage.checkTopHeaderPromoBar();

    }

    @Test
    public void checkAKCorgLink() throws InterruptedException {

        shopHomepage.checkAKCorgLink();

    }

    @Test
    public void checkPointsProgression() throws InterruptedException {

        shopHomepage.checkPointsProgression();

    }

    @Test
    public void checkCompetitorReports() throws InterruptedException {

        shopHomepage.checkCompetitorReports();

    }

    @Test
    public void checkBreederReports() throws InterruptedException {

        shopHomepage.checkBreederReports();

    }

    @Test
    public void checkPedigrees() throws InterruptedException {

        shopHomepage.checkPedigrees();

    }

    @Test
    public void checkShoppingCart() throws InterruptedException {

        shopHomepage.checkShoppingCart();

    }

     @Test
     public void checkShopNowBanner0() throws InterruptedException {

        shopHomepage.checkShopNowBanner0();

     }

     @Test
     public void clickDogBasicsMenu() throws InterruptedException {

         shopHomepage.clickDogBasicsMenu();

     }

    @Test
    public void clickOnTheGoMenu() throws InterruptedException {

        shopHomepage.clickOnTheGoMenu();

    }

    @Test
    public void clickGromingWellnessMenu() throws InterruptedException {

        shopHomepage.clickGromingWellnessMenu();

    }

    @Test
    public void clickTrainingMenu() throws InterruptedException {

        shopHomepage.clickTrainingMenu();

    }

    @Test
    public void clickGiftShopMenu() throws InterruptedException {

        shopHomepage.clickGiftShopMenu();

    }

    @Test
    public void clickAKCProMenu() throws InterruptedException {

        shopHomepage.clickAKCProMenu();

    }

    @Test
    public void clickCollectionsMenu() throws InterruptedException {

        shopHomepage.clickCollectionsMenu();

    }

    @Test
    public void clickEatDrinkMenu() throws InterruptedException {

        shopHomepage.clickEatDrinkMenu();

    }

    @Test
    public void clickPlayMenu() throws InterruptedException {

        shopHomepage.clickPlayMenu();

    }

    @Test
    public void clickRestMenu() throws InterruptedException {

        shopHomepage.clickRestMenu();

    }

    @Test
    public void clickWalkMenu() throws InterruptedException {

        shopHomepage.clickWalkMenu();

    }

    @Test
    public void clickPuppyChekList() throws InterruptedException {

        shopHomepage.clickPuppyChekList();

    }

    @Test
    public void clickTreats() throws InterruptedException {

        shopHomepage.clickTreats();

    }

    @Test
    public void clickDogBowls() throws InterruptedException {

        shopHomepage.clickDogBowls();

    }

    @Test
    public void clickDogBowlsPlaceMats() throws InterruptedException {

        shopHomepage.clickDogBowlsPlaceMats();

    }

    @Test
    public void clickPlushToys() throws InterruptedException {

        shopHomepage.clickPlushToys();

    }

    @Test
    public void clickFetchToys() throws InterruptedException {

        shopHomepage.clickFetchToys();

    }

    @Test
    public void clickTugToys() throws InterruptedException {

        shopHomepage.clickTugToys();

    }

    @Test
    public void clickTeethingToys() throws InterruptedException {

        shopHomepage.clickTeethingToys();

    }

    @Test
    public void clickInteractiveToys() throws InterruptedException {

        shopHomepage.clickInteractiveToys();

    }

    @Test
    public void clickDogGiftPaks() throws InterruptedException {

        shopHomepage.clickDogGiftPaks();

    }

    @Test
    public void clickBeds() throws InterruptedException {

        shopHomepage.clickBeds();

    }

    @Test
    public void clickCrates() throws InterruptedException {

        shopHomepage.clickCrates();

    }

    @Test
    public void clickCrateMats() throws InterruptedException {

        shopHomepage.clickCrateMats();

    }

    @Test
    public void clickCollars() throws InterruptedException {

        shopHomepage.clickCollars();

    }

    @Test
    public void clickLeashes() throws InterruptedException {

        shopHomepage.clickLeashes();

    }

    @Test
    public void clickHarnesses() throws InterruptedException {

        shopHomepage.clickHarnesses();

    }

    @Test
    public void clickBreedCLS() throws InterruptedException {

        shopHomepage.clickBreedCLS();

    }

    @Test
    public void clickCar() throws InterruptedException {

        shopHomepage.clickCar();

    }

    //

    @Test
    public void clickCarCovers() throws InterruptedException {

        shopHomepage.clickCarCovers();

    }

    @Test
    public void clickSeatsHarnesses() throws InterruptedException {

        shopHomepage.clickSeatsHarnesses();

    }

    @Test
    public void clickCarBarriers() throws InterruptedException {

        shopHomepage.clickCarBarriers();

    }

    @Test
    public void clickCarRapms() throws InterruptedException {

        shopHomepage.clickCarRapms();

    }

    @Test
    public void clickTravelBolws() throws InterruptedException {

        shopHomepage.clickTravelBolws();

    }

    @Test
    public void clickDogCarriers() throws InterruptedException {

        shopHomepage.clickDogCarriers();

    }

    @Test
    public void clickDogStrollers() throws InterruptedException {

        shopHomepage.clickDogStrollers();

    }

    @Test
    public void clickOutAdventure() throws InterruptedException {

        shopHomepage.clickOutAdventure();

    }

    @Test
    public void clickJackCoats() throws InterruptedException {

        shopHomepage.clickJackCoats();

    }

    @Test
    public void clickDogSweaters() throws InterruptedException {

        shopHomepage.clickDogSweaters();

    }

    @Test
    public void clickSafetyWear() throws InterruptedException {

        shopHomepage.clickSafetyWear();

    }

    @Test
    public void clickDogAccessories() throws InterruptedException {

        shopHomepage.clickDogAccessories();

    }

    @Test
    public void clickGrooming() throws InterruptedException {

        shopHomepage.clickGrooming();

    }

    @Test
    public void clickWellness() throws InterruptedException {

        shopHomepage.clickWellness();

    }

    @Test
    public void clickShampoConditio() throws InterruptedException {

        shopHomepage.clickShampoConditio();

    }

    @Test
    public void clickNailPaw() throws InterruptedException {

        shopHomepage.clickNailPaw();

    }

    @Test
    public void clickSkinCoat() throws InterruptedException {

        shopHomepage.clickSkinCoat();

    }

    @Test
    public void clickDogDentalCare() throws InterruptedException {

        shopHomepage.clickDogDentalCare();

    }

    @Test
    public void clickDogEarEyeCare() throws InterruptedException {

        shopHomepage.clickDogEarEyeCare();

    }

    @Test
    public void clickGrommingKits() throws InterruptedException {

        shopHomepage.clickGrommingKits();

    }

    @Test
    public void clickClippersAccessories() throws InterruptedException {

        shopHomepage.clickClippersAccessories();

    }

    @Test
    public void clickAKCVetline() {

        shopHomepage.clickAKCVetline();

    }

    @Test
    public void clickAnxietyRelief() throws InterruptedException {

        shopHomepage.clickAnxietyRelief();

    }

    @Test
    public void clickInsectProtection() throws InterruptedException {

        shopHomepage.clickInsectProtection();

    }

    @Test
    public void clickMobilitySupport() throws InterruptedException {

        shopHomepage.clickMobilitySupport();

    }

    @Test
    public void clickWellnessAccess() throws InterruptedException {

        shopHomepage.clickWellnessAccess();

    }

    @Test
    public void clickTrainingSupplies() throws InterruptedException {

        shopHomepage.clickTrainingSupplies();

    }

    @Test
    public void clickAgilityEquip() throws InterruptedException {

        shopHomepage.clickAgilityEquip();

    }

    @Test
    public void clickTrainingLeashes() throws InterruptedException {

        shopHomepage.clickTrainingLeashes();

    }

    @Test
    public void clickTreatsPouches() throws InterruptedException {

        shopHomepage.clickTreatsPouches();

    }

    @Test
    public void clickPuppySupplies() throws InterruptedException {

        shopHomepage.clickPuppySupplies();

    }

    @Test
    public void clickMuzzles() throws InterruptedException {

        shopHomepage.clickMuzzles();

    }

    @Test
    public void clickBooksDVDs() throws InterruptedException {

        shopHomepage.clickBooksDVDs();

    }

    @Test
    public void clickBasicTraining() throws InterruptedException {

        shopHomepage.clickBasicTraining();

    }

    @Test
    public void clickTrickTraining() throws InterruptedException {

        shopHomepage.clickTrickTraining();

    }

    @Test
    public void clickBreedTraining() throws InterruptedException {

        shopHomepage.clickBreedTraining();

    }
    //CANINE GOOD CITIZEN

    //////Continue with TRAINING MENU ^

     @Test
     public void FurYourOwnGoodCampButton() throws InterruptedException {

        shopHomepage.FurYourOwnGoodCampButton();

     }

    @Test
    public void ViewMoreChewyProdCampButton() throws InterruptedException {

        shopHomepage.ViewMoreChewyProdCampButton();

    }

    @Test
    public void ViewMoreBreedEmbroideryButton() throws InterruptedException {

        shopHomepage.ViewMoreBreedEmbroideryButton();

    }

    @Test
    public void ViewMoreNewArrivalsButton() throws InterruptedException {

        shopHomepage.ViewMoreNewArrivalsButton();

    }

    @Test
    public void checkSubsEmail() throws InterruptedException{

        shopHomepage.checkSubsEmail();

    }

    @Test
    public void SocialMediaIcons() throws InterruptedException {

        shopHomepage.SocialMediaIcons();

    }

    @Test
    public void ClickCustServ() throws InterruptedException {

        shopHomepage.ClickCustServ();

    }

    @Test
    public void ClickAKCShopExp() throws InterruptedException {

        shopHomepage.ClickAKCShopExp();

    }

    @Test
    public void ClickPrivacyPoli() throws InterruptedException {

        shopHomepage.ClickPrivacyPoli();

    }

    @Test
    public void ClickTermsUse() throws InterruptedException {

        shopHomepage.ClickTermsUse();

    }

    @Test
    public void ClickCaliPrivacyRight() throws InterruptedException {

        shopHomepage.ClickCaliPrivacyRight();

    }

    //PurchaseOrders scenarios:

    @Test
    public void BasicPurchase() throws InterruptedException {

        shopPurchaseOrders.BasicPurchase();

    }



    //---------------------------------Visual tests:

    //@Test
    public void VisualShopHomePage() {

        //driver.navigate().to("https://shop.akc.org/");
        eyes.open(driver, "AKCSHOP", "ShopHomePage", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //Main Menus >

    //@Test
    public void VisualShopDogBasicsMenu() {

        driver.navigate().to("https://shop.akc.org/collections/dog-essentials-supplies");
        eyes.open(driver, "AKCSHOP", "DogBasicsMenu", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualShopOntheGoMenu() {

        driver.navigate().to("https://shop.akc.org/collections/on-the-go-dog-travel-products");
        eyes.open(driver, "AKCSHOP", "OntheGoMenu", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualGroomingWellnessMenu() {

        driver.navigate().to("https://shop.akc.org/collections/grooming-wellness");
        eyes.open(driver, "AKCSHOP", "GroomingWellness", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualTrainingMenu() {

        driver.navigate().to("https://shop.akc.org/collections/training");
        eyes.open(driver, "AKCSHOP", "Training", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualDogLoversMenu() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers");
        eyes.open(driver, "AKCSHOP", "DogLovers", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualProfessionalMenu() {

        driver.navigate().to("https://shop.akc.org/collections/akc-services");
        eyes.open(driver, "AKCSHOP", "ProfessionalMenu", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCollectionsMenu() {

        driver.navigate().to("https://shop.akc.org/collections/");
        eyes.open(driver, "AKCSHOP", "Collections", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //SubMenus:

    //@Test
    public void VisualEatDrink() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-eat-drink");
        eyes.open(driver, "AKCSHOP", "Eat&Drink", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualPlay() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-play");
        eyes.open(driver, "AKCSHOP", "Play", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualRest() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-rest");
        eyes.open(driver, "AKCSHOP", "Rest", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualWalk() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-walk");
        eyes.open(driver, "AKCSHOP", "Walk", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualPuppyChecklist() {

        driver.navigate().to("https://shop.akc.org/pages/puppychecklist");
        eyes.open(driver, "AKCSHOP", "PuppyChecklist", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCar() {

        driver.navigate().to("https://shop.akc.org/collections/dog-travel-accessories-car");
        eyes.open(driver, "AKCSHOP", "Car", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualTravel() {

        driver.navigate().to("https://shop.akc.org/collections/on-the-go-travel");
        eyes.open(driver, "AKCSHOP", "Travel", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualClothingAndWear() {

        driver.navigate().to("https://shop.akc.org/collections/on-the-go-clothing");
        eyes.open(driver, "AKCSHOP", "ClothingAndWear", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualGrooming() {

        driver.navigate().to("https://shop.akc.org/collections/grooming-wellness-grooming");
        eyes.open(driver, "AKCSHOP", "Grooming", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualWellnessWellness() {

        driver.navigate().to("https://shop.akc.org/collections/grooming-wellness-wellness");
        eyes.open(driver, "AKCSHOP", "WellnessWellness", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualTrainingSupplies() {

        driver.navigate().to("https://shop.akc.org/collections/training-supplies");
        eyes.open(driver, "AKCSHOP", "TrainingSupplies", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualBooksDVDs() {

        driver.navigate().to("https://shop.akc.org/collections/training-books-dvds");
        eyes.open(driver, "AKCSHOP", "BooksDVDs", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualTrainingCGC() {

        driver.navigate().to("https://shop.akc.org/collections/training-canine-good-citizen");
        eyes.open(driver, "AKCSHOP", "TrainingCGC", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualTrainingServices() {

        driver.navigate().to("https://shop.akc.org/collections/training-training-services");
        eyes.open(driver, "AKCSHOP", "TrainingServices", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualHumanApparel() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-human-apparel");
        eyes.open(driver, "AKCSHOP", "HumanApparel", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualJewelrySubMenu() {

        driver.navigate().to("https://shop.akc.org/pages/jewelry");
        eyes.open(driver, "AKCSHOP", "JewelrySubMenu", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualToteBags() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-tote-bags");
        eyes.open(driver, "AKCSHOP", "ToteBags", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualDogLoversKitchen() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-kitchen");
        eyes.open(driver, "AKCSHOP", "DogLoversKitchen", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualDogLoversHome() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-breed-merchandise-home");
        eyes.open(driver, "AKCSHOP", "DogLoversHome", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualDogLoversTravelAcc() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-travel-accessories");
        eyes.open(driver, "AKCSHOP", "DogLoversTravelAcc", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualAKCServBreeders() {

        driver.navigate().to("https://shop.akc.org/collections/akc-services-breeders");
        eyes.open(driver, "AKCSHOP", "AKCServBreeders", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualAKCServCompetitors() {

        driver.navigate().to("https://shop.akc.org/collections/akc-services-competitors");
        eyes.open(driver, "AKCSHOP", "AKCServCompetitors", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualAKCServJudgesClub() {

        driver.navigate().to("https://shop.akc.org/collections/akc-services-judges-clubs");
        eyes.open(driver, "AKCSHOP", "AKCServJudgesClub", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualAKCServTrainers() {

        driver.navigate().to("https://shop.akc.org/collections/akc-services-trainers");
        eyes.open(driver, "AKCSHOP", "AKCServTrainers", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //Tabs within SubMenus:

    //@Test
    public void VisualTreats() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-eat-drink-treats");
        eyes.open(driver, "AKCSHOP", "Treats", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualPlushToys() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-play-plush-toys");
        eyes.open(driver, "AKCSHOP", "PlushToys", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualBeds() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-rest-beds");
        eyes.open(driver, "AKCSHOP", "Beds", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCollars() {

        driver.navigate().to("https://shop.akc.org/collections/essentials-walk-collars");
        eyes.open(driver, "AKCSHOP", "Collars", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCarrriers() {

        driver.navigate().to("https://shop.akc.org/collections/on-the-go-travel-dog-carriers");
        eyes.open(driver, "AKCSHOP", "Carrriers", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCoats() {

        driver.navigate().to("https://shop.akc.org/collections/on-the-go-clothing-dog-coats");
        eyes.open(driver, "AKCSHOP", "Coats", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualShampoos() {

        driver.navigate().to("https://shop.akc.org/collections/grooming-wellness-grooming-shampoos-conditioners");
        eyes.open(driver, "AKCSHOP", "Shampoos", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualWellness() {

        driver.navigate().to("https://shop.akc.org/collections/wellness-accessories");
        eyes.open(driver, "AKCSHOP", "Wellness", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualAgility() {

        driver.navigate().to("https://shop.akc.org/collections/training-training-supplies-training-equipment");
        eyes.open(driver, "AKCSHOP", "Agility", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualBooks() {

        driver.navigate().to("https://shop.akc.org/collections/training-books-dvds-basic-training");
        eyes.open(driver, "AKCSHOP", "Books", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualGraphicApparel() {

        driver.navigate().to("https://shop.akc.org/collections/human-apparel-graphic-apparel");
        eyes.open(driver, "AKCSHOP", "GraphicApparel", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualJewelry() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-jewelry-sporting-dog-lovers-jewelry");
        eyes.open(driver, "AKCSHOP", "Jewelry", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualBags() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-tote-bags-duffel-bags");
        eyes.open(driver, "AKCSHOP", "Bags", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualMugs() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-mugs-coffee-mugs");
        eyes.open(driver, "AKCSHOP", "Mugs", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualDecorative() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-home-decorative");
        eyes.open(driver, "AKCSHOP", "Decorative", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualKeyRings() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-travel-accessories-key-rings");
        eyes.open(driver, "AKCSHOP", "KeyRings", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualSupplies() {

        driver.navigate().to("https://shop.akc.org/collections/akc-services-breeders-supplies");
        eyes.open(driver, "AKCSHOP", "Supplies", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCGC() {

        driver.navigate().to("https://shop.akc.org/collections/training-canine-good-citizen-materials-for-evaluators");
        eyes.open(driver, "AKCSHOP", "CGC", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualNewArrivals() {

        driver.navigate().to("https://shop.akc.org/collections/new-arrivals");
        eyes.open(driver, "AKCSHOP", "NewArrivals", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualPetTech() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-pet-tech");
        eyes.open(driver, "AKCSHOP", "PetTech", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualPetRemembrance() {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers-pet-remembrance");
        eyes.open(driver, "AKCSHOP", "PetRemembrance", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualClearance() {

        driver.navigate().to("https://shop.akc.org/collections/clearance");
        eyes.open(driver, "AKCSHOP", "Clearance", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //Products visual checks:

    //@Test
    public void VisualProdFaceMask() {

        driver.navigate().to("https://shop.akc.org/products/teddy-the-dog-face-masks?variant=31603146817630");
        eyes.open(driver, "AKCSHOP", "ProdFaceMask", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }


}
