package Specs;

import Helpers.DataHelper;
import Helpers.DriverHelper;
import Pages.*;
import com.applitools.eyes.selenium.Eyes;
import io.percy.selenium.Percy;
import org.openqa.selenium.WebDriver;


public class SuperBaseClass {

    //driver
    WebDriver driver;
    public Eyes eyes;

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
    DogName dogName;
    CanMyDogEat canMyDogEat;
    RegisterDog registerDog;
    Search search;
    BreedSelectorTool breedSelectorTool;

    //helpers
    DataHelper dataHelper;
    DriverHelper driverHelper;


    public void InitPages(){

        signIn = new SignIn(driver);
        register = new Register(driver, driverHelper);
        breeds = new BreedsMenu(driver);
        homepage = new Homepage(driver);
        expertAdvice = new ExpertAdvice(driver);
        prodserv = new ProdServ(driver);
        sportsEvents = new SportsEvents(driver);
        clubsDelegates = new ClubsDelegates(driver);
        compareBreeds = new CompareBreeds(driver);
        dogName= new DogName(driver);
        canMyDogEat= new CanMyDogEat(driver);
        registerDog= new RegisterDog(driver);
        search= new Search(driver);
        breedSelectorTool= new BreedSelectorTool(driver);
    }

    public void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);

    }

}
