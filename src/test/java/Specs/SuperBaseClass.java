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
    ShopPurchaseOrders shopPurchaseOrders;


    //helpers
    DataHelper dataHelper;
    DriverHelper driverHelper;


    protected void InitPages(){

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
        shopPurchaseOrders= new ShopPurchaseOrders(this.driver);

    }

    protected void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);
    }

}
