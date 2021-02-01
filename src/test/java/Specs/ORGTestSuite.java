package Specs;

import Helpers.DataHelper;
import Model.User;
import Model.Word;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.fluent.Target;
import org.testng.annotations.Test;

public class ORGTestSuite extends SpecsBaseClass {

    @Test (dataProvider = "RegisterUsers", dataProviderClass = DataHelper.class)
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
    public void TopMenu() {

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
    public void SportsEventsVerify() {

        sportsEvents.VerifySportsEvents();

    }

    @Test
    public void ClubsDelegatesVerify() {

        clubsDelegates.VerifyClubsDelegates();

    }

    @Test
    public void CompareBreedsVerify() {

        compareBreeds.VerifyCompareBreeds();

    }

    @Test
    public void BreedSelectorVerify1() {

        breedSelector.VerifyBreedSelector1();

    }

    @Test
    public void BreedSelectorVerify2() {

        breedSelector.VerifyBreedSelector2();

    }

    @Test
    public void BreedSelectorVerify3() {

        breedSelector.VerifyBreedSelector3();

    }

    @Test
    public void VerifyDogName() {

        dogName.DogNameVerify();

    }

    @Test
    public void CanMyDogEatVerify1() {

        canMyDogEat.VerifyCanMyDogEat1();

    }

    @Test
    public void CanMyDogEatVerify2() {

        canMyDogEat.VerifyCanMyDogEat2();

    }


    @Test
    public void RegisterDogVerify1() {

        registerDog.VerifyRegisterDog1();

    }


    @Test
    public void RegisterDogVerify2() {

        registerDog.VerifyRegisterDog2();

    }


    @Test
    public void RegisterDogVerify3() {

        registerDog.VerifyRegisterDog3();

    }

    @Test
    public void RegisterDogVerify4() {

        registerDog.VerifyRegisterDog4();

    }


    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void SearchVerify(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        search.SearchPage(searchWord);

    }

    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void HeroBreedSearch(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        search.HeroBreedSearch(searchWord);

    }


    @Test (dataProvider = "WordSearch", dataProviderClass = DataHelper.class)
    public void HeroAsideSearch(String sWord) {

        Word searchWord;
        searchWord = new Word(sWord);
        search.HeroAsideSearch(searchWord);

    }


    @Test
    public void RegisterDogVerify5() {

        registerDog.VerifyRegisterDog5();

    }


    @Test
    public void RegisterDogVerify6() {

        registerDog.VerifyRegisterDog6();

    }


    @Test
    public void RegisterDogVerify7() {

        registerDog.VerifyRegisterDog7();

    }


    @Test
    public void RegisterDogVerify8() {

        registerDog.VerifyRegisterDog8();

    }


    @Test
    public void RegisterDogVerify9() {

        registerDog.VerifyRegisterDog9();

    }


    @Test
    public void RegisterLitterVerify() {

        registerDog.VerifyRegisterLitter();

    }


    @Test
    public void RegisterLitterVerify2() {

        registerDog.VerifyRegisterLitter2();

    }


    @Test
    public void RegisterLitterVerify3() {

        registerDog.VerifyRegisterLitter3();

    }


    @Test
    public void RegisterLitterVerify4() {

        registerDog.VerifyRegisterLitter4();

    }


    @Test
    public void RegisterLitterVerify5() {

        registerDog.VerifyRegisterLitter5();

    }


    @Test
    public void RegisterLitterVerify6() {

        registerDog.VerifyRegisterLitter6();

    }


    @Test
    public void RegisterLitterVerify7() {

        registerDog.VerifyRegisterLitter7();

    }


    @Test
    public void RegisterLitterVerify8() {

        registerDog.VerifyRegisterLitter8();

    }


    @Test
    public void RegisterLitterVerify9() {

        registerDog.VerifyRegisterLitter9();

    }


    @Test
    public void TransOwnerVerify() {

        registerDog.VerifyTransOwner();

    }


    @Test
    public void PurchPediVerify() {

        registerDog.VerifyPurchPedig();

    }


    @Test
    public void PurchPediVerify2() {

        registerDog.VerifyPurchPedig2();

    }


    @Test
    public void MoreInfoVerify() {

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
    public void RegisterVerify() {

        homepage.VerifyRegistericon();


    }

    @Test
    public void TrainingVerify()  {

        homepage.VerifyTrainingicon();

    }


    @Test
    public void SportsVerify() {

        homepage.VerifySportsicon();

    }


    @Test
    public void AKCCareVerify() {

        homepage.VerifyAKCCareicon();

    }


    @Test
    public void FindPuppiesVerify()  {

        homepage.VerifyFindPuppiesicon();

    }


    @Test
    public void ShopVerify() {

        homepage.VerifyShopicon();

    }


    @Test
    public void AKCTVVerify() {

        homepage.VerifyAKCTVicon();

    }

    @Test
    public void UsabillaFeedback() {

        homepage.UsabillaFeedback();

    }

    @Test
    public void SpecificFeedback() {

        homepage.SpecificFeedback();

    }

    @Test
    public void GeneralFeedback() {

        homepage.GeneralFeedback();

    }

    @Test
    public void TopStoryVerify1() {

        homepage.VerifyTopstory1();

    }

    @Test
    public void TopStoryVerify2() {

        homepage.VerifyTopstory2();

    }

    @Test
    public void TopStoryVerify3() {

        homepage.VerifyTopstory3();

    }


    @Test
    public void TopStoryVerify4() {

        homepage.VerifyTopstory4();

    }

    @Test
    public void VerifyAKCTVideo() {

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
    public void TrendVerify1() {

        homepage.VerifyTrend1();

    }

    @Test
    public void TrendVerify2() {

        homepage.VerifyTrend2();

    }

    @Test
    public void TrendVerify3() {

        homepage.VerifyTrend3();

    }


    @Test
    public void BreedofDayVerify() {

        homepage.VerifyBreedofDay();

    }


    @Test
    public void ExpBreedsVerify() {

        homepage.VerifyExpBreeds();

    }


    @Test
    public void AKCCanineVerify() {

        homepage.VerifyAKCCanine();

    }


    @Test
    public void RescueNetVerify() {

        homepage.VerifyRescueNet();

    }


    @Test
    public void AKCReuniteVerify() {

        homepage.VerifyAKCReunite();

    }


    @Test
    public void HumaneFundVerify() {

        homepage.VerifyHumaneFund();

    }


    @Test
    public void MuseumofDogVerify() {

        homepage.VerifyMuseumofDog();

    }


    @Test
    public void ProtectRightsVerify() {

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
    public void FindEventsbutVerify() {

        homepage.VerifyFindEvents();

    }


    @Test
    public void RegisterDogbutVerify() {

        homepage.VerifyRegisterDogbut();

    }

    //Test for Adds Verify & Click:

    @Test
    public void AddVerify() {

        homepage.VerifyAdd();

    }

    @Test
    public void ClickAdd() {

        homepage.ClickAdd();

    }

    @Test
    public void VerifyAdd1() {

        homepage.VerifyAdd1();

    }

    @Test
    public void ClickAdd1() {

        homepage.ClickAdd1();

    }

    //Test for BreedsMenu click action:


    @Test
    public void Clickviewbreeds() {

        breeds.Clickviewbreeds();

    }

    @Test
    public void Clicksearchbreeds() {

        breeds.Clicksearchbreeds();

    }

    @Test
    public void Clickexplorebreeds() {

        breeds.Clickexplorebreeds();

    }

    @Test
    public void Clickfindmatch() {

        breeds.Clickfindmatch();

    }

    @Test
    public void Clickcomparebreeds() {

        breeds.Clickcomparebreeds();

    }

    @Test
    public void Clickfindapuppy() {

        breeds.Clickfindapuppy();

    }

    @Test
    public void Clickchooseabreed() {

        breeds.Clickchooseabreed();

    }

    @Test
    public void Clickwhygetdog() {

        breeds.Clickwhygetdog();

    }

    @Test
    public void Clickfindrespbreeder() {

        breeds.Clickfindrespbreeder();

    }

    @Test
    public void Clickgetstartdogsports() {

        breeds.Clickgetstartdogsports();

    }

    @Test
    public void Clickallaboutpuppies() {

        breeds.Clickallaboutpuppies();

    }

    @Test
    public void Clickfindpurebreed() {

        breeds.Clickfindpurebreed();

    }

    @Test
    public void Clickmenuregdog() {

        breeds.Clickmenuregdog();

    }

    @Test
    public void Clickfindbreedclub() {

        breeds.Clickfindbreedclub();

    }

    @Test
    public void Clickmostpopdogs() {

        breeds.Clickmostpopdogs();

    }

    @Test
    public void Clickfordogbreeders() {

        breeds.Clickfordogbreeders();

    }

    @Test
    public void Clickfordogowners() {

        breeds.Clickfordogowners();

    }

    //Tests for ExpertAdvice Menu Click action:

    @Test
    public void Clickartexpadv() {

        expertAdvice.Clickartexpadv();


    }

    @Test
    public void Clickallcateg() {

        expertAdvice.Clickallcateg();


    }

    @Test
    public void Clickdogbreeding() {

        expertAdvice.Clickdogbreeding();

    }

    @Test
    public void Clickgrooming(){

        expertAdvice.Clickgrooming();

    }

    @Test
    public void Clickhealth() {

        expertAdvice.Clickhealth();

    }

    @Test
    public void Clickhomeliving() {

        expertAdvice.Clickhomeliving();

    }

    @Test
    public void Clicklifestyle() {

        expertAdvice.Clicklifestyle();

    }

    @Test
    public void Clicknews() {

        expertAdvice.Clicknews();

    }

    @Test
    public void Clicknutrition() {

        expertAdvice.Clicknutrition();

    }

    @Test
    public void Clickpuppyinfo()  {

        expertAdvice.Clickpuppyinfo();

    }

    @Test
    public void Clicksports() {

        expertAdvice.Clicksports();

    }

    @Test
    public void Clicktraining() {

        expertAdvice.Clicktraining();

    }

    @Test
    public void Clickvetcorner() {

        expertAdvice.Clickvetcorner();

    }

    @Test
    public void ClickfindmatchOnExpAdvMenu() {

        expertAdvice.ClickfindmatchOnExpAdvMenu();

    }

    @Test
    public void Clickdognamefind() {

        expertAdvice.Clickdognamefind();

    }

    @Test
    public void Clickcandogeat() {

        expertAdvice.Clickcandogeat();

    }

    @Test
    public void Clickakctv() {

        expertAdvice.Clickakctv();

    }

    @Test
    public void Clickakcmag() {

        expertAdvice.Clickakcmag();

    }

    @Test
    public void Clicknewsletter() {

        expertAdvice.Clicknewsletter();

    }

    @Test
    public void Clickpresscenter() {

        expertAdvice.Clickpresscenter();

    }

    @Test
    public void Clickakcdetection() {

        expertAdvice.Clickakcdetection();

    }

    @Test
    public void Clickakccanine() {

        expertAdvice.Clickakccanine();

    }

    @Test
    public void Clickgovernment() {

        expertAdvice.Clickgovernment();

    }

    @Test
    public void Clickakceducation() {

        expertAdvice.Clickakceducation();

    }

    @Test
    public void Clickakclibrary() {

        expertAdvice.Clickakclibrary();

    }

    @Test
    public void SubscriptionForm() {

        expertAdvice.SubscriptionForm();

    }

     //Tests for ProdServ Menu Click action >


    @Test
    public void Clickshopdog() {

        prodserv.Clickshopdog();

    }

    @Test
    public void Clickbreedspecif() {

        prodserv.Clickbreedspecif();

    }

    @Test
    public void Clicktoystreats() {

        prodserv.Clicktoystreats();

    }

    @Test
    public void Clicktrainingprod() {

        prodserv.Clicktrainingprod();

    }

    @Test
    public void Clickdoggift()  {

        prodserv.Clickdoggift();

    }

    @Test
    public void Clickdna() {

        prodserv.Clickdna();

    }

    @Test
    public void ClickakctvProdServ() {

        prodserv.ClickakctvProdServ();

    }

    @Test
    public void ClickakcmagProdServ() {

        prodserv.ClickakcmagProdServ();

    }

    @Test
    public void Clickpedigrees() {

        prodserv.Clickpedigrees();

    }

    @Test
    public void Clickbreedrep() {

        prodserv.Clickbreedrep();

    }

    @Test
    public void Clickakccomp() {

        prodserv.Clickakccomp();

    }

    @Test
    public void Clickregdog() {

        prodserv.Clickregdog();

    }

    @Test
    public void Clickregpure() {

        prodserv.Clickregpure();

    }

    @Test
    public void reglitter() {

        prodserv.reglitter();

    }

    @Test
    public void Clickenroll() {

        prodserv.Clickenroll();

    }

    @Test
    public void Clickregdown() {

        prodserv.Clickregdown();

    }

    @Test
    public void Clickfinddog() {

        prodserv.Clickfinddog();

    }

    @Test
    public void Clickfinpuppy() {

        prodserv.Clickfinpuppy();

    }

    @Test
    public void Clickakcrescue() {

        prodserv.Clickakcrescue();

    }

    @Test
    public void Clickbreedrefer() {

        prodserv.Clickbreedrefer();

    }

    @Test
    public void Clickpuppyvisor() {

        prodserv.Clickpuppyvisor();

    }

    @Test
    public void Clicktrainserv() {

        prodserv.Clicktrainserv();

    }

    @Test
    public void Clickcgc() {

        prodserv.Clickcgc();

    }

    @Test
    public void Clickgooddog() {

        prodserv.Clickgooddog();

    }

    @Test
    public void Clickfindtrainclub() {

        prodserv.Clickfindtrainclub();

    }

    @Test
    public void Clickakccaninecolle() {

        prodserv.Clickakccaninecolle();

    }

    @Test
    public void Clickhealthgen() {

        prodserv.Clickhealthgen();

    }

    @Test
    public void Clickfindgroom() {

        prodserv.Clickfindgroom();

    }

    @Test
    public void Clickakcsafe() {

        prodserv.Clickakcsafe();

    }

    @Test
    public void Clickakcpet() {

        prodserv.Clickakcpet();

    }

    @Test
    public void Clickakcvete() {

        prodserv.Clickakcvete();

    }

    @Test
    public void Clickakccanineretreat() throws InterruptedException {

        prodserv.Clickakccanineretreat();

    }

    @Test
    public void Clickakcreunite() {

        prodserv.Clickakcreunite();

    }

    @Test
    public void Clickbreedprog() {

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
    public void Clickintrodog() {

        sportsEvents.Clickintrodog();

    }

    @Test
    public void Clickcanpartenro() {

        sportsEvents.Clickcanpartenro();

    }

    @Test
    public void Clicktitleabrev() {

        sportsEvents.Clicktitleabrev();

    }

    @Test
    public void Clickwhichsports() {

        sportsEvents.Clickwhichsports();

    }

    @Test
    public void Clickgetstartdog() {

        sportsEvents.Clickgetstartdog();

    }

    @Test
    public void Clickupcomevent() {

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
    public void Clickakcagility() {

        sportsEvents.Clickakcagility();

    }

    @Test
    public void Clickobediencecla() {

        sportsEvents.Clickobediencecla();

    }

    @Test
    public void Clickakcmeet() {

        sportsEvents.Clickakcmeet();

    }

    @Test
    public void Clickakcnatobechamp() {

        sportsEvents.Clickakcnatobechamp();

    }

    @Test
    public void Clickakcrallynatchamp() {

        sportsEvents.Clickakcrallynatchamp();

    }

    @Test
    public void Clickconfdogshow() {

        sportsEvents.Clickconfdogshow();

    }

    @Test
    public void Clickmatchshow() {

        sportsEvents.Clickmatchshow();

    }

    @Test
    public void Clickfourtosix() {

        sportsEvents.Clickfourtosix();

    }

    @Test
    public void Clickpuppyachiev() {

        sportsEvents.Clickpuppyachiev();

    }

    @Test
    public void Clicknatiohand() {

        sportsEvents.Clicknatiohand();

    }

    @Test
    public void Clickopenshow() {

        sportsEvents.Clickopenshow();

    }

    @Test
    public void Clickcompsport() {

        sportsEvents.Clickcompsport();

    }

    @Test
    public void Clickagility() {

        sportsEvents.Clickagility();

    }

    @Test
    public void Clickobedience() {

        sportsEvents.Clickobedience();

    }

    @Test
    public void Clickrally() {

        sportsEvents.Clickrally();

    }

    @Test
    public void Clicktracking() {

        sportsEvents.Clicktracking();

    }

    @Test
    public void Clicktittlereco() {

        sportsEvents.Clicktittlereco();

    }

    @Test
    public void Clickbarnhunt() {

        sportsEvents.Clickbarnhunt();

    }

    @Test
    public void Clickdiscdog() {

        sportsEvents.Clickdiscdog();

    }

    @Test
    public void Clickdivingdog() {

        sportsEvents.Clickdivingdog();

    }

    @Test
    public void Clickflyball() {

        sportsEvents.Clickflyball();

    }

    @Test
    public void Clicksearchresc() {

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
    public void Clickearthdog() {

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
    public void Clickpeewee() {

        sportsEvents.Clickpeewee();

    }

    @Test
    public void Clickakcfamdog() {

        sportsEvents.Clickakcfamdog();

    }

    @Test
    public void Clickcgcstar() {

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
    public void Clickpointaward() {

        sportsEvents.Clickpointaward();

    }

    @Test
    public void Clickjudgingres() throws InterruptedException {

        sportsEvents.Clickjudgingres();

    }

    @Test
    public void Clickjudgesdirec() {

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
    public void Clickakccontact() {

        sportsEvents.Clickakccontact();

    }

    @Test
    public void Clickakcrhp() {

        sportsEvents.Clickakcrhp();

    }

    @Test
    public void ClickjuniorRes() {

        sportsEvents.ClickjuniorRes();

    }

    //Tests for clubsDelegates menu click action:


    @Test
    public void Clicksearchallclub()  {

        clubsDelegates.Clicksearchallclub();

    }

    @Test
    public void Clickfindanevent() {

        clubsDelegates.Clickfindanevent();

    }

    @Test
    public void Clicktrainclass() {

        clubsDelegates.Clicktrainclass();

    }

    @Test
    public void Clickaboutclub() {

        clubsDelegates.Clickaboutclub();

    }

    @Test
    public void Clickformclub() {

        clubsDelegates.Clickformclub();

    }

    @Test
    public void Clickclubdevelop()  {

        clubsDelegates.Clickclubdevelop();

    }

    @Test
    public void Clickpromoteclub() {

        clubsDelegates.Clickpromoteclub();

    }

    @Test
    public void Clickclubresources() {

        clubsDelegates.Clickclubresources();

    }

    @Test
    public void Clickdelegatespor() {

        clubsDelegates.Clickdelegatespor();

    }

    @Test
    public void Clickdelegatesdir() {

        clubsDelegates.Clickdelegatesdir();

    }

    @Test
    public void Clickdelegatesmeet() {

        clubsDelegates.Clickdelegatesmeet();

    }

    @Test
    public void Clickboardmin() {

        clubsDelegates.Clickboardmin();

    }

    @Test
    public void Clickdelegatestan() {

        clubsDelegates.Clickdelegatestan();

    }

    @Test
    public void Clickperspective() {

        clubsDelegates.Clickperspective();

    }

    @Test
    public void Clickakcgazette() {

        clubsDelegates.Clickakcgazette();

    }

    @Test
    public void Clickrolakcdel() {

        clubsDelegates.Clickrolakcdel();

    }

    @Test
    public void Clickimportance()  {

        clubsDelegates.Clickimportance();

    }

    @Test
    public void Clicklegisla()  {

        clubsDelegates.Clicklegisla();

    }

    @Test
    public void Clicklegislaalarm() {

        clubsDelegates.Clicklegislaalarm();

    }

    @Test
    public void Clickakcpac() throws InterruptedException {

        clubsDelegates.Clickakcpac();

    }

    @Test
    public void Clickgovernrelat() {

        clubsDelegates.Clickgovernrelat();

    }

    @Test
    public void Clickovercollec() {

        clubsDelegates.Clickovercollec();

    }

    @Test
    public void Clickclubarchives() {

        clubsDelegates.Clickclubarchives();

    }

    @Test
    public void Clicksearchlib() {

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
    public void puppiesArticle2() {

        breeds.puppiesArticle2();

    }

    @Test
    public void puppiesArticle3() {

        breeds.puppiesArticle3();

    }


    //@Test  We need to fix this test Elements cannot be selected when running automation script on this Section*
    public void fordogbreedersArticle1() throws InterruptedException {

        breeds.fordogbreedersArticle1();

    }

    @Test
    public void ForDogOwnerArticle1() {

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
    public void dogbreedArticle() {

        expertAdvice.dogbreedArticle();
        eyes.open(driver, "AKC", "dogbreedArticle", new RectangleSize(1420, 680));
        eyes.check("EAmenu", Target.window());
        eyes.close();

    }

    @Test
    public void healthArticle() {

        expertAdvice.healthArticle();

    }

    @Test
    public void newsArticle() throws InterruptedException {

        expertAdvice.newsArticle();

    }

    //@Test
    public void HomelivingArticle() throws InterruptedException {

        expertAdvice.HomelivingArticle();
        eyes.open(driver, "AKC", "HomelivingArticle", new RectangleSize(1420, 680));
        eyes.check("HomelivingArticle", Target.window());
        eyes.close();

    }


    //@Test
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
    public void ProdServArticle3() {

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

    @Test
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

    @Test
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
    





