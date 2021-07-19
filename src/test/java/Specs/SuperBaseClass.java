package Specs;

import Helpers.DataHelper;
import Helpers.DriverHelper;
import Pages.*;
import org.openqa.selenium.WebDriver;

public class SuperBaseClass {
    //driver
    WebDriver driver;

    //pages
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
    ShopHomepage shopHomepage;
    ShopEssentials ShopEssentials;
    ShopOnTheGo ShopOnTheGo;
    ShopGroomingWellness ShopGroomingWellness;
    ShopTraining ShopTraining;
    ShopDogLovers ShopDogLovers;
    ShopAKCPro ShopAKCPro;
    ShopCollections ShopCollections;
    ShopPurchaseOrders shopPurchaseOrders;

    //helpers
    DataHelper dataHelper;
    DriverHelper driverHelper;


    public void InitPages(){

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
        shopHomepage= new ShopHomepage(this.driver);
        ShopEssentials= new ShopEssentials(this.driver);
        ShopOnTheGo= new ShopOnTheGo(this.driver);
        ShopGroomingWellness= new ShopGroomingWellness(this.driver);
        ShopTraining= new ShopTraining(this.driver);
        ShopDogLovers= new ShopDogLovers(this.driver);
        ShopAKCPro= new ShopAKCPro(this.driver);
        ShopCollections= new ShopCollections(this.driver);
        shopPurchaseOrders= new ShopPurchaseOrders(this.driver);

    }

    public void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);
    }

}
