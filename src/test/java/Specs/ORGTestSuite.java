package Specs;

import Helpers.DataHelper;
import Model.User;
import Model.Word;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;

public class ORGTestSuite extends SpecsBaseClass {


    //@Test (dataProvider = "RegisterUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulRegister(String sUserName, String sFirstName, String sLastName, String sPassword1, String sPassword2) throws InterruptedException {

        User testUser;
        testUser = new User(sUserName, sFirstName, sLastName, sPassword1, sPassword2);
        register.registerUser(testUser);

    }

    @Test (dataProvider = "ExistingUsers", dataProviderClass = DataHelper.class)
    public void SuccessfulLogin(String sEmail, String sPassword) throws InterruptedException {

        User testUser = new User(sEmail, sPassword);
        signIn.signInUser(testUser);

    }

    @Test
    public void HomepageCheck() throws InterruptedException {

        homepage.CheckHomepage();

    }

    @Test
    public void TopMenu() throws InterruptedException {

        homepage.Verifytopmenu();

    }

    @Test
    public void BreedMenu() {

        breeds.Verifybreedsmenu();

    }

    @Test
    public void ExpAdviceVerify() {

        expertAdvice.VerifyExpAdv();

    }

    @Test
    public void ProdServVerify() {

        prodserv.VerifyProdServ();

    }

    @Test
    public void SportsEventsVerify() throws InterruptedException {

        sportsEvents.VerifySportsEvents();

    }

    @Test
    public void ClubsDelegatesVerify() {

        clubsDelegates.VerifyClubsDelegates();

    }

    @Test
    public void CompareBreedsVerify() throws InterruptedException {

        compareBreeds.VerifyCompareBreeds();

    }

    @Test
    public void BreedSelectorVerify1() throws InterruptedException {

        breedSelector.VerifyBreedSelector1();

    }

    @Test
    public void BreedSelectorVerify2() throws InterruptedException {

        breedSelector.VerifyBreedSelector2();

    }

    @Test
    public void BreedSelectorVerify3() throws InterruptedException {

        breedSelector.VerifyBreedSelector3();

    }

    @Test
    public void VerifyDogName() throws InterruptedException {

        dogName.DogNameVerify();

    }

    @Test
    public void CanMyDogEatVerify1() throws InterruptedException {

        canMyDogEat.VerifyCanMyDogEat1();

    }

    @Test
    public void CanMyDogEatVerify2() throws InterruptedException {

        canMyDogEat.VerifyCanMyDogEat2();

    }


    @Test
    public void RegisterDogVerify1() throws InterruptedException {

        registerDog.VerifyRegisterDog1();

    }


    @Test
    public void RegisterDogVerify2() throws InterruptedException {

        registerDog.VerifyRegisterDog2();

    }


    @Test
    public void RegisterDogVerify3()  throws InterruptedException {

        registerDog.VerifyRegisterDog3();

    }

    @Test
    public void RegisterDogVerify4() throws InterruptedException {

        registerDog.VerifyRegisterDog4();

    }


    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void SearchVerify(String sWord) throws InterruptedException {

        Word searchWord;
        searchWord = new Word(sWord);
        search.SearchPage(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void HeroBreedSearch(String sWord) throws InterruptedException {

        Word searchWord;
        searchWord = new Word(sWord);
        search.HeroBreedSearch(searchWord);

    }


    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void HeroAsideSearch(String sWord) throws InterruptedException {

        Word searchWord;
        searchWord = new Word(sWord);
        search.HeroAsideSearch(searchWord);

    }


    @Test
    public void RegisterDogVerify5() throws InterruptedException {

        registerDog.VerifyRegisterDog5();

    }


    @Test
    public void RegisterDogVerify6() throws InterruptedException {

        registerDog.VerifyRegisterDog6();

    }


    @Test
    public void RegisterDogVerify7() throws InterruptedException {

        registerDog.VerifyRegisterDog7();

    }


    @Test
    public void RegisterDogVerify8() throws InterruptedException {

        registerDog.VerifyRegisterDog8();

    }


    @Test
    public void RegisterDogVerify9() throws InterruptedException {

        registerDog.VerifyRegisterDog9();

    }


    @Test
    public void RegisterLitterVerify() throws InterruptedException {

        registerDog.VerifyRegisterLitter();

    }


    @Test
    public void RegisterLitterVerify2() throws InterruptedException {

        registerDog.VerifyRegisterLitter2();

    }


    @Test
    public void RegisterLitterVerify3() throws InterruptedException {

        registerDog.VerifyRegisterLitter3();

    }


    @Test
    public void RegisterLitterVerify4() throws InterruptedException {

        registerDog.VerifyRegisterLitter4();

    }


    @Test
    public void RegisterLitterVerify5() throws InterruptedException {

        registerDog.VerifyRegisterLitter5();

    }


    @Test
    public void RegisterLitterVerify6() throws InterruptedException {

        registerDog.VerifyRegisterLitter6();

    }


    @Test
    public void RegisterLitterVerify7() throws InterruptedException {

        registerDog.VerifyRegisterLitter7();

    }


    @Test
    public void RegisterLitterVerify8() throws InterruptedException {

        registerDog.VerifyRegisterLitter8();

    }


    @Test
    public void RegisterLitterVerify9() throws InterruptedException {

        registerDog.VerifyRegisterLitter9();

    }


    @Test
    public void TransOwnerVerify() throws InterruptedException {

        registerDog.VerifyTransOwner();

    }


    @Test
    public void PurchPediVerify() throws InterruptedException {

        registerDog.VerifyPurchPedig();

    }


    @Test
    public void PurchPediVerify2() throws InterruptedException {

        registerDog.VerifyPurchPedig2();

    }


    @Test
    public void MoreInfoVerify() throws InterruptedException {

        registerDog.VerifyMoreInformation();

    }

    //HomePage Image Icons Verify test >>>>>>>>>>>


    //@Test  ----------   THIS WAS REMOVED ON SPRINT 10/02/20 ***
    public void AboutVerify() throws InterruptedException {

        homepage.VerifyAKCAbouticon();
        //eyes.open(driver, "AKC", "VerifyAKCAbouticon", new RectangleSize(1440, 693));
        //eyes.check("AboutSite", Target.window());
        //eyes.close();

    }

    @Test
    public void RegisterVerify() throws InterruptedException {

        homepage.VerifyRegistericon();


    }

    @Test
    public void TrainingVerify()  throws InterruptedException {

        homepage.VerifyTrainingicon();


    }


    @Test
    public void SportsVerify() throws InterruptedException {

        homepage.VerifySportsicon();

    }


    @Test
    public void AKCCareVerify() throws InterruptedException {

        homepage.VerifyAKCCareicon();

    }


    @Test
    public void FindPuppiesVerify()  throws InterruptedException {

        homepage.VerifyFindPuppiesicon();

    }


    @Test
    public void ShopVerify() throws InterruptedException {

        homepage.VerifyShopicon();

    }


    @Test
    public void AKCTVVerify() throws InterruptedException {

        homepage.VerifyAKCTVicon();

    }

    @Test
    public void UsabillaFeedback() {

        homepage.UsabillaFeedback();

    }

    //@Test   Finish this test and continue with General Feedback option ... *****
    public void SpecificFeedback() {

        homepage.SpecificFeedback();

    }

    @Test
    public void TopStoryVerify1() throws InterruptedException {

        homepage.VerifyTopstory1();

    }


    @Test
    public void TopStoryVerify2() throws InterruptedException {

        homepage.VerifyTopstory2();

    }


    @Test
    public void TopStoryVerify3() throws InterruptedException {

        homepage.VerifyTopstory3();

    }


    @Test
    public void TopStoryVerify4() throws InterruptedException {

        homepage.VerifyTopstory4();

    }


    @Test
    public void VerifyAKCTVideo() throws InterruptedException {

        homepage.VerifyAKCTVideo();

    }

    @Test
    public void VerifyAKCTVimg1() {

        homepage.VerifyAKCTVimg1();

    }

    @Test
    public void AKCTVimgVerify2() {

        homepage.VerifyAKCTVimg2();

    }

    @Test
    public void AKCTVimgVerify3() {

        homepage.VerifyAKCTVimg3();

    }

    @Test
    public void AKCTVimgVerify4() {

        homepage.VerifyAKCTVimg4();

    }


    //@Test   // The video section was removed from Prod in Sprint April0720 ******
    public void VideoVerify() throws InterruptedException {

        homepage.VerifyVideo();

    }


    @Test
    public void TrendVerify1() throws InterruptedException {

        homepage.VerifyTrend1();

    }

    @Test
    public void TrendVerify2() throws InterruptedException {

        homepage.VerifyTrend2();

    }

    @Test
    public void TrendVerify3() throws InterruptedException {

        homepage.VerifyTrend3();

    }


    @Test
    public void BreedofDayVerify() throws InterruptedException {

        homepage.VerifyBreedofDay();

    }


    @Test
    public void ExpBreedsVerify() throws InterruptedException {

        homepage.VerifyExpBreeds();

    }


    @Test
    public void AKCCanineVerify() throws InterruptedException {

        homepage.VerifyAKCCanine();

    }


    @Test
    public void RescueNetVerify() throws InterruptedException {

        homepage.VerifyRescueNet();

    }


    @Test
    public void AKCReuniteVerify() throws InterruptedException {

        homepage.VerifyAKCReunite();

    }


    @Test
    public void HumaneFundVerify() throws InterruptedException {

        homepage.VerifyHumaneFund();

    }


    @Test
    public void MuseumofDogVerify() throws InterruptedException {

        homepage.VerifyMuseumofDog();

    }


    @Test
    public void ProtectRightsVerify() throws InterruptedException {

        homepage.VerifyProtectRights();

    }


    @Test
    public void ConformationVerify() {

        homepage.VerifyConformation();

    }


    @Test
    public void ObedienceVerify() {

        homepage.VerifyObedience();

    }


    @Test
    public void RallyVerify() {

        homepage.VerifyRally();

    }


    @Test
    public void AgilityVerify() {

        homepage.VerifyAgility();

    }


    @Test
    public void TrackingVerify() {

        homepage.VerifyTracking();

    }


    @Test
    public void HerdingVerify() throws InterruptedException {

        homepage.VerifyHerding();

    }


    @Test
    public void EarthDogVerify() throws InterruptedException {

        homepage.VerifyEarthDog();

    }


    @Test
    public void FieldTrialsVerify() throws InterruptedException {

        homepage.VerifyFieldTrials();

    }


    @Test
    public void HuntingVerify() throws InterruptedException {

        homepage.VerifyHunting();

    }

    @Test
    public void FarmDogVerify() throws InterruptedException {

        homepage.VerifyFarmDog();

    }

    @Test
    public void LureCoursingVerify() throws InterruptedException {

        homepage.VerifyLureCoursing();

    }

    @Test
    public void CoursingAbilityVerify() throws InterruptedException {

        homepage.VerifyCoursingAbility();

    }

    @Test
    public void FastCatVerify() throws InterruptedException {

        homepage.VerifyFastCat();

    }

    @Test
    public void CoonhoundVerify() throws InterruptedException {

        homepage.VerifyCoounhound();

    }

    @Test
    public void ScentWorkVerify() throws InterruptedException {

        homepage.VerifyScentWork();

    }

    @Test
    public void TrickDogVerify() throws InterruptedException {

        homepage.VerifyTrickDog();

    }


    @Test
    public void FindEventsbutVerify() throws InterruptedException  {

        homepage.VerifyFindEvents();

    }


    @Test
    public void RegisterDogbutVerify() {

        homepage.VerifyRegisterDogbut();

    }

    //Test for Adds Verify & Click:

    @Test
    public void AddVerify() throws InterruptedException {

        homepage.VerifyAdd();

    }

    @Test
    public void ClickAdd() throws InterruptedException {

        homepage.ClickAdd();

    }

    @Test
    public void VerifyAdd1() throws InterruptedException {

        homepage.VerifyAdd1();

    }

    @Test
    public void ClickAdd1() throws InterruptedException {

        homepage.ClickAdd1();

    }

    //Test for Breeds Menu click action:


    @Test
    public void Clickviewbreeds() throws InterruptedException {

        breeds.Clickviewbreeds();

    }

    @Test
    public void Clicksearchbreeds() throws InterruptedException {

        breeds.Clicksearchbreeds();


    }

    @Test
    public void Clickexplorebreeds() throws InterruptedException {

        breeds.Clickexplorebreeds();


    }

    @Test
    public void Clickfindmatch() throws InterruptedException {

        breeds.Clickfindmatch();


    }

    @Test
    public void Clickcomparebreeds() throws InterruptedException {

        breeds.Clickcomparebreeds();


    }

    @Test
    public void Clickfindapuppy() throws InterruptedException {

        breeds.Clickfindapuppy();


    }

    @Test
    public void Clickchooseabreed() throws InterruptedException {

        breeds.Clickchooseabreed();


    }

    @Test
    public void Clickwhygetdog() throws InterruptedException {

        breeds.Clickwhygetdog();


    }

    @Test
    public void Clickfindrespbreeder() throws InterruptedException {

        breeds.Clickfindrespbreeder();


    }

    @Test
    public void Clickgetstartdogsports() throws InterruptedException {

        breeds.Clickgetstartdogsports();


    }

    @Test
    public void Clickallaboutpuppies() throws InterruptedException {

        breeds.Clickallaboutpuppies();


    }

    @Test
    public void Clickfindpurebreed() throws InterruptedException {

        breeds.Clickfindpurebreed();


    }

    @Test
    public void Clickmenuregdog() throws InterruptedException {

        breeds.Clickmenuregdog();


    }

    @Test
    public void Clickfindbreedclub() throws InterruptedException {

        breeds.Clickfindbreedclub();

    }

    @Test
    public void Clickmostpopdogs() throws InterruptedException {

        breeds.Clickmostpopdogs();


    }

    @Test
    public void Clickfordogbreeders() throws InterruptedException {

        breeds.Clickfordogbreeders();


    }

    @Test
    public void Clickfordogowners() throws InterruptedException {

        breeds.Clickfordogowners();

    }


    //Tests for ExpertAdvice Menu Click action:

    @Test
    public void Clickartexpadv() throws InterruptedException {

        expertAdvice.Clickartexpadv();


    }

    @Test
    public void Clickallcateg() throws InterruptedException {

        expertAdvice.Clickallcateg();


    }

    @Test
    public void Clickdogbreeding() throws InterruptedException {

        expertAdvice.Clickdogbreeding();

    }

    @Test
    public void Clickgrooming() throws InterruptedException {

        expertAdvice.Clickgrooming();

    }

    @Test
    public void Clickhealth() throws InterruptedException {

        expertAdvice.Clickhealth();

    }

    @Test
    public void Clickhomeliving() throws InterruptedException {

        expertAdvice.Clickhomeliving();

    }

    @Test
    public void Clicklifestyle() throws InterruptedException {

        expertAdvice.Clicklifestyle();

    }

    @Test
    public void Clicknews() throws InterruptedException {

        expertAdvice.Clicknews();

    }

    @Test
    public void Clicknutrition() throws InterruptedException {

        expertAdvice.Clicknutrition();

    }

    @Test
    public void Clickpuppyinfo() throws InterruptedException {

        expertAdvice.Clickpuppyinfo();

    }

    @Test
    public void Clicksports() throws InterruptedException {

        expertAdvice.Clicksports();

    }

    @Test
    public void Clicktraining() throws InterruptedException {

        expertAdvice.Clicktraining();

    }

    @Test
    public void Clickvetcorner() throws InterruptedException {

        expertAdvice.Clickvetcorner();

    }

    @Test
    public void ClickfindmatchOnExpAdvMenu() throws InterruptedException {

        expertAdvice.ClickfindmatchOnExpAdvMenu();

    }

    @Test
    public void Clickdognamefind() throws InterruptedException {

        expertAdvice.Clickdognamefind();

    }

    @Test
    public void Clickcandogeat() throws InterruptedException {

        expertAdvice.Clickcandogeat();

    }

    @Test
    public void Clickakctv() throws InterruptedException {

        expertAdvice.Clickakctv();

    }

    @Test
    public void Clickakcmag() throws InterruptedException {

        expertAdvice.Clickakcmag();

    }

    @Test
    public void Clicknewsletter() throws InterruptedException {

        expertAdvice.Clicknewsletter();

    }

    @Test
    public void Clickpresscenter() throws InterruptedException {

        expertAdvice.Clickpresscenter();

    }

    @Test
    public void Clickakcdetection() throws InterruptedException {

        expertAdvice.Clickakcdetection();

    }

    @Test
    public void Clickakccanine() throws InterruptedException {

        expertAdvice.Clickakccanine();

    }

    @Test
    public void Clickgovernment() throws InterruptedException {

        expertAdvice.Clickgovernment();

    }

    @Test
    public void Clickakceducation() throws InterruptedException {

        expertAdvice.Clickakceducation();

    }

    @Test
    public void Clickakclibrary() throws InterruptedException {

        expertAdvice.Clickakclibrary();

    }

    @Test
    public void SubscriptionForm() {

        expertAdvice.SubscriptionForm();

    }

     //Tests for ProdServ Menu Click action >


    @Test
    public void Clickshopdog() throws InterruptedException {

        prodserv.Clickshopdog();

    }

    @Test
    public void Clickbreedspecif() throws InterruptedException {

        prodserv.Clickbreedspecif();

    }

    @Test
    public void Clicktoystreats() throws InterruptedException {

        prodserv.Clicktoystreats();

    }

    @Test
    public void Clicktrainingprod() throws InterruptedException {

        prodserv.Clicktrainingprod();

    }

    @Test
    public void Clickdoggift() throws InterruptedException {

        prodserv.Clickdoggift();

    }

    @Test
    public void Clickdna() throws InterruptedException {

        prodserv.Clickdna();

    }

    @Test
    public void ClickakctvProdServ() throws InterruptedException {

        prodserv.ClickakctvProdServ();

    }

    @Test
    public void ClickakcmagProdServ() throws InterruptedException {

        prodserv.ClickakcmagProdServ();

    }

    @Test
    public void Clickpedigrees() throws InterruptedException {

        prodserv.Clickpedigrees();

    }

    @Test
    public void Clickbreedrep() throws InterruptedException {

        prodserv.Clickbreedrep();

    }

    @Test
    public void Clickakccomp() throws InterruptedException {

        prodserv.Clickakccomp();

    }

    @Test
    public void Clickregdog() throws InterruptedException {

        prodserv.Clickregdog();

    }

    @Test
    public void Clickregpure() throws InterruptedException {

        prodserv.Clickregpure();

    }

    @Test
    public void reglitter() throws InterruptedException {

        prodserv.reglitter();

    }

    @Test
    public void Clickenroll() throws InterruptedException {

        prodserv.Clickenroll();

    }

    @Test
    public void Clickregdown() throws InterruptedException {

        prodserv.Clickregdown();

    }

    @Test
    public void Clickfinddog() throws InterruptedException {

        prodserv.Clickfinddog();

    }

    @Test
    public void Clickfinpuppy() throws InterruptedException {

        prodserv.Clickfinpuppy();

    }

    @Test
    public void Clickakcrescue() throws InterruptedException {

        prodserv.Clickakcrescue();

    }

    @Test
    public void Clickbreedrefer() throws InterruptedException {

        prodserv.Clickbreedrefer();

    }

    @Test
    public void Clickpuppyvisor() throws InterruptedException {

        prodserv.Clickpuppyvisor();

    }

    @Test
    public void Clicktrainserv() throws InterruptedException {

        prodserv.Clicktrainserv();

    }

    @Test
    public void Clickcgc() throws InterruptedException {

        prodserv.Clickcgc();

    }

    @Test
    public void Clickgooddog() throws InterruptedException {

        prodserv.Clickgooddog();

    }

    @Test
    public void Clickfindtrainclub() throws InterruptedException {

        prodserv.Clickfindtrainclub();

    }

    @Test
    public void Clickakccaninecolle() throws InterruptedException {

        prodserv.Clickakccaninecolle();

    }

    @Test
    public void Clickhealthgen() throws InterruptedException {

        prodserv.Clickhealthgen();

    }

    @Test
    public void Clickfindgroom() throws InterruptedException {

        prodserv.Clickfindgroom();

    }

    @Test
    public void Clickakcsafe() throws InterruptedException {

        prodserv.Clickakcsafe();

    }

    @Test
    public void Clickakcpet() throws InterruptedException {

        prodserv.Clickakcpet();

    }

    @Test
    public void Clickakcvete() throws InterruptedException {

        prodserv.Clickakcvete();

    }

    @Test
    public void Clickakccanineretreat() throws InterruptedException {

        prodserv.Clickakccanineretreat();

    }

    @Test
    public void Clickakcreunite() throws InterruptedException {

        prodserv.Clickakcreunite();

    }

    @Test
    public void Clickbreedprog() throws InterruptedException {

        prodserv.Clickbreedprog();

    }

    @Test
    public void Clickbom() throws InterruptedException {

        prodserv.Clickbom();

    }

    @Test
    public void Clickbwh() throws InterruptedException {

        prodserv.Clickbwh();

    }

    @Test
    public void Clickbez() throws InterruptedException {

        prodserv.Clickbez();

    }

    @Test
    public void Clickseall() throws InterruptedException {

        prodserv.Clickseall();

    }

    @Test
    public void Clickbrowseserv() throws InterruptedException {

        prodserv.Clickbrowseserv();

    }

    @Test
    public void Clickakcshop() throws InterruptedException {

        prodserv.Clickakcshop();

    }

    //Test for SportsEvents Menu click action:

    @Test
    public void Clickintrodog() throws InterruptedException {

        sportsEvents.Clickintrodog();

    }

    @Test
    public void Clickcanpartenro() throws InterruptedException {

        sportsEvents.Clickcanpartenro();

    }

    @Test
    public void Clicktitleabrev() throws InterruptedException {

        sportsEvents.Clicktitleabrev();

    }

    @Test
    public void Clickwhichsports() throws InterruptedException {

        sportsEvents.Clickwhichsports();

    }

    @Test
    public void Clickgetstartdog() throws InterruptedException {

        sportsEvents.Clickgetstartdog();

    }

    @Test
    public void Clickupcomevent() throws InterruptedException {

        sportsEvents.Clickupcomevent();

    }

    @Test
    public void Clicknatiotrack() throws InterruptedException {

        sportsEvents.Clicknatiotrack();

    }

    @Test
    public void Clicknatiochamp() throws InterruptedException {

        sportsEvents.Clicknatiochamp();

    }

    @Test
    public void Clickakcagility() throws InterruptedException {

        sportsEvents.Clickakcagility();

    }

    @Test
    public void Clickobediencecla() throws InterruptedException {

        sportsEvents.Clickobediencecla();

    }

    @Test
    public void Clickakcmeet() throws InterruptedException {

        sportsEvents.Clickakcmeet();

    }

    @Test
    public void Clickakcnatobechamp() throws InterruptedException {

        sportsEvents.Clickakcnatobechamp();

    }

    @Test
    public void Clickakcrallynatchamp() throws InterruptedException {

        sportsEvents.Clickakcrallynatchamp();

    }

    @Test
    public void Clickconfdogshow() throws InterruptedException {

        sportsEvents.Clickconfdogshow();

    }

    @Test
    public void Clickmatchshow() throws InterruptedException {

        sportsEvents.Clickmatchshow();

    }

    @Test
    public void Clickfourtosix() throws InterruptedException {

        sportsEvents.Clickfourtosix();

    }

    @Test
    public void Clickpuppyachiev() throws InterruptedException {

        sportsEvents.Clickpuppyachiev();

    }

    @Test
    public void Clicknatiohand() throws InterruptedException {

        sportsEvents.Clicknatiohand();

    }

    @Test
    public void Clickopenshow() throws InterruptedException {

        sportsEvents.Clickopenshow();

    }

    @Test
    public void Clickcompsport() throws InterruptedException {

        sportsEvents.Clickcompsport();

    }

    @Test
    public void Clickagility() throws InterruptedException {

        sportsEvents.Clickagility();

    }

    @Test
    public void Clickobedience() throws InterruptedException {

        sportsEvents.Clickobedience();

    }

    @Test
    public void Clickrally() throws InterruptedException {

        sportsEvents.Clickrally();

    }

    @Test
    public void Clicktracking() throws InterruptedException {

        sportsEvents.Clicktracking();

    }

    @Test
    public void Clicktittlereco() throws InterruptedException {

        sportsEvents.Clicktittlereco();

    }

    @Test
    public void Clickbarnhunt() throws InterruptedException {

        sportsEvents.Clickbarnhunt();

    }

    @Test
    public void Clickdiscdog() throws InterruptedException {

        sportsEvents.Clickdiscdog();

    }

    @Test
    public void Clickdivingdog() throws InterruptedException {

        sportsEvents.Clickdivingdog();

    }

    @Test
    public void Clickflyball() throws InterruptedException {

        sportsEvents.Clickflyball();

    }

    @Test
    public void Clicksearchresc() throws InterruptedException {

        sportsEvents.Clicksearchresc();

    }

    @Test
    public void Clickparentclubrec() throws InterruptedException {

        sportsEvents.Clickparentclubrec();

    }

    @Test
    public void Clickperfsport() throws InterruptedException {

        sportsEvents.Clickperfsport();

    }

    @Test
    public void Clickfieldevnthound() throws InterruptedException {

        sportsEvents.Clickfieldevnthound();

    }

    @Test
    public void Clickcourscat() throws InterruptedException {

        sportsEvents.Clickcourscat();

    }

    @Test
    public void Clickearthdog() throws InterruptedException {

        sportsEvents.Clickearthdog();

    }

    @Test
    public void Clickherding() throws InterruptedException {

        sportsEvents.Clickherding();

    }

    @Test
    public void Clickpointbreed() throws InterruptedException {

        sportsEvents.Clickpointbreed();

    }

    @Test
    public void Clickretrievers() throws InterruptedException {

        sportsEvents.Clickretrievers();

    }

    @Test
    public void ClickscentWork() throws InterruptedException {

        sportsEvents.ClickscentWork();

    }

    @Test
    public void Clickspaniels() throws InterruptedException {

        sportsEvents.Clickspaniels();

    }

    @Test
    public void Clicksportsjun() throws InterruptedException {

        sportsEvents.Clicksportsjun();

    }

    @Test
    public void Clickjunshow() throws InterruptedException {

        sportsEvents.Clickjunshow();

    }

    @Test
    public void Clickjuncomp() throws InterruptedException {

        sportsEvents.Clickjuncomp();

    }

    @Test
    public void Clickjunperf() throws InterruptedException {

        sportsEvents.Clickjunperf();

    }

    @Test
    public void Clickpeewee() throws InterruptedException {

        sportsEvents.Clickpeewee();

    }

    @Test
    public void Clickakcfamdog() throws InterruptedException {

        sportsEvents.Clickakcfamdog();

    }

    @Test
    public void Clickcgcstar() throws InterruptedException {

        sportsEvents.Clickcgcstar();

    }

    @Test
    public void ClicktrickVirtual() throws InterruptedException {

        sportsEvents.ClicktrickVirtual();

    }

    @Test
    public void ClicktherapyDog() throws InterruptedException {

        sportsEvents.ClicktherapyDog();

    }

    @Test
    public void ClickfitDog() throws InterruptedException {

        sportsEvents.ClickfitDog();

    }

    @Test
    public void ClicktempTest() throws InterruptedException {

        sportsEvents.ClicktempTest();

    }

    @Test
    public void Clickeventse() throws InterruptedException {

        sportsEvents.Clickeventse();

    }

    @Test
    public void Clickdownform() throws InterruptedException {

        sportsEvents.Clickdownform();

    }

    @Test
    public void Clickrulesreg() throws InterruptedException {

        sportsEvents.Clickrulesreg();

    }

    @Test
    public void Clickoem() throws InterruptedException {

        sportsEvents.Clickoem();

    }

    @Test
    public void Clickpointaward() throws InterruptedException {

        sportsEvents.Clickpointaward();

    }

    @Test
    public void Clickjudgingres() throws InterruptedException {

        sportsEvents.Clickjudgingres();

    }

    @Test
    public void Clickjudgesdirec() throws InterruptedException {

        sportsEvents.Clickjudgesdirec();

    }

    @Test
    public void Clickjudgeseduc() throws InterruptedException {

        sportsEvents.Clickjudgeseduc();

    }

    @Test
    public void Clickakcweeklywin() throws InterruptedException {

        sportsEvents.Clickakcweeklywin();

    }

    @Test
    public void Clickeventcanc() throws InterruptedException {

        sportsEvents.Clickeventcanc();

    }

    @Test
    public void Clickakccontact() throws InterruptedException {

        sportsEvents.Clickakccontact();

    }

    @Test
    public void Clickakcrhp() throws InterruptedException {

        sportsEvents.Clickakcrhp();

    }

    //Tests for clubsDelegates menu click action:


    @Test
    public void Clicksearchallclub() throws InterruptedException {

        clubsDelegates.Clicksearchallclub();

    }

    @Test
    public void Clickfindanevent() throws InterruptedException {

        clubsDelegates.Clickfindanevent();

    }

    @Test
    public void Clicktrainclass() throws InterruptedException {

        clubsDelegates.Clicktrainclass();

    }

    @Test
    public void Clickaboutclub() throws InterruptedException {

        clubsDelegates.Clickaboutclub();

    }

    @Test
    public void Clickformclub() throws InterruptedException {

        clubsDelegates.Clickformclub();

    }

    @Test
    public void Clickclubdevelop() throws InterruptedException {

        clubsDelegates.Clickclubdevelop();

    }

    @Test
    public void Clickpromoteclub() throws InterruptedException {

        clubsDelegates.Clickpromoteclub();

    }

    @Test
    public void Clickclubresources() throws InterruptedException {

        clubsDelegates.Clickclubresources();

    }

    @Test
    public void Clickdelegatespor() throws InterruptedException {

        clubsDelegates.Clickdelegatespor();

    }

    @Test
    public void Clickdelegatesdir() throws InterruptedException {

        clubsDelegates.Clickdelegatesdir();

    }

    @Test
    public void Clickdelegatesmeet() throws InterruptedException {

        clubsDelegates.Clickdelegatesmeet();

    }

    @Test
    public void Clickboardmin() throws InterruptedException {

        clubsDelegates.Clickboardmin();

    }

    @Test
    public void Clickdelegatestan() throws InterruptedException {

        clubsDelegates.Clickdelegatestan();

    }

    @Test
    public void Clickperspective() throws InterruptedException {

        clubsDelegates.Clickperspective();

    }

    @Test
    public void Clickakcgazette() throws InterruptedException {

        clubsDelegates.Clickakcgazette();

    }

    @Test
    public void Clickrolakcdel() throws InterruptedException {

        clubsDelegates.Clickrolakcdel();

    }

    @Test
    public void Clickimportance() throws InterruptedException {

        clubsDelegates.Clickimportance();

    }

    @Test
    public void Clicklegisla() throws InterruptedException {

        clubsDelegates.Clicklegisla();

    }

    @Test
    public void Clicklegislaalarm() throws InterruptedException {

        clubsDelegates.Clicklegislaalarm();

    }

    @Test
    public void Clickakcpac() throws InterruptedException {

        clubsDelegates.Clickakcpac();

    }

    @Test
    public void Clickgovernrelat() throws InterruptedException {

        clubsDelegates.Clickgovernrelat();

    }

    @Test
    public void Clickovercollec() throws InterruptedException {

        clubsDelegates.Clickovercollec();

    }

    @Test
    public void Clickclubarchives() throws InterruptedException {

        clubsDelegates.Clickclubarchives();

    }

    @Test
    public void Clicksearchlib() throws InterruptedException {

        clubsDelegates.Clicksearchlib();

    }

    @Test
    public void Clickhowtovisit() throws InterruptedException {

        clubsDelegates.Clickhowtovisit();

    }

    //Breeds Menu Articles tests:


    @Test
    public void puppiesArticle1() throws InterruptedException {

        breeds.puppiesArticle1();

    }

    @Test
    public void puppiesArticle2() throws InterruptedException {

        breeds.puppiesArticle2();

    }

    @Test
    public void puppiesArticle3() throws InterruptedException {

        breeds.puppiesArticle3();

    }

    @Test
    public void mostpopdogsArticle1() throws InterruptedException {

        breeds.mostpopdogsArticle1();

    }

    @Test
    public void mostpopdogsArticle2() throws InterruptedException {

        breeds.mostpopdogsArticle2();

    }

    //@Test  We need to fix this test Elements cannot be selected when running automation script on this Section*
    public void fordogbreedersArticle1() throws InterruptedException {

        breeds.fordogbreedersArticle1();

    }

    @Test
    public void ForDogOwnerArticle1() throws InterruptedException {

        breeds.ForDogOwnerArticle1();

    }

    @Test
    public void ForDogOwnerArticle2() throws InterruptedException {

        breeds.ForDogOwnerArticle2();

    }

    //ExpertAdvice Menu Articles >


    //@Test
    public void allcategArticle() throws InterruptedException {

        expertAdvice.allcategArticle();   //This test was replaced by a Visual test below >

    }

    //@Test
    public void dogbreedArticle() throws InterruptedException {

        expertAdvice.dogbreedArticle();
        eyes.open(driver, "AKC", "dogbreedArticle", new RectangleSize(1420, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }

    @Test
    public void healthArticle() throws InterruptedException {

        expertAdvice.healthArticle();

    }

    @Test
    public void newsArticle() throws InterruptedException {

        expertAdvice.newsArticle();

    }

    @Test
    public void HomelivingArticle() throws InterruptedException {

        expertAdvice.HomelivingArticle();
        eyes.open(driver, "AKC", "HomelivingArticle", new RectangleSize(1420, 680));
        eyes.check("HomelivingArticle", Target.window());
        eyes.close();

    }


    @Test
    public void lifestyleArticle() throws InterruptedException {

        expertAdvice.lifestyleArticle();
        eyes.open(driver, "AKC", "lifestyleArticle", new RectangleSize(1420, 680));
        eyes.check("lifestyleArticle", Target.window());
        eyes.close();

    }

    //ProdServ Menu Articles >

    //@Test
    public void ProdServArticle1() throws InterruptedException {

        prodserv.ProdServArticle1();
        eyes.open(driver, "AKC", "ProdServArticle1", new RectangleSize(1420, 680));
        eyes.check("ProdServArticle", Target.window());
        eyes.close();

    }

    //@Test
    public void ProdServArticle2() throws InterruptedException {

        prodserv.ProdServArticle2();
        eyes.open(driver, "AKC", "ProdServArticle2", new RectangleSize(1420, 680));
        eyes.check("ProdServArticle2", Target.window());
        eyes.close();

    }

    @Test
    public void ProdServArticle3() throws InterruptedException {

        prodserv.ProdServArticle3();

    }

    //SportsEvents Menu Articles >

    //@Test
    public void SportsEventsArticle1() throws InterruptedException {

        sportsEvents.SportsEventsArticle1();
        eyes.open(driver, "AKC", "SportsEventsArticle1", new RectangleSize(1420, 680));
        eyes.check("SportsEventsArticle1", Target.window());
        eyes.close();

    }

    //@Test
    public void SportsEventArticle2() throws InterruptedException {

        sportsEvents.SportsEventArticle2();
        eyes.open(driver, "AKC", "SportsEventArticle2", new RectangleSize(1420, 680));
        eyes.check("SportsEventArticle2", Target.window());
        eyes.close();

    }


    //Visual UI tests for .ORG >>>>>>>>>>>>>>>>>>>>>>>>>


    @Test
    public void VisualHomepageCheck() throws InterruptedException {

        homepage.CheckHomepage();
        eyes.open(driver, "AKC", "CheckHomepage", new RectangleSize(1420, 680));
        eyes.check("HomepageCheck", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualClickexplorebreeds() throws InterruptedException {

        breeds.Clickexplorebreeds();
        eyes.open(driver, "AKC", "Clickexplorebreeds", new RectangleSize(1430, 680));
        eyes.check("BreedMenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualClickwhygetdog() throws InterruptedException {

        breeds.Clickwhygetdog();
        eyes.open(driver, "AKC", "Clickwhygetdog", new RectangleSize(1430, 680));
        eyes.check("BreedMenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualClickfindrespbreeder() throws InterruptedException {

        breeds.Clickfindrespbreeder();
        eyes.open(driver, "AKC", "Clickfindrespbreeder", new RectangleSize(1430, 680));
        eyes.check("BreedMenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualClickallcateg() throws InterruptedException {

        expertAdvice.Clickallcateg();
        eyes.open(driver, "AKC", "Clickallcateg", new RectangleSize(1430, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualBestDogFoodArticle() {

        driver.navigate().to("https://www.akc.org/expert-advice/nutrition/best-dog-food-choosing-whats-right-for-your-dog/");
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        eyes.open(driver, "AKC", "BestDogFoodArticle", new RectangleSize(1420, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualHealthArticleKennelCough () throws InterruptedException {

        driver.navigate().to("https://www.akc.org/expert-advice/health/kennel-cough-symptoms-treatment-and-prevention/?test=true");
        eyes.open(driver, "AKC", "ArticleKennelCough", new RectangleSize(1420, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }


    //@Test
    public void VisualNewsArticle2020Westminster () throws InterruptedException {

        driver.navigate().to("https://www.akc.org/expert-advice/news/how-to-watch-westminster-2020/?test=true");
        eyes.open(driver, "AKC", "Article2020Westminster", new RectangleSize(1420, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisuallifestyleArticleWhatarezoomies () throws InterruptedException {

        driver.navigate().to("https://www.akc.org/expert-advice/lifestyle/what-are-zoomies/?test=true");
        eyes.open(driver, "AKC", "ArticleWhatarezoomies", new RectangleSize(1420, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }

    //@Test
    public void VisualCGC () throws InterruptedException {

        driver.navigate().to("https://www.akc.org/products-services/training-programs/canine-good-citizen/?test=true");
        eyes.open(driver, "AKC", "CGC", new RectangleSize(1420, 680));
        eyes.check("Prod&ServMenu", Target.window());
        eyes.close();

    }




}
    





