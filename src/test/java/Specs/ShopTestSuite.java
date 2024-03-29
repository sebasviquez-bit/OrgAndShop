
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
    public void ShopSearch(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        search.ShopSearch(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopSearchBreed(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        search.ShopSearchBreed(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void ShopDogLoversSearch(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        search.ShopDogLoversSearch(searchWord);

    }

    @Test //Secondary test bar was removed in Sprint 052720 *****
    public void SecondarySearch() throws InterruptedException {

        shopHomepage.SecondarySearch();

    }

    @Test
    public void checkTopHeaderPromoBar() {

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
    public void checkQuickView() {

        shopHomepage.checkQuickView();

    }

     //MAIN MENUS:

     @Test
     public void clickEssentialsMenu() {

         ShopEssentials.clickEssentialsMenu();

     }

    @Test
    public void clickOnTheGoMenu() throws InterruptedException {

        ShopOnTheGo.clickOnTheGoMenu();

    }

    @Test
    public void clickGromingWellnessMenu() throws InterruptedException {

        ShopGroomingWellness.clickGromingWellnessMenu();

    }

    @Test
    public void clickTrainingMenu() throws InterruptedException {

        ShopTraining.clickTrainingMenu();

    }

    @Test
    public void clickDogLoversMenu()  {

        ShopDogLovers.clickDogLoversMenu();

    }

    @Test
    public void clickAKCProMenu() throws InterruptedException {

        ShopAKCPro.clickAKCProMenu();

    }

    @Test
    public void clickCollectionsMenu() throws InterruptedException {

        ShopCollections.clickCollectionsMenu();

    }

    //START OF ESSENTIALS SUBMENUs:

    @Test
    public void clickEatDrinkMenu()  {

        ShopEssentials.clickEatDrinkMenu();

    }

    @Test
    public void clickPlayMenu()  {

        ShopEssentials.clickPlayMenu();

    }

    @Test
    public void clickRestMenu() throws InterruptedException {

        ShopEssentials.clickRestMenu();

    }

    @Test
    public void clickWalkMenu() throws InterruptedException {

        ShopEssentials.clickWalkMenu();

    }

    @Test
    public void clickPuppyChekList() throws InterruptedException {

        ShopEssentials.clickPuppyChekList();

    }

    @Test
    public void clickTreats()  {

        ShopEssentials.clickTreats();

    }

    @Test
    public void clickDogFood()  {

        ShopEssentials.clickDogFood();

    }

    @Test
    public void clickDogBowls() throws InterruptedException {

        ShopEssentials.clickDogBowls();

    }

    @Test
    public void clickDogBowlsPlaceMats() throws InterruptedException {

        ShopEssentials.clickDogBowlsPlaceMats();

    }

    @Test
    public void clickPlushToys() throws InterruptedException {

        ShopEssentials.clickPlushToys();

    }

    @Test
    public void clickFetchToys() throws InterruptedException {

        ShopEssentials.clickFetchToys();

    }

    @Test
    public void clickTugToys() throws InterruptedException {

        ShopEssentials.clickTugToys();

    }

    @Test
    public void clickTeethingToys() throws InterruptedException {

        ShopEssentials.clickTeethingToys();

    }

    @Test
    public void clickInteractiveToys() throws InterruptedException {

        ShopEssentials.clickInteractiveToys();

    }

    @Test
    public void clickDogGiftPaks() throws InterruptedException {

        ShopEssentials.clickDogGiftPaks();

    }

    @Test
    public void clickBeds() throws InterruptedException {

        ShopEssentials.clickBeds();

    }

    @Test
    public void clickCrates() throws InterruptedException {

        ShopEssentials.clickCrates();

    }

    @Test
    public void clickCrateMats() throws InterruptedException {

        ShopEssentials.clickCrateMats();

    }

    @Test
    public void clickCollars() throws InterruptedException {

        ShopEssentials.clickCollars();

    }

    @Test
    public void clickLeashes() throws InterruptedException {

        ShopEssentials.clickLeashes();

    }

    @Test
    public void clickHarnesses() throws InterruptedException {

        ShopEssentials.clickHarnesses();

    }

    @Test
    public void clickBreedCLS() throws InterruptedException {

        ShopEssentials.clickBreedCLS();

    }

    @Test
    public void clickSideMenu()  {

        ShopEssentials.clickSideMenu();

    }

    //END OF ESSENTIALS ^

    //ON THE GO MENU:

    @Test
    public void clickCar() throws InterruptedException {

        ShopOnTheGo.clickCar();

    }

    @Test
    public void clickCarCovers() throws InterruptedException {

        ShopOnTheGo.clickCarCovers();

    }

    @Test
    public void clickSeatsHarnesses() throws InterruptedException {

        ShopOnTheGo.clickSeatsHarnesses();

    }

    @Test
    public void clickCarBarriers() throws InterruptedException {

        ShopOnTheGo.clickCarBarriers();

    }

    @Test
    public void clickCarRapms() throws InterruptedException {

        ShopOnTheGo.clickCarRapms();

    }

    @Test
    public void clickTravel() throws InterruptedException {

        ShopOnTheGo.clickTravel();

    }

    @Test
    public void clickTravelBolws() throws InterruptedException {

        ShopOnTheGo.clickTravelBolws();

    }

    @Test
    public void clickDogCarriers() throws InterruptedException {

        ShopOnTheGo.clickDogCarriers();

    }

    @Test
    public void clickDogStrollers() throws InterruptedException {

        ShopOnTheGo.clickDogStrollers();

    }

    @Test
    public void clickOutAdventure() throws InterruptedException {

        ShopOnTheGo.clickOutAdventure();

    }

    @Test
    public void clickClothingWear() throws InterruptedException {

        ShopOnTheGo.clickClothingWear();

    }

    @Test
    public void clickJackCoats() throws InterruptedException {

        ShopOnTheGo.clickJackCoats();

    }

    @Test
    public void clickDogSweaters() throws InterruptedException {

        ShopOnTheGo.clickDogSweaters();

    }

    @Test
    public void clickSafetyWear() throws InterruptedException {

        ShopOnTheGo.clickSafetyWear();

    }

    @Test
    public void clickDogAccessories() throws InterruptedException {

        ShopOnTheGo.clickDogAccessories();

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

        ShopTraining.clickTrainingSupplies();

    }

    @Test
    public void clickAgilityEquip() throws InterruptedException {

        ShopTraining.clickAgilityEquip();

    }

    @Test
    public void clickTrainingLeashes() throws InterruptedException {

        ShopTraining.clickTrainingLeashes();

    }

    @Test
    public void clickTreatsPouches() throws InterruptedException {

        ShopTraining.clickTreatsPouches();

    }

    @Test
    public void clickPuppySupplies() throws InterruptedException {

        ShopTraining.clickPuppySupplies();

    }

    @Test
    public void clickMuzzles() throws InterruptedException {

        ShopTraining.clickMuzzles();

    }

    @Test
    public void clickBooksDVDs() throws InterruptedException {

        ShopTraining.clickBooksDVDs();

    }

    @Test
    public void clickBasicTraining() throws InterruptedException {

        ShopTraining.clickBasicTraining();

    }

    @Test
    public void clickTrickTraining() throws InterruptedException {

        ShopTraining.clickTrickTraining();

    }

    @Test
    public void clickBreedTraining() throws InterruptedException {

        ShopTraining.clickBreedTraining();

    }

    @Test
    public void clickGCG() throws InterruptedException {

        ShopTraining.clickGCG();

    }

    @Test
    public void clickBooks() throws InterruptedException {

        ShopTraining.clickBooks();

    }

    @Test
    public void clickMerchandise() throws InterruptedException {

        ShopTraining.clickMerchandise();

    }

    @Test
    public void clickMaterialsEvaluators() throws InterruptedException {

        ShopTraining.clickMaterialsEvaluators();

    }

    @Test
    public void clickTrainingServices() throws InterruptedException {

        ShopTraining.clickTrainingServices();

    }

    @Test
    public void clickGoodDogHelpLine() throws InterruptedException {

        ShopTraining.clickGoodDogHelpLine();

    }

    //END OF TRAINING MENU ^

    //START OF DOGLOVERS:

    @Test
    public void clickHumanApparel()  {

        ShopDogLovers.clickHumanApparel();

    }

    @Test
    public void clickGraphicApparel()  {

        ShopDogLovers.clickGraphicApparel();

    }

    @Test
    public void clickBreedEmbroidery()  {

        ShopDogLovers.clickBreedEmbroidery();

    }

    @Test
    public void clickScarves()  {

        ShopDogLovers.clickScarves();

    }

    @Test
    public void clickHats()  {

        ShopDogLovers.clickHats();

    }

    @Test
    public void clickPajamas() {

        ShopDogLovers.clickPajamas();

    }

    @Test
    public void clickRobes() {

        ShopDogLovers.clickRobes();

    }

    @Test
    public void clickJewelry()  {

        ShopDogLovers.clickJewelry();

    }

    @Test
    public void clickPins() {

        ShopDogLovers.clickPins();

    }

    @Test
    public void clickRings() {

        ShopDogLovers.clickRings();

    }

    @Test
    public void clickEarigns()  {

        ShopDogLovers.clickEarigns();

    }

    @Test
    public void clickBracelets() {

        ShopDogLovers.clickBracelets();

    }

    @Test
    public void clickJewelryChains() {

        ShopDogLovers.clickJewelryChains();

    }

    @Test
    public void clickCharmsPendants()  {

        ShopDogLovers.clickCharmsPendants();

    }

    @Test
    public void clickFineJewelry()  {

        ShopDogLovers.clickFineJewelry();

    }

    @Test
    public void clickSportJewlery()  {

        ShopDogLovers.clickSportJewlery();

    }

    @Test
    public void clickOvalBreedPendants()  {

        ShopDogLovers.clickOvalBreedPendants();

    }

    @Test
    public void clickToteBags()  {

        ShopDogLovers.clickToteBags();

    }

    @Test
    public void clickDuffelBags()  {

        ShopDogLovers.clickDuffelBags();

    }

    @Test
    public void clickPrintToteBags()  {

        ShopDogLovers.clickPrintToteBags();

    }

    @Test
    public void clickHandPaintTotes()  {

        ShopDogLovers.clickHandPaintTotes();

    }

    @Test
    public void clickEmbroToteBags()  {

        ShopDogLovers.clickEmbroToteBags();

    }

    @Test
    public void clickWineTotes()  {

        ShopDogLovers.clickWineTotes();

    }

    @Test
    public void clickKitchen()  {

        ShopDogLovers.clickKitchen();

    }

    @Test
    public void clickCoffeMugs()  {

        ShopDogLovers.clickCoffeMugs();

    }

    @Test
    public void clickTravelMugs()  {

        ShopDogLovers.clickTravelMugs();

    }

    @Test
    public void clickTumblers()  {

        ShopDogLovers.clickTumblers();

    }

    @Test
    public void clickWineGlasses()  {

        ShopDogLovers.clickWineGlasses();

    }

    @Test
    public void clickAprons()  {

        ShopDogLovers.clickAprons();

    }

    @Test
    public void clickOvenPot()  {

        ShopDogLovers.clickOvenPot();

    }

    @Test
    public void clickCuttingBoards()  {

        ShopDogLovers.clickCuttingBoards();

    }

    @Test
    public void clickDrinkAccesories()  {

        ShopDogLovers.clickDrinkAccesories();

    }

    @Test
    public void clickHome()  {

        ShopDogLovers.clickHome();

    }

    @Test
    public void clickDecorative()  {

        ShopDogLovers.clickDecorative();

    }

    @Test
    public void clickCardHolders()  {

        ShopDogLovers.clickCardHolders();

    }

    @Test
    public void clickCustomPetArt()  {

        ShopDogLovers.clickCustomPetArt();

    }

    @Test
    public void clickCoasters()  {

        ShopDogLovers.clickCoasters();

    }

    @Test
    public void clickTeaTowels()  {

        ShopDogLovers.clickTeaTowels();

    }

    @Test
    public void clickBlankets()  {

        ShopDogLovers.clickBlankets();

    }

    @Test
    public void clickPillows()  {

        ShopDogLovers.clickPillows();

    }

    @Test
    public void clickHolyDecor()  {

        ShopDogLovers.clickHolyDecor();

    }

    @Test
    public void clickOutdoorAcces()  {

        ShopDogLovers.clickOutdoorAcces();

    }

    @Test
    public void clickTravelAcces()  {

        ShopDogLovers.clickTravelAcces();

    }

    @Test
    public void clickKeyRings()  {

        ShopDogLovers.clickKeyRings();

    }

    @Test
    public void clickPhoneCases()  {

        ShopDogLovers.clickPhoneCases();

    }

    @Test
    public void clickLuggageTags()  {

        ShopDogLovers.clickLuggageTags();

    }

    @Test
    public void clickStationary()  {

        ShopDogLovers.clickStationary();

    }

    @Test
    public void clickUmbrellas()  {

        ShopDogLovers.clickUmbrellas();

    }

    @Test
    public void clickSportsChairs()  {

        ShopDogLovers.clickSportsChairs();

    }

    //END OF DOGLOVERS MENU ^

    //START OF AKCPRO:

    @Test
    public void clickBreeders()  {

        ShopAKCPro.clickBreeders();

    }

    @Test
    public void clickIDCollLeashes()  {

        ShopAKCPro.clickIDCollLeashes();

    }

    @Test
    public void clickBooksAndDVDs()  {

        ShopAKCPro.clickBooksAndDVDs();

    }

    @Test
    public void clickDNAKit()  {

        ShopAKCPro.clickDNAKit();

    }

    @Test
    public void clickRulesAndPolicies()  {

        ShopAKCPro.clickRulesAndPolicies();

    }

    @Test
    public void clickCertiPedig()  {

        ShopAKCPro.clickCertiPedig();

    }

    @Test
    public void clickBreederRepo()  {

        ShopAKCPro.clickBreederRepo();

    }

    @Test
    public void clickExhibitors()  {

        ShopAKCPro.clickExhibitors();

    }

    @Test
    public void clickEventRuleRegula()  {

        ShopAKCPro.clickEventRuleRegula();

    }

    @Test
    public void clickCompetitorRepo()  {

        ShopAKCPro.clickCompetitorRepo();

    }

    @Test
    public void clickTitlePatches()  {

        ShopAKCPro.clickTitlePatches();

    }

    @Test
    public void clickFreePointProgress()  {

        ShopAKCPro.clickFreePointProgress();

    }

    @Test
    public void clickJudgesClubs()  {

        ShopAKCPro.clickJudgesClubs();

    }

    @Test
    public void clickBooksDVDS()  {

        ShopAKCPro.clickBooksDVDS();

    }

    @Test
    public void clickEventRulesReg()  {

        ShopAKCPro.clickEventRulesReg();

    }

    @Test
    public void clickRegRulesPolicies()  {

        ShopAKCPro.clickRegRulesPolicies();

    }

    @Test
    public void clickBreedStand()  {

        ShopAKCPro.clickBreedStand();

    }

    @Test
    public void clickGoverClubReso()  {

        ShopAKCPro.clickGoverClubReso();

    }

    @Test
    public void clickDogShowResorces()  {

        ShopAKCPro.clickDogShowResorces();

    }

    @Test
    public void clickTrainers()  {

        ShopAKCPro.clickTrainers();

    }

    @Test
    public void clickMaterialsCGC()  {

        ShopAKCPro.clickMaterialsCGC();

    }

    @Test
    public void clickCGCMerch()  {

        ShopAKCPro.clickCGCMerch();

    }

    @Test
    public void clickCGCWorkMerch()  {

        ShopAKCPro.clickCGCWorkMerch();

    }

    @Test
    public void clickTrickDogMerch()  {

        ShopAKCPro.clickTrickDogMerch();

    }

    @Test
    public void clickTrainingBooks()  {

        ShopAKCPro.clickTrainingBooks();

    }

    @Test
    public void clickAllTrainingProd()  {

        ShopAKCPro.clickAllTrainingProd();

    }

    //END OF AKC PRO MENU TESTS ^

    //Start of Collections:

    @Test
    public void clickCollectionsMain()  {

        ShopCollections.clickCollectionsMain();

    }

    @Test
    public void clickPetTech()  {

        ShopCollections.clickPetTech();

    }

    @Test
    public void clickPetRememb()  {

        ShopCollections.clickPetRememb();

    }

    @Test
    public void clickShopByBreed()  {

        ShopCollections.clickShopByBreed();

    }

    @Test
    public void clickCollectShopByBreed()  {

        ShopCollections.clickCollectShopByBreed();

    }

    //END OF COLLECTIONS ^

     //@Test ----This button was removed----
     public void FurYourOwnGoodCampButton() {

        shopHomepage.FurYourOwnGoodCampButton();

     }

    @Test
    public void ViewMoreChewyProdCampButton() {

        shopHomepage.ViewMoreChewyProdCampButton();

    }

    @Test
    public void ViewMoreBeeHoundButton() {

        shopHomepage.ViewMoreBeeHoundButton();

    }

    @Test
    public void ViewMoreNationalChamp2020() {

        shopHomepage.ViewMoreNationalChamp2020();

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
    public void BasicPurchase() {

        shopPurchaseOrders.BasicPurchase();

    }

    @Test
    public void QuickViewPurchase() throws InterruptedException {

        shopPurchaseOrders.QuickViewPurchase();

    }
    //

    //---------------------------------Visual tests:

    //@Test
    public void VisualShopHomePage() {

        //driver.navigate().to("https://shop.akc.org/");
        eyes.open(driver, "AKCSHOP", "ShopHomePage", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //Main Menus >

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
