
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

    @Test
    public void ClickNewArrivals() {

        SpecialShops.ClickNewArrivals();

    }

    @Test
    public void ClickPuppyEssentials() {

        SpecialShops.ClickPuppyEssentials();

    }

    @Test
    public void ClickCozzyCollection() {

        SpecialShops.ClickCozzyCollection();

    }

    @Test
    public void ClickChewy() {

        SpecialShops.ClickChewy();

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

        //driver.navigate().to("https://shop.akc.org/");
        eyes.open(driver, "AKCSHOP", "ShopHomePage", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //Main Menus > Change URL's and update visual validations.

    @Test
    public void VisualShopGiftsForHumans() {

        driver.navigate().to("https://shop.akc.org/collections/gifts-for-humans");
        eyes.open(driver, "AKCSHOP", "gifts-for-humans", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    @Test
    public void VisualShopGearForDogs() {

        driver.navigate().to("https://shop.akc.org/collections/gear-for-dogs");
        eyes.open(driver, "AKCSHOP", "gear-for-dogs", new RectangleSize(1420, 680));
        eyes.check("Shop", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualGroomingWellnessMenu() { //

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

}
