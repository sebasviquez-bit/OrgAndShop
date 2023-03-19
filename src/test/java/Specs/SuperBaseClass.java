package Specs;

import Helpers.DataHelper;
import Helpers.DriverHelper;
import Pages.*;
import com.applitools.eyes.selenium.Eyes;
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

        signIn = new SignIn(this.driver);
        register = new Register(this.driver, driverHelper);
        breeds = new BreedsMenu(this.driver);
        homepage = new Homepage(this.driver);
        expertAdvice = new ExpertAdvice(this.driver);
        prodserv = new ProdServ(this.driver);
        sportsEvents = new SportsEvents(this.driver);
        clubsDelegates = new ClubsDelegates(this.driver);
        compareBreeds = new CompareBreeds(this.driver);
        dogName= new DogName(this.driver);
        canMyDogEat= new CanMyDogEat(this.driver);
        registerDog= new RegisterDog(this.driver);
        search= new Search(this.driver);
        breedSelectorTool= new BreedSelectorTool(this.driver);

    }

    public void InitHelpers(String baseUrl){

        dataHelper = new DataHelper();
        driverHelper = new DriverHelper(driver, baseUrl);
    }

}
