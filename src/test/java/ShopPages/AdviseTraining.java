package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdviseTraining {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(4)")
    WebElement AdviceTrainingMenu;

    @FindBy(css = "#main-content > div > h1")
    WebElement AKCExpertiseTitle;

    @FindBy(css = "#single_facet_Type")
    WebElement SideNav;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a")
    WebElement AdviseTrainingProduct;

    @FindBy(css = "#main-content > div > div.smart-collection__pagination > p > span")
    WebElement PageNumbCarousel;
    //

    @FindBy(css = "#training-supplies > li:nth-child(1) > a")
    WebElement TrainingSupplies;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrainingSuppliesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(2) > a")
    WebElement AgilityEquip;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AgilityEquipTitle;

    @FindBy(css = "#training-supplies > li:nth-child(3) > a")
    WebElement TrainingLeashes;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrainingLeashesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(4) > a")
    WebElement TreatsPouches;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TreatsPouchesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(5) > a")
    WebElement PuppySupplies;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement PuppySuppliesTitle;

    @FindBy(css = "#training-supplies > li:nth-child(6) > a")
    WebElement Muzzles;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement MuzzlesTitle;

    @FindBy(css = "#training-books-dvds > li:nth-child(2) > a")
    WebElement BooksDVDs;

    @FindBy(css = "#collection-header > div > div > h1")
    WebElement BooksDVDsTitle;

    @FindBy(css = "#training-books-dvds > li:nth-child(2) > a")
    WebElement BasicTraining;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BasicTrainingTitle;

    @FindBy(css = "#training-books-dvds > li:nth-child(3) > a")
    WebElement TricksTraining;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TricksTrainingTitle;

    @FindBy(css = "#training-canine-good-citizen > li:nth-child(1) > a")
    WebElement BreedTraining;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement BreedTrainingTitle;

    @FindBy(css = "#training-canine-good-citizen > li:nth-child(1) > a")
    WebElement CGC;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement CGCTitle;

    @FindBy(css = "#training-canine-good-citizen > li:nth-child(2) > a")
    WebElement Books;

    @FindBy(css = "#canine-good-citizen > li:nth-child(2) > a")
    WebElement BooksTitle;

    @FindBy(css = "#training-canine-good-citizen > li:nth-child(4) > a")
    WebElement Merchandise;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement MerchandiseTitle;

    @FindBy(css = "#training-canine-good-citizen > li:nth-child(4) > a")
    WebElement MaterialsEvaluators;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement MaterialsEvaluatorsTitle;

    @FindBy(css = "#training-training-services > li:nth-child(1) > a")
    WebElement TrainingServices;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement TrainingServicesTitle;

    @FindBy(css = "#training-training-services > li:nth-child(2) > a")
    WebElement GoodDogHelpLine;

    //------------------------//

    WebDriver driver;

    // Constructor
    public AdviseTraining(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickAdviseTrainingMenu()  {

        this.AdviceTrainingMenu.isDisplayed();
        this.AdviceTrainingMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AKCExpertiseTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(SideNav));
        wait.until(ExpectedConditions.visibilityOf(AdviseTrainingProduct));
        wait.until(ExpectedConditions.visibilityOf(PageNumbCarousel));

    }

    public void clickTrainingSupplies() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TrainingSupplies.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TrainingSuppliesTitle));

    }

    public void clickAgilityEquip() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.AgilityEquip.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AgilityEquipTitle));

    }

    public void clickTrainingLeashes() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TrainingLeashes.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TrainingLeashesTitle));

    }

    public void clickTreatsPouches() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TreatsPouches.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TreatsPouchesTitle));

    }

    public void clickPuppySupplies() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.PuppySupplies.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(PuppySuppliesTitle));

    }

    public void clickMuzzles() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.Muzzles.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(MuzzlesTitle));

    }

    public void clickBooksDVDs() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.BooksDVDs.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BooksDVDsTitle));

    }

    public void clickBasicTraining() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.BasicTraining.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BasicTrainingTitle));

    }

    public void clickTrickTraining() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TricksTraining.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TricksTrainingTitle));

    }

    public void clickBreedTraining() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.BreedTraining.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BreedTrainingTitle));

    }

    public void clickGCG() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.CGC.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CGCTitle));

    }

    public void clickBooks() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.Books.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(BooksTitle));

    }

    public void clickMerchandise() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.Merchandise.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(MerchandiseTitle));

    }

    public void clickMaterialsEvaluators() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.MaterialsEvaluators.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(MaterialsEvaluatorsTitle));

    }

    public void clickTrainingServices() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.TrainingServices.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(TrainingServicesTitle));

    }

    public void clickGoodDogHelpLine() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#menu-bar > ul > li.training > a"));
        builder.moveToElement(element).build().perform();
        this.GoodDogHelpLine.click(); // *
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("products/good-dog-helpline"));

    }

}
