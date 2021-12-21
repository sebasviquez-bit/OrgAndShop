
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

    //START OF ESSENTIALS SUBMENUs:


    //these are the new GiftForHumans menu:

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

    //Continue:

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
    public void clickTugToys() throws InterruptedException {

        GiftForHumans.clickTugToys();

    }

    @Test
    public void clickTeethingToys() throws InterruptedException {

        GiftForHumans.clickTeethingToys();

    }

    @Test
    public void clickInteractiveToys() throws InterruptedException {

        GiftForHumans.clickInteractiveToys();

    }

    @Test
    public void clickDogGiftPaks() throws InterruptedException {

        GiftForHumans.clickDogGiftPaks();

    }

    @Test
    public void clickBeds() throws InterruptedException {

        GiftForHumans.clickBeds();

    }

    @Test
    public void clickCrates() throws InterruptedException {

        GiftForHumans.clickCrates();

    }

    @Test
    public void clickCrateMats() throws InterruptedException {

        GiftForHumans.clickCrateMats();

    }

    @Test
    public void clickCollars() throws InterruptedException {

        GiftForHumans.clickCollars();

    }

    @Test
    public void clickLeashes() throws InterruptedException {

        GiftForHumans.clickLeashes();

    }

    @Test
    public void clickHarnesses() throws InterruptedException {

        GiftForHumans.clickHarnesses();

    }

    @Test
    public void clickBreedCLS() throws InterruptedException {

        GiftForHumans.clickBreedCLS();

    }

    @Test
    public void clickSideMenu()  {

        GiftForHumans.clickSideMenu();

    }

    //END OF ESSENTIALS ^

    //ON THE GO MENU:

    @Test
    public void clickCar() throws InterruptedException {

        GearForDogs.clickCar();

    }

    @Test
    public void clickCarCovers() throws InterruptedException {

        GearForDogs.clickCarCovers();

    }

    @Test
    public void clickSeatsHarnesses() throws InterruptedException {

        GearForDogs.clickSeatsHarnesses();

    }

    @Test
    public void clickCarBarriers() throws InterruptedException {

        GearForDogs.clickCarBarriers();

    }

    @Test
    public void clickCarRapms() throws InterruptedException {

        GearForDogs.clickCarRapms();

    }

    @Test
    public void clickTravel() throws InterruptedException {

        GearForDogs.clickTravel();

    }

    @Test
    public void clickTravelBolws() throws InterruptedException {

        GearForDogs.clickTravelBolws();

    }

    @Test
    public void clickDogCarriers() throws InterruptedException {

        GearForDogs.clickDogCarriers();

    }

    @Test
    public void clickDogStrollers() throws InterruptedException {

        GearForDogs.clickDogStrollers();

    }

    @Test
    public void clickOutAdventure() throws InterruptedException {

        GearForDogs.clickOutAdventure();

    }

    @Test
    public void clickClothingWear() throws InterruptedException {

        GearForDogs.clickClothingWear();

    }

    @Test
    public void clickJackCoats() throws InterruptedException {

        GearForDogs.clickJackCoats();

    }

    @Test
    public void clickDogSweaters() throws InterruptedException {

        GearForDogs.clickDogSweaters();

    }

    @Test
    public void clickSafetyWear() throws InterruptedException {

        GearForDogs.clickSafetyWear();

    }

    @Test
    public void clickDogAccessories() throws InterruptedException {

        GearForDogs.clickDogAccessories();

    }

    //END OF ON THE GO MENU ^

    //Start OF GROOMING:

    @Test
    public void clickGrooming() throws InterruptedException {

        ShopGroomingWellness.clickGrooming();

    }

    @Test
    public void clickWellness() throws InterruptedException {

        ShopGroomingWellness.clickWellness();

    }

    @Test
    public void clickShampoConditio() throws InterruptedException {

        ShopGroomingWellness.clickShampoConditio();

    }

    @Test
    public void clickNailPaw() throws InterruptedException {

        ShopGroomingWellness.clickNailPaw();

    }

    @Test
    public void clickSkinCoat() throws InterruptedException {

        ShopGroomingWellness.clickSkinCoat();

    }

    @Test
    public void clickDogDentalCare() throws InterruptedException {

        ShopGroomingWellness.clickDogDentalCare();

    }

    @Test
    public void clickDogEarEyeCare() throws InterruptedException {

        ShopGroomingWellness.clickDogEarEyeCare();

    }

    @Test
    public void clickGrommingKits() throws InterruptedException {

        ShopGroomingWellness.clickGrommingKits();

    }

    @Test
    public void clickClippersAccessories() throws InterruptedException {

        ShopGroomingWellness.clickClippersAccessories();

    }

    @Test
    public void clickAKCVetline() {

        ShopGroomingWellness.clickAKCVetline();

    }

    @Test
    public void clickAnxietyRelief() throws InterruptedException {

        ShopGroomingWellness.clickAnxietyRelief();

    }

    @Test
    public void clickInsectProtection() throws InterruptedException {

        ShopGroomingWellness.clickInsectProtection();

    }

    @Test
    public void clickMobilitySupport() throws InterruptedException {

        ShopGroomingWellness.clickMobilitySupport();

    }

    @Test
    public void clickWellnessAccess() throws InterruptedException {

        ShopGroomingWellness.clickWellnessAccess();

    }

    //End of Grooming & Wellness subMenus -------

    //Training subMenus:


    @Test
    public void clickTrainingSupplies() throws InterruptedException {

        AdviseTraining.clickTrainingSupplies();

    }

    @Test
    public void clickAgilityEquip() throws InterruptedException {

        AdviseTraining.clickAgilityEquip();

    }

    @Test
    public void clickTrainingLeashes() throws InterruptedException {

        AdviseTraining.clickTrainingLeashes();

    }

    @Test
    public void clickTreatsPouches() throws InterruptedException {

        AdviseTraining.clickTreatsPouches();

    }

    @Test
    public void clickPuppySupplies() throws InterruptedException {

        AdviseTraining.clickPuppySupplies();

    }

    @Test
    public void clickMuzzles() throws InterruptedException {

        AdviseTraining.clickMuzzles();

    }

    @Test
    public void clickBooksDVDs() throws InterruptedException {

        AdviseTraining.clickBooksDVDs();

    }

    @Test
    public void clickBasicTraining() throws InterruptedException {

        AdviseTraining.clickBasicTraining();

    }

    @Test
    public void clickTrickTraining() throws InterruptedException {

        AdviseTraining.clickTrickTraining();

    }

    @Test
    public void clickBreedTraining() throws InterruptedException {

        AdviseTraining.clickBreedTraining();

    }

    @Test
    public void clickGCG() throws InterruptedException {

        AdviseTraining.clickGCG();

    }

    @Test
    public void clickBooks() throws InterruptedException {

        AdviseTraining.clickBooks();

    }

    @Test
    public void clickMerchandise() throws InterruptedException {

        AdviseTraining.clickMerchandise();

    }

    @Test
    public void clickMaterialsEvaluators() throws InterruptedException {

        AdviseTraining.clickMaterialsEvaluators();

    }

    @Test
    public void clickTrainingServices() throws InterruptedException {

        AdviseTraining.clickTrainingServices();

    }

    @Test
    public void clickGoodDogHelpLine() throws InterruptedException {

        AdviseTraining.clickGoodDogHelpLine();

    }

    //END OF TRAINING MENU ^

    //START OF DOGLOVERS:

    @Test
    public void clickHumanApparel()  {

        ShopByBreed.clickHumanApparel();

    }

    @Test
    public void clickGraphicApparel()  {

        ShopByBreed.clickGraphicApparel();

    }

    @Test
    public void clickBreedEmbroidery()  {

        ShopByBreed.clickBreedEmbroidery();

    }

    @Test
    public void clickScarves()  {

        ShopByBreed.clickScarves();

    }

    @Test
    public void clickHats()  {

        ShopByBreed.clickHats();

    }

    @Test
    public void clickPajamas() {

        ShopByBreed.clickPajamas();

    }


    @Test
    public void clickJewelry()  {

        ShopByBreed.clickJewelry();

    }

    @Test
    public void clickPins() {

        ShopByBreed.clickPins();

    }

    @Test
    public void clickRings() {

        ShopByBreed.clickRings();

    }

    @Test
    public void clickEarigns()  {

        ShopByBreed.clickEarigns();

    }

    @Test
    public void clickBracelets() {

        ShopByBreed.clickBracelets();

    }

    @Test
    public void clickJewelryChains() {

        ShopByBreed.clickJewelryChains();

    }

    @Test
    public void clickCharmsPendants()  {

        ShopByBreed.clickCharmsPendants();

    }

    @Test
    public void clickFineJewelry()  {

        ShopByBreed.clickFineJewelry();

    }

    @Test
    public void clickSportJewlery()  {

        ShopByBreed.clickSportJewlery();

    }

    @Test
    public void clickOvalBreedPendants()  {

        ShopByBreed.clickOvalBreedPendants();

    }

    @Test
    public void clickToteBags()  {

        ShopByBreed.clickToteBags();

    }

    @Test
    public void clickDuffelBags()  {

        ShopByBreed.clickDuffelBags();

    }

    @Test
    public void clickPrintToteBags()  {

        ShopByBreed.clickPrintToteBags();

    }

    @Test
    public void clickHandPaintTotes()  {

        ShopByBreed.clickHandPaintTotes();

    }

    @Test
    public void clickEmbroToteBags()  {

        ShopByBreed.clickEmbroToteBags();

    }

    @Test
    public void clickKitchen()  {

        ShopByBreed.clickKitchen();

    }

    @Test
    public void clickCoffeMugs()  {

        ShopByBreed.clickCoffeMugs();

    }

    @Test
    public void clickTravelMugs()  {

        ShopByBreed.clickTravelMugs();

    }

    @Test
    public void clickWineGlasses()  {

        ShopByBreed.clickWineGlasses();

    }

    @Test
    public void clickAprons()  {

        ShopByBreed.clickAprons();

    }

    @Test
    public void clickOvenPot()  {

        ShopByBreed.clickOvenPot();

    }

    @Test
    public void clickCuttingBoards()  {

        ShopByBreed.clickCuttingBoards();

    }

    @Test
    public void clickDrinkAccesories()  {

        ShopByBreed.clickDrinkAccesories();

    }

    @Test
    public void clickHome()  {

        ShopByBreed.clickHome();

    }

    @Test
    public void clickDecorative()  {

        ShopByBreed.clickDecorative();

    }

    @Test
    public void clickCardHolders()  {

        ShopByBreed.clickCardHolders();

    }

    @Test
    public void clickCustomPetArt()  {

        ShopByBreed.clickCustomPetArt();

    }


    @Test
    public void clickTeaTowels()  {

        ShopByBreed.clickTeaTowels();

    }

    @Test
    public void clickBlankets()  {

        ShopByBreed.clickBlankets();

    }

    @Test
    public void clickPillows()  {

        ShopByBreed.clickPillows();

    }

    @Test
    public void clickHolyDecor()  {

        ShopByBreed.clickHolyDecor();

    }

    @Test
    public void clickOutdoorAcces()  {

        ShopByBreed.clickOutdoorAcces();

    }

    @Test
    public void clickTravelAcces()  {

        ShopByBreed.clickTravelAcces();

    }

    @Test
    public void clickKeyRings()  {

        ShopByBreed.clickKeyRings();

    }

    @Test
    public void clickPhoneCases()  {

        ShopByBreed.clickPhoneCases();

    }

    @Test
    public void clickLuggageTags()  {

        ShopByBreed.clickLuggageTags();

    }

    @Test
    public void clickStationary()  {

        ShopByBreed.clickStationary();

    }

    @Test
    public void clickUmbrellas()  {

        ShopByBreed.clickUmbrellas();

    }

    @Test
    public void clickSportsChairs()  {

        ShopByBreed.clickSportsChairs();

    }

    //END OF DOGLOVERS MENU ^

    //START OF AKCPRO:

    @Test
    public void clickBreeders()  {

        AKCProShop.clickBreeders();

    }

    @Test
    public void clickIDCollLeashes()  {

        AKCProShop.clickIDCollLeashes();

    }

    @Test
    public void clickBooksAndDVDs()  {

        AKCProShop.clickBooksAndDVDs();

    }

    @Test
    public void clickDNAKit()  {

        AKCProShop.clickDNAKit();

    }

    @Test
    public void clickRulesAndPolicies()  {

        AKCProShop.clickRulesAndPolicies();

    }

    @Test
    public void clickCertiPedig()  {

        AKCProShop.clickCertiPedig();

    }

    @Test
    public void clickBreederRepo()  {

        AKCProShop.clickBreederRepo();

    }

    @Test
    public void clickExhibitors()  {

        AKCProShop.clickExhibitors();

    }

    @Test
    public void clickEventRuleRegula()  {

        AKCProShop.clickEventRuleRegula();

    }

    @Test
    public void clickCompetitorRepo()  {

        AKCProShop.clickCompetitorRepo();

    }

    @Test
    public void clickTitlePatches()  {

        AKCProShop.clickTitlePatches();

    }

    @Test
    public void clickFreePointProgress()  {

        AKCProShop.clickFreePointProgress();

    }

    @Test
    public void clickJudgesClubs()  {

        AKCProShop.clickJudgesClubs();

    }

    @Test
    public void clickBooksDVDS()  {

        AKCProShop.clickBooksDVDS();

    }

    @Test
    public void clickEventRulesReg()  {

        AKCProShop.clickEventRulesReg();

    }

    @Test
    public void clickRegRulesPolicies()  {

        AKCProShop.clickRegRulesPolicies();

    }

    @Test
    public void clickBreedStand()  {

        AKCProShop.clickBreedStand();

    }

    @Test
    public void clickGoverClubReso()  {

        AKCProShop.clickGoverClubReso();

    }

    @Test
    public void clickDogShowResorces()  {

        AKCProShop.clickDogShowResorces();

    }

    @Test
    public void clickTrainers()  {

        AKCProShop.clickTrainers();

    }

    @Test
    public void clickMaterialsCGC()  {

        AKCProShop.clickMaterialsCGC();

    }

    @Test
    public void clickCGCMerch()  {

        AKCProShop.clickCGCMerch();

    }

    @Test
    public void clickCGCWorkMerch()  {

        AKCProShop.clickCGCWorkMerch();

    }

    @Test
    public void clickTrickDogMerch()  {

        AKCProShop.clickTrickDogMerch();

    }

    @Test
    public void clickTrainingBooks()  {

        AKCProShop.clickTrainingBooks();

    }

    @Test
    public void clickAllTrainingProd()  {

        AKCProShop.clickAllTrainingProd();

    }

    //END OF AKC PRO MENU TESTS ^

    //Start of Collections:

    @Test
    public void clickCollectionsMain()  {

        SpecialShops.clickCollectionsMain();

    }

    @Test
    public void clickPetTech()  {

        SpecialShops.clickPetTech();

    }

    @Test
    public void clickPetRememb()  {

        SpecialShops.clickPetRememb();

    }

    @Test
    public void clickShopByBreed()  {

        SpecialShops.clickShopByBreed();

    }

    @Test
    public void clickCollectShopByBreed()  {

        SpecialShops.clickCollectShopByBreed();

    }

    //END OF COLLECTIONS ^  OLD MENU


    //Special Shops Section:

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
