package Specs;

import Helpers.DataHelper;
import Helpers.DriverHelper;
import ORGPages.*;
import ShopPages.*;
import org.openqa.selenium.WebDriver;

public class SuperBaseClass {
    //driver
    WebDriver driver;

    //ORGPages
    SignIn signIn;
    Register register;
    BreedsMenu breeds;
    Homepage homepage;
    ExpertAdvice expertAdvice;
    ProdServ prodserv;
    SportsEvents sportsEvents;
    ClubsDelegates clubsDelegates;
    CompareBreeds compareBreeds;
    BreedSelector breedSelector;
    DogName dogName;
    CanMyDogEat canMyDogEat;
    RegisterDog registerDog;
    Search search;

    //ShopPages
    ShopHomepage shopHomepage;
    GiftForHumans GiftForHumans;
    GearForDogs GearForDogs;
    ShopPages.ShopGroomingWellness ShopGroomingWellness;
    AdviseTraining AdviseTraining;
    ShopByBreed ShopByBreed;
    AKCProShop AKCProShop;
    SpecialShops SpecialShops;
    ShopPurchaseOrders shopPurchaseOrders;
    ShopPages.ShopRegister ShopRegister;
    ShopPages.ShopSearch ShopSearch;
    ShopPages.ShopSignIn ShopSignIn;

    //Retrievist
    //Coming soon *


    //helpers
    DataHelper dataHelper;
    DriverHelper driverHelper;

    public void InitPages(){

        //ORG
        signIn = new SignIn(this.driver);
        register = new Register(this.driver, driverHelper);
        breeds = new BreedsMenu(this.driver);
        homepage = new Homepage(this.driver);
        expertAdvice = new ExpertAdvice(this.driver);
        prodserv = new ProdServ(this.driver);
        sportsEvents = new SportsEvents(this.driver);
        clubsDelegates = new ClubsDelegates(this.driver);
        compareBreeds = new CompareBreeds(this.driver);
        breedSelector = new BreedSelector(this.driver);
        dogName= new DogName(this.driver);
        canMyDogEat= new CanMyDogEat(this.driver);
        registerDog= new RegisterDog(this.driver);
        search= new Search(this.driver);

        //SHOP
        shopHomepage= new ShopHomepage(this.driver);
        GiftForHumans = new GiftForHumans(this.driver);
        GearForDogs = new GearForDogs(this.driver);
        ShopGroomingWellness= new ShopGroomingWellness(this.driver);
        AdviseTraining = new AdviseTraining(this.driver);
        ShopByBreed = new ShopByBreed(this.driver);
        AKCProShop = new AKCProShop(this.driver);
        SpecialShops = new SpecialShops(this.driver);
        shopPurchaseOrders= new ShopPurchaseOrders(this.driver);
        ShopRegister= new ShopRegister(this.driver, driverHelper);
        ShopSearch= new ShopSearch(this.driver);
        ShopSignIn= new ShopSignIn(this.driver);

        //Retrievist
        //Coming soon *

    }

    public void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);
    }

}
