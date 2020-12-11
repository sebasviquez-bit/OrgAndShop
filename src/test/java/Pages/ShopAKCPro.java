package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopAKCPro {

    @FindBy(css = "#menu-bar > ul > li.akc-services > a")
    WebElement AKCProMenu;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AKCServicesTitle;

    @FindBy(css = "#akc-professional-side-nav")
    WebElement AKCProSideNav;

    @FindBy(css = "#akc-services-breeders > li:nth-child(1) > a")
    WebElement Breeders;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement BreedersTitle;

    @FindBy(css = "#akc-services-breeders > li:nth-child(2) > a")
    WebElement IDCollLeashes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement IDCollLeashesTitle;

    @FindBy(css = "#akc-services-breeders > li:nth-child(3) > a")
    WebElement BooksAndDVDs;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement BooksAndDVDsTitle;

    @FindBy(css = "#akc-services-breeders > li:nth-child(4) > a")
    WebElement DNAKit;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement DNAKitTitle;

    @FindBy(css = "#akc-services-breeders > li:nth-child(5) > a")
    WebElement RulesAndPolicies;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement RulesAndPoliciesTitle;

    @FindBy(css = "#akc-services-breeders > li:nth-child(6) > a")
    WebElement CertiPedig;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement CertiPedigTitle;

    @FindBy(css = "#akc-services-breeders > li:nth-child(7) > a")
    WebElement BreederRepo;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement BreederRepoTitle;

    @FindBy(css = "#akc-services-competitors > li:nth-child(1) > a")
    WebElement Exhibitors;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement ExhibitorsTitle;

    @FindBy(css = "#akc-services-competitors > li:nth-child(2) > a")
    WebElement EventRuleRegula;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement EventRuleRegulaTitle;

    @FindBy(css = "#akc-services-competitors > li:nth-child(3) > a")
    WebElement CompetitorRepo;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement CompetitorRepoTitle;

    @FindBy(css = "#exhibitors > li:nth-child(4) > a")
    WebElement TitlePatches;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement TitlePatchesTitle;

    @FindBy(css = "#akc-services-competitors > li:nth-child(4) > a")
    WebElement FreePointProgress;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement FreePointProgressTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(1) > a")
    WebElement JudgesClubs;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement JudgesClubsTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(2) > a")
    WebElement BooksDVDS;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement BooksDVDSTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(3) > a")
    WebElement EventRulesReg;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement EventRulesRegTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(4) > a")
    WebElement RegRulesPolicies;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement RegRulesPoliciesTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(5) > a")
    WebElement BreedStand;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement BreedStandTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(6) > a")
    WebElement GoverClubReso;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement GoverClubResoTitle;

    @FindBy(css = "#akc-services-judges-clubs > li:nth-child(7) > a")
    WebElement DogShowResorces;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement DogShowResorcesTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(1) > a")
    WebElement Trainers;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrainersTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(2) > a")
    WebElement MaterialsCGC;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement MaterialsCGCTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(3) > a")
    WebElement CGCMerch;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CGCMerchTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(4) > a")
    WebElement CGCWorkMerch;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CGCWorkMerchTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(5) > a")
    WebElement TrickDogMerch;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrickDogMerchTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(6) > a")
    WebElement TrainingBooks;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrainingBooksTitle;

    @FindBy(css = "#akc-services-trainers > li:nth-child(7) > a")
    WebElement AllTrainingProd;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AllTrainingProdTitle;

    //------------------------//

    WebDriver driver;

    // Constructor
    public ShopAKCPro (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickAKCProMenu()  {

        this.AKCProMenu.isDisplayed();
        this.AKCProMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AKCServicesTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(AKCProSideNav));

    }

    public void clickBreeders() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.Breeders.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreedersTitle));

    }

    public void clickIDCollLeashes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.IDCollLeashes.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(IDCollLeashesTitle));

    }

    public void clickBooksAndDVDs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.BooksAndDVDs.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BooksAndDVDsTitle));

    }

    public void clickDNAKit() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.DNAKit.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DNAKitTitle));

    }

    public void clickRulesAndPolicies() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.RulesAndPolicies.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RulesAndPoliciesTitle));

    }

    public void clickCertiPedig() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.CertiPedig.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CertiPedigTitle));

    }

    public void clickBreederRepo() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.BreederRepo.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreederRepoTitle));

    }

    public void clickExhibitors() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.Exhibitors.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ExhibitorsTitle));

    }

    public void clickEventRuleRegula() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.EventRuleRegula.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(EventRuleRegulaTitle));

    }

    public void clickCompetitorRepo() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.CompetitorRepo.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CompetitorRepoTitle));

    }

    public void clickTitlePatches() {

        this.AKCProMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TitlePatches));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.TitlePatches.click();
        wait.until(ExpectedConditions.visibilityOf(TitlePatchesTitle));

    }

    public void clickFreePointProgress() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.FreePointProgress.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(FreePointProgressTitle));

    }

    public void clickJudgesClubs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.JudgesClubs.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(JudgesClubsTitle));

    }

    public void clickBooksDVDS() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.BooksDVDS.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BooksDVDSTitle));

    }

    public void clickEventRulesReg() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.EventRulesReg.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(EventRulesRegTitle));

    }

    public void clickRegRulesPolicies() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.RegRulesPolicies.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(RegRulesPoliciesTitle));

    }

    public void clickBreedStand() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.BreedStand.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreedStandTitle));

    }

    public void clickGoverClubReso() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.GoverClubReso.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(GoverClubResoTitle));

    }

    public void clickDogShowResorces() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.DogShowResorces.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(DogShowResorcesTitle));

    }

    public void clickTrainers() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.Trainers.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TrainersTitle));

    }

    public void clickMaterialsCGC() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.MaterialsCGC.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(MaterialsCGCTitle));

    }

    public void clickCGCMerch() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.CGCMerch.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CGCMerchTitle));

    }

    public void clickCGCWorkMerch() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.CGCWorkMerch.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CGCWorkMerchTitle));

    }

    public void clickTrickDogMerch() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.TrickDogMerch.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TrickDogMerchTitle));

    }

    public void clickTrainingBooks() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.TrainingBooks.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TrainingBooksTitle));

    }

    public void clickAllTrainingProd() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.akc-services > a"));
        builder.moveToElement(element).build().perform();
        this.AllTrainingProd.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AllTrainingProdTitle));

    }

}
