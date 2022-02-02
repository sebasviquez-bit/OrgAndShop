
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
        ShopRegister.registerUserShop(testUser);

    }

    @Test (dataProvider = "ExistingUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulLogin(String sEmail, String sPassword) throws InterruptedException {

        User testUser = new User(sEmail, sPassword);
        ShopSignIn.signInUserShop(testUser);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopSearch(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        ShopSearch.ShopSearch(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopSearchBreed(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        ShopSearch.ShopSearchBreed(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopDogLoversSearch(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        ShopSearch.ShopDogLoversSearch(searchWord);

    }

    //@Test //Secondary test bar was removed in Sprint 052720 *****
    public void SecondarySearch() throws InterruptedException {

        shopHomepage.SecondarySearch();

    }

    @Test
    public void checkTopHeaderPromoBar() {

        shopHomepage.checkTopHeaderPromoBar();

    }

    @Test
    public void checkAKCorgLink() {

        shopHomepage.checkAKCorgLink();

    }

    @Test
    public void checkPointsProgression() {

        shopHomepage.checkPointsProgression();

    }

    @Test
    public void checkCompetitorReports() {

        shopHomepage.checkCompetitorReports();

    }

    @Test
    public void checkBreederReports() {

        shopHomepage.checkBreederReports();

    }

    @Test
    public void checkPedigrees() {

        shopHomepage.checkPedigrees();

    }

    @Test
    public void checkShoppingCart() {

        shopHomepage.checkShoppingCart();

    }

     @Test
     public void checkHeroImage() {

        shopHomepage.checkHeroImage();

     }

    @Test
    public void checkFeatureCollectionsSection() {

        shopHomepage.checkFeatureCollectionsSection();

    }

    @Test
    public void checkQuickShop() {

        shopHomepage.checkQuickShop();

    }

     //MAIN MENUS:

     @Test
     public void GiftForHumansMenu() {

         GiftForHumans.clickGiftForHumansMenu();

     }

    @Test
    public void GearForDogsMenu() {

        GearForDogs.clickGearForDogsMenu();

    }

    @Test
    public void AKCProShop()  {

        AKCProShop.clickAKCProShopMenu();

    }

    @Test
    public void AdviseTrainingMenu() {

        AdviseTraining.clickAdviseTrainingMenu();

    }

    @Test
    public void ShopByBreedMenu()  {

        ShopByBreed.clickShopByBreedMenu();

    }

    @Test
    public void AKCProShopMenu() {

        AKCProShop.clickAKCProShopMenu();

    }

    @Test
    public void SpecialShopMenu() {

        SpecialShops.SpecialShopDropDown();

    }

    //GiftForHumans menu:

    @Test
    public void clickJewelryMenu()  {

        GiftForHumans.clickJewelryMenu();

    }

    @Test
    public void clickBraceletsMenu()  {

        GiftForHumans.clickBraceletsMenu();

    }

    @Test
    public void clickharmsPedants() {

        GiftForHumans.clickharmsPedants();

    }

    @Test
    public void clickEarings() {

        GiftForHumans.clickEarings();

    }

    @Test
    public void clickJewelryChain() {

        GiftForHumans.clickJewelryChain();

    }

    @Test
    public void clickPuppyChekList() {

        GiftForHumans.clickRigns();

    }

    @Test
    public void SportingJewelry()  {

        GiftForHumans.SportingJewelry();

    }

    @Test
    public void clickMemorialJewelry() {

        GiftForHumans.clickMemorialJewelry();

    }

    @Test
    public void clickBreedEmbrodeiry() {

        GiftForHumans.clickBreedEmbrodeiry();

    }

    @Test
    public void clickBreedEmbrodeiryApparel() {

        GiftForHumans.clickBreedEmbrodeiryApparel();

    }

    @Test
    public void clickBreedEmbrodeiryAccesGear() {

        GiftForHumans.clickBreedEmbrodeiryAccesGear();

    }

    @Test
    public void clickClothingAccessories() {

        GiftForHumans.clickClothingAccessories();

    }

    @Test
    public void clickApparel() {

        GiftForHumans.clickApparel();

    }

    @Test
    public void clickOuterWear() {

        GiftForHumans.clickOuterWear();

    }

    @Test
    public void clickLoungeWear() {

        GiftForHumans.clickLoungeWear();

    }

    @Test
    public void clickHats() {

        GiftForHumans.clickHats();

    }

    @Test
    public void clickTechAccessories() {

        GiftForHumans.clickTechAccessories();

    }

    @Test
    public void clickTotesBags() {

        GiftForHumans.clickTotesBags();

    }

    @Test
    public void clickDuffleBags() {

        GiftForHumans.clickDuffleBags();

    }

    @Test
    public void clickPrintedTotes() {

        GiftForHumans.clickPrintedTotes();

    }

    @Test
    public void clickCustomEmbroTotes() {

        GiftForHumans.clickCustomEmbroTotes();

    }

    @Test
    public void clickLunchTotes()  {

        GiftForHumans.clickLunchTotes();

    }

    @Test
    public void clickHomeKitchen()  {

        GiftForHumans.clickHomeKitchen();

    }

    @Test
    public void clickEveryDayHome()  {

        GiftForHumans.clickEveryDayHome();

    }

    @Test
    public void clickHolidayDecor()  {

        GiftForHumans.clickHolidayDecor();

    }

    @Test
    public void clickArtWork()  {

        GiftForHumans.clickArtWork();

    }

    @Test
    public void clickBlanketsThrows()  {

        GiftForHumans.clickBlanketsThrows();

    }

    @Test
    public void clickDrinkware()  {

        GiftForHumans.clickDrinkware();

    }

    @Test
    public void clickKitchenAccessories()  {

        GiftForHumans.clickKitchenAccessories();

    }

    @Test
    public void clickRemembranceMemorial()  {

        GiftForHumans.clickRemembranceMemorial();

    }

    @Test
    public void clickRemebranceMemorialJewelry()  {

        GiftForHumans.clickRemebranceMemorialJewelry();

    }

    @Test
    public void clickSomewhereOverThe()  {

        GiftForHumans.clickSomewhereOverThe();

    }

    @Test
    public void clickMemoryBoxesUrns()  {

        GiftForHumans.clickMemoryBoxesUrns();

    }

    //End of GiftsForHumansMenus ^


    //GearForDogsMenu:

    @Test
    public void clickGiftBoxes() {

        GearForDogs.clickGiftBoxes();

    }

    @Test
    public void clickToysPay() {

        GearForDogs.clickToysPay();

    }

    @Test
    public void clickPlushTugFetch() {

        GearForDogs.clickPlushTugFetch();

    }

    @Test
    public void clickTeethingToys()  {

        GearForDogs.clickTeethingToys();

    }


    @Test
    public void clickInteractiveToys() {

        GearForDogs.clickInteractiveToys();

    }


    @Test
    public void clickCollarsLeashes()  {

        GearForDogs.clickCollarsLeashes();

    }

    @Test
    public void clickCollars()  {

        GearForDogs.clickCollars();

    }

    @Test
    public void clickLeashes()  {

        GearForDogs.clickLeashes();

    }

    @Test
    public void clickHarnesses() {

        GearForDogs.clickHarnesses();

    }

    @Test
    public void clickCarTravel() {

        GearForDogs.clickCarTravel();

    }


    @Test
    public void clickCar() {

        GearForDogs.clickCar();

    }


    @Test
    public void clickTravel() {

        GearForDogs.clickTravel();

    }


    @Test
    public void clickOutdoorAdventure() {

        GearForDogs.clickOutdoorAdventure();

    }

    @Test
    public void ClothingAccessories()  {

        GearForDogs.ClothingAccessories();

    }

    @Test
    public void ClickAccessories() {

        GearForDogs.ClickAccessories();

    }

    @Test
    public void ClickJackets() {

        GearForDogs.ClickJackets();

    }

    @Test
    public void ClickSweatersShirts() {

        GearForDogs.ClickSweatersShirts();

    }

    @Test
    public void ClickGroomingWellness() {

        GearForDogs.ClickGroomingWellness();

    }

    @Test
    public void ClickGrooming() {

        GearForDogs.ClickGrooming();

    }

    @Test
    public void ClickWellness() {

        GearForDogs.ClickWellness();

    }

    @Test
    public void AKCVetline() {

        GearForDogs.ClickAKCVetline();

    }

    @Test
    public void ClickTrainingSupplies() {

        GearForDogs.ClickTrainingSupplies();

    }

    @Test
    public void ClickPuppyTraining() {

        GearForDogs.ClickPuppyTraining();

    }

    @Test
    public void ClickTrainingEssentials() {

        GearForDogs.ClickTrainingEssentials();

    }

    @Test
    public void ClickSportsAgilityTraining() {

        GearForDogs.ClickSportsAgilityTraining();

    }

    @Test
    public void ClickDogTreats() {

        GearForDogs.ClickDogTreats();

    }

    @Test
    public void ClickGoodDogHelpLine() {

        GearForDogs.ClickGoodDogHelpLine();

    }

    @Test
    public void ClickPetTech() {

        GearForDogs.ClickPetTech();

    }

    @Test
    public void ClickDogFood() {

        GearForDogs.ClickDogFood();

    }

    //END OF GEAR FOR DOGS MENU ^
    

    //START OF AKCPROSHOP:

    @Test
    public void clickAKCBrandedGears()  {

        AKCProShop.clickAKCBrandedGears();

    }

    @Test
    public void clickForBreeders()  {

        AKCProShop.clickForBreeders();

    }

    @Test
    public void clickExhibitors()  {

        AKCProShop.clickExhibitors();

    }

    @Test
    public void clickForJudges()  {

        AKCProShop.clickForJudges();

    }

    @Test
    public void clickForClubs()  {

        AKCProShop.clickForClubs();

    }

    @Test
    public void clickForTrainers()  {

        AKCProShop.clickForTrainers();

    }

    @Test
    public void clickPointsProgressionProShop()  {

        AKCProShop.clickPointsProgressionProShop();

    }

    //End of AKCPROSHOP ^


    //Start of ADVISETRAINING:


    @Test
    public void clickAdvice() {

        AdviseTraining.clickAdvice();

    }

    @Test
    public void clickVetLine() {

        AdviseTraining.clickVetLine();

    }

    @Test
    public void clickGoodDogHelpLine2() {

        AdviseTraining.clickGoodDogHelpLine2();

    }

    @Test
    public void clickNewPuppyCheckList() {

        AdviseTraining.clickNewPuppyCheckList();

    }

    @Test
    public void ClickTrainingCertification() {

        AdviseTraining.ClickTrainingCertification();

    }

    @Test
    public void ClickSTARPuppy() {

        AdviseTraining.ClickSTARPuppy();

    }

    @Test
    public void ClickCanineGoodCitizen() {

        AdviseTraining.ClickCanineGoodCitizen();

    }

    @Test
    public void ClickVirtualHomeManners() {

        AdviseTraining.ClickVirtualHomeManners();

    }

    @Test
    public void ClickTrainingSupplies2() {

        AdviseTraining.ClickTrainingSupplies2();

    }

    //END OF ADVISETRAINING MENU ^

    //ShopByBreed:

    @Test
    public void ChooseABreedDropdownAkita()  {

        ShopByBreed.ChooseABreedDropdown();

    }

    @Test
    public void ChooseABreedDropdownGolden()  {

        ShopByBreed.ChooseABreedDropdown2();

    }

    @Test
    public void ChooseABreedDropdownYorkShire()  {

        ShopByBreed.ChooseABreedDropdown3();

    }

    @Test
    public void ChooseABreedBeagle()  {

        ShopByBreed.ChooseABreedBeagle();

    }

    @Test
    public void ChooseABreedBulldog()  {

        ShopByBreed.ChooseABreedBulldog();

    }

    @Test
    public void ChooseABreedPapillon()  {

        ShopByBreed.ChooseABreedPapillon();

    }

    //END OF SHOPBYBREED ^

    //START OF SPECIALSHOP >

    


     @Test
     public void clickFallEntertainingLook() {

        shopHomepage.clickFallEntertainingLook();

     }

    @Test
    public void checkNovNewArrivals() {

        shopHomepage.checkNovNewArrivals();

    }

    @Test
    public void checkPuppyEssentials() {

        shopHomepage.checkPuppyEssentials();

    }

    @Test
    public void checkHolidayShop() {

        shopHomepage.checkHolidayShop();

    }

    @Test
    public void clickShopByBreedButton() {

        shopHomepage.clickShopByBreedButton();

    }

    //Footer tests:


    @Test
    public void checkSubsEmail() throws InterruptedException{

        shopHomepage.checkSubsEmail();

    }

    @Test
    public void SocialMediaIcons() throws InterruptedException {

        shopHomepage.SocialMediaIcons();

    }

    @Test
    public void ClickCustServ() {

        shopHomepage.ClickCustServ();

    }

    @Test
    public void ClickReturnsExchanges() {

        shopHomepage.ClickReturnsExchanges();

    }

    @Test
    public void ClickPrivacyPoli() {

        shopHomepage.ClickPrivacyPoli();

    }

    @Test
    public void ClickTermsUse() {

        shopHomepage.ClickTermsUse();

    }

    @Test
    public void ClickCaliPrivacyRight() {

        shopHomepage.ClickCaliPrivacyRight();

    }

    //PurchaseOrders scenarios:

    @Test
    public void BasicPurchase() {

        shopPurchaseOrders.BasicPurchase();

    }

    @Test
    public void QuickViewPurchase() throws InterruptedException {

        shopPurchaseOrders.QuickViewPurchase();

    }


    //---------------------------------Visual tests:

    @Test
    public void VisualShopHomePage() {

        driver.navigate().to("https://shop.akc.org/");
        eyes.open(driver, "AKCSHOP", "ShopHomePage", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //Main Menus > Change URL's and update visual validations.

    @Test
    public void VisualShopDogBasicsMenu() {

        driver.navigate().to("https://shop.akc.org/collections/dog-essentials-supplies");
        eyes.open(driver, "AKCSHOP", "DogBasicsMenu", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    @Test
    public void VisualShopOntheGoMenu() {

        driver.navigate().to("https://shop.akc.org/collections/on-the-go-dog-travel-products");
        eyes.open(driver, "AKCSHOP", "OntheGoMenu", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    @Test
    public void VisualGroomingWellnessMenu() {

        driver.navigate().to("https://shop.akc.org/collections/grooming-wellness");
        eyes.open(driver, "AKCSHOP", "GroomingWellness", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    @Test
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
